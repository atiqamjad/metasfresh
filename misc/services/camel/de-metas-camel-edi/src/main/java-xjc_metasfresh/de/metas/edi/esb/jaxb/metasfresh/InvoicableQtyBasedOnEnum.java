//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.01 at 08:03:25 AM CEST 
//


package de.metas.edi.esb.jaxb.metasfresh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoicableQtyBasedOnEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InvoicableQtyBasedOnEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CatchWeight"/&gt;
 *     &lt;enumeration value="Nominal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoicableQtyBasedOnEnum")
@XmlEnum
public enum InvoicableQtyBasedOnEnum {

    CatchWeight,
    Nominal;

    public String value() {
        return name();
    }

    public static InvoicableQtyBasedOnEnum fromValue(String v) {
        return valueOf(v);
    }

}
