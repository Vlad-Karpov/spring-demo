
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualifiedElementPath" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="exclusionIndicator" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseFilterType", propOrder = {
    "qualifiedElementPath"
})
public class ResponseFilterType {

    @XmlElement(name = "QualifiedElementPath", required = true)
    protected List<String> qualifiedElementPath;
    @XmlAttribute(name = "exclusionIndicator")
    protected Boolean exclusionIndicator;

    /**
     * Gets the value of the qualifiedElementPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedElementPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedElementPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQualifiedElementPath() {
        if (qualifiedElementPath == null) {
            qualifiedElementPath = new ArrayList<String>();
        }
        return this.qualifiedElementPath;
    }

    /**
     * Gets the value of the exclusionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusionIndicator() {
        return exclusionIndicator;
    }

    /**
     * Sets the value of the exclusionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusionIndicator(Boolean value) {
        this.exclusionIndicator = value;
    }

}
