//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.01 at 08:03:28 AM CEST 
//


package at.erpel.schemas._1p0.documents.extensions.edifact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * <p>Java class for DESADVExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DESADVExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="DesadvReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="NVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeForPayment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OrdrspReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}MessageFunction" minOccurs="0"/&gt;
 *         &lt;element name="BillOfLadingReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SupplierOrderReference" type="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://erpel.at/schemas/1p0/documents/extensions/edifact}ConsignmentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DESADVExtensionType", propOrder = {
    "orderReference",
    "desadvReference",
    "nve",
    "packageAmount",
    "typeOfPackage",
    "contractNumber",
    "agreementNumber",
    "timeForPayment",
    "ordrspReference",
    "messageFunction",
    "billOfLadingReference",
    "supplierOrderReference",
    "consignmentReference"
})
public class DESADVExtensionType {

    @XmlElement(name = "OrderReference")
    protected ReferenceType orderReference;
    @XmlElement(name = "DesadvReference")
    protected ReferenceType desadvReference;
    @XmlElement(name = "NVE")
    protected String nve;
    @XmlElement(name = "PackageAmount")
    protected Integer packageAmount;
    @XmlElement(name = "TypeOfPackage")
    protected String typeOfPackage;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "AgreementNumber")
    protected String agreementNumber;
    @XmlElement(name = "TimeForPayment")
    protected BigInteger timeForPayment;
    @XmlElement(name = "OrdrspReference")
    protected ReferenceType ordrspReference;
    @XmlElement(name = "MessageFunction")
    protected String messageFunction;
    @XmlElement(name = "BillOfLadingReference")
    protected ReferenceType billOfLadingReference;
    @XmlElement(name = "SupplierOrderReference")
    protected ReferenceType supplierOrderReference;
    @XmlElement(name = "ConsignmentReference")
    protected String consignmentReference;

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOrderReference(ReferenceType value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the desadvReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDesadvReference() {
        return desadvReference;
    }

    /**
     * Sets the value of the desadvReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDesadvReference(ReferenceType value) {
        this.desadvReference = value;
    }

    /**
     * Gets the value of the nve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVE() {
        return nve;
    }

    /**
     * Sets the value of the nve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVE(String value) {
        this.nve = value;
    }

    /**
     * Gets the value of the packageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPackageAmount() {
        return packageAmount;
    }

    /**
     * Sets the value of the packageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPackageAmount(Integer value) {
        this.packageAmount = value;
    }

    /**
     * Gets the value of the typeOfPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPackage() {
        return typeOfPackage;
    }

    /**
     * Sets the value of the typeOfPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPackage(String value) {
        this.typeOfPackage = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the timeForPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeForPayment() {
        return timeForPayment;
    }

    /**
     * Sets the value of the timeForPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeForPayment(BigInteger value) {
        this.timeForPayment = value;
    }

    /**
     * Gets the value of the ordrspReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOrdrspReference() {
        return ordrspReference;
    }

    /**
     * Sets the value of the ordrspReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOrdrspReference(ReferenceType value) {
        this.ordrspReference = value;
    }

    /**
     * DEPRICATED: please use DocumentExtension/MessageFunction instead.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFunction(String value) {
        this.messageFunction = value;
    }

    /**
     * Gets the value of the billOfLadingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getBillOfLadingReference() {
        return billOfLadingReference;
    }

    /**
     * Sets the value of the billOfLadingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setBillOfLadingReference(ReferenceType value) {
        this.billOfLadingReference = value;
    }

    /**
     * Gets the value of the supplierOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSupplierOrderReference() {
        return supplierOrderReference;
    }

    /**
     * Sets the value of the supplierOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSupplierOrderReference(ReferenceType value) {
        this.supplierOrderReference = value;
    }

    /**
     * Reference to the consignment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentReference() {
        return consignmentReference;
    }

    /**
     * Sets the value of the consignmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentReference(String value) {
        this.consignmentReference = value;
    }

}
