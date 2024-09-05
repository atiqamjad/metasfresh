import React, { useEffect } from 'react';
import {
  closePickTarget,
  closeTUPickTarget,
  setPickTarget,
  setTUPickTarget,
  usePickTargets,
} from '../../../api/picking';
import { useHistory, useRouteMatch } from 'react-router-dom';
import ButtonWithIndicator from '../../../components/buttons/ButtonWithIndicator';
import { updateWFProcess } from '../../../actions/WorkflowActions';
import { useDispatch } from 'react-redux';
import Spinner from '../../../components/Spinner';
import {
  useCurrentPickTarget,
  useCurrentTUPickTarget,
} from '../../../reducers/wfProcesses/picking/useCurrentPickTarget';
import { pushHeaderEntry } from '../../../actions/HeaderActions';
import { trl } from '../../../utils/translations';
import PropTypes from 'prop-types';
import { useLocation } from 'react-router';

const isItAboutTUs = (location) => {
  const queryParams = new URLSearchParams(location.search);
  return queryParams.get('tu') === 'true';
};

export const SelectPickTargetScreen = () => {
  const dispatch = useDispatch();
  const history = useHistory();
  const {
    url,
    params: { workflowId: wfProcessId, activityId },
  } = useRouteMatch();

  const location = useLocation();
  const useTUFunctions = isItAboutTUs(location);
  const pickTargetFunctions = {
    closePickTargetFunc: useTUFunctions ? closeTUPickTarget : closePickTarget,
    useCurrentPickTargetFunc: useTUFunctions ? useCurrentTUPickTarget : useCurrentPickTarget,
  };

  const currentTarget = pickTargetFunctions.useCurrentPickTargetFunc({ wfProcessId, activityId });

  useHeaderUpdate({ url, currentTarget });

  const onCloseTargetClicked = async () => {
    pickTargetFunctions
      .closePickTargetFunc({ wfProcessId })
      .then((wfProcess) => dispatch(updateWFProcess({ wfProcess })))
      .then(() => history.go(-1)); // go back to Picking Job
  };

  return (
    <div className="section pt-2">
      {currentTarget && (
        <ButtonWithIndicator
          caption={trl('activities.picking.pickingTarget.CloseTarget')}
          onClick={onCloseTargetClicked}
        />
      )}
      {!currentTarget && <NewTargets wfProcessId={wfProcessId} />}
    </div>
  );
};

//
//
//--------------------------------------------------------------------------
//
//

const NewTargets = ({ wfProcessId }) => {
  const dispatch = useDispatch();
  const history = useHistory();

  const { isTargetsLoading, targets, tuTargets } = usePickTargets({ wfProcessId });

  const location = useLocation();
  const useTUFunctions = isItAboutTUs(location);
  const pickTargetHelper = {
    setPickTarget: useTUFunctions ? setTUPickTarget : setPickTarget,
    actualTargets: useTUFunctions ? tuTargets : targets,
  };

  const onSelectTargetClicked = async (target) => {
    pickTargetHelper
      .setPickTarget({ wfProcessId, target })
      .then((wfProcess) => dispatch(updateWFProcess({ wfProcess })))
      .then(() => history.go(-1)); // go back to Picking Job
  };

  return (
    <>
      {isTargetsLoading && <Spinner />}
      {pickTargetHelper.actualTargets &&
        pickTargetHelper.actualTargets.map((target, index) => {
          return (
            <ButtonWithIndicator
              key={index}
              caption={target.caption}
              onClick={() => onSelectTargetClicked(target)}
              additionalCssClass={target.default ? 'green-border-button' : undefined}
            />
          );
        })}
    </>
  );
};
NewTargets.propTypes = {
  wfProcessId: PropTypes.string,
};

//
//
//--------------------------------------------------------------------------
//
//

const useHeaderUpdate = ({ url, currentTarget }) => {
  const dispatch = useDispatch();

  const currentTargetCaption = currentTarget?.caption;

  useEffect(() => {
    dispatch(
      pushHeaderEntry({
        location: url,
        caption: trl('activities.picking.pickingTarget.Select'),
        values: [
          {
            caption: trl('activities.picking.pickingTarget.Current'),
            value: currentTargetCaption,
            hidden: !currentTargetCaption,
          },
        ],
      })
    );
  }, [url, currentTargetCaption]);
};
