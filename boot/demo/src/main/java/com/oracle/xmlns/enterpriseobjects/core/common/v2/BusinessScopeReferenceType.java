
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessScopeReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessScopeReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseServiceName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseServiceOperationName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessScopeReferenceType", propOrder = {
    "id",
    "instanceID",
    "enterpriseServiceName",
    "enterpriseServiceOperationName"
})
public class BusinessScopeReferenceType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "InstanceID")
    protected IdentifierType instanceID;
    @XmlElement(name = "EnterpriseServiceName")
    protected List<NameType> enterpriseServiceName;
    @XmlElement(name = "EnterpriseServiceOperationName")
    protected List<NameType> enterpriseServiceOperationName;

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
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setInstanceID(IdentifierType value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the enterpriseServiceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterpriseServiceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterpriseServiceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getEnterpriseServiceName() {
        if (enterpriseServiceName == null) {
            enterpriseServiceName = new ArrayList<NameType>();
        }
        return this.enterpriseServiceName;
    }

    /**
     * Gets the value of the enterpriseServiceOperationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterpriseServiceOperationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterpriseServiceOperationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getEnterpriseServiceOperationName() {
        if (enterpriseServiceOperationName == null) {
            enterpriseServiceOperationName = new ArrayList<NameType>();
        }
        return this.enterpriseServiceOperationName;
    }

}
