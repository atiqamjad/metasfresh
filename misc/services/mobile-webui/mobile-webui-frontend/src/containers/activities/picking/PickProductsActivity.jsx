import React from 'react';
import PropTypes from 'prop-types';
import * as CompleteStatus from '../../../constants/CompleteStatus';
import ButtonWithIndicator from '../../../components/buttons/ButtonWithIndicator';
import ButtonQuantityProp from '../../../components/buttons/ButtonQuantityProp';
import {
  pickingLineScreenLocation,
  pickingScanScreenLocation,
  selectPickTargetScreenLocation,
  selectTUPickTargetScreenLocation,
} from '../../../routes/picking';
import { useHistory } from 'react-router-dom';
import { trl } from '../../../utils/translations';
import { getLinesArrayFromActivity } from '../../../reducers/wfProcesses';
import { isAllowPickingAnyHUForActivity } from '../../../utils/picking';
import {
  useCurrentPickTarget,
  useCurrentTUPickTarget,
} from '../../../reducers/wfProcesses/picking/useCurrentPickTarget';

export const COMPONENTTYPE_PickProducts = 'picking/pickProducts';

const PickProductsActivity = ({ applicationId, wfProcessId, activityId, activity }) => {
  const {
    dataStored: { isUserEditable, isPickWithNewLU, isAllowNewTU },
  } = activity;
  const lines = getLinesArrayFromActivity(activity);
  const allowPickingAnyHU = isAllowPickingAnyHUForActivity({ activity });

  const history = useHistory();

  const currentPickTarget = useCurrentPickTarget({ wfProcessId, activityId });

  const isLUScanRequiredAndMissing = isPickWithNewLU && !currentPickTarget;

  const onSelectPickTargetClick = () => {
    history.push(selectPickTargetScreenLocation({ applicationId, wfProcessId, activityId }));
  };

  const currentTUPickTarget = useCurrentTUPickTarget({ wfProcessId, activityId });
  const onSelectTUPickTargetClick = () => {
    history.push(selectTUPickTargetScreenLocation({ applicationId, wfProcessId, activityId }));
  };

  const onScanButtonClick = () => {
    history.push(pickingScanScreenLocation({ applicationId, wfProcessId, activityId }));
  };
  const onLineButtonClick = ({ lineId }) => {
    history.push(pickingLineScreenLocation({ applicationId, wfProcessId, activityId, lineId }));
  };

  return (
    <div className="mt-5">
      {isPickWithNewLU && (
        <ButtonWithIndicator
          caption={
            currentPickTarget?.caption
              ? trl('activities.picking.pickingTarget.Current') + ': ' + currentPickTarget?.caption
              : trl('activities.picking.pickingTarget.New')
          }
          disabled={!isUserEditable}
          onClick={onSelectPickTargetClick}
        />
      )}
      {isAllowNewTU && (
        <ButtonWithIndicator
          caption={
            currentTUPickTarget?.caption
              ? trl('activities.picking.tuPickingTarget.Current') + ': ' + currentTUPickTarget?.caption
              : trl('activities.picking.tuPickingTarget.New')
          }
          disabled={!isUserEditable || isLUScanRequiredAndMissing}
          onClick={onSelectTUPickTargetClick}
        />
      )}
      <br />

      {allowPickingAnyHU && !isPickWithNewLU && (
        <ButtonWithIndicator
          caption={trl('activities.picking.scanQRCode')}
          disabled={!isUserEditable || isLUScanRequiredAndMissing}
          onClick={onScanButtonClick}
        />
      )}
      {lines &&
        lines.map((lineItem) => {
          const lineId = lineItem.pickingLineId;
          const { uom, qtyToPick, qtyPicked } = lineItem;

          const tuTargetIsSetButCurrentLineHasItsOwnPacking = currentTUPickTarget && lineItem.pickingUnit === 'TU';
          const tuTargetIsNotSetButCurrentLineMustBePlacedOnTUs =
            isPickWithNewLU && isAllowNewTU && !currentTUPickTarget && lineItem.pickingUnit === 'CU';
          const lineIsDisabled =
            !isUserEditable ||
            isLUScanRequiredAndMissing ||
            tuTargetIsSetButCurrentLineHasItsOwnPacking ||
            tuTargetIsNotSetButCurrentLineMustBePlacedOnTUs;

          return (
            <ButtonWithIndicator
              key={lineId}
              caption={lineItem.caption}
              completeStatus={lineItem.completeStatus || CompleteStatus.NOT_STARTED}
              disabled={lineIsDisabled}
              onClick={() => onLineButtonClick({ lineId })}
            >
              <ButtonQuantityProp
                qtyCurrent={qtyPicked}
                qtyTarget={qtyToPick}
                uom={uom}
                applicationId={applicationId}
              />
            </ButtonWithIndicator>
          );
        })}
    </div>
  );
};

PickProductsActivity.propTypes = {
  applicationId: PropTypes.string.isRequired,
  wfProcessId: PropTypes.string.isRequired,
  activityId: PropTypes.string.isRequired,
  activity: PropTypes.object.isRequired,
};

export default PickProductsActivity;
