
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImplementationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImplementationCodeType"&gt;
 *   &lt;restriction base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType"&gt;
 *     &lt;enumeration value="BPEL"/&gt;
 *     &lt;enumeration value="ESB"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="JAVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImplementationCodeType")
@XmlEnum
public enum ImplementationCodeType {

    BPEL("BPEL"),
    ESB("ESB"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    JAVA("JAVA");
    private final String value;

    ImplementationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImplementationCodeType fromValue(String v) {
        for (ImplementationCodeType c: ImplementationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
