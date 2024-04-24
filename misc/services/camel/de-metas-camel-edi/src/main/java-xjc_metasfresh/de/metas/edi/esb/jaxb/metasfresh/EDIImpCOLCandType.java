//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.27 at 03:13:42 PM CET 
//


package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for EDI_Imp_C_OLCandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_Imp_C_OLCandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AD_DataDestination_ID" type="{}EDI_Imp_AD_InputDataSource_Lookup_INType" minOccurs="0"/&gt;
 *         &lt;element name="AD_InputDataSource_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AD_Org_ID" type="{}EDI_AD_Org_Lookup_BPL_GLN_vType" minOccurs="0"/&gt;
 *         &lt;element name="AD_User_EnteredBy_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Bill_BPartner_ID" type="{}EDI_C_BPartner_Lookup_BPL_GLN_vType" minOccurs="0"/&gt;
 *         &lt;element name="Bill_Location_ID" type="{}EDI_Imp_C_BPartner_Location_Lookup_GLNType" minOccurs="0"/&gt;
 *         &lt;element name="C_BPartner_ID" type="{}EDI_C_BPartner_Lookup_BPL_GLN_vType" minOccurs="0"/&gt;
 *         &lt;element name="C_BPartner_Location_ID" type="{}EDI_Imp_C_BPartner_Location_Lookup_GLNType" minOccurs="0"/&gt;
 *         &lt;element name="C_Currency_ID" type="{}EDI_Imp_C_Currency_Lookup_ISOCodeType" minOccurs="0"/&gt;
 *         &lt;element name="C_UOM_ID" type="{}EDI_Imp_C_UOM_Lookup_UOMSymbolType" minOccurs="0"/&gt;
 *         &lt;element name="DateCandidate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DeliveryRule" type="{}C_Order_DeliveryRuleEnum" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryViaRule" type="{}C_Order_DeliveryViaRuleEnum" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsManualPrice" type="{}YES-NO"/&gt;
 *         &lt;element name="M_Product_ID" type="{}EDI_M_Product_Lookup_UPC_vType" minOccurs="0"/&gt;
 *         &lt;element name="PriceEntered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyEntered" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="POReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HandOver_Location_ID" type="{}EDI_Imp_C_BPartner_Location_Lookup_GLNType" minOccurs="0"/&gt;
 *         &lt;element name="M_HU_PI_Item_Product_ID" type="{}EDI_M_HU_PI_Item_Product_Lookup_UPC_vType" minOccurs="0"/&gt;
 *         &lt;element name="HandOver_Partner_ID" type="{}EDI_C_BPartner_Lookup_BPL_GLN_vType" minOccurs="0"/&gt;
 *         &lt;element name="DropShip_BPartner_ID" type="{}EDI_C_BPartner_Lookup_BPL_GLN_vType" minOccurs="0"/&gt;
 *         &lt;element name="DropShip_Location_ID" type="{}EDI_Imp_C_BPartner_Location_Lookup_GLNType" minOccurs="0"/&gt;
 *         &lt;element name="QtyItemCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DatePromised" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{}AD_Client_Value"/&gt;
 *       &lt;attribute ref="{}ReplicationEvent"/&gt;
 *       &lt;attribute ref="{}ReplicationMode"/&gt;
 *       &lt;attribute ref="{}ReplicationType"/&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" fixed="*" /&gt;
 *       &lt;attribute ref="{}SequenceNo"/&gt;
 *       &lt;attribute ref="{}TrxName"/&gt;
 *       &lt;attribute ref="{}AD_Session_ID"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_Imp_C_OLCandType", propOrder = {
    "adDataDestinationID",
    "adInputDataSourceID",
    "adOrgID",
    "adUserEnteredByID",
    "billBPartnerID",
    "billLocationID",
    "cbPartnerID",
    "cbPartnerLocationID",
    "cCurrencyID",
    "cuomid",
    "dateCandidate",
    "deliveryRule",
    "deliveryViaRule",
    "description",
    "productDescription",
    "isManualPrice",
    "mProductID",
    "priceEntered",
    "qtyEntered",
    "line",
    "poReference",
    "handOverLocationID",
    "mhupiItemProductID",
    "handOverPartnerID",
    "dropShipBPartnerID",
    "dropShipLocationID",
    "qtyItemCapacity",
    "datePromised"
})
public class EDIImpCOLCandType {

    @XmlElement(name = "AD_DataDestination_ID")
    protected EDIImpADInputDataSourceLookupINType adDataDestinationID;
    @XmlElement(name = "AD_InputDataSource_ID", required = true)
    protected BigInteger adInputDataSourceID;
    @XmlElement(name = "AD_Org_ID")
    protected EDIADOrgLookupBPLGLNVType adOrgID;
    @XmlElement(name = "AD_User_EnteredBy_ID", required = true)
    protected BigInteger adUserEnteredByID;
    @XmlElement(name = "Bill_BPartner_ID")
    protected EDICBPartnerLookupBPLGLNVType billBPartnerID;
    @XmlElement(name = "Bill_Location_ID")
    protected EDIImpCBPartnerLocationLookupGLNType billLocationID;
    @XmlElement(name = "C_BPartner_ID")
    protected EDICBPartnerLookupBPLGLNVType cbPartnerID;
    @XmlElement(name = "C_BPartner_Location_ID")
    protected EDIImpCBPartnerLocationLookupGLNType cbPartnerLocationID;
    @XmlElement(name = "C_Currency_ID")
    protected EDIImpCCurrencyLookupISOCodeType cCurrencyID;
    @XmlElement(name = "C_UOM_ID")
    protected EDIImpCUOMLookupUOMSymbolType cuomid;
    @XmlElement(name = "DateCandidate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateCandidate;
    @XmlElement(name = "DeliveryRule")
    @XmlSchemaType(name = "string")
    protected COrderDeliveryRuleEnum deliveryRule;
    @XmlElement(name = "DeliveryViaRule")
    @XmlSchemaType(name = "string")
    protected COrderDeliveryViaRuleEnum deliveryViaRule;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "IsManualPrice", required = true)
    protected String isManualPrice;
    @XmlElement(name = "M_Product_ID")
    protected EDIMProductLookupUPCVType mProductID;
    @XmlElement(name = "PriceEntered")
    protected BigDecimal priceEntered;
    @XmlElement(name = "QtyEntered", required = true)
    protected BigDecimal qtyEntered;
    @XmlElement(name = "Line", required = true)
    protected BigInteger line;
    @XmlElement(name = "POReference", required = true)
    protected String poReference;
    @XmlElement(name = "HandOver_Location_ID")
    protected EDIImpCBPartnerLocationLookupGLNType handOverLocationID;
    @XmlElement(name = "M_HU_PI_Item_Product_ID")
    protected EDIMHUPIItemProductLookupUPCVType mhupiItemProductID;
    @XmlElement(name = "HandOver_Partner_ID")
    protected EDICBPartnerLookupBPLGLNVType handOverPartnerID;
    @XmlElement(name = "DropShip_BPartner_ID")
    protected EDICBPartnerLookupBPLGLNVType dropShipBPartnerID;
    @XmlElement(name = "DropShip_Location_ID")
    protected EDIImpCBPartnerLocationLookupGLNType dropShipLocationID;
    @XmlElement(name = "QtyItemCapacity")
    protected BigDecimal qtyItemCapacity;
    @XmlElement(name = "DatePromised")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromised;
    @XmlAttribute(name = "AD_Client_Value")
    protected String adClientValueAttr;
    @XmlAttribute(name = "ReplicationEvent")
    protected ReplicationEventEnum replicationEventAttr;
    @XmlAttribute(name = "ReplicationMode")
    protected ReplicationModeEnum replicationModeAttr;
    @XmlAttribute(name = "ReplicationType")
    protected ReplicationTypeEnum replicationTypeAttr;
    @XmlAttribute(name = "Version")
    protected String versionAttr;
    @XmlAttribute(name = "SequenceNo")
    protected BigInteger sequenceNoAttr;
    @XmlAttribute(name = "TrxName")
    protected String trxNameAttr;
    @XmlAttribute(name = "AD_Session_ID")
    protected BigInteger adSessionIDAttr;

    /**
     * Gets the value of the adDataDestinationID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpADInputDataSourceLookupINType }
     *     
     */
    public EDIImpADInputDataSourceLookupINType getADDataDestinationID() {
        return adDataDestinationID;
    }

    /**
     * Sets the value of the adDataDestinationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpADInputDataSourceLookupINType }
     *     
     */
    public void setADDataDestinationID(EDIImpADInputDataSourceLookupINType value) {
        this.adDataDestinationID = value;
    }

    /**
     * Gets the value of the adInputDataSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getADInputDataSourceID() {
        return adInputDataSourceID;
    }

    /**
     * Sets the value of the adInputDataSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setADInputDataSourceID(BigInteger value) {
        this.adInputDataSourceID = value;
    }

    /**
     * Gets the value of the adOrgID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIADOrgLookupBPLGLNVType }
     *     
     */
    public EDIADOrgLookupBPLGLNVType getADOrgID() {
        return adOrgID;
    }

    /**
     * Sets the value of the adOrgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIADOrgLookupBPLGLNVType }
     *     
     */
    public void setADOrgID(EDIADOrgLookupBPLGLNVType value) {
        this.adOrgID = value;
    }

    /**
     * Gets the value of the adUserEnteredByID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getADUserEnteredByID() {
        return adUserEnteredByID;
    }

    /**
     * Sets the value of the adUserEnteredByID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setADUserEnteredByID(BigInteger value) {
        this.adUserEnteredByID = value;
    }

    /**
     * Gets the value of the billBPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public EDICBPartnerLookupBPLGLNVType getBillBPartnerID() {
        return billBPartnerID;
    }

    /**
     * Sets the value of the billBPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public void setBillBPartnerID(EDICBPartnerLookupBPLGLNVType value) {
        this.billBPartnerID = value;
    }

    /**
     * Gets the value of the billLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public EDIImpCBPartnerLocationLookupGLNType getBillLocationID() {
        return billLocationID;
    }

    /**
     * Sets the value of the billLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public void setBillLocationID(EDIImpCBPartnerLocationLookupGLNType value) {
        this.billLocationID = value;
    }

    /**
     * Gets the value of the cbPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public EDICBPartnerLookupBPLGLNVType getCBPartnerID() {
        return cbPartnerID;
    }

    /**
     * Sets the value of the cbPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public void setCBPartnerID(EDICBPartnerLookupBPLGLNVType value) {
        this.cbPartnerID = value;
    }

    /**
     * Gets the value of the cbPartnerLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public EDIImpCBPartnerLocationLookupGLNType getCBPartnerLocationID() {
        return cbPartnerLocationID;
    }

    /**
     * Sets the value of the cbPartnerLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public void setCBPartnerLocationID(EDIImpCBPartnerLocationLookupGLNType value) {
        this.cbPartnerLocationID = value;
    }

    /**
     * Gets the value of the cCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpCCurrencyLookupISOCodeType }
     *     
     */
    public EDIImpCCurrencyLookupISOCodeType getCCurrencyID() {
        return cCurrencyID;
    }

    /**
     * Sets the value of the cCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpCCurrencyLookupISOCodeType }
     *     
     */
    public void setCCurrencyID(EDIImpCCurrencyLookupISOCodeType value) {
        this.cCurrencyID = value;
    }

    /**
     * Gets the value of the cuomid property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpCUOMLookupUOMSymbolType }
     *     
     */
    public EDIImpCUOMLookupUOMSymbolType getCUOMID() {
        return cuomid;
    }

    /**
     * Sets the value of the cuomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpCUOMLookupUOMSymbolType }
     *     
     */
    public void setCUOMID(EDIImpCUOMLookupUOMSymbolType value) {
        this.cuomid = value;
    }

    /**
     * Gets the value of the dateCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCandidate() {
        return dateCandidate;
    }

    /**
     * Sets the value of the dateCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCandidate(XMLGregorianCalendar value) {
        this.dateCandidate = value;
    }

    /**
     * Gets the value of the deliveryRule property.
     * 
     * @return
     *     possible object is
     *     {@link COrderDeliveryRuleEnum }
     *     
     */
    public COrderDeliveryRuleEnum getDeliveryRule() {
        return deliveryRule;
    }

    /**
     * Sets the value of the deliveryRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link COrderDeliveryRuleEnum }
     *     
     */
    public void setDeliveryRule(COrderDeliveryRuleEnum value) {
        this.deliveryRule = value;
    }

    /**
     * Gets the value of the deliveryViaRule property.
     * 
     * @return
     *     possible object is
     *     {@link COrderDeliveryViaRuleEnum }
     *     
     */
    public COrderDeliveryViaRuleEnum getDeliveryViaRule() {
        return deliveryViaRule;
    }

    /**
     * Sets the value of the deliveryViaRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link COrderDeliveryViaRuleEnum }
     *     
     */
    public void setDeliveryViaRule(COrderDeliveryViaRuleEnum value) {
        this.deliveryViaRule = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the isManualPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsManualPrice() {
        return isManualPrice;
    }

    /**
     * Sets the value of the isManualPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsManualPrice(String value) {
        this.isManualPrice = value;
    }

    /**
     * Gets the value of the mProductID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIMProductLookupUPCVType }
     *     
     */
    public EDIMProductLookupUPCVType getMProductID() {
        return mProductID;
    }

    /**
     * Sets the value of the mProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIMProductLookupUPCVType }
     *     
     */
    public void setMProductID(EDIMProductLookupUPCVType value) {
        this.mProductID = value;
    }

    /**
     * Gets the value of the priceEntered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceEntered() {
        return priceEntered;
    }

    /**
     * Sets the value of the priceEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceEntered(BigDecimal value) {
        this.priceEntered = value;
    }

    /**
     * Gets the value of the qtyEntered property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyEntered() {
        return qtyEntered;
    }

    /**
     * Sets the value of the qtyEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyEntered(BigDecimal value) {
        this.qtyEntered = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
    }

    /**
     * Gets the value of the poReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOReference() {
        return poReference;
    }

    /**
     * Sets the value of the poReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOReference(String value) {
        this.poReference = value;
    }

    /**
     * Gets the value of the handOverLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public EDIImpCBPartnerLocationLookupGLNType getHandOverLocationID() {
        return handOverLocationID;
    }

    /**
     * Sets the value of the handOverLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public void setHandOverLocationID(EDIImpCBPartnerLocationLookupGLNType value) {
        this.handOverLocationID = value;
    }

    /**
     * Gets the value of the mhupiItemProductID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIMHUPIItemProductLookupUPCVType }
     *     
     */
    public EDIMHUPIItemProductLookupUPCVType getMHUPIItemProductID() {
        return mhupiItemProductID;
    }

    /**
     * Sets the value of the mhupiItemProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIMHUPIItemProductLookupUPCVType }
     *     
     */
    public void setMHUPIItemProductID(EDIMHUPIItemProductLookupUPCVType value) {
        this.mhupiItemProductID = value;
    }

    /**
     * Gets the value of the handOverPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public EDICBPartnerLookupBPLGLNVType getHandOverPartnerID() {
        return handOverPartnerID;
    }

    /**
     * Sets the value of the handOverPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public void setHandOverPartnerID(EDICBPartnerLookupBPLGLNVType value) {
        this.handOverPartnerID = value;
    }

    /**
     * Gets the value of the dropShipBPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public EDICBPartnerLookupBPLGLNVType getDropShipBPartnerID() {
        return dropShipBPartnerID;
    }

    /**
     * Sets the value of the dropShipBPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDICBPartnerLookupBPLGLNVType }
     *     
     */
    public void setDropShipBPartnerID(EDICBPartnerLookupBPLGLNVType value) {
        this.dropShipBPartnerID = value;
    }

    /**
     * Gets the value of the dropShipLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public EDIImpCBPartnerLocationLookupGLNType getDropShipLocationID() {
        return dropShipLocationID;
    }

    /**
     * Sets the value of the dropShipLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIImpCBPartnerLocationLookupGLNType }
     *     
     */
    public void setDropShipLocationID(EDIImpCBPartnerLocationLookupGLNType value) {
        this.dropShipLocationID = value;
    }

    /**
     * Gets the value of the qtyItemCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyItemCapacity() {
        return qtyItemCapacity;
    }

    /**
     * Sets the value of the qtyItemCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyItemCapacity(BigDecimal value) {
        this.qtyItemCapacity = value;
    }

    /**
     * Gets the value of the datePromised property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePromised() {
        return datePromised;
    }

    /**
     * Sets the value of the datePromised property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePromised(XMLGregorianCalendar value) {
        this.datePromised = value;
    }

    /**
     * Gets the value of the adClientValueAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADClientValueAttr() {
        return adClientValueAttr;
    }

    /**
     * Sets the value of the adClientValueAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADClientValueAttr(String value) {
        this.adClientValueAttr = value;
    }

    /**
     * Gets the value of the replicationEventAttr property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationEventEnum }
     *     
     */
    public ReplicationEventEnum getReplicationEventAttr() {
        return replicationEventAttr;
    }

    /**
     * Sets the value of the replicationEventAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationEventEnum }
     *     
     */
    public void setReplicationEventAttr(ReplicationEventEnum value) {
        this.replicationEventAttr = value;
    }

    /**
     * Gets the value of the replicationModeAttr property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationModeEnum }
     *     
     */
    public ReplicationModeEnum getReplicationModeAttr() {
        return replicationModeAttr;
    }

    /**
     * Sets the value of the replicationModeAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationModeEnum }
     *     
     */
    public void setReplicationModeAttr(ReplicationModeEnum value) {
        this.replicationModeAttr = value;
    }

    /**
     * Gets the value of the replicationTypeAttr property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationTypeEnum }
     *     
     */
    public ReplicationTypeEnum getReplicationTypeAttr() {
        return replicationTypeAttr;
    }

    /**
     * Sets the value of the replicationTypeAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationTypeEnum }
     *     
     */
    public void setReplicationTypeAttr(ReplicationTypeEnum value) {
        this.replicationTypeAttr = value;
    }

    /**
     * Gets the value of the versionAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionAttr() {
        if (versionAttr == null) {
            return "*";
        } else {
            return versionAttr;
        }
    }

    /**
     * Sets the value of the versionAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionAttr(String value) {
        this.versionAttr = value;
    }

    /**
     * Gets the value of the sequenceNoAttr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNoAttr() {
        return sequenceNoAttr;
    }

    /**
     * Sets the value of the sequenceNoAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNoAttr(BigInteger value) {
        this.sequenceNoAttr = value;
    }

    /**
     * Gets the value of the trxNameAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxNameAttr() {
        return trxNameAttr;
    }

    /**
     * Sets the value of the trxNameAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxNameAttr(String value) {
        this.trxNameAttr = value;
    }

    /**
     * Gets the value of the adSessionIDAttr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getADSessionIDAttr() {
        return adSessionIDAttr;
    }

    /**
     * Sets the value of the adSessionIDAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setADSessionIDAttr(BigInteger value) {
        this.adSessionIDAttr = value;
    }

}
