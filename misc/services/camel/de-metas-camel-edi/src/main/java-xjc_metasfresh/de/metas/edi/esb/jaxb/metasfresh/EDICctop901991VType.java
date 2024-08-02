//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.01 at 08:03:25 AM CEST 
//


package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for EDI_cctop_901_991_vType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDI_cctop_901_991_vType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C_Invoice_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="EDI_cctop_901_991_v_ID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaxBaseAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SurchargeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TaxBaseAmtWithSurchargeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TaxAmtWithSurchargeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDI_cctop_901_991_vType", propOrder = {
    "cInvoiceID",
    "ediCctop901991VID",
    "rate",
    "taxAmt",
    "taxBaseAmt",
    "totalAmt",
    "referenceNo",
    "surchargeAmt",
    "taxBaseAmtWithSurchargeAmt",
    "taxAmtWithSurchargeAmt"
})
public class EDICctop901991VType {

    @XmlElement(name = "C_Invoice_ID")
    protected BigInteger cInvoiceID;
    @XmlElement(name = "EDI_cctop_901_991_v_ID")
    protected BigInteger ediCctop901991VID;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "TaxAmt")
    protected BigDecimal taxAmt;
    @XmlElement(name = "TaxBaseAmt")
    protected BigDecimal taxBaseAmt;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "ReferenceNo")
    protected String referenceNo;
    @XmlElement(name = "SurchargeAmt", required = true)
    protected BigDecimal surchargeAmt;
    @XmlElement(name = "TaxBaseAmtWithSurchargeAmt", required = true)
    protected BigDecimal taxBaseAmtWithSurchargeAmt;
    @XmlElement(name = "TaxAmtWithSurchargeAmt", required = true)
    protected BigDecimal taxAmtWithSurchargeAmt;

    /**
     * Gets the value of the cInvoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCInvoiceID() {
        return cInvoiceID;
    }

    /**
     * Sets the value of the cInvoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCInvoiceID(BigInteger value) {
        this.cInvoiceID = value;
    }

    /**
     * Gets the value of the ediCctop901991VID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEDICctop901991VID() {
        return ediCctop901991VID;
    }

    /**
     * Sets the value of the ediCctop901991VID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEDICctop901991VID(BigInteger value) {
        this.ediCctop901991VID = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmt(BigDecimal value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the taxBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxBaseAmt() {
        return taxBaseAmt;
    }

    /**
     * Sets the value of the taxBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxBaseAmt(BigDecimal value) {
        this.taxBaseAmt = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the surchargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurchargeAmt() {
        return surchargeAmt;
    }

    /**
     * Sets the value of the surchargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurchargeAmt(BigDecimal value) {
        this.surchargeAmt = value;
    }

    /**
     * Gets the value of the taxBaseAmtWithSurchargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxBaseAmtWithSurchargeAmt() {
        return taxBaseAmtWithSurchargeAmt;
    }

    /**
     * Sets the value of the taxBaseAmtWithSurchargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxBaseAmtWithSurchargeAmt(BigDecimal value) {
        this.taxBaseAmtWithSurchargeAmt = value;
    }

    /**
     * Gets the value of the taxAmtWithSurchargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmtWithSurchargeAmt() {
        return taxAmtWithSurchargeAmt;
    }

    /**
     * Sets the value of the taxAmtWithSurchargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmtWithSurchargeAmt(BigDecimal value) {
        this.taxAmtWithSurchargeAmt = value;
    }

}
