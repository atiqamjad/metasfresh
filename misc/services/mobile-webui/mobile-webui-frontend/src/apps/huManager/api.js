import axios from 'axios';
import { apiBasePath } from '../../constants';
import { unboxAxiosResponse } from '../../utils';
import { toQRCodeString } from '../../utils/qrCode/hu';
import { toLocatorQRCodeString } from '../../utils/qrCode/locator';

const huAPIBasePath = `${apiBasePath}/material/handlingunits`;

export const getHUByQRCode = (qrCode) => {
  return axios
    .post(`${huAPIBasePath}/byQRCode`, { qrCode })
    .then(unboxAxiosResponse)
    .then((response) => response.result);
};

export const disposeHU = ({ huId, reasonCode }) => {
  return axios.post(`${huAPIBasePath}/byId/${huId}/dispose?reasonCode=${reasonCode}`).then(unboxAxiosResponse);
};

export const getDisposalReasonsArray = () => {
  return axios
    .get(`${huAPIBasePath}/disposalReasons`)
    .then(unboxAxiosResponse)
    .then((response) => response.reasons);
};

/**
 * @returns {Promise<T>} handling unit info
 */
export const moveHU = ({ huId, huQRCode, targetQRCode }) => {
  return axios
    .post(`${huAPIBasePath}/move`, {
      huId,
      huQRCode: toQRCodeString(huQRCode),
      targetQRCode: toQRCodeString(targetQRCode),
    })
    .then(unboxAxiosResponse)
    .then((response) => response.result);
};

/**
 * @returns {Promise<T>} handling unit info
 */
export function getAllowedClearanceStatusesRequest({ huId }) {
  return axios
    .get(`${huAPIBasePath}/byId/${huId}/allowedClearanceStatuses`)
    .then(unboxAxiosResponse)
    .then((response) => response.clearanceStatuses);
}

export function setClearanceStatusRequest({ huId, clearanceNote = null, clearanceStatus }) {
  return axios.put(`${huAPIBasePath}/clearance`, {
    huIdentifier: { metasfreshId: huId },
    clearanceStatus,
    clearanceNote,
  });
}

export const changeQty = ({
  huId,
  huQRCode,
  description,
  qty,
  locatorQRCode,
  setBestBeforeDate,
  bestBeforeDate,
  setLotNo,
  lotNo,
}) => {
  return axios
    .post(`${huAPIBasePath}/qty`, {
      huId,
      huQRCode: toQRCodeString(huQRCode),
      qty,
      description,
      locatorQRCode: locatorQRCode ? toLocatorQRCodeString(locatorQRCode) : null,
      splitOneIfAggregated: true,
      setBestBeforeDate,
      bestBeforeDate: setBestBeforeDate ? bestBeforeDate : null,
      setLotNo,
      lotNo: setLotNo ? lotNo : null,
    })
    .then(unboxAxiosResponse)
    .then((response) => response.result);
};
