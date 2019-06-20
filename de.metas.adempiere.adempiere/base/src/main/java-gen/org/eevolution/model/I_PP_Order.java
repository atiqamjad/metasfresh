package org.eevolution.model;


/** Generated Interface for PP_Order
 *  @author Adempiere (generated)
 */
@SuppressWarnings("javadoc")
public interface I_PP_Order
{

    /** TableName=PP_Order */
    String Table_Name = "PP_Order";

    /** AD_Table_ID=53027 */
//    public static final int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);

//    org.compiere.util.KeyNamePair Model = new org.compiere.util.KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 1 - Org
     */
//    java.math.BigDecimal accessLevel = java.math.BigDecimal.valueOf(1);

    /** Load Meta Data */

	/**
	 * Get Mandant.
	 * Client/Tenant for this installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Client_ID();

	org.compiere.model.I_AD_Client getAD_Client();

    /** Column definition for AD_Client_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Client> COLUMN_AD_Client_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Client>(I_PP_Order.class, "AD_Client_ID", org.compiere.model.I_AD_Client.class);
    /** Column name AD_Client_ID */
    String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Org_ID();

	org.compiere.model.I_AD_Org getAD_Org();

	void setAD_Org(org.compiere.model.I_AD_Org AD_Org);

    /** Column definition for AD_Org_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Org> COLUMN_AD_Org_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Org>(I_PP_Order.class, "AD_Org_ID", org.compiere.model.I_AD_Org.class);
    /** Column name AD_Org_ID */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Set Buchende Organisation.
	 * Performing or initiating organization
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setAD_OrgTrx_ID (int AD_OrgTrx_ID);

	/**
	 * Get Buchende Organisation.
	 * Performing or initiating organization
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getAD_OrgTrx_ID();

	org.compiere.model.I_AD_Org getAD_OrgTrx();

	void setAD_OrgTrx(org.compiere.model.I_AD_Org AD_OrgTrx);

    /** Column definition for AD_OrgTrx_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Org> COLUMN_AD_OrgTrx_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Org>(I_PP_Order.class, "AD_OrgTrx_ID", org.compiere.model.I_AD_Org.class);
    /** Column name AD_OrgTrx_ID */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

	/**
	 * Set Workflow.
	 * Workflow or combination of tasks
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setAD_Workflow_ID (int AD_Workflow_ID);

	/**
	 * Get Workflow.
	 * Workflow or combination of tasks
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getAD_Workflow_ID();

	org.compiere.model.I_AD_Workflow getAD_Workflow();

	void setAD_Workflow(org.compiere.model.I_AD_Workflow AD_Workflow);

    /** Column definition for AD_Workflow_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Workflow> COLUMN_AD_Workflow_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_Workflow>(I_PP_Order.class, "AD_Workflow_ID", org.compiere.model.I_AD_Workflow.class);
    /** Column name AD_Workflow_ID */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";

	/**
	 * Set Quantity Assay.
	 * Indicated the Quantity Assay to use into Quality Order
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setAssay (java.math.BigDecimal Assay);

	/**
	 * Get Quantity Assay.
	 * Indicated the Quantity Assay to use into Quality Order
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getAssay();

    /** Column definition for Assay */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Assay = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Assay", null);
    /** Column name Assay */
    String COLUMNNAME_Assay = "Assay";

	/**
	 * Set Kostenstelle.
	 * Kostenstelle
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_Activity_ID (int C_Activity_ID);

	/**
	 * Get Kostenstelle.
	 * Kostenstelle
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_Activity_ID();

	org.compiere.model.I_C_Activity getC_Activity();

	void setC_Activity(org.compiere.model.I_C_Activity C_Activity);

    /** Column definition for C_Activity_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_Activity> COLUMN_C_Activity_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_Activity>(I_PP_Order.class, "C_Activity_ID", org.compiere.model.I_C_Activity.class);
    /** Column name C_Activity_ID */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

	/**
	 * Set Geschäftspartner.
	 * Bezeichnet einen Geschäftspartner
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_BPartner_ID (int C_BPartner_ID);

	/**
	 * Get Geschäftspartner.
	 * Bezeichnet einen Geschäftspartner
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_BPartner_ID();

	org.compiere.model.I_C_BPartner getC_BPartner();

	void setC_BPartner(org.compiere.model.I_C_BPartner C_BPartner);

    /** Column definition for C_BPartner_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_BPartner> COLUMN_C_BPartner_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_BPartner>(I_PP_Order.class, "C_BPartner_ID", org.compiere.model.I_C_BPartner.class);
    /** Column name C_BPartner_ID */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/**
	 * Set Werbemassnahme.
	 * Marketing Campaign
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_Campaign_ID (int C_Campaign_ID);

	/**
	 * Get Werbemassnahme.
	 * Marketing Campaign
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_Campaign_ID();

	org.compiere.model.I_C_Campaign getC_Campaign();

	void setC_Campaign(org.compiere.model.I_C_Campaign C_Campaign);

    /** Column definition for C_Campaign_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_Campaign> COLUMN_C_Campaign_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_Campaign>(I_PP_Order.class, "C_Campaign_ID", org.compiere.model.I_C_Campaign.class);
    /** Column name C_Campaign_ID */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

	/**
	 * Set Belegart.
	 * Document type or rules
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_DocType_ID (int C_DocType_ID);

	/**
	 * Get Belegart.
	 * Document type or rules
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_DocType_ID();

	org.compiere.model.I_C_DocType getC_DocType();

	void setC_DocType(org.compiere.model.I_C_DocType C_DocType);

    /** Column definition for C_DocType_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_DocType> COLUMN_C_DocType_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_DocType>(I_PP_Order.class, "C_DocType_ID", org.compiere.model.I_C_DocType.class);
    /** Column name C_DocType_ID */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/**
	 * Set Zielbelegart.
	 * Target document type for conversing documents
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setC_DocTypeTarget_ID (int C_DocTypeTarget_ID);

	/**
	 * Get Zielbelegart.
	 * Target document type for conversing documents
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getC_DocTypeTarget_ID();

	org.compiere.model.I_C_DocType getC_DocTypeTarget();

	void setC_DocTypeTarget(org.compiere.model.I_C_DocType C_DocTypeTarget);

    /** Column definition for C_DocTypeTarget_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_DocType> COLUMN_C_DocTypeTarget_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_DocType>(I_PP_Order.class, "C_DocTypeTarget_ID", org.compiere.model.I_C_DocType.class);
    /** Column name C_DocTypeTarget_ID */
    String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";

	/**
	 * Set Auftrag.
	 * Auftrag
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: true (lazy loading)
	 * @deprecated Please don't use it because this is a virtual column
	 */
	@Deprecated void setC_Order_ID (int C_Order_ID);

	/**
	 * Get Auftrag.
	 * Auftrag
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: true (lazy loading)
	 * @deprecated Please don't use it because this is a lazy loading column and it might affect the performances
	 */
	@Deprecated int getC_Order_ID();

	@Deprecated org.compiere.model.I_C_Order getC_Order();

	@Deprecated void setC_Order(org.compiere.model.I_C_Order C_Order);

    /** Column definition for C_Order_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_Order> COLUMN_C_Order_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_Order>(I_PP_Order.class, "C_Order_ID", org.compiere.model.I_C_Order.class);
    /** Column name C_Order_ID */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";

	/**
	 * Set Auftragsposition.
	 * Sales Order Line
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_OrderLine_ID (int C_OrderLine_ID);

	/**
	 * Get Auftragsposition.
	 * Sales Order Line
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_OrderLine_ID();

	org.compiere.model.I_C_OrderLine getC_OrderLine();

	void setC_OrderLine(org.compiere.model.I_C_OrderLine C_OrderLine);

    /** Column definition for C_OrderLine_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_OrderLine> COLUMN_C_OrderLine_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_OrderLine>(I_PP_Order.class, "C_OrderLine_ID", org.compiere.model.I_C_OrderLine.class);
    /** Column name C_OrderLine_ID */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";

	/**
	 * Set Auftragsposition (MTO).
	 * Auftragsposition (Make to Order)
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setC_OrderLine_MTO_ID (int C_OrderLine_MTO_ID);

	/**
	 * Get Auftragsposition (MTO).
	 * Auftragsposition (Make to Order)
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getC_OrderLine_MTO_ID();

	org.compiere.model.I_C_OrderLine getC_OrderLine_MTO();

	void setC_OrderLine_MTO(org.compiere.model.I_C_OrderLine C_OrderLine_MTO);

    /** Column definition for C_OrderLine_MTO_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_OrderLine> COLUMN_C_OrderLine_MTO_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_OrderLine>(I_PP_Order.class, "C_OrderLine_MTO_ID", org.compiere.model.I_C_OrderLine.class);
    /** Column name C_OrderLine_MTO_ID */
    String COLUMNNAME_C_OrderLine_MTO_ID = "C_OrderLine_MTO_ID";

	/**
	 * Set Maßeinheit.
	 * Unit of Measure
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setC_UOM_ID (int C_UOM_ID);

	/**
	 * Get Maßeinheit.
	 * Unit of Measure
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getC_UOM_ID();

	org.compiere.model.I_C_UOM getC_UOM();

	void setC_UOM(org.compiere.model.I_C_UOM C_UOM);

    /** Column definition for C_UOM_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_UOM> COLUMN_C_UOM_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_UOM>(I_PP_Order.class, "C_UOM_ID", org.compiere.model.I_C_UOM.class);
    /** Column name C_UOM_ID */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/**
	 * Set Copy From.
	 * Copy From Record
	 *
	 * <br>Type: Button
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setCopyFrom (java.lang.String CopyFrom);

	/**
	 * Get Copy From.
	 * Copy From Record
	 *
	 * <br>Type: Button
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.lang.String getCopyFrom();

    /** Column definition for CopyFrom */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_CopyFrom = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "CopyFrom", null);
    /** Column name CopyFrom */
    String COLUMNNAME_CopyFrom = "CopyFrom";

	/**
	 * Get Erstellt.
	 * Date this record was created
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getCreated();

    /** Column definition for Created */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Created = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Created", null);
    /** Column name Created */
    String COLUMNNAME_Created = "Created";

	/**
	 * Get Erstellt durch.
	 * User who created this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getCreatedBy();

    /** Column definition for CreatedBy */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_User> COLUMN_CreatedBy = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_User>(I_PP_Order.class, "CreatedBy", org.compiere.model.I_AD_User.class);
    /** Column name CreatedBy */
    String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set DateConfirm.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateConfirm (java.sql.Timestamp DateConfirm);

	/**
	 * Get DateConfirm.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateConfirm();

    /** Column definition for DateConfirm */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateConfirm = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateConfirm", null);
    /** Column name DateConfirm */
    String COLUMNNAME_DateConfirm = "DateConfirm";

	/**
	 * Set Lieferdatum.
	 * Date when the product was delivered
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateDelivered (java.sql.Timestamp DateDelivered);

	/**
	 * Get Lieferdatum.
	 * Date when the product was delivered
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateDelivered();

    /** Column definition for DateDelivered */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateDelivered = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateDelivered", null);
    /** Column name DateDelivered */
    String COLUMNNAME_DateDelivered = "DateDelivered";

	/**
	 * Set Projektabschluss.
	 * Finish or (planned) completion date
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateFinish (java.sql.Timestamp DateFinish);

	/**
	 * Get Projektabschluss.
	 * Finish or (planned) completion date
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateFinish();

    /** Column definition for DateFinish */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateFinish = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateFinish", null);
    /** Column name DateFinish */
    String COLUMNNAME_DateFinish = "DateFinish";

	/**
	 * Set DateFinishSchedule.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateFinishSchedule (java.sql.Timestamp DateFinishSchedule);

	/**
	 * Get DateFinishSchedule.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateFinishSchedule();

    /** Column definition for DateFinishSchedule */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateFinishSchedule = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateFinishSchedule", null);
    /** Column name DateFinishSchedule */
    String COLUMNNAME_DateFinishSchedule = "DateFinishSchedule";

	/**
	 * Set Auftragsdatum.
	 * Date of Order
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDateOrdered (java.sql.Timestamp DateOrdered);

	/**
	 * Get Auftragsdatum.
	 * Date of Order
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateOrdered();

    /** Column definition for DateOrdered */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateOrdered = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateOrdered", null);
    /** Column name DateOrdered */
    String COLUMNNAME_DateOrdered = "DateOrdered";

	/**
	 * Set Zugesagter Termin.
	 * Date Order was promised
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDatePromised (java.sql.Timestamp DatePromised);

	/**
	 * Get Zugesagter Termin.
	 * Date Order was promised
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDatePromised();

    /** Column definition for DatePromised */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DatePromised = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DatePromised", null);
    /** Column name DatePromised */
    String COLUMNNAME_DatePromised = "DatePromised";

	/**
	 * Set DateStart.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDateStart (java.sql.Timestamp DateStart);

	/**
	 * Get DateStart.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateStart();

    /** Column definition for DateStart */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateStart = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateStart", null);
    /** Column name DateStart */
    String COLUMNNAME_DateStart = "DateStart";

	/**
	 * Set DateStartSchedule.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDateStartSchedule (java.sql.Timestamp DateStartSchedule);

	/**
	 * Get DateStartSchedule.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getDateStartSchedule();

    /** Column definition for DateStartSchedule */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DateStartSchedule = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DateStartSchedule", null);
    /** Column name DateStartSchedule */
    String COLUMNNAME_DateStartSchedule = "DateStartSchedule";

	/**
	 * Set Beschreibung.
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setDescription (java.lang.String Description);

	/**
	 * Get Beschreibung.
	 *
	 * <br>Type: Text
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.lang.String getDescription();

    /** Column definition for Description */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Description = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Description", null);
    /** Column name Description */
    String COLUMNNAME_Description = "Description";

	/**
	 * Set Belegverarbeitung.
	 * The targeted status of the document
	 *
	 * <br>Type: Button
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDocAction (java.lang.String DocAction);

	/**
	 * Get Belegverarbeitung.
	 * The targeted status of the document
	 *
	 * <br>Type: Button
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getDocAction();

    /** Column definition for DocAction */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DocAction = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DocAction", null);
    /** Column name DocAction */
    String COLUMNNAME_DocAction = "DocAction";

	/**
	 * Set Belegstatus.
	 * The current status of the document
	 *
	 * <br>Type: List
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDocStatus (java.lang.String DocStatus);

	/**
	 * Get Belegstatus.
	 * The current status of the document
	 *
	 * <br>Type: List
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getDocStatus();

    /** Column definition for DocStatus */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DocStatus = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DocStatus", null);
    /** Column name DocStatus */
    String COLUMNNAME_DocStatus = "DocStatus";

	/**
	 * Set Beleg Nr..
	 * Document sequence number of the document
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setDocumentNo (java.lang.String DocumentNo);

	/**
	 * Get Beleg Nr..
	 * Document sequence number of the document
	 *
	 * <br>Type: String
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getDocumentNo();

    /** Column definition for DocumentNo */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_DocumentNo = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "DocumentNo", null);
    /** Column name DocumentNo */
    String COLUMNNAME_DocumentNo = "DocumentNo";

	/**
	 * Set Float After.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setFloatAfter (java.math.BigDecimal FloatAfter);

	/**
	 * Get Float After.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getFloatAfter();

    /** Column definition for FloatAfter */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_FloatAfter = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "FloatAfter", null);
    /** Column name FloatAfter */
    String COLUMNNAME_FloatAfter = "FloatAfter";

	/**
	 * Set Float Befored.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setFloatBefored (java.math.BigDecimal FloatBefored);

	/**
	 * Get Float Befored.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getFloatBefored();

    /** Column definition for FloatBefored */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_FloatBefored = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "FloatBefored", null);
    /** Column name FloatBefored */
    String COLUMNNAME_FloatBefored = "FloatBefored";

	/**
	 * Set Aktiv.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsActive (boolean IsActive);

	/**
	 * Get Aktiv.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isActive();

    /** Column definition for IsActive */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_IsActive = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "IsActive", null);
    /** Column name IsActive */
    String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Set Freigegeben.
	 * Indicates if this document requires approval
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsApproved (boolean IsApproved);

	/**
	 * Get Freigegeben.
	 * Indicates if this document requires approval
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isApproved();

    /** Column definition for IsApproved */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_IsApproved = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "IsApproved", null);
    /** Column name IsApproved */
    String COLUMNNAME_IsApproved = "IsApproved";

	/**
	 * Set andrucken.
	 * Indicates if this document / line is printed
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsPrinted (boolean IsPrinted);

	/**
	 * Get andrucken.
	 * Indicates if this document / line is printed
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isPrinted();

    /** Column definition for IsPrinted */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_IsPrinted = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "IsPrinted", null);
    /** Column name IsPrinted */
    String COLUMNNAME_IsPrinted = "IsPrinted";

	/**
	 * Set Is Qty Percentage.
	 * Indicate that this component is based in % Quantity
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setIsQtyPercentage (boolean IsQtyPercentage);

	/**
	 * Get Is Qty Percentage.
	 * Indicate that this component is based in % Quantity
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	boolean isQtyPercentage();

    /** Column definition for IsQtyPercentage */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_IsQtyPercentage = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "IsQtyPercentage", null);
    /** Column name IsQtyPercentage */
    String COLUMNNAME_IsQtyPercentage = "IsQtyPercentage";

	/**
	 * Set Selektiert.
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsSelected (boolean IsSelected);

	/**
	 * Get Selektiert.
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isSelected();

    /** Column definition for IsSelected */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_IsSelected = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "IsSelected", null);
    /** Column name IsSelected */
    String COLUMNNAME_IsSelected = "IsSelected";

	/**
	 * Set Verkaufs-Transaktion.
	 * This is a Sales Transaction
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setIsSOTrx (boolean IsSOTrx);

	/**
	 * Get Verkaufs-Transaktion.
	 * This is a Sales Transaction
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isSOTrx();

    /** Column definition for IsSOTrx */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_IsSOTrx = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "IsSOTrx", null);
    /** Column name IsSOTrx */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";

	/**
	 * Set Zeile Nr..
	 * Unique line for this document
	 *
	 * <br>Type: Integer
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setLine (int Line);

	/**
	 * Get Zeile Nr..
	 * Unique line for this document
	 *
	 * <br>Type: Integer
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getLine();

    /** Column definition for Line */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Line = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Line", null);
    /** Column name Line */
    String COLUMNNAME_Line = "Line";

	/**
	 * Set Los-Nr..
	 * Los-Nummer (alphanumerisch)
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setLot (java.lang.String Lot);

	/**
	 * Get Los-Nr..
	 * Los-Nummer (alphanumerisch)
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.lang.String getLot();

    /** Column definition for Lot */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Lot = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Lot", null);
    /** Column name Lot */
    String COLUMNNAME_Lot = "Lot";

	/**
	 * Set Merkmale.
	 * Merkmals Ausprägungen zum Produkt
	 *
	 * <br>Type: PAttribute
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID);

	/**
	 * Get Merkmale.
	 * Merkmals Ausprägungen zum Produkt
	 *
	 * <br>Type: PAttribute
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getM_AttributeSetInstance_ID();

	org.compiere.model.I_M_AttributeSetInstance getM_AttributeSetInstance();

	void setM_AttributeSetInstance(org.compiere.model.I_M_AttributeSetInstance M_AttributeSetInstance);

    /** Column definition for M_AttributeSetInstance_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_AttributeSetInstance> COLUMN_M_AttributeSetInstance_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_AttributeSetInstance>(I_PP_Order.class, "M_AttributeSetInstance_ID", org.compiere.model.I_M_AttributeSetInstance.class);
    /** Column name M_AttributeSetInstance_ID */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

	/**
	 * Set Lagerort.
	 * Lagerort im Lager
	 *
	 * <br>Type: Locator
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setM_Locator_ID (int M_Locator_ID);

	/**
	 * Get Lagerort.
	 * Lagerort im Lager
	 *
	 * <br>Type: Locator
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getM_Locator_ID();

	org.compiere.model.I_M_Locator getM_Locator();

	void setM_Locator(org.compiere.model.I_M_Locator M_Locator);

    /** Column definition for M_Locator_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_Locator> COLUMN_M_Locator_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_Locator>(I_PP_Order.class, "M_Locator_ID", org.compiere.model.I_M_Locator.class);
    /** Column name M_Locator_ID */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

	/**
	 * Set Produkt.
	 * Produkt, Leistung, Artikel
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setM_Product_ID (int M_Product_ID);

	/**
	 * Get Produkt.
	 * Produkt, Leistung, Artikel
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getM_Product_ID();

//	public org.compiere.model.I_M_Product getM_Product();
//
//	public void setM_Product(org.compiere.model.I_M_Product M_Product);

    /** Column definition for M_Product_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_Product> COLUMN_M_Product_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_Product>(I_PP_Order.class, "M_Product_ID", org.compiere.model.I_M_Product.class);
    /** Column name M_Product_ID */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/**
	 * Set Lager.
	 * Storage Warehouse and Service Point
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setM_Warehouse_ID (int M_Warehouse_ID);

	/**
	 * Get Lager.
	 * Storage Warehouse and Service Point
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getM_Warehouse_ID();

	org.compiere.model.I_M_Warehouse getM_Warehouse();

	void setM_Warehouse(org.compiere.model.I_M_Warehouse M_Warehouse);

    /** Column definition for M_Warehouse_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_Warehouse> COLUMN_M_Warehouse_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_M_Warehouse>(I_PP_Order.class, "M_Warehouse_ID", org.compiere.model.I_M_Warehouse.class);
    /** Column name M_Warehouse_ID */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

	/**
	 * Set MRP Allow Cleanup.
	 * MRP is allowed to remove this document
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setMRP_AllowCleanup (boolean MRP_AllowCleanup);

	/**
	 * Get MRP Allow Cleanup.
	 * MRP is allowed to remove this document
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isMRP_AllowCleanup();

    /** Column definition for MRP_AllowCleanup */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_MRP_AllowCleanup = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "MRP_AllowCleanup", null);
    /** Column name MRP_AllowCleanup */
    String COLUMNNAME_MRP_AllowCleanup = "MRP_AllowCleanup";

	/**
	 * Set MRP Generated Document.
	 * This document was generated by MRP
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setMRP_Generated (boolean MRP_Generated);

	/**
	 * Get MRP Generated Document.
	 * This document was generated by MRP
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isMRP_Generated();

    /** Column definition for MRP_Generated */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_MRP_Generated = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "MRP_Generated", null);
    /** Column name MRP_Generated */
    String COLUMNNAME_MRP_Generated = "MRP_Generated";

	/**
	 * Set To be deleted (MRP).
	 * Indicates if this document is scheduled to be deleted by MRP
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setMRP_ToDelete (boolean MRP_ToDelete);

	/**
	 * Get To be deleted (MRP).
	 * Indicates if this document is scheduled to be deleted by MRP
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isMRP_ToDelete();

    /** Column definition for MRP_ToDelete */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_MRP_ToDelete = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "MRP_ToDelete", null);
    /** Column name MRP_ToDelete */
    String COLUMNNAME_MRP_ToDelete = "MRP_ToDelete";

	/**
	 * Set OrderType.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setOrderType (java.lang.String OrderType);

	/**
	 * Get OrderType.
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.lang.String getOrderType();

    /** Column definition for OrderType */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_OrderType = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "OrderType", null);
    /** Column name OrderType */
    String COLUMNNAME_OrderType = "OrderType";

	/**
	 * Set Planner.
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setPlanner_ID (int Planner_ID);

	/**
	 * Get Planner.
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getPlanner_ID();

	org.compiere.model.I_AD_User getPlanner();

	void setPlanner(org.compiere.model.I_AD_User Planner);

    /** Column definition for Planner_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_User> COLUMN_Planner_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_User>(I_PP_Order.class, "Planner_ID", org.compiere.model.I_AD_User.class);
    /** Column name Planner_ID */
    String COLUMNNAME_Planner_ID = "Planner_ID";

	/**
	 * Set Planning status.
	 *
	 * <br>Type: List
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setPlanningStatus (java.lang.String PlanningStatus);

	/**
	 * Get Planning status.
	 *
	 * <br>Type: List
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getPlanningStatus();

    /** Column definition for PlanningStatus */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_PlanningStatus = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "PlanningStatus", null);
    /** Column name PlanningStatus */
    String COLUMNNAME_PlanningStatus = "PlanningStatus";

	/**
	 * Set Verbucht.
	 * Posting status
	 *
	 * <br>Type: Button
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setPosted (boolean Posted);

	/**
	 * Get Verbucht.
	 * Posting status
	 *
	 * <br>Type: Button
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	boolean isPosted();

    /** Column definition for Posted */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Posted = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Posted", null);
    /** Column name Posted */
    String COLUMNNAME_Posted = "Posted";

	/**
	 * Set Produktionsauftrag.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setPP_Order_ID (int PP_Order_ID);

	/**
	 * Get Produktionsauftrag.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getPP_Order_ID();

    /** Column definition for PP_Order_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_PP_Order_ID = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "PP_Order_ID", null);
    /** Column name PP_Order_ID */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";

	/**
	 * Set BOM & Formula.
	 * BOM & Formula
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setPP_Product_BOM_ID (int PP_Product_BOM_ID);

	/**
	 * Get BOM & Formula.
	 * BOM & Formula
	 *
	 * <br>Type: Search
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getPP_Product_BOM_ID();

	org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM();

	void setPP_Product_BOM(org.eevolution.model.I_PP_Product_BOM PP_Product_BOM);

    /** Column definition for PP_Product_BOM_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.eevolution.model.I_PP_Product_BOM> COLUMN_PP_Product_BOM_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.eevolution.model.I_PP_Product_BOM>(I_PP_Order.class, "PP_Product_BOM_ID", org.eevolution.model.I_PP_Product_BOM.class);
    /** Column name PP_Product_BOM_ID */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";

	/**
	 * Set Product Planning.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setPP_Product_Planning_ID (int PP_Product_Planning_ID);

	/**
	 * Get Product Planning.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getPP_Product_Planning_ID();

	org.eevolution.model.I_PP_Product_Planning getPP_Product_Planning();

	void setPP_Product_Planning(org.eevolution.model.I_PP_Product_Planning PP_Product_Planning);

    /** Column definition for PP_Product_Planning_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.eevolution.model.I_PP_Product_Planning> COLUMN_PP_Product_Planning_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.eevolution.model.I_PP_Product_Planning>(I_PP_Order.class, "PP_Product_Planning_ID", org.eevolution.model.I_PP_Product_Planning.class);
    /** Column name PP_Product_Planning_ID */
    String COLUMNNAME_PP_Product_Planning_ID = "PP_Product_Planning_ID";

	/**
	 * Set Bereitstellungsdatum.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setPreparationDate (java.sql.Timestamp PreparationDate);

	/**
	 * Get Bereitstellungsdatum.
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getPreparationDate();

    /** Column definition for PreparationDate */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_PreparationDate = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "PreparationDate", null);
    /** Column name PreparationDate */
    String COLUMNNAME_PreparationDate = "PreparationDate";

	/**
	 * Set Priorität.
	 * Priority of a document
	 *
	 * <br>Type: List
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setPriorityRule (java.lang.String PriorityRule);

	/**
	 * Get Priorität.
	 * Priority of a document
	 *
	 * <br>Type: List
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.lang.String getPriorityRule();

    /** Column definition for PriorityRule */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_PriorityRule = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "PriorityRule", null);
    /** Column name PriorityRule */
    String COLUMNNAME_PriorityRule = "PriorityRule";

	/**
	 * Set Verarbeitet.
	 * Checkbox sagt aus, ob der Beleg verarbeitet wurde.
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setProcessed (boolean Processed);

	/**
	 * Get Verarbeitet.
	 * Checkbox sagt aus, ob der Beleg verarbeitet wurde.
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	boolean isProcessed();

    /** Column definition for Processed */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Processed = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Processed", null);
    /** Column name Processed */
    String COLUMNNAME_Processed = "Processed";

	/**
	 * Set Verarbeiten.
	 *
	 * <br>Type: Button
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setProcessing (boolean Processing);

	/**
	 * Get Verarbeiten.
	 *
	 * <br>Type: Button
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	boolean isProcessing();

    /** Column definition for Processing */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Processing = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Processing", null);
    /** Column name Processing */
    String COLUMNNAME_Processing = "Processing";

	/**
	 * Set Qty Batchs.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setQtyBatchs (java.math.BigDecimal QtyBatchs);

	/**
	 * Get Qty Batchs.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyBatchs();

    /** Column definition for QtyBatchs */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyBatchs = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyBatchs", null);
    /** Column name QtyBatchs */
    String COLUMNNAME_QtyBatchs = "QtyBatchs";

	/**
	 * Set Qty Batch Size.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setQtyBatchSize (java.math.BigDecimal QtyBatchSize);

	/**
	 * Get Qty Batch Size.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyBatchSize();

    /** Column definition for QtyBatchSize */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyBatchSize = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyBatchSize", null);
    /** Column name QtyBatchSize */
    String COLUMNNAME_QtyBatchSize = "QtyBatchSize";

	/**
	 * Set Qty before close.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setQtyBeforeClose (java.math.BigDecimal QtyBeforeClose);

	/**
	 * Get Qty before close.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyBeforeClose();

    /** Column definition for QtyBeforeClose */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyBeforeClose = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyBeforeClose", null);
    /** Column name QtyBeforeClose */
    String COLUMNNAME_QtyBeforeClose = "QtyBeforeClose";

	/**
	 * Set Gelieferte Menge.
	 * Delivered Quantity
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setQtyDelivered (java.math.BigDecimal QtyDelivered);

	/**
	 * Get Gelieferte Menge.
	 * Delivered Quantity
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyDelivered();

    /** Column definition for QtyDelivered */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyDelivered = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyDelivered", null);
    /** Column name QtyDelivered */
    String COLUMNNAME_QtyDelivered = "QtyDelivered";

	/**
	 * Set Menge.
	 * The Quantity Entered is based on the selected UoM
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setQtyEntered (java.math.BigDecimal QtyEntered);

	/**
	 * Get Menge.
	 * The Quantity Entered is based on the selected UoM
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyEntered();

    /** Column definition for QtyEntered */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyEntered = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyEntered", null);
    /** Column name QtyEntered */
    String COLUMNNAME_QtyEntered = "QtyEntered";

	/**
	 * Set Bestellte Menge.
	 * Ordered Quantity
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setQtyOrdered (java.math.BigDecimal QtyOrdered);

	/**
	 * Get Bestellte Menge.
	 * Ordered Quantity
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyOrdered();

    /** Column definition for QtyOrdered */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyOrdered = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyOrdered", null);
    /** Column name QtyOrdered */
    String COLUMNNAME_QtyOrdered = "QtyOrdered";

	/**
	 * Set Qty Reject.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setQtyReject (java.math.BigDecimal QtyReject);

	/**
	 * Get Qty Reject.
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyReject();

    /** Column definition for QtyReject */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyReject = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyReject", null);
    /** Column name QtyReject */
    String COLUMNNAME_QtyReject = "QtyReject";

	/**
	 * Set Reservierte Menge.
	 * Reserved Quantity
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setQtyReserved (java.math.BigDecimal QtyReserved);

	/**
	 * Get Reservierte Menge.
	 * Reserved Quantity
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyReserved();

    /** Column definition for QtyReserved */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyReserved = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyReserved", null);
    /** Column name QtyReserved */
    String COLUMNNAME_QtyReserved = "QtyReserved";

	/**
	 * Set QtyScrap.
	 * Scrap Quantity for this componet
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setQtyScrap (java.math.BigDecimal QtyScrap);

	/**
	 * Get QtyScrap.
	 * Scrap Quantity for this componet
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getQtyScrap();

    /** Column definition for QtyScrap */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_QtyScrap = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "QtyScrap", null);
    /** Column name QtyScrap */
    String COLUMNNAME_QtyScrap = "QtyScrap";

	/**
	 * Set Ressource.
	 * Resource
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setS_Resource_ID (int S_Resource_ID);

	/**
	 * Get Ressource.
	 * Resource
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getS_Resource_ID();

	org.compiere.model.I_S_Resource getS_Resource();

	void setS_Resource(org.compiere.model.I_S_Resource S_Resource);

    /** Column definition for S_Resource_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_S_Resource> COLUMN_S_Resource_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_S_Resource>(I_PP_Order.class, "S_Resource_ID", org.compiere.model.I_S_Resource.class);
    /** Column name S_Resource_ID */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";

	/**
	 * Set Planungs-Art.
	 * Type of schedule
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setScheduleType (java.lang.String ScheduleType);

	/**
	 * Get Planungs-Art.
	 * Type of schedule
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.lang.String getScheduleType();

    /** Column definition for ScheduleType */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_ScheduleType = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "ScheduleType", null);
    /** Column name ScheduleType */
    String COLUMNNAME_ScheduleType = "ScheduleType";

	/**
	 * Set Serien-Nr..
	 * Product Serial Number
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setSerNo (java.lang.String SerNo);

	/**
	 * Get Serien-Nr..
	 * Product Serial Number
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	java.lang.String getSerNo();

    /** Column definition for SerNo */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_SerNo = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "SerNo", null);
    /** Column name SerNo */
    String COLUMNNAME_SerNo = "SerNo";

	/**
	 * Get Aktualisiert.
	 * Date this record was updated
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.sql.Timestamp getUpdated();

    /** Column definition for Updated */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Updated = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Updated", null);
    /** Column name Updated */
    String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Aktualisiert durch.
	 * User who updated this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	int getUpdatedBy();

    /** Column definition for UpdatedBy */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_User> COLUMN_UpdatedBy = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_AD_User>(I_PP_Order.class, "UpdatedBy", org.compiere.model.I_AD_User.class);
    /** Column name UpdatedBy */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/**
	 * Set Nutzer 1.
	 * User defined list element #1
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setUser1_ID (int User1_ID);

	/**
	 * Get Nutzer 1.
	 * User defined list element #1
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getUser1_ID();

	org.compiere.model.I_C_ElementValue getUser1();

	void setUser1(org.compiere.model.I_C_ElementValue User1);

    /** Column definition for User1_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_ElementValue> COLUMN_User1_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_ElementValue>(I_PP_Order.class, "User1_ID", org.compiere.model.I_C_ElementValue.class);
    /** Column name User1_ID */
    String COLUMNNAME_User1_ID = "User1_ID";

	/**
	 * Set Nutzer 2.
	 * User defined list element #2
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	void setUser2_ID (int User2_ID);

	/**
	 * Get Nutzer 2.
	 * User defined list element #2
	 *
	 * <br>Type: Table
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	int getUser2_ID();

	org.compiere.model.I_C_ElementValue getUser2();

	void setUser2(org.compiere.model.I_C_ElementValue User2);

    /** Column definition for User2_ID */
    org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_ElementValue> COLUMN_User2_ID = new org.adempiere.model.ModelColumn<I_PP_Order, org.compiere.model.I_C_ElementValue>(I_PP_Order.class, "User2_ID", org.compiere.model.I_C_ElementValue.class);
    /** Column name User2_ID */
    String COLUMNNAME_User2_ID = "User2_ID";

	/**
	 * Set Yield %.
	 * The Yield is the percentage of a lot that is expected to be of acceptable wuality may fall below 100 percent
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	void setYield (java.math.BigDecimal Yield);

	/**
	 * Get Yield %.
	 * The Yield is the percentage of a lot that is expected to be of acceptable wuality may fall below 100 percent
	 *
	 * <br>Type: Quantity
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	java.math.BigDecimal getYield();

    /** Column definition for Yield */
    org.adempiere.model.ModelColumn<I_PP_Order, Object> COLUMN_Yield = new org.adempiere.model.ModelColumn<I_PP_Order, Object>(I_PP_Order.class, "Yield", null);
    /** Column name Yield */
    String COLUMNNAME_Yield = "Yield";
}
