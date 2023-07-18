//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.07.18 at 01:09:33 PM EEST 
//


package de.metas.vertical.healthcare_ch.forum_datenaustausch_ch.invoice_450.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for bodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prolog" type="{http://www.forum-datenaustausch.ch/invoice}prologType"/&gt;
 *         &lt;element name="remark" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_350" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="tiers_garant" type="{http://www.forum-datenaustausch.ch/invoice}garantType"/&gt;
 *           &lt;element name="tiers_payant" type="{http://www.forum-datenaustausch.ch/invoice}payantType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="esr9" type="{http://www.forum-datenaustausch.ch/invoice}esr9Type"/&gt;
 *           &lt;element name="esrRed" type="{http://www.forum-datenaustausch.ch/invoice}esrRedType"/&gt;
 *           &lt;element name="esrQR" type="{http://www.forum-datenaustausch.ch/invoice}esrQRType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="kvg" type="{http://www.forum-datenaustausch.ch/invoice}kvgLawType"/&gt;
 *           &lt;element name="vvg" type="{http://www.forum-datenaustausch.ch/invoice}vvgLawType"/&gt;
 *           &lt;element name="uvg" type="{http://www.forum-datenaustausch.ch/invoice}uvgLawType"/&gt;
 *           &lt;element name="ivg" type="{http://www.forum-datenaustausch.ch/invoice}ivgLawType"/&gt;
 *           &lt;element name="mvg" type="{http://www.forum-datenaustausch.ch/invoice}mvgLawType"/&gt;
 *           &lt;element name="org" type="{http://www.forum-datenaustausch.ch/invoice}orgLawType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="treatment" type="{http://www.forum-datenaustausch.ch/invoice}treatmentType"/&gt;
 *         &lt;element name="services" type="{http://www.forum-datenaustausch.ch/invoice}servicesType"/&gt;
 *         &lt;element name="documents" type="{http://www.forum-datenaustausch.ch/invoice}documentsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="role_title" type="{http://www.forum-datenaustausch.ch/invoice}stringType1_35" /&gt;
 *       &lt;attribute name="role" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="physician"/&gt;
 *             &lt;enumeration value="physiotherapist"/&gt;
 *             &lt;enumeration value="chiropractor"/&gt;
 *             &lt;enumeration value="ergotherapist"/&gt;
 *             &lt;enumeration value="nutritionist"/&gt;
 *             &lt;enumeration value="midwife"/&gt;
 *             &lt;enumeration value="logotherapist"/&gt;
 *             &lt;enumeration value="hospital"/&gt;
 *             &lt;enumeration value="pharmacist"/&gt;
 *             &lt;enumeration value="dentist"/&gt;
 *             &lt;enumeration value="labtechnician"/&gt;
 *             &lt;enumeration value="dentaltechnician"/&gt;
 *             &lt;enumeration value="othertechnician"/&gt;
 *             &lt;enumeration value="psychologist"/&gt;
 *             &lt;enumeration value="wholesaler"/&gt;
 *             &lt;enumeration value="nursingstaff"/&gt;
 *             &lt;enumeration value="transport"/&gt;
 *             &lt;enumeration value="druggist"/&gt;
 *             &lt;enumeration value="naturopathicdoctor"/&gt;
 *             &lt;enumeration value="naturopathictherapist"/&gt;
 *             &lt;enumeration value="other"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="place" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="practice"/&gt;
 *             &lt;enumeration value="hospital"/&gt;
 *             &lt;enumeration value="lab"/&gt;
 *             &lt;enumeration value="association"/&gt;
 *             &lt;enumeration value="company"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyType", namespace = "http://www.forum-datenaustausch.ch/invoice", propOrder = {
    "prolog",
    "remark",
    "tiersGarant",
    "tiersPayant",
    "esr9",
    "esrRed",
    "esrQR",
    "kvg",
    "vvg",
    "uvg",
    "ivg",
    "mvg",
    "org",
    "treatment",
    "services",
    "documents"
})
public class BodyType {

    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice", required = true)
    protected PrologType prolog;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected String remark;
    @XmlElement(name = "tiers_garant", namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected GarantType tiersGarant;
    @XmlElement(name = "tiers_payant", namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected PayantType tiersPayant;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected Esr9Type esr9;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected EsrRedType esrRed;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected EsrQRType esrQR;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected KvgLawType kvg;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected VvgLawType vvg;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected UvgLawType uvg;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected IvgLawType ivg;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected MvgLawType mvg;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected OrgLawType org;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice", required = true)
    protected TreatmentType treatment;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice", required = true)
    protected ServicesType services;
    @XmlElement(namespace = "http://www.forum-datenaustausch.ch/invoice")
    protected DocumentsType documents;
    @XmlAttribute(name = "role_title")
    protected String roleTitle;
    @XmlAttribute(name = "role", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String role;
    @XmlAttribute(name = "place", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String place;

    /**
     * Gets the value of the prolog property.
     * 
     * @return
     *     possible object is
     *     {@link PrologType }
     *     
     */
    public PrologType getProlog() {
        return prolog;
    }

    /**
     * Sets the value of the prolog property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrologType }
     *     
     */
    public void setProlog(PrologType value) {
        this.prolog = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the tiersGarant property.
     * 
     * @return
     *     possible object is
     *     {@link GarantType }
     *     
     */
    public GarantType getTiersGarant() {
        return tiersGarant;
    }

    /**
     * Sets the value of the tiersGarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarantType }
     *     
     */
    public void setTiersGarant(GarantType value) {
        this.tiersGarant = value;
    }

    /**
     * Gets the value of the tiersPayant property.
     * 
     * @return
     *     possible object is
     *     {@link PayantType }
     *     
     */
    public PayantType getTiersPayant() {
        return tiersPayant;
    }

    /**
     * Sets the value of the tiersPayant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayantType }
     *     
     */
    public void setTiersPayant(PayantType value) {
        this.tiersPayant = value;
    }

    /**
     * Gets the value of the esr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Esr9Type }
     *     
     */
    public Esr9Type getEsr9() {
        return esr9;
    }

    /**
     * Sets the value of the esr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Esr9Type }
     *     
     */
    public void setEsr9(Esr9Type value) {
        this.esr9 = value;
    }

    /**
     * Gets the value of the esrRed property.
     * 
     * @return
     *     possible object is
     *     {@link EsrRedType }
     *     
     */
    public EsrRedType getEsrRed() {
        return esrRed;
    }

    /**
     * Sets the value of the esrRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsrRedType }
     *     
     */
    public void setEsrRed(EsrRedType value) {
        this.esrRed = value;
    }

    /**
     * Gets the value of the esrQR property.
     * 
     * @return
     *     possible object is
     *     {@link EsrQRType }
     *     
     */
    public EsrQRType getEsrQR() {
        return esrQR;
    }

    /**
     * Sets the value of the esrQR property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsrQRType }
     *     
     */
    public void setEsrQR(EsrQRType value) {
        this.esrQR = value;
    }

    /**
     * Gets the value of the kvg property.
     * 
     * @return
     *     possible object is
     *     {@link KvgLawType }
     *     
     */
    public KvgLawType getKvg() {
        return kvg;
    }

    /**
     * Sets the value of the kvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link KvgLawType }
     *     
     */
    public void setKvg(KvgLawType value) {
        this.kvg = value;
    }

    /**
     * Gets the value of the vvg property.
     * 
     * @return
     *     possible object is
     *     {@link VvgLawType }
     *     
     */
    public VvgLawType getVvg() {
        return vvg;
    }

    /**
     * Sets the value of the vvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VvgLawType }
     *     
     */
    public void setVvg(VvgLawType value) {
        this.vvg = value;
    }

    /**
     * Gets the value of the uvg property.
     * 
     * @return
     *     possible object is
     *     {@link UvgLawType }
     *     
     */
    public UvgLawType getUvg() {
        return uvg;
    }

    /**
     * Sets the value of the uvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UvgLawType }
     *     
     */
    public void setUvg(UvgLawType value) {
        this.uvg = value;
    }

    /**
     * Gets the value of the ivg property.
     * 
     * @return
     *     possible object is
     *     {@link IvgLawType }
     *     
     */
    public IvgLawType getIvg() {
        return ivg;
    }

    /**
     * Sets the value of the ivg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IvgLawType }
     *     
     */
    public void setIvg(IvgLawType value) {
        this.ivg = value;
    }

    /**
     * Gets the value of the mvg property.
     * 
     * @return
     *     possible object is
     *     {@link MvgLawType }
     *     
     */
    public MvgLawType getMvg() {
        return mvg;
    }

    /**
     * Sets the value of the mvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MvgLawType }
     *     
     */
    public void setMvg(MvgLawType value) {
        this.mvg = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link OrgLawType }
     *     
     */
    public OrgLawType getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgLawType }
     *     
     */
    public void setOrg(OrgLawType value) {
        this.org = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentType }
     *     
     */
    public TreatmentType getTreatment() {
        return treatment;
    }

    /**
     * Sets the value of the treatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentType }
     *     
     */
    public void setTreatment(TreatmentType value) {
        this.treatment = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    public ServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    public void setServices(ServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsType }
     *     
     */
    public DocumentsType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsType }
     *     
     */
    public void setDocuments(DocumentsType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the roleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleTitle() {
        return roleTitle;
    }

    /**
     * Sets the value of the roleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleTitle(String value) {
        this.roleTitle = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

}
