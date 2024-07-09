//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.07 at 05:17:59 PM CET 
//


package de.metas.postfinance.ybinvoice.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * complextype delivery
 * 
 * <p>Java class for DeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillerID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;pattern value="\d{17}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="eBillAccountID"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *                 &lt;totalDigits value="17"/&gt;
 *                 &lt;pattern value="\d{17}"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="AlternativeRecipientID"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;maxLength value="255"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DeliveryID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TransactionID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillDetailsType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PDF"/&gt;
 *               &lt;enumeration value="PDFSystem"/&gt;
 *               &lt;enumeration value="PDFAppendix"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="URLBillDetails" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "billerID",
    "eBillAccountID",
    "alternativeRecipientID",
    "deliveryID",
    "deliveryDate",
    "transactionID",
    "billDetailsType",
    "urlBillDetails"
})
public class DeliveryType {

    @XmlElement(name = "BillerID")
    protected long billerID;
    protected Long eBillAccountID;
    @XmlElement(name = "AlternativeRecipientID")
    protected String alternativeRecipientID;
    @XmlElement(name = "DeliveryID")
    protected String deliveryID;
    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "BillDetailsType", required = true)
    protected String billDetailsType;
    @XmlElementRef(name = "URLBillDetails", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlBillDetails;

    /**
     * Gets the value of the billerID property.
     * 
     */
    public long getBillerID() {
        return billerID;
    }

    /**
     * Sets the value of the billerID property.
     * 
     */
    public void setBillerID(long value) {
        this.billerID = value;
    }

    /**
     * Gets the value of the eBillAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEBillAccountID() {
        return eBillAccountID;
    }

    /**
     * Sets the value of the eBillAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEBillAccountID(Long value) {
        this.eBillAccountID = value;
    }

    /**
     * Gets the value of the alternativeRecipientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeRecipientID() {
        return alternativeRecipientID;
    }

    /**
     * Sets the value of the alternativeRecipientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeRecipientID(String value) {
        this.alternativeRecipientID = value;
    }

    /**
     * Gets the value of the deliveryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryID() {
        return deliveryID;
    }

    /**
     * Sets the value of the deliveryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryID(String value) {
        this.deliveryID = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the billDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDetailsType() {
        return billDetailsType;
    }

    /**
     * Sets the value of the billDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDetailsType(String value) {
        this.billDetailsType = value;
    }

    /**
     * Gets the value of the urlBillDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURLBillDetails() {
        return urlBillDetails;
    }

    /**
     * Sets the value of the urlBillDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURLBillDetails(JAXBElement<String> value) {
        this.urlBillDetails = value;
    }

}
