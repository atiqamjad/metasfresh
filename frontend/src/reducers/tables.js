import { original, produce } from 'immer';
import { difference, get } from 'lodash';
import { createSelector } from 'reselect';
import { merge } from 'merge-anything';

import * as types from '../constants/ActionTypes';
import { SORT_TAB } from '../constants/ActionTypes';
import { doesSelectionExist } from '../utils/documentListHelper';
import { NUMERIC_FIELD_TYPES } from '../constants/Constants';

export const initialTableState = {
  windowId: null,
  viewId: null,
  docId: null,
  tabId: null,
  keyProperty: null,
  selected: [],
  rows: [],
  collapsedRows: [],
  collapsedParentRows: [],
  // row columns
  columns: [],
  activeSort: false,
  headerProperties: {},
  size: 0,

  //header columns
  headerElements: {},
  emptyText: null,
  emptyHint: null,
  expandedDepth: 0,
  collapsible: false,
  indentSupported: false,
  supportAttribute: false,
  navigationActive: true,
};

// we store the length of the tables structure for the sake of testing and debugging
export const initialState = { length: 0 };

/**
 * @method getTableId
 * @summary Small helper function to generate the table id depending on the values (if viewId is
 * provided, we'll use only that for grids, and if not - it's a tab table so document id
 * and tab ids are expected ).
 */
export const getTableId = ({ windowId, viewId, docId, tabId }) => {
  return `${windowId}_${viewId ? viewId : `${docId}_${tabId}`}`;
};

/**
 * @method selectTableHelper
 * @summary selector function for `getTable`
 */
const selectTableHelper = (state, id) => {
  return get(state, ['tables', id], initialTableState);
};

/**
 * @method getTable
 * @summary Memoized selector for getting table object by id from the state
 */
export const getTable = createSelector(selectTableHelper, (table) => table);

const getSelectionData = (state, tableId) =>
  selectTableHelper(state, tableId).selected;

/**
 * @method getSelection
 * @summary Memoized selector for getting selections in a table
 */
export const getSelection = () => {
  return createSelector(getSelectionData, (table) => table);
};

export const getSupportAttribute = (selected, rows) => {
  if (!selected.length || !rows.length) {
    return;
  }

  if (selected.length === 1) {
    const selectedRow = rows.find((row) => row.id === selected[0]);

    return selectedRow && selectedRow.supportAttributes;
  }
  return false;
};

const addRowToArray = ({ orderedRows, rowToAdd, orderBys }) => {
  if (!orderedRows.length) {
    orderedRows.push(rowToAdd);
    return;
  }

  for (let i = 0; i < orderedRows.length; i++) {
    const currentRow = orderedRows[i];
    const cmp = compareRows({ row1: currentRow, row2: rowToAdd, orderBys });
    if (cmp > 0) {
      orderedRows.splice(i, 0, rowToAdd);
      return;
    }
  }

  orderedRows.push(rowToAdd);
};

const compareRows = ({ row1, row2, orderBys }) => {
  for (const orderBy of orderBys) {
    const { fieldName, ascending } = orderBy;
    const value1 = extractValueToCompare(row1, fieldName);
    const value2 = extractValueToCompare(row2, fieldName);
    const cmp = compareValues({ value1, value2, ascending });
    if (cmp !== 0) {
      return cmp;
    }
  }
};

const extractValueToCompare = (row, fieldName) => {
  const field = row?.fieldsByName?.[fieldName];
  if (!field) {
    return undefined;
  }

  let value = field.value;
  const widgetType = field.widgetType;

  if (NUMERIC_FIELD_TYPES.includes(widgetType)) {
    if (value == null) {
      return null;
    }
    return Number(value);
  } else {
    if (value?.caption) {
      value = value.caption;
    }
    return value;
  }
};

const compareValues = ({ value1, value2, ascending }) => {
  if (value1 == null && value2 == null) {
    return 0;
  } else if (value1 == value2) {
    return 0;
  } else if (value1 < value2) {
    return ascending ? -1 : +1;
  } else {
    //if(value1 > value2)
    return ascending ? +1 : -1;
  }
};

//
//
// ------------------------
//
//

const reducer = produce((draftState, action) => {
  switch (action.type) {
    // CRUD
    case types.CREATE_TABLE: {
      const { id, data } = action.payload;
      const newLength = draftState.length + 1;
      let updatedSelected = {};

      if (data.rows && data.rows.length) {
        const selected = [data.rows[0][data.keyProperty]];
        updatedSelected = {
          selected,
          supportAttribute: getSupportAttribute(selected, data.rows),
        };
      }

      draftState[id] = {
        ...initialTableState,
        ...data,
        ...updatedSelected,
      };
      draftState.length = newLength;

      return;
    }

    case types.UPDATE_TABLE: {
      const { id, data } = action.payload;
      const { pending } = data;

      const prevTableStruct = draftState[id]
        ? draftState[id]
        : initialTableState;
      let updatedSelected = {};
      let selectionValid = false;

      if (!pending && data.rows && data.rows.length) {
        const currentSelected = original(prevTableStruct.selected);

        if (currentSelected.length) {
          selectionValid = doesSelectionExist({
            data: data.rows,
            selected: currentSelected,
          });
        }

        if (!selectionValid) {
          const newSelected = [data.rows[0][data.keyProperty]];
          updatedSelected = {
            selected: newSelected,
            supportAttribute: getSupportAttribute(newSelected, data.rows),
          };
        }
      }

      draftState[id] = {
        ...prevTableStruct,
        ...data,
        ...updatedSelected,
      };

      return;
    }

    case types.DELETE_TABLE: {
      const { id } = action.payload;

      if (draftState[id]) {
        const newLength = draftState.length - 1;

        draftState.length = newLength;
        delete draftState[id];
      }

      return;
    }

    case types.UPDATE_TABLE_DATA: {
      const { id, rows, keyProperty } = action.payload;
      const currentSelected = original(draftState[id].selected);
      const selectionValid = doesSelectionExist({
        data: rows,
        selected: currentSelected,
      });
      let updatedSelected = {};

      if (!selectionValid && rows.length) {
        const newSelected = [rows[0][keyProperty]];
        updatedSelected = {
          selected: newSelected,
          supportAttribute: getSupportAttribute(newSelected, rows),
        };
      }

      draftState[id] = {
        ...draftState[id],
        rows,
        ...updatedSelected,
      };

      return;
    }

    case types.UPDATE_TABLE_ROW_PROPERTY: {
      const { id, rowId, change } = action.payload;
      const keyProperty = draftState[id].keyProperty;
      let rows = original(draftState[id].rows);

      const newRows = rows.map((row) => {
        if (row[keyProperty] === rowId) {
          return merge(row, change);
        }
        return row;
      });

      draftState[id].rows = newRows;

      return;
    }

    case types.UPDATE_TAB_ROWS_DATA: {
      const {
        rows: { changed, removed },
        id,
      } = action.payload;
      let rows = original(draftState[id].rows);

      if (rows.length) {
        if (removed && Object.values(removed).length) {
          rows = rows.filter((row) => !removed[row.rowId]);
        }

        //
        // find&replace updated rows (unfortunately it's a table, so we'll have to traverse it)
        if (changed && Object.values(changed).length) {
          rows = rows.map((row) => {
            if (changed[row.rowId]) {
              row = { ...changed[row.rowId] };

              delete changed[row.rowId];

              return row;
            }
            return row;
          });
        }
      } else {
        rows = [];
      }

      //
      // Add remaining rows
      if (changed) {
        const rowsToAdd = Object.values(changed);
        if (rowsToAdd.length) {
          const orderBys = original(
            draftState[id].orderBys ?? draftState[id].defaultOrderBys
          );
          rowsToAdd.forEach((rowToAdd) =>
            addRowToArray({ orderedRows: rows, rowToAdd, orderBys })
          );
        }
      }

      draftState[id].rows = rows;

      return;
    }

    case types.UPDATE_TABLE_SELECTION: {
      const { id, selection, keyProperty } = action.payload;
      const rows = original(draftState[id].rows);

      const selectionValid = doesSelectionExist({
        data: rows,
        selected: selection,
        keyProperty,
      });

      if (selectionValid) {
        draftState[id].selected = selection;
        draftState[id].supportAttribute = getSupportAttribute(selection, rows);
      }

      return;
    }

    case types.DESELECT_TABLE_ROWS: {
      const { id, selection } = action.payload;

      // just for precaution
      if (draftState[id]) {
        const rows = original(draftState[id].rows);

        if (selection.length) {
          draftState[id].selected = difference(
            draftState[id].selected,
            selection
          );
          draftState[id].supportAttribute = getSupportAttribute(
            draftState[id].selected,
            rows
          );
        } else {
          draftState[id].selected = [];
          draftState[id].supportAttribute = false;
        }
      }

      return;
    }

    case types.CLEAR_TABLE_DATA: {
      const { id } = action.payload;

      draftState[id] = {
        ...draftState[id],
        rows: [],
        selected: [],
        collapsedRows: [],
        collapsedParentRows: [],
        size: 0,
      };

      return;
    }

    case types.COLLAPSE_TABLE_ROWS: {
      const { id, collapsedParentRows, collapsedRows } = action.payload;
      const table = draftState[id];

      draftState[id] = {
        ...table,
        collapsedParentRows: collapsedParentRows,
        collapsedRows: collapsedRows,
      };

      return;
    }

    case types.SET_ACTIVE_SORT: {
      const { id, active } = action.payload;

      draftState[id].activeSort = active;

      return;
    }

    case types.SET_TABLE_NAVIGATION: {
      const { id, active } = action.payload;
      if (draftState[id]) {
        draftState[id].navigationActive = active;
      } else {
        console.error(
          `Table with ID ${id} is not present in state. Skip setting navigationActive=${active}`
        );
      }

      return;
    }

    case SORT_TAB: {
      const {
        scope,
        windowId,
        docId,
        tabId,
        field: fieldName,
        asc: ascending,
      } = action;

      if (scope !== 'master') {
        return;
      }

      const tableId = getTableId({ windowId, docId, tabId });
      draftState[tableId].orderBys = [{ fieldName, ascending }];

      return;
    }
  }
}, initialState);

export default reducer;
