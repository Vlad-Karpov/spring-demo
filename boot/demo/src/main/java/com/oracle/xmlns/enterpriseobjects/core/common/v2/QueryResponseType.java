
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The relevanceScore attribute of QueryResponse can be used to indicate a ranking or scoring of each response instance against the original query request
 *             
 * 
 * <p>Java class for QueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="relevanceScore" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NumericType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponseType")
public class QueryResponseType {

    @XmlAttribute(name = "relevanceScore")
    protected BigDecimal relevanceScore;

    /**
     * Gets the value of the relevanceScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelevanceScore() {
        return relevanceScore;
    }

    /**
     * Sets the value of the relevanceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelevanceScore(BigDecimal value) {
        this.relevanceScore = value;
    }

}
