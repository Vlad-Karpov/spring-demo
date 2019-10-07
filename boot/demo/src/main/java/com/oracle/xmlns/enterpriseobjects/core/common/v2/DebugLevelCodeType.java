
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebugLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DebugLevelCodeType"&gt;
 *   &lt;restriction base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Medium"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DebugLevelCodeType")
@XmlEnum
public enum DebugLevelCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    DebugLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DebugLevelCodeType fromValue(String v) {
        for (DebugLevelCodeType c: DebugLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
