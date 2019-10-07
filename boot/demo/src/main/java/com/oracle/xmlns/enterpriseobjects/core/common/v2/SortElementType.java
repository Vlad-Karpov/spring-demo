
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SortElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortElementType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2&gt;StringType"&gt;
 *       &lt;attribute name="sortDirectionCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SortDirectionCodeType" default="ASC" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortElementType", propOrder = {
    "value"
})
public class SortElementType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "sortDirectionCode")
    protected SortDirectionCodeType sortDirectionCode;

    /**
     * 
     *                 The string datatype represents character strings in XML. The value space of string is the set of finite-length sequences of characters (as defined in [XML 1.0 (Second Edition)]) that match the Char production from [XML 1.0 (Second Edition)]. A character is an atomic unit of communication; it is not further specified except to note that every character has a corresponding Universal Character Set code point, which is an integer
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
     * Gets the value of the sortDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirectionCodeType }
     *     
     */
    public SortDirectionCodeType getSortDirectionCode() {
        if (sortDirectionCode == null) {
            return SortDirectionCodeType.ASC;
        } else {
            return sortDirectionCode;
        }
    }

    /**
     * Sets the value of the sortDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirectionCodeType }
     *     
     */
    public void setSortDirectionCode(SortDirectionCodeType value) {
        this.sortDirectionCode = value;
    }

}
