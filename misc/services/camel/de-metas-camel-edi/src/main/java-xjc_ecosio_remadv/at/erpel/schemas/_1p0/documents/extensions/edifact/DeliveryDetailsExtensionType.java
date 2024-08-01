//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.01 at 08:03:28 AM CEST 
//


package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DeliveryDetailsExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetailsExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryPoint" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}DeliveryPointDetails" minOccurs="0"/&gt;
 *         &lt;element name="PickUpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInformationCode" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}AlphaNumType_3" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InternalCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ShipFrom" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOrTransportTermsFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentNetWeight" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}UnitType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentGrossWeight" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}UnitType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentNumberOfPackages" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsExtensionType", propOrder = {
    "deliveryPoint",
    "pickUpDate",
    "deliveryTimeFrom",
    "deliveryTimeTo",
    "additionalInformationCode",
    "additionalInformation",
    "internalCustomerNumber",
    "shipFrom",
    "deliveryOrTransportTermsFunctionCode",
    "shipmentNetWeight",
    "shipmentGrossWeight",
    "shipmentNumberOfPackages"
})
public class DeliveryDetailsExtensionType {

    @XmlElement(name = "DeliveryPoint")
    protected DeliveryPointDetails deliveryPoint;
    @XmlElement(name = "PickUpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDate;
    @XmlElement(name = "DeliveryTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryTimeFrom;
    @XmlElement(name = "DeliveryTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryTimeTo;
    @XmlElement(name = "AdditionalInformationCode")
    protected String additionalInformationCode;
    @XmlElement(name = "AdditionalInformation")
    protected List<String> additionalInformation;
    @XmlElement(name = "InternalCustomerNumber")
    protected String internalCustomerNumber;
    @XmlElement(name = "ShipFrom")
    protected ShipFromType shipFrom;
    @XmlElement(name = "DeliveryOrTransportTermsFunctionCode")
    protected String deliveryOrTransportTermsFunctionCode;
    @XmlElement(name = "ShipmentNetWeight")
    protected UnitType shipmentNetWeight;
    @XmlElement(name = "ShipmentGrossWeight")
    protected UnitType shipmentGrossWeight;
    @XmlElement(name = "ShipmentNumberOfPackages")
    protected BigInteger shipmentNumberOfPackages;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPointDetails }
     *     
     */
    public DeliveryPointDetails getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPointDetails }
     *     
     */
    public void setDeliveryPoint(DeliveryPointDetails value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDate(XMLGregorianCalendar value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the deliveryTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryTimeFrom() {
        return deliveryTimeFrom;
    }

    /**
     * Sets the value of the deliveryTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryTimeFrom(XMLGregorianCalendar value) {
        this.deliveryTimeFrom = value;
    }

    /**
     * Gets the value of the deliveryTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryTimeTo() {
        return deliveryTimeTo;
    }

    /**
     * Sets the value of the deliveryTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryTimeTo(XMLGregorianCalendar value) {
        this.deliveryTimeTo = value;
    }

    /**
     * Gets the value of the additionalInformationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformationCode() {
        return additionalInformationCode;
    }

    /**
     * Sets the value of the additionalInformationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformationCode(String value) {
        this.additionalInformationCode = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<String>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the internalCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCustomerNumber() {
        return internalCustomerNumber;
    }

    /**
     * Sets the value of the internalCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCustomerNumber(String value) {
        this.internalCustomerNumber = value;
    }

    /**
     * Additional information about the ship from location.
     * 
     * @return
     *     possible object is
     *     {@link ShipFromType }
     *     
     */
    public ShipFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFromType }
     *     
     */
    public void setShipFrom(ShipFromType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the deliveryOrTransportTermsFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOrTransportTermsFunctionCode() {
        return deliveryOrTransportTermsFunctionCode;
    }

    /**
     * Sets the value of the deliveryOrTransportTermsFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOrTransportTermsFunctionCode(String value) {
        this.deliveryOrTransportTermsFunctionCode = value;
    }

    /**
     * Gets the value of the shipmentNetWeight property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getShipmentNetWeight() {
        return shipmentNetWeight;
    }

    /**
     * Sets the value of the shipmentNetWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setShipmentNetWeight(UnitType value) {
        this.shipmentNetWeight = value;
    }

    /**
     * Gets the value of the shipmentGrossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getShipmentGrossWeight() {
        return shipmentGrossWeight;
    }

    /**
     * Sets the value of the shipmentGrossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setShipmentGrossWeight(UnitType value) {
        this.shipmentGrossWeight = value;
    }

    /**
     * Gets the value of the shipmentNumberOfPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShipmentNumberOfPackages() {
        return shipmentNumberOfPackages;
    }

    /**
     * Sets the value of the shipmentNumberOfPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShipmentNumberOfPackages(BigInteger value) {
        this.shipmentNumberOfPackages = value;
    }

}
