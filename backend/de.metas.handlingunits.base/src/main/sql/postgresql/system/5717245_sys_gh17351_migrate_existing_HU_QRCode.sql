insert into m_hu_qrcode_assignment(m_hu_qrcode_assignment_id, m_hu_id, m_hu_qrcode_id, ad_client_id, ad_org_id, created, createdby, isactive, updated, updatedby)
select NEXTVAL('m_hu_qrcode_assignment_seq'), m_hu_id, m_hu_qrcode_id, ad_client_id, ad_org_id, created, 99, isactive, now()::timestamp with time zone, 99 from m_hu_qrcode;