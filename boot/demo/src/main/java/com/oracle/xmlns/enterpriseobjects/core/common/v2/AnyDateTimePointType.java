
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *                 A flexible time point type. It allows for various time point to be specified as indicated by its precision code attribute.
 *             
 * 
 * <p>Java class for AnyDateTimePointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyDateTimePointType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2&gt;AnyDateTimePointBaseType"&gt;
 *       &lt;attribute name="PrecisionCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}AnyDateTimePointPrecisionCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyDateTimePointType", propOrder = {
    "value"
})
public class AnyDateTimePointType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PrecisionCode")
    protected AnyDateTimePointPrecisionCodeType precisionCode;

    /**
     * 
     *                 From UN/CEFACT XML NDR, this is considered a built-in type.
     *             
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the precisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnyDateTimePointPrecisionCodeType }
     *     
     */
    public AnyDateTimePointPrecisionCodeType getPrecisionCode() {
        return precisionCode;
    }

    /**
     * Sets the value of the precisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyDateTimePointPrecisionCodeType }
     *     
     */
    public void setPrecisionCode(AnyDateTimePointPrecisionCodeType value) {
        this.precisionCode = value;
    }

}
