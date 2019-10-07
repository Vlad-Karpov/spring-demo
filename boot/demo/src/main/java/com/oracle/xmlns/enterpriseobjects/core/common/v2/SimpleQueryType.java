
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="getAllTranslationsIndicator" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleQueryType", propOrder = {
    "queryCode",
    "responseCode"
})
public class SimpleQueryType {

    @XmlElement(name = "QueryCode")
    protected CodeType queryCode;
    @XmlElement(name = "ResponseCode")
    protected CodeType responseCode;
    @XmlAttribute(name = "getAllTranslationsIndicator")
    protected Boolean getAllTranslationsIndicator;

    /**
     * Gets the value of the queryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getQueryCode() {
        return queryCode;
    }

    /**
     * Sets the value of the queryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setQueryCode(CodeType value) {
        this.queryCode = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setResponseCode(CodeType value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the getAllTranslationsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetAllTranslationsIndicator() {
        return getAllTranslationsIndicator;
    }

    /**
     * Sets the value of the getAllTranslationsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetAllTranslationsIndicator(Boolean value) {
        this.getAllTranslationsIndicator = value;
    }

}
