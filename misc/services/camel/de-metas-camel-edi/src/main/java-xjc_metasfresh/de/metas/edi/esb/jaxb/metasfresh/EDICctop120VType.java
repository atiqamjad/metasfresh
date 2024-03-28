//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.27 at 03:13:42 PM CET 
//


package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for EDI_cctop_120_vType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_cctop_120_vType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C_Invoice_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="EDI_cctop_120_v_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ISO_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="netdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="NetDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="singlevat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxfree" type="{}YES-NO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_cctop_120_vType", propOrder = {
    "cInvoiceID",
    "ediCctop120VID",
    "isoCode",
    "netdate",
    "netDays",
    "singlevat",
    "taxfree"
})
public class EDICctop120VType {

    @XmlElement(name = "C_Invoice_ID")
    protected BigInteger cInvoiceID;
    @XmlElement(name = "EDI_cctop_120_v_ID")
    protected BigInteger ediCctop120VID;
    @XmlElement(name = "ISO_Code")
    protected String isoCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar netdate;
    @XmlElement(name = "NetDays")
    protected BigInteger netDays;
    protected BigDecimal singlevat;
    protected String taxfree;

    /**
     * Gets the value of the cInvoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCInvoiceID() {
        return cInvoiceID;
    }

    /**
     * Sets the value of the cInvoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCInvoiceID(BigInteger value) {
        this.cInvoiceID = value;
    }

    /**
     * Gets the value of the ediCctop120VID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEDICctop120VID() {
        return ediCctop120VID;
    }

    /**
     * Sets the value of the ediCctop120VID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEDICctop120VID(BigInteger value) {
        this.ediCctop120VID = value;
    }

    /**
     * Gets the value of the isoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCode() {
        return isoCode;
    }

    /**
     * Sets the value of the isoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCode(String value) {
        this.isoCode = value;
    }

    /**
     * Gets the value of the netdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNetdate() {
        return netdate;
    }

    /**
     * Sets the value of the netdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNetdate(XMLGregorianCalendar value) {
        this.netdate = value;
    }

    /**
     * Gets the value of the netDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetDays() {
        return netDays;
    }

    /**
     * Sets the value of the netDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetDays(BigInteger value) {
        this.netDays = value;
    }

    /**
     * Gets the value of the singlevat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSinglevat() {
        return singlevat;
    }

    /**
     * Sets the value of the singlevat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSinglevat(BigDecimal value) {
        this.singlevat = value;
    }

    /**
     * Gets the value of the taxfree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxfree() {
        return taxfree;
    }

    /**
     * Sets the value of the taxfree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxfree(String value) {
        this.taxfree = value;
    }

}
