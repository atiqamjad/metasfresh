//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:31 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_450.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postalAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pobox" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" minOccurs="0"/&gt;
 *         &lt;element name="street" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" minOccurs="0"/&gt;
 *         &lt;element name="zip" type="{http://www.forum-datenaustausch.ch/invoice}zipType"/&gt;
 *         &lt;element name="city" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postalAddressType", propOrder = {
    "pobox",
    "street",
    "zip",
    "city"
})
public class PostalAddressType {

    protected String pobox;
    protected String street;
    @XmlElement(required = true)
    protected ZipType zip;
    @XmlElement(required = true)
    protected String city;

    /**
     * Gets the value of the pobox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobox() {
        return pobox;
    }

    /**
     * Sets the value of the pobox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobox(String value) {
        this.pobox = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link ZipType }
     *     
     */
    public ZipType getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipType }
     *     
     */
    public void setZip(ZipType value) {
        this.zip = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

}
