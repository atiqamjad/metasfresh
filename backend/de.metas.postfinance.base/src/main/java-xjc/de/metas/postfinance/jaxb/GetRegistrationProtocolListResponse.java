
package de.metas.postfinance.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetRegistrationProtocolListResult" type="{http://swisspost_ch.ebs.ebill.b2bservice}ArrayOfProtocolReport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRegistrationProtocolListResult"
})
@XmlRootElement(name = "GetRegistrationProtocolListResponse")
public class GetRegistrationProtocolListResponse {

    @XmlElementRef(name = "GetRegistrationProtocolListResult", namespace = "http://ch.swisspost.ebill.b2bservice", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProtocolReport> getRegistrationProtocolListResult;

    /**
     * Gets the value of the getRegistrationProtocolListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProtocolReport }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProtocolReport> getGetRegistrationProtocolListResult() {
        return getRegistrationProtocolListResult;
    }

    /**
     * Sets the value of the getRegistrationProtocolListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProtocolReport }{@code >}
     *     
     */
    public void setGetRegistrationProtocolListResult(JAXBElement<ArrayOfProtocolReport> value) {
        this.getRegistrationProtocolListResult = value;
    }

}
