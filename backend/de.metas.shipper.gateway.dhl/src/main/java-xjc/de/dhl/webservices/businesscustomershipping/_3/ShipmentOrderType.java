//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.09 at 05:46:45 PM CET 
//


package de.dhl.webservices.businesscustomershipping._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for the creation of a shipment. 
 * 
 * <p>Java class for ShipmentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceNumber" type="{http://dhl.de/webservices/businesscustomershipping/3.0}SequenceNumber"/&gt;
 *         &lt;element name="Shipment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ShipmentDetails" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipmentDetailsTypeType"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Shipper" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipperType"/&gt;
 *                     &lt;element name="ShipperReference" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipperReferenceType"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Receiver" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ReceiverType"/&gt;
 *                   &lt;element name="ReturnReceiver" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipperType" minOccurs="0"/&gt;
 *                   &lt;element name="ExportDocument" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ExportDocumentType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrintOnlyIfCodeable" type="{http://dhl.de/webservices/businesscustomershipping/3.0}Serviceconfiguration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentOrderType", propOrder = {
    "sequenceNumber",
    "shipment",
    "printOnlyIfCodeable"
})
public class ShipmentOrderType {

    @XmlElement(required = true)
    protected String sequenceNumber;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentOrderType.Shipment shipment;
    @XmlElement(name = "PrintOnlyIfCodeable")
    protected Serviceconfiguration printOnlyIfCodeable;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderType.Shipment }
     *     
     */
    public ShipmentOrderType.Shipment getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderType.Shipment }
     *     
     */
    public void setShipment(ShipmentOrderType.Shipment value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the printOnlyIfCodeable property.
     * 
     * @return
     *     possible object is
     *     {@link Serviceconfiguration }
     *     
     */
    public Serviceconfiguration getPrintOnlyIfCodeable() {
        return printOnlyIfCodeable;
    }

    /**
     * Sets the value of the printOnlyIfCodeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Serviceconfiguration }
     *     
     */
    public void setPrintOnlyIfCodeable(Serviceconfiguration value) {
        this.printOnlyIfCodeable = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ShipmentDetails" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipmentDetailsTypeType"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="Shipper" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipperType"/&gt;
     *           &lt;element name="ShipperReference" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipperReferenceType"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Receiver" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ReceiverType"/&gt;
     *         &lt;element name="ReturnReceiver" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ShipperType" minOccurs="0"/&gt;
     *         &lt;element name="ExportDocument" type="{http://dhl.de/webservices/businesscustomershipping/3.0}ExportDocumentType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shipmentDetails",
        "shipper",
        "shipperReference",
        "receiver",
        "returnReceiver",
        "exportDocument"
    })
    public static class Shipment {

        @XmlElement(name = "ShipmentDetails", required = true)
        protected ShipmentDetailsTypeType shipmentDetails;
        @XmlElement(name = "Shipper")
        protected ShipperType shipper;
        @XmlElement(name = "ShipperReference")
        protected String shipperReference;
        @XmlElement(name = "Receiver", required = true)
        protected ReceiverType receiver;
        @XmlElement(name = "ReturnReceiver")
        protected ShipperType returnReceiver;
        @XmlElement(name = "ExportDocument")
        protected ExportDocumentType exportDocument;

        /**
         * Gets the value of the shipmentDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ShipmentDetailsTypeType }
         *     
         */
        public ShipmentDetailsTypeType getShipmentDetails() {
            return shipmentDetails;
        }

        /**
         * Sets the value of the shipmentDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipmentDetailsTypeType }
         *     
         */
        public void setShipmentDetails(ShipmentDetailsTypeType value) {
            this.shipmentDetails = value;
        }

        /**
         * Gets the value of the shipper property.
         * 
         * @return
         *     possible object is
         *     {@link ShipperType }
         *     
         */
        public ShipperType getShipper() {
            return shipper;
        }

        /**
         * Sets the value of the shipper property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipperType }
         *     
         */
        public void setShipper(ShipperType value) {
            this.shipper = value;
        }

        /**
         * Gets the value of the shipperReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipperReference() {
            return shipperReference;
        }

        /**
         * Sets the value of the shipperReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipperReference(String value) {
            this.shipperReference = value;
        }

        /**
         * Gets the value of the receiver property.
         * 
         * @return
         *     possible object is
         *     {@link ReceiverType }
         *     
         */
        public ReceiverType getReceiver() {
            return receiver;
        }

        /**
         * Sets the value of the receiver property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReceiverType }
         *     
         */
        public void setReceiver(ReceiverType value) {
            this.receiver = value;
        }

        /**
         * Gets the value of the returnReceiver property.
         * 
         * @return
         *     possible object is
         *     {@link ShipperType }
         *     
         */
        public ShipperType getReturnReceiver() {
            return returnReceiver;
        }

        /**
         * Sets the value of the returnReceiver property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipperType }
         *     
         */
        public void setReturnReceiver(ShipperType value) {
            this.returnReceiver = value;
        }

        /**
         * Gets the value of the exportDocument property.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocumentType }
         *     
         */
        public ExportDocumentType getExportDocument() {
            return exportDocument;
        }

        /**
         * Sets the value of the exportDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocumentType }
         *     
         */
        public void setExportDocument(ExportDocumentType value) {
            this.exportDocument = value;
        }

    }

}
