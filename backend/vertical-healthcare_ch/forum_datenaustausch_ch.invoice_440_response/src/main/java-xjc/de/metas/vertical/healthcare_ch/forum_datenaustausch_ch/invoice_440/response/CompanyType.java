//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:32 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_440.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyname" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35"/&gt;
 *         &lt;element name="department" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" minOccurs="0"/&gt;
 *         &lt;element name="subaddressing" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" minOccurs="0"/&gt;
 *         &lt;element name="postal" type="{http://www.forum-datenaustausch.ch/invoice}postalAddressType"/&gt;
 *         &lt;element name="telecom" type="{http://www.forum-datenaustausch.ch/invoice}telecomAddressType" minOccurs="0"/&gt;
 *         &lt;element name="online" type="{http://www.forum-datenaustausch.ch/invoice}onlineAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyType", propOrder = {
    "companyname",
    "department",
    "subaddressing",
    "postal",
    "telecom",
    "online"
})
public class CompanyType {

    @XmlElement(required = true)
    protected String companyname;
    protected String department;
    protected String subaddressing;
    @XmlElement(required = true)
    protected PostalAddressType postal;
    protected TelecomAddressType telecom;
    protected OnlineAddressType online;

    /**
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyname(String value) {
        this.companyname = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the subaddressing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubaddressing() {
        return subaddressing;
    }

    /**
     * Sets the value of the subaddressing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubaddressing(String value) {
        this.subaddressing = value;
    }

    /**
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getPostal() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setPostal(PostalAddressType value) {
        this.postal = value;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomAddressType }
     *     
     */
    public TelecomAddressType getTelecom() {
        return telecom;
    }

    /**
     * Sets the value of the telecom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomAddressType }
     *     
     */
    public void setTelecom(TelecomAddressType value) {
        this.telecom = value;
    }

    /**
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineAddressType }
     *     
     */
    public OnlineAddressType getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineAddressType }
     *     
     */
    public void setOnline(OnlineAddressType value) {
        this.online = value;
    }

}
