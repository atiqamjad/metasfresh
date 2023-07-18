//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:32 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_440.response;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.forum-datenaustausch.ch/invoice}notificationType"&gt;
 *       &lt;attribute name="error_value" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_350" /&gt;
 *       &lt;attribute name="valid_value" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_350" /&gt;
 *       &lt;attribute name="record_id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorType")
public class ErrorType
    extends NotificationType
{

    @XmlAttribute(name = "error_value")
    protected String errorValue;
    @XmlAttribute(name = "valid_value")
    protected String validValue;
    @XmlAttribute(name = "record_id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recordId;

    /**
     * Gets the value of the errorValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorValue() {
        return errorValue;
    }

    /**
     * Sets the value of the errorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorValue(String value) {
        this.errorValue = value;
    }

    /**
     * Gets the value of the validValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidValue() {
        return validValue;
    }

    /**
     * Sets the value of the validValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidValue(String value) {
        this.validValue = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordId(BigInteger value) {
        this.recordId = value;
    }

}
