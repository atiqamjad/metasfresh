//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.14 at 03:18:11 PM CEST 
//


package at.erpel.schemas._1p0.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import at.erpel.schemas._1p0.documents.ext.OrderingPartyExtensionType;


/**
 * <p>Java class for OrderingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://erpel.at/schemas/1p0/documents}BusinessEntityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents}SuppliersOrderingPartyID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}OrderingPartyExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderingPartyType", propOrder = {
    "suppliersOrderingPartyID",
    "orderingPartyExtension"
})
public class OrderingPartyType
    extends BusinessEntityType
{

    @XmlElement(name = "SuppliersOrderingPartyID")
    protected String suppliersOrderingPartyID;
    @XmlElement(name = "OrderingPartyExtension", namespace = "http://erpel.at/schemas/1p0/documents/ext")
    protected OrderingPartyExtensionType orderingPartyExtension;

    /**
     * ID of the ordering party issued by the supplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliersOrderingPartyID() {
        return suppliersOrderingPartyID;
    }

    /**
     * Sets the value of the suppliersOrderingPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliersOrderingPartyID(String value) {
        this.suppliersOrderingPartyID = value;
    }

    /**
     * Gets the value of the orderingPartyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingPartyExtensionType }
     *     
     */
    public OrderingPartyExtensionType getOrderingPartyExtension() {
        return orderingPartyExtension;
    }

    /**
     * Sets the value of the orderingPartyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingPartyExtensionType }
     *     
     */
    public void setOrderingPartyExtension(OrderingPartyExtensionType value) {
        this.orderingPartyExtension = value;
    }

}
