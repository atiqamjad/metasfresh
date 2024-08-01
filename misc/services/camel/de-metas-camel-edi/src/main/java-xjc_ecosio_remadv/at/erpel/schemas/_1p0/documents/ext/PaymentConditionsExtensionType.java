//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.01 at 08:03:28 AM CEST 
//


package at.erpel.schemas._1p0.documents.ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentConditionsExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentConditionsExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}PaymentConditionsExtension"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/ext}ErpelPaymentConditionsExtension"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentConditionsExtensionType", propOrder = {
    "paymentConditionsExtension",
    "erpelPaymentConditionsExtension"
})
public class PaymentConditionsExtensionType {

    @XmlElement(name = "PaymentConditionsExtension", namespace = "http://erpel.at/schemas/1p0/documents/extensions/edifact")
    protected at.erpel.schemas._1p0.documents.extensions.edifact.PaymentConditionsExtensionType paymentConditionsExtension;
    @XmlElement(name = "ErpelPaymentConditionsExtension")
    protected CustomType erpelPaymentConditionsExtension;

    /**
     * Gets the value of the paymentConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link at.erpel.schemas._1p0.documents.extensions.edifact.PaymentConditionsExtensionType }
     *     
     */
    public at.erpel.schemas._1p0.documents.extensions.edifact.PaymentConditionsExtensionType getPaymentConditionsExtension() {
        return paymentConditionsExtension;
    }

    /**
     * Sets the value of the paymentConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link at.erpel.schemas._1p0.documents.extensions.edifact.PaymentConditionsExtensionType }
     *     
     */
    public void setPaymentConditionsExtension(at.erpel.schemas._1p0.documents.extensions.edifact.PaymentConditionsExtensionType value) {
        this.paymentConditionsExtension = value;
    }

    /**
     * Gets the value of the erpelPaymentConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link CustomType }
     *     
     */
    public CustomType getErpelPaymentConditionsExtension() {
        return erpelPaymentConditionsExtension;
    }

    /**
     * Sets the value of the erpelPaymentConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomType }
     *     
     */
    public void setErpelPaymentConditionsExtension(CustomType value) {
        this.erpelPaymentConditionsExtension = value;
    }

}
