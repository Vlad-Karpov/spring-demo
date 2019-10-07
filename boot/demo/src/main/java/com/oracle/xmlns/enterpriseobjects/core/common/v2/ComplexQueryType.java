
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}QueryCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ResponseFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="getAllTranslationsIndicator" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IndicatorType" /&gt;
 *       &lt;attribute name="recordSetStart" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}PositiveIntegerType" /&gt;
 *       &lt;attribute name="recordSetCount" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}PositiveIntegerType" /&gt;
 *       &lt;attribute name="maxItems" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}PositiveIntegerType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexQueryType", propOrder = {
    "queryCode",
    "responseCode",
    "queryCriteria",
    "responseFilter"
})
public class ComplexQueryType {

    @XmlElement(name = "QueryCode")
    protected CodeType queryCode;
    @XmlElement(name = "ResponseCode")
    protected CodeType responseCode;
    @XmlElement(name = "QueryCriteria")
    protected List<QueryCriteriaType> queryCriteria;
    @XmlElement(name = "ResponseFilter")
    protected ResponseFilterType responseFilter;
    @XmlAttribute(name = "getAllTranslationsIndicator")
    protected Boolean getAllTranslationsIndicator;
    @XmlAttribute(name = "recordSetStart")
    protected BigInteger recordSetStart;
    @XmlAttribute(name = "recordSetCount")
    protected BigInteger recordSetCount;
    @XmlAttribute(name = "maxItems")
    protected BigInteger maxItems;

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
     * Gets the value of the queryCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCriteriaType }
     * 
     * 
     */
    public List<QueryCriteriaType> getQueryCriteria() {
        if (queryCriteria == null) {
            queryCriteria = new ArrayList<QueryCriteriaType>();
        }
        return this.queryCriteria;
    }

    /**
     * Gets the value of the responseFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseFilterType }
     *     
     */
    public ResponseFilterType getResponseFilter() {
        return responseFilter;
    }

    /**
     * Sets the value of the responseFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseFilterType }
     *     
     */
    public void setResponseFilter(ResponseFilterType value) {
        this.responseFilter = value;
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

    /**
     * Gets the value of the recordSetStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetStart() {
        return recordSetStart;
    }

    /**
     * Sets the value of the recordSetStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetStart(BigInteger value) {
        this.recordSetStart = value;
    }

    /**
     * Gets the value of the recordSetCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSetCount() {
        return recordSetCount;
    }

    /**
     * Sets the value of the recordSetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSetCount(BigInteger value) {
        this.recordSetCount = value;
    }

    /**
     * Gets the value of the maxItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItems() {
        return maxItems;
    }

    /**
     * Sets the value of the maxItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItems(BigInteger value) {
        this.maxItems = value;
    }

}
