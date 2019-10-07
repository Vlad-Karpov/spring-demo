
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOperatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOperatorCodeType"&gt;
 *   &lt;restriction base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType"&gt;
 *     &lt;enumeration value="EQUALS"/&gt;
 *     &lt;enumeration value="NOT_EQUALS"/&gt;
 *     &lt;enumeration value="GREATER_THAN"/&gt;
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/&gt;
 *     &lt;enumeration value="LESS_THAN"/&gt;
 *     &lt;enumeration value="LESS_THAN_EQUALS"/&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/&gt;
 *     &lt;enumeration value="LIKE"/&gt;
 *     &lt;enumeration value="NOT_LIKE"/&gt;
 *     &lt;enumeration value="LIKE_IGNORE_CASE"/&gt;
 *     &lt;enumeration value="NOT_LIKE_IGNORE_CASE"/&gt;
 *     &lt;enumeration value="IS_BLANK"/&gt;
 *     &lt;enumeration value="IS_NOT_BLANK"/&gt;
 *     &lt;enumeration value="BETWEEN"/&gt;
 *     &lt;enumeration value="NOT_BETWEEN"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NOT_IN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryOperatorCodeType")
@XmlEnum
public enum QueryOperatorCodeType {

    EQUALS,
    NOT_EQUALS,
    GREATER_THAN,
    GREATER_THAN_EQUALS,
    LESS_THAN,
    LESS_THAN_EQUALS,
    CONTAINS,
    DOES_NOT_CONTAIN,
    LIKE,
    NOT_LIKE,
    LIKE_IGNORE_CASE,
    NOT_LIKE_IGNORE_CASE,
    IS_BLANK,
    IS_NOT_BLANK,
    BETWEEN,
    NOT_BETWEEN,
    IN,
    NOT_IN;

    public String value() {
        return name();
    }

    public static QueryOperatorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
