//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.20 at 01:32:35 PM EEST 
//


package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for EDI_cctop_111_vType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_cctop_111_vType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C_Order_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DateOrdered" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EDI_cctop_111_v_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="M_InOut_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="MovementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="POReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipment_documentno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_cctop_111_vType", propOrder = {
    "cOrderID",
    "dateOrdered",
    "ediCctop111VID",
    "mInOutID",
    "movementDate",
    "poReference",
    "shipmentDocumentno"
})
public class EDICctop111VType {

    @XmlElement(name = "C_Order_ID")
    protected BigInteger cOrderID;
    @XmlElement(name = "DateOrdered")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOrdered;
    @XmlElement(name = "EDI_cctop_111_v_ID")
    protected BigInteger ediCctop111VID;
    @XmlElement(name = "M_InOut_ID")
    protected BigInteger mInOutID;
    @XmlElement(name = "MovementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar movementDate;
    @XmlElement(name = "POReference")
    protected String poReference;
    @XmlElement(name = "shipment_documentno")
    protected String shipmentDocumentno;

    /**
     * Gets the value of the cOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCOrderID() {
        return cOrderID;
    }

    /**
     * Sets the value of the cOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCOrderID(BigInteger value) {
        this.cOrderID = value;
    }

    /**
     * Gets the value of the dateOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOrdered() {
        return dateOrdered;
    }

    /**
     * Sets the value of the dateOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOrdered(XMLGregorianCalendar value) {
        this.dateOrdered = value;
    }

    /**
     * Gets the value of the ediCctop111VID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEDICctop111VID() {
        return ediCctop111VID;
    }

    /**
     * Sets the value of the ediCctop111VID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEDICctop111VID(BigInteger value) {
        this.ediCctop111VID = value;
    }

    /**
     * Gets the value of the mInOutID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMInOutID() {
        return mInOutID;
    }

    /**
     * Sets the value of the mInOutID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMInOutID(BigInteger value) {
        this.mInOutID = value;
    }

    /**
     * Gets the value of the movementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovementDate() {
        return movementDate;
    }

    /**
     * Sets the value of the movementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovementDate(XMLGregorianCalendar value) {
        this.movementDate = value;
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
     * Gets the value of the shipmentDocumentno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDocumentno() {
        return shipmentDocumentno;
    }

    /**
     * Sets the value of the shipmentDocumentno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDocumentno(String value) {
        this.shipmentDocumentno = value;
    }

}
