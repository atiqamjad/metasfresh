UPDATE AD_EventLog
SET eventtypename='DISTRIBUTED'
WHERE eventtypename='REMOTE';

-- 2022-04-26T12:59:02.564Z
DELETE FROM  AD_Ref_List_Trl WHERE AD_Ref_List_ID=541510
;

-- 2022-04-26T12:59:02.571Z
DELETE FROM AD_Ref_List WHERE AD_Ref_List_ID=541510
;

