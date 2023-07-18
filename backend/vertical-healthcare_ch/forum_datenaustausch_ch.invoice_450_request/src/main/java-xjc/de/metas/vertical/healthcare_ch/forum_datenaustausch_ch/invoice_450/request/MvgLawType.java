//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:33 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_450.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mvgLawType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mvgLawType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="insured_id" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" /&gt;
 *       &lt;attribute name="case_id" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" /&gt;
 *       &lt;attribute name="case_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ssn" use="required" type="{http://www.forum-datenaustausch.ch/invoice}ssnPartyType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mvgLawType", namespace = "http://www.forum-datenaustausch.ch/invoice")
public class MvgLawType {

    @XmlAttribute(name = "insured_id")
    protected String insuredId;
    @XmlAttribute(name = "case_id")
    protected String caseId;
    @XmlAttribute(name = "case_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caseDate;
    @XmlAttribute(name = "ssn", required = true)
    protected String ssn;

    /**
     * Gets the value of the insuredId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredId() {
        return insuredId;
    }

    /**
     * Sets the value of the insuredId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredId(String value) {
        this.insuredId = value;
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the caseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseDate() {
        return caseDate;
    }

    /**
     * Sets the value of the caseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseDate(XMLGregorianCalendar value) {
        this.caseDate = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

}
