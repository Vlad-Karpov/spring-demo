
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenderReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="SenderMessageID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ObjectCrossReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}Application" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderReferenceType", propOrder = {
    "id",
    "senderMessageID",
    "transactionCode",
    "objectCrossReference",
    "application"
})
public class SenderReferenceType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "SenderMessageID")
    protected IdentifierType senderMessageID;
    @XmlElement(name = "TransactionCode")
    protected CodeType transactionCode;
    @XmlElement(name = "ObjectCrossReference")
    protected ObjectCrossReferenceType objectCrossReference;
    @XmlElement(name = "Application")
    protected ApplicationType application;

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
     * Gets the value of the senderMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSenderMessageID() {
        return senderMessageID;
    }

    /**
     * Sets the value of the senderMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSenderMessageID(IdentifierType value) {
        this.senderMessageID = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransactionCode(CodeType value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the objectCrossReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectCrossReferenceType }
     *     
     */
    public ObjectCrossReferenceType getObjectCrossReference() {
        return objectCrossReference;
    }

    /**
     * Sets the value of the objectCrossReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectCrossReferenceType }
     *     
     */
    public void setObjectCrossReference(ObjectCrossReferenceType value) {
        this.objectCrossReference = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplication(ApplicationType value) {
        this.application = value;
    }

}
