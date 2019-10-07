
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomTargetType;


/**
 * <p>Java class for TargetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="OverrideRoutingIndicator" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationTypeCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="EndPointURI" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}URIType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomTargetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetType", propOrder = {
    "id",
    "overrideRoutingIndicator",
    "serviceName",
    "applicationTypeCode",
    "endPointURI",
    "custom"
})
public class TargetType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "OverrideRoutingIndicator")
    protected Boolean overrideRoutingIndicator;
    @XmlElement(name = "ServiceName")
    protected List<NameType> serviceName;
    @XmlElement(name = "ApplicationTypeCode")
    protected CodeType applicationTypeCode;
    @XmlElement(name = "EndPointURI")
    @XmlSchemaType(name = "anyURI")
    protected String endPointURI;
    @XmlElement(name = "Custom")
    protected CustomTargetType custom;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the overrideRoutingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideRoutingIndicator() {
        return overrideRoutingIndicator;
    }

    /**
     * Sets the value of the overrideRoutingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideRoutingIndicator(Boolean value) {
        this.overrideRoutingIndicator = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getServiceName() {
        if (serviceName == null) {
            serviceName = new ArrayList<NameType>();
        }
        return this.serviceName;
    }

    /**
     * Gets the value of the applicationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getApplicationTypeCode() {
        return applicationTypeCode;
    }

    /**
     * Sets the value of the applicationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setApplicationTypeCode(CodeType value) {
        this.applicationTypeCode = value;
    }

    /**
     * Gets the value of the endPointURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPointURI() {
        return endPointURI;
    }

    /**
     * Sets the value of the endPointURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPointURI(String value) {
        this.endPointURI = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTargetType }
     *     
     */
    public CustomTargetType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTargetType }
     *     
     */
    public void setCustom(CustomTargetType value) {
        this.custom = value;
    }

}
