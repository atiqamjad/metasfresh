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
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EDI_Imp_C_OLCandsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_Imp_C_OLCandsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EDI_Imp_C_OLCand" type="{}EDI_Imp_C_OLCandType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_Imp_C_OLCandsType", propOrder = {
    "ediImpCOLCand"
})
public class EDIImpCOLCandsType {

    @XmlElement(name = "EDI_Imp_C_OLCand")
    protected List<EDIImpCOLCandType> ediImpCOLCand;

    /**
     * Gets the value of the ediImpCOLCand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ediImpCOLCand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDIImpCOLCand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EDIImpCOLCandType }
     * 
     * 
     */
    public List<EDIImpCOLCandType> getEDIImpCOLCand() {
        if (ediImpCOLCand == null) {
            ediImpCOLCand = new ArrayList<EDIImpCOLCandType>();
        }
        return this.ediImpCOLCand;
    }

}
