
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultingServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultingServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="ImplementationCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ImplementationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionContextID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultingServiceType", propOrder = {
    "id",
    "implementationCode",
    "instanceID",
    "executionContextID"
})
public class FaultingServiceType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "ImplementationCode")
    @XmlSchemaType(name = "string")
    protected ImplementationCodeType implementationCode;
    @XmlElement(name = "InstanceID")
    protected IdentifierType instanceID;
    @XmlElement(name = "ExecutionContextID")
    protected IdentifierType executionContextID;

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
     * Gets the value of the implementationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationCodeType }
     *     
     */
    public ImplementationCodeType getImplementationCode() {
        return implementationCode;
    }

    /**
     * Sets the value of the implementationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationCodeType }
     *     
     */
    public void setImplementationCode(ImplementationCodeType value) {
        this.implementationCode = value;
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
     * Gets the value of the executionContextID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getExecutionContextID() {
        return executionContextID;
    }

    /**
     * Sets the value of the executionContextID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setExecutionContextID(IdentifierType value) {
        this.executionContextID = value;
    }

}
