
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncActionCodeType"&gt;
 *   &lt;restriction base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType"&gt;
 *     &lt;enumeration value="CREATEUPDATE"/&gt;
 *     &lt;enumeration value="CREATEREPLACE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SyncActionCodeType")
@XmlEnum
public enum SyncActionCodeType {

    CREATEUPDATE,
    CREATEREPLACE;

    public String value() {
        return name();
    }

    public static SyncActionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
