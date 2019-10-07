
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ValueExpression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}QueryExpression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="logicalOperatorCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}LogicalOperatorCodeType" default="AND" /&gt;
 *       &lt;attribute name="logicalNegationIndicator" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpressionType", propOrder = {
    "valueExpression",
    "queryExpression"
})
public class QueryExpressionType {

    @XmlElement(name = "ValueExpression")
    protected List<ValueExpressionType> valueExpression;
    @XmlElement(name = "QueryExpression")
    protected List<QueryExpressionType> queryExpression;
    @XmlAttribute(name = "logicalOperatorCode")
    protected LogicalOperatorCodeType logicalOperatorCode;
    @XmlAttribute(name = "logicalNegationIndicator")
    protected Boolean logicalNegationIndicator;

    /**
     * Gets the value of the valueExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueExpressionType }
     * 
     * 
     */
    public List<ValueExpressionType> getValueExpression() {
        if (valueExpression == null) {
            valueExpression = new ArrayList<ValueExpressionType>();
        }
        return this.valueExpression;
    }

    /**
     * Gets the value of the queryExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryExpressionType }
     * 
     * 
     */
    public List<QueryExpressionType> getQueryExpression() {
        if (queryExpression == null) {
            queryExpression = new ArrayList<QueryExpressionType>();
        }
        return this.queryExpression;
    }

    /**
     * Gets the value of the logicalOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperatorCodeType }
     *     
     */
    public LogicalOperatorCodeType getLogicalOperatorCode() {
        if (logicalOperatorCode == null) {
            return LogicalOperatorCodeType.AND;
        } else {
            return logicalOperatorCode;
        }
    }

    /**
     * Sets the value of the logicalOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperatorCodeType }
     *     
     */
    public void setLogicalOperatorCode(LogicalOperatorCodeType value) {
        this.logicalOperatorCode = value;
    }

    /**
     * Gets the value of the logicalNegationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogicalNegationIndicator() {
        return logicalNegationIndicator;
    }

    /**
     * Sets the value of the logicalNegationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogicalNegationIndicator(Boolean value) {
        this.logicalNegationIndicator = value;
    }

}
