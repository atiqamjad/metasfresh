//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 05:52:47 PM EET 
//


package de.metas.edi.esb.jaxb.stepcom.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Xbest4h complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Xbest4h"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HEADER" type="{}HEADER_Xbest"/&gt;
 *         &lt;element name="TRAILR" type="{}TRAILR"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Xbest4h", propOrder = {
    "header",
    "trailr"
})
public class Xbest4H {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERXbest header;
    @XmlElement(name = "TRAILR", required = true)
    protected TRAILR trailr;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HEADERXbest }
     *     
     */
    public HEADERXbest getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERXbest }
     *     
     */
    public void setHEADER(HEADERXbest value) {
        this.header = value;
    }

    /**
     * Gets the value of the trailr property.
     * 
     * @return
     *     possible object is
     *     {@link TRAILR }
     *     
     */
    public TRAILR getTRAILR() {
        return trailr;
    }

    /**
     * Sets the value of the trailr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRAILR }
     *     
     */
    public void setTRAILR(TRAILR value) {
        this.trailr = value;
    }

}
