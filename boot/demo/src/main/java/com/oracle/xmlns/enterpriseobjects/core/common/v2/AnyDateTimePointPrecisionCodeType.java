
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyDateTimePointPrecisionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnyDateTimePointPrecisionCodeType"&gt;
 *   &lt;restriction base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType"&gt;
 *     &lt;enumeration value="Year"/&gt;
 *     &lt;enumeration value="YearMonth"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnyDateTimePointPrecisionCodeType")
@XmlEnum
public enum AnyDateTimePointPrecisionCodeType {

    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("YearMonth")
    YEAR_MONTH("YearMonth"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime");
    private final String value;

    AnyDateTimePointPrecisionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnyDateTimePointPrecisionCodeType fromValue(String v) {
        for (AnyDateTimePointPrecisionCodeType c: AnyDateTimePointPrecisionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
