
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomSenderType;


/**
 * <p>Java class for SenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}URIType" minOccurs="0"/&gt;
 *         &lt;element name="SenderMessageID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CallingServiceName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}Application" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactEmail" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}URIType" minOccurs="0"/&gt;
 *         &lt;element name="ContactPhoneNumber" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ESBHeaderExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ObjectCrossReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}WSAddress" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomSenderType" minOccurs="0"/&gt;
 *         &lt;element name="ClientMacAddress" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderType", propOrder = {
    "id",
    "description",
    "ipAddress",
    "senderMessageID",
    "transactionCode",
    "callingServiceName",
    "application",
    "contactName",
    "contactEmail",
    "contactPhoneNumber",
    "esbHeaderExtension",
    "objectCrossReference",
    "wsAddress",
    "custom",
    "clientMacAddress"
})
public class SenderType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "IPAddress")
    @XmlSchemaType(name = "anyURI")
    protected String ipAddress;
    @XmlElement(name = "SenderMessageID")
    protected IdentifierType senderMessageID;
    @XmlElement(name = "TransactionCode")
    protected CodeType transactionCode;
    @XmlElement(name = "CallingServiceName")
    protected List<NameType> callingServiceName;
    @XmlElement(name = "Application")
    protected ApplicationType application;
    @XmlElement(name = "ContactName")
    protected List<NameType> contactName;
    @XmlElement(name = "ContactEmail")
    @XmlSchemaType(name = "anyURI")
    protected String contactEmail;
    @XmlElement(name = "ContactPhoneNumber")
    protected String contactPhoneNumber;
    @XmlElement(name = "ESBHeaderExtension")
    protected List<ESBHeaderExtensionType> esbHeaderExtension;
    @XmlElement(name = "ObjectCrossReference")
    protected List<ObjectCrossReferenceType> objectCrossReference;
    @XmlElement(name = "WSAddress")
    protected WSAddressType wsAddress;
    @XmlElement(name = "Custom")
    protected CustomSenderType custom;
    @XmlElement(name = "ClientMacAddress")
    protected String clientMacAddress;

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
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
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
     * Gets the value of the callingServiceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingServiceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingServiceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getCallingServiceName() {
        if (callingServiceName == null) {
            callingServiceName = new ArrayList<NameType>();
        }
        return this.callingServiceName;
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

    /**
     * Gets the value of the contactName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getContactName() {
        if (contactName == null) {
            contactName = new ArrayList<NameType>();
        }
        return this.contactName;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * Sets the value of the contactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneNumber(String value) {
        this.contactPhoneNumber = value;
    }

    /**
     * Gets the value of the esbHeaderExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esbHeaderExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESBHeaderExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ESBHeaderExtensionType }
     * 
     * 
     */
    public List<ESBHeaderExtensionType> getESBHeaderExtension() {
        if (esbHeaderExtension == null) {
            esbHeaderExtension = new ArrayList<ESBHeaderExtensionType>();
        }
        return this.esbHeaderExtension;
    }

    /**
     * Gets the value of the objectCrossReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectCrossReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectCrossReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectCrossReferenceType }
     * 
     * 
     */
    public List<ObjectCrossReferenceType> getObjectCrossReference() {
        if (objectCrossReference == null) {
            objectCrossReference = new ArrayList<ObjectCrossReferenceType>();
        }
        return this.objectCrossReference;
    }

    /**
     * Gets the value of the wsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link WSAddressType }
     *     
     */
    public WSAddressType getWSAddress() {
        return wsAddress;
    }

    /**
     * Sets the value of the wsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAddressType }
     *     
     */
    public void setWSAddress(WSAddressType value) {
        this.wsAddress = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSenderType }
     *     
     */
    public CustomSenderType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSenderType }
     *     
     */
    public void setCustom(CustomSenderType value) {
        this.custom = value;
    }

    /**
     * Gets the value of the clientMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientMacAddress() {
        return clientMacAddress;
    }

    /**
     * Sets the value of the clientMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientMacAddress(String value) {
        this.clientMacAddress = value;
    }

}
