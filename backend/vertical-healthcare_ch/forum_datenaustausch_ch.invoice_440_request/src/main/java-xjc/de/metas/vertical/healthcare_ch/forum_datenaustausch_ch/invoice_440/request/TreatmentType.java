//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:30 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_440.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for treatmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="treatmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="diagnosis" type="{http://www.forum-datenaustausch.ch/invoice}diagnosisType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="xtra_hospital" type="{http://www.forum-datenaustausch.ch/invoice}xtraHospitalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="date_begin" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="date_end" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="canton" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="AG"/&gt;
 *             &lt;enumeration value="AI"/&gt;
 *             &lt;enumeration value="AR"/&gt;
 *             &lt;enumeration value="BE"/&gt;
 *             &lt;enumeration value="BL"/&gt;
 *             &lt;enumeration value="BS"/&gt;
 *             &lt;enumeration value="FR"/&gt;
 *             &lt;enumeration value="GE"/&gt;
 *             &lt;enumeration value="GL"/&gt;
 *             &lt;enumeration value="GR"/&gt;
 *             &lt;enumeration value="JU"/&gt;
 *             &lt;enumeration value="LU"/&gt;
 *             &lt;enumeration value="NE"/&gt;
 *             &lt;enumeration value="NW"/&gt;
 *             &lt;enumeration value="OW"/&gt;
 *             &lt;enumeration value="SG"/&gt;
 *             &lt;enumeration value="SH"/&gt;
 *             &lt;enumeration value="SO"/&gt;
 *             &lt;enumeration value="SZ"/&gt;
 *             &lt;enumeration value="TI"/&gt;
 *             &lt;enumeration value="TG"/&gt;
 *             &lt;enumeration value="UR"/&gt;
 *             &lt;enumeration value="VD"/&gt;
 *             &lt;enumeration value="VS"/&gt;
 *             &lt;enumeration value="ZG"/&gt;
 *             &lt;enumeration value="ZH"/&gt;
 *             &lt;enumeration value="LI"/&gt;
 *             &lt;enumeration value="A"/&gt;
 *             &lt;enumeration value="D"/&gt;
 *             &lt;enumeration value="F"/&gt;
 *             &lt;enumeration value="I"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="reason" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="disease"/&gt;
 *             &lt;enumeration value="accident"/&gt;
 *             &lt;enumeration value="maternity"/&gt;
 *             &lt;enumeration value="prevention"/&gt;
 *             &lt;enumeration value="birthdefect"/&gt;
 *             &lt;enumeration value="unknown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="apid" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" /&gt;
 *       &lt;attribute name="acid" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "treatmentType", namespace = "http://www.forum-datenaustausch.ch/invoice", propOrder = {
    "diagnosis",
    "xtraHospital"
})
public class TreatmentType {

    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected List<DiagnosisType> diagnosis;
    @XmlElement(name = "xtra_hospital", namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected XtraHospitalType xtraHospital;
    @XmlAttribute(name = "date_begin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBegin;
    @XmlAttribute(name = "date_end", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    @XmlAttribute(name = "canton", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String canton;
    @XmlAttribute(name = "reason", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reason;
    @XmlAttribute(name = "apid")
    protected String apid;
    @XmlAttribute(name = "acid")
    protected String acid;

    /**
     * Gets the value of the diagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosisType }
     * 
     * 
     */
    public List<DiagnosisType> getDiagnosis() {
        if (diagnosis == null) {
            diagnosis = new ArrayList<DiagnosisType>();
        }
        return this.diagnosis;
    }

    /**
     * Gets the value of the xtraHospital property.
     * 
     * @return
     *     possible object is
     *     {@link XtraHospitalType }
     *     
     */
    public XtraHospitalType getXtraHospital() {
        return xtraHospital;
    }

    /**
     * Sets the value of the xtraHospital property.
     * 
     * @param value
     *     allowed object is
     *     {@link XtraHospitalType }
     *     
     */
    public void setXtraHospital(XtraHospitalType value) {
        this.xtraHospital = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the canton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Sets the value of the canton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanton(String value) {
        this.canton = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the apid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApid() {
        return apid;
    }

    /**
     * Sets the value of the apid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApid(String value) {
        this.apid = value;
    }

    /**
     * Gets the value of the acid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcid() {
        return acid;
    }

    /**
     * Sets the value of the acid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcid(String value) {
        this.acid = value;
    }

}
