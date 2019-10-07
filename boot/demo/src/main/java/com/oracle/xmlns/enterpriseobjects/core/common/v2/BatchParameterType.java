
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchParameterType", propOrder = {
    "name",
    "dataTypeCode",
    "value"
})
public class BatchParameterType {

    @XmlElement(name = "Name")
    protected NameType name;
    @XmlElement(name = "DataTypeCode")
    protected CodeType dataTypeCode;
    @XmlElement(name = "Value")
    protected String value;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the dataTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDataTypeCode() {
        return dataTypeCode;
    }

    /**
     * Sets the value of the dataTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDataTypeCode(CodeType value) {
        this.dataTypeCode = value;
    }

    /**
     * Gets the value of the value property.
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

}
