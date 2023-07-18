//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:30 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_440.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xtraHospitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xtraHospitalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ambulatory" type="{http://www.forum-datenaustausch.ch/invoice}xtraAmbulatoryType"/&gt;
 *         &lt;element name="stationary" type="{http://www.forum-datenaustausch.ch/invoice}xtraStationaryType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xtraHospitalType", namespace = "http://www.forum-datenaustausch.ch/invoice", propOrder = {
    "ambulatory",
    "stationary"
})
public class XtraHospitalType {

    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected XtraAmbulatoryType ambulatory;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected XtraStationaryType stationary;

    /**
     * Gets the value of the ambulatory property.
     * 
     * @return
     *     possible object is
     *     {@link XtraAmbulatoryType }
     *     
     */
    public XtraAmbulatoryType getAmbulatory() {
        return ambulatory;
    }

    /**
     * Sets the value of the ambulatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link XtraAmbulatoryType }
     *     
     */
    public void setAmbulatory(XtraAmbulatoryType value) {
        this.ambulatory = value;
    }

    /**
     * Gets the value of the stationary property.
     * 
     * @return
     *     possible object is
     *     {@link XtraStationaryType }
     *     
     */
    public XtraStationaryType getStationary() {
        return stationary;
    }

    /**
     * Sets the value of the stationary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XtraStationaryType }
     *     
     */
    public void setStationary(XtraStationaryType value) {
        this.stationary = value;
    }

}
