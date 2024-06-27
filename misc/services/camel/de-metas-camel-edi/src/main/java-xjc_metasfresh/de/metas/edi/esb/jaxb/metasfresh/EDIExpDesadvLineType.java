//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.22 at 01:55:45 PM EET
//


package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for EDI_Exp_DesadvLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_Exp_DesadvLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C_UOM_ID" type="{}EDI_Exp_C_UOMType" minOccurs="0"/&gt;
 *         &lt;element name="EDI_DesadvLine_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="M_Product_ID" type="{}EDI_Exp_M_ProductType" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QtyEntered" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSubsequentDeliveryPlanned" type="{}YES-NO"/&gt;
 *         &lt;element name="EAN_CU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAN_TU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPC_TU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EanCom_Invoice_UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoicableQtyBasedOn" type="{}InvoicableQtyBasedOnEnum"/&gt;
 *         &lt;element name="OrderPOReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QtyItemCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyDeliveredInInvoiceUOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="QtyDeliveredInUOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrderLine" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ExternalSeqNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="C_UOM_BPartner_ID" type="{}EDI_Exp_C_UOMType" minOccurs="0"/&gt;
 *         &lt;element name="QtyEnteredInBPartnerUOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BPartner_QtyItemCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsDeliveryClosed" type="{}YES-NO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_Exp_DesadvLineType", propOrder = {
    "cuomid",
    "ediDesadvLineID",
    "line",
    "mProductID",
    "productDescription",
    "productNo",
    "qtyEntered",
    "upc",
    "isSubsequentDeliveryPlanned",
    "eancu",
    "eantu",
    "gtin",
    "upctu",
    "priceActual",
    "eanComInvoiceUOM",
    "invoicableQtyBasedOn",
    "orderPOReference",
    "qtyItemCapacity",
    "qtyDeliveredInInvoiceUOM",
    "qtyDeliveredInUOM",
    "orderLine",
    "externalSeqNo",
    "cuombPartnerID",
    "qtyEnteredInBPartnerUOM",
    "bPartnerQtyItemCapacity",
    "isDeliveryClosed"
})
public class EDIExpDesadvLineType {

    @XmlElement(name = "C_UOM_ID")
    protected EDIExpCUOMType cuomid;
    @XmlElement(name = "EDI_DesadvLine_ID", required = true)
    protected BigInteger ediDesadvLineID;
    @XmlElement(name = "Line", required = true)
    protected BigInteger line;
    @XmlElement(name = "M_Product_ID")
    protected EDIExpMProductType mProductID;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductNo")
    protected String productNo;
    @XmlElement(name = "QtyEntered", required = true)
    protected BigDecimal qtyEntered;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "IsSubsequentDeliveryPlanned", required = true)
    protected String isSubsequentDeliveryPlanned;
    @XmlElement(name = "EAN_CU")
    protected String eancu;
    @XmlElement(name = "EAN_TU")
    protected String eantu;
    @XmlElement(name = "GTIN")
    protected String gtin;
    @XmlElement(name = "UPC_TU")
    protected String upctu;
    @XmlElement(name = "PriceActual")
    protected BigDecimal priceActual;
    @XmlElement(name = "EanCom_Invoice_UOM")
    protected String eanComInvoiceUOM;
    @XmlElement(name = "InvoicableQtyBasedOn", required = true)
    @XmlSchemaType(name = "string")
    protected InvoicableQtyBasedOnEnum invoicableQtyBasedOn;
    @XmlElement(name = "OrderPOReference")
    protected String orderPOReference;
    @XmlElement(name = "QtyItemCapacity")
    protected BigDecimal qtyItemCapacity;
    @XmlElement(name = "QtyDeliveredInInvoiceUOM")
    protected BigDecimal qtyDeliveredInInvoiceUOM;
    @XmlElement(name = "QtyDeliveredInUOM")
    protected BigDecimal qtyDeliveredInUOM;
    @XmlElement(name = "OrderLine")
    protected BigInteger orderLine;
    @XmlElement(name = "ExternalSeqNo")
    protected BigInteger externalSeqNo;
    @XmlElement(name = "C_UOM_BPartner_ID")
    protected EDIExpCUOMType cuombPartnerID;
    @XmlElement(name = "QtyEnteredInBPartnerUOM")
    protected BigDecimal qtyEnteredInBPartnerUOM;
    @XmlElement(name = "BPartner_QtyItemCapacity")
    protected BigDecimal bPartnerQtyItemCapacity;
    @XmlElement(name = "IsDeliveryClosed")
    protected String isDeliveryClosed;

    /**
     * Gets the value of the cuomid property.
     * 
     * @return
     *     possible object is
     *     {@link EDIExpCUOMType }
     *     
     */
    public EDIExpCUOMType getCUOMID() {
        return cuomid;
    }

    /**
     * Sets the value of the cuomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIExpCUOMType }
     *     
     */
    public void setCUOMID(EDIExpCUOMType value) {
        this.cuomid = value;
    }

    /**
     * Gets the value of the ediDesadvLineID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getEDIDesadvLineID() {
        return ediDesadvLineID;
    }

    /**
     * Sets the value of the ediDesadvLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setEDIDesadvLineID(BigInteger value) {
        this.ediDesadvLineID = value;
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
     * Gets the value of the mProductID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIExpMProductType }
     *     
     */
    public EDIExpMProductType getMProductID() {
        return mProductID;
    }

    /**
     * Sets the value of the mProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIExpMProductType }
     *     
     */
    public void setMProductID(EDIExpMProductType value) {
        this.mProductID = value;
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
     * Gets the value of the productNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * Sets the value of the productNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNo(String value) {
        this.productNo = value;
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
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the isSubsequentDeliveryPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSubsequentDeliveryPlanned() {
        return isSubsequentDeliveryPlanned;
    }

    /**
     * Sets the value of the isSubsequentDeliveryPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSubsequentDeliveryPlanned(String value) {
        this.isSubsequentDeliveryPlanned = value;
    }

    /**
     * Gets the value of the eancu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANCU() {
        return eancu;
    }

    /**
     * Sets the value of the eancu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANCU(String value) {
        this.eancu = value;
    }

    /**
     * Gets the value of the eantu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANTU() {
        return eantu;
    }

    /**
     * Sets the value of the eantu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANTU(String value) {
        this.eantu = value;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTIN() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTIN(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the upctu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPCTU() {
        return upctu;
    }

    /**
     * Sets the value of the upctu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPCTU(String value) {
        this.upctu = value;
    }

    /**
     * Gets the value of the priceActual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceActual() {
        return priceActual;
    }

    /**
     * Sets the value of the priceActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceActual(BigDecimal value) {
        this.priceActual = value;
    }

    /**
     * Gets the value of the eanComInvoiceUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEanComInvoiceUOM() {
        return eanComInvoiceUOM;
    }

    /**
     * Sets the value of the eanComInvoiceUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEanComInvoiceUOM(String value) {
        this.eanComInvoiceUOM = value;
    }

    /**
     * Gets the value of the invoicableQtyBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicableQtyBasedOnEnum }
     *     
     */
    public InvoicableQtyBasedOnEnum getInvoicableQtyBasedOn() {
        return invoicableQtyBasedOn;
    }

    /**
     * Sets the value of the invoicableQtyBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicableQtyBasedOnEnum }
     *     
     */
    public void setInvoicableQtyBasedOn(InvoicableQtyBasedOnEnum value) {
        this.invoicableQtyBasedOn = value;
    }

    /**
     * Gets the value of the orderPOReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPOReference() {
        return orderPOReference;
    }

    /**
     * Sets the value of the orderPOReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPOReference(String value) {
        this.orderPOReference = value;
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
     * Gets the value of the qtyDeliveredInInvoiceUOM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyDeliveredInInvoiceUOM() {
        return qtyDeliveredInInvoiceUOM;
    }

    /**
     * Sets the value of the qtyDeliveredInInvoiceUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyDeliveredInInvoiceUOM(BigDecimal value) {
        this.qtyDeliveredInInvoiceUOM = value;
    }

    /**
     * Gets the value of the qtyDeliveredInUOM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyDeliveredInUOM() {
        return qtyDeliveredInUOM;
    }

    /**
     * Sets the value of the qtyDeliveredInUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyDeliveredInUOM(BigDecimal value) {
        this.qtyDeliveredInUOM = value;
    }

    /**
     * Gets the value of the orderLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderLine() {
        return orderLine;
    }

    /**
     * Sets the value of the orderLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderLine(BigInteger value) {
        this.orderLine = value;
    }

    /**
     * Gets the value of the externalSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalSeqNo() {
        return externalSeqNo;
    }

    /**
     * Sets the value of the externalSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalSeqNo(BigInteger value) {
        this.externalSeqNo = value;
    }

    /**
     * Gets the value of the cuombPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link EDIExpCUOMType }
     *     
     */
    public EDIExpCUOMType getCUOMBPartnerID() {
        return cuombPartnerID;
    }

    /**
     * Sets the value of the cuombPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIExpCUOMType }
     *     
     */
    public void setCUOMBPartnerID(EDIExpCUOMType value) {
        this.cuombPartnerID = value;
    }

    /**
     * Gets the value of the qtyEnteredInBPartnerUOM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyEnteredInBPartnerUOM() {
        return qtyEnteredInBPartnerUOM;
    }

    /**
     * Sets the value of the qtyEnteredInBPartnerUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyEnteredInBPartnerUOM(BigDecimal value) {
        this.qtyEnteredInBPartnerUOM = value;
    }

    /**
     * Gets the value of the bPartnerQtyItemCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBPartnerQtyItemCapacity() {
        return bPartnerQtyItemCapacity;
    }

    /**
     * Sets the value of the bPartnerQtyItemCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBPartnerQtyItemCapacity(BigDecimal value) {
        this.bPartnerQtyItemCapacity = value;
    }

    /**
     * Gets the value of the isDeliveryClosed property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsDeliveryClosed() {
        return isDeliveryClosed;
    }

    /**
     * Sets the value of the isDeliveryClosed property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsDeliveryClosed(String value) {
        this.isDeliveryClosed = value;
    }

}
