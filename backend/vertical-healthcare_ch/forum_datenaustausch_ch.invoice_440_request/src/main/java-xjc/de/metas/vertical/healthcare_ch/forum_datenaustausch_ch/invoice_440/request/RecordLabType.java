//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:30 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_440.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordLabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordLabType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.forum-datenaustausch.ch/invoice}recordServiceType"&gt;
 *       &lt;attribute name="tariff_type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[0-9A-Z]{3}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordLabType", namespace = "http://www.forum-datenaustausch.ch/invoice")
public class RecordLabType
    extends RecordServiceType
{

    @XmlAttribute(name = "tariff_type", required = true)
    protected String tariffType;

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffType(String value) {
        this.tariffType = value;
    }

}
