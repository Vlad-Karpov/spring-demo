
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualifiedElementPath" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}QueryExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SortElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCriteriaType", propOrder = {
    "qualifiedElementPath",
    "queryExpression",
    "sortElement"
})
public class QueryCriteriaType {

    @XmlElement(name = "QualifiedElementPath")
    protected String qualifiedElementPath;
    @XmlElement(name = "QueryExpression")
    protected QueryExpressionType queryExpression;
    @XmlElement(name = "SortElement")
    protected List<SortElementType> sortElement;

    /**
     * Gets the value of the qualifiedElementPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedElementPath() {
        return qualifiedElementPath;
    }

    /**
     * Sets the value of the qualifiedElementPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedElementPath(String value) {
        this.qualifiedElementPath = value;
    }

    /**
     * Gets the value of the queryExpression property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getQueryExpression() {
        return queryExpression;
    }

    /**
     * Sets the value of the queryExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setQueryExpression(QueryExpressionType value) {
        this.queryExpression = value;
    }

    /**
     * Gets the value of the sortElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortElementType }
     * 
     * 
     */
    public List<SortElementType> getSortElement() {
        if (sortElement == null) {
            sortElement = new ArrayList<SortElementType>();
        }
        return this.sortElement;
    }

}
