/*
 * #%L
 * de.metas.banking.camt53
 * %%
 * Copyright (C) 2023 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.07 at 02:56:38 PM EEST 
//


package de.metas.banking.camt53.jaxb.camt053_001_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EntryTransaction4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntryTransaction4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionReferences3" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}ActiveOrHistoricCurrencyAndAmount"/&gt;
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}CreditDebitCode"/&gt;
 *         &lt;element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}AmountAndCurrencyExchange3" minOccurs="0"/&gt;
 *         &lt;element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}CashBalanceAvailability2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}BankTransactionCodeStructure4" minOccurs="0"/&gt;
 *         &lt;element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}Charges4" minOccurs="0"/&gt;
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionInterest3" minOccurs="0"/&gt;
 *         &lt;element name="RltdPties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionParties3" minOccurs="0"/&gt;
 *         &lt;element name="RltdAgts" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionAgents3" minOccurs="0"/&gt;
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}Purpose2Choice" minOccurs="0"/&gt;
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}RemittanceLocation2" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}RemittanceInformation7" minOccurs="0"/&gt;
 *         &lt;element name="RltdDts" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionDates2" minOccurs="0"/&gt;
 *         &lt;element name="RltdPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionPrice3Choice" minOccurs="0"/&gt;
 *         &lt;element name="RltdQties" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TransactionQuantities2Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}SecurityIdentification14" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}TaxInformation3" minOccurs="0"/&gt;
 *         &lt;element name="RtrInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}PaymentReturnReason2" minOccurs="0"/&gt;
 *         &lt;element name="CorpActn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}CorporateAction9" minOccurs="0"/&gt;
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}SecuritiesAccount13" minOccurs="0"/&gt;
 *         &lt;element name="CshDpst" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}CashDeposit1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}CardTransaction1" minOccurs="0"/&gt;
 *         &lt;element name="AddtlTxInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}Max500Text" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryTransaction4", propOrder = {
    "refs",
    "amt",
    "cdtDbtInd",
    "amtDtls",
    "avlbty",
    "bkTxCd",
    "chrgs",
    "intrst",
    "rltdPties",
    "rltdAgts",
    "purp",
    "rltdRmtInf",
    "rmtInf",
    "rltdDts",
    "rltdPric",
    "rltdQties",
    "finInstrmId",
    "tax",
    "rtrInf",
    "corpActn",
    "sfkpgAcct",
    "cshDpst",
    "cardTx",
    "addtlTxInf",
    "splmtryData"
})
public class EntryTransaction4 {

    @XmlElement(name = "Refs")
    protected TransactionReferences3 refs;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange3 amtDtls;
    @XmlElement(name = "Avlbty")
    protected List<CashBalanceAvailability2> avlbty;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Chrgs")
    protected Charges4 chrgs;
    @XmlElement(name = "Intrst")
    protected TransactionInterest3 intrst;
    @XmlElement(name = "RltdPties")
    protected TransactionParties3 rltdPties;
    @XmlElement(name = "RltdAgts")
    protected TransactionAgents3 rltdAgts;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation2> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation7 rmtInf;
    @XmlElement(name = "RltdDts")
    protected TransactionDates2 rltdDts;
    @XmlElement(name = "RltdPric")
    protected TransactionPrice3Choice rltdPric;
    @XmlElement(name = "RltdQties")
    protected List<TransactionQuantities2Choice> rltdQties;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "Tax")
    protected TaxInformation3 tax;
    @XmlElement(name = "RtrInf")
    protected PaymentReturnReason2 rtrInf;
    @XmlElement(name = "CorpActn")
    protected CorporateAction9 corpActn;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount13 sfkpgAcct;
    @XmlElement(name = "CshDpst")
    protected List<CashDeposit1> cshDpst;
    @XmlElement(name = "CardTx")
    protected CardTransaction1 cardTx;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences3 }
     *     
     */
    public TransactionReferences3 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences3 }
     *     
     */
    public void setRefs(TransactionReferences3 value) {
        this.refs = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange3 }
     *     
     */
    public AmountAndCurrencyExchange3 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange3 }
     *     
     */
    public void setAmtDtls(AmountAndCurrencyExchange3 value) {
        this.amtDtls = value;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalanceAvailability2 }
     * 
     * 
     */
    public List<CashBalanceAvailability2> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<CashBalanceAvailability2>();
        }
        return this.avlbty;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charges4 }
     *     
     */
    public Charges4 getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges4 }
     *     
     */
    public void setChrgs(Charges4 value) {
        this.chrgs = value;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInterest3 }
     *     
     */
    public TransactionInterest3 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInterest3 }
     *     
     */
    public void setIntrst(TransactionInterest3 value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the rltdPties property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties3 }
     *     
     */
    public TransactionParties3 getRltdPties() {
        return rltdPties;
    }

    /**
     * Sets the value of the rltdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties3 }
     *     
     */
    public void setRltdPties(TransactionParties3 value) {
        this.rltdPties = value;
    }

    /**
     * Gets the value of the rltdAgts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAgents3 }
     *     
     */
    public TransactionAgents3 getRltdAgts() {
        return rltdAgts;
    }

    /**
     * Sets the value of the rltdAgts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAgents3 }
     *     
     */
    public void setRltdAgts(TransactionAgents3 value) {
        this.rltdAgts = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public void setPurp(Purpose2Choice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation2 }
     * 
     * 
     */
    public List<RemittanceLocation2> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<RemittanceLocation2>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation7 }
     *     
     */
    public RemittanceInformation7 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation7 }
     *     
     */
    public void setRmtInf(RemittanceInformation7 value) {
        this.rmtInf = value;
    }

    /**
     * Gets the value of the rltdDts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDates2 }
     *     
     */
    public TransactionDates2 getRltdDts() {
        return rltdDts;
    }

    /**
     * Sets the value of the rltdDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDates2 }
     *     
     */
    public void setRltdDts(TransactionDates2 value) {
        this.rltdDts = value;
    }

    /**
     * Gets the value of the rltdPric property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPrice3Choice }
     *     
     */
    public TransactionPrice3Choice getRltdPric() {
        return rltdPric;
    }

    /**
     * Sets the value of the rltdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPrice3Choice }
     *     
     */
    public void setRltdPric(TransactionPrice3Choice value) {
        this.rltdPric = value;
    }

    /**
     * Gets the value of the rltdQties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdQties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdQties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionQuantities2Choice }
     * 
     * 
     */
    public List<TransactionQuantities2Choice> getRltdQties() {
        if (rltdQties == null) {
            rltdQties = new ArrayList<TransactionQuantities2Choice>();
        }
        return this.rltdQties;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation3 }
     *     
     */
    public TaxInformation3 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation3 }
     *     
     */
    public void setTax(TaxInformation3 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the rtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason2 }
     *     
     */
    public PaymentReturnReason2 getRtrInf() {
        return rtrInf;
    }

    /**
     * Sets the value of the rtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason2 }
     *     
     */
    public void setRtrInf(PaymentReturnReason2 value) {
        this.rtrInf = value;
    }

    /**
     * Gets the value of the corpActn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction9 }
     *     
     */
    public CorporateAction9 getCorpActn() {
        return corpActn;
    }

    /**
     * Sets the value of the corpActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction9 }
     *     
     */
    public void setCorpActn(CorporateAction9 value) {
        this.corpActn = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public SecuritiesAccount13 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount13 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount13 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the cshDpst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshDpst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDpst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashDeposit1 }
     * 
     * 
     */
    public List<CashDeposit1> getCshDpst() {
        if (cshDpst == null) {
            cshDpst = new ArrayList<CashDeposit1>();
        }
        return this.cshDpst;
    }

    /**
     * Gets the value of the cardTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction1 }
     *     
     */
    public CardTransaction1 getCardTx() {
        return cardTx;
    }

    /**
     * Sets the value of the cardTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction1 }
     *     
     */
    public void setCardTx(CardTransaction1 value) {
        this.cardTx = value;
    }

    /**
     * Gets the value of the addtlTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxInf() {
        return addtlTxInf;
    }

    /**
     * Sets the value of the addtlTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTxInf(String value) {
        this.addtlTxInf = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
