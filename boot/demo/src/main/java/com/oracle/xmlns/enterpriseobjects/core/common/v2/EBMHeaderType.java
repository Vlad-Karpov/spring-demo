
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomEBMHeaderType;
import oasis.names.tc.xacml._2_0.context.schema.cd._04.RequestType;


/**
 * <p>Java class for EBMHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBMHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EBMID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="EBMName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EBOName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="RequestEBMID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="VerbCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}MessageProcessingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}Sender" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}Target" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}BusinessScope" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}EBMTracking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}FaultNotification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}MessageBatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:context:schema:cd:04}Request" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}B2BProfile" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomEBMHeaderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="languageCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}LanguageCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMHeaderType", propOrder = {
    "ebmid",
    "ebmName",
    "eboName",
    "creationDateTime",
    "requestEBMID",
    "verbCode",
    "messageProcessingInstruction",
    "sender",
    "target",
    "businessScope",
    "ebmTracking",
    "faultNotification",
    "messageBatch",
    "request",
    "b2BProfile",
    "custom"
})
public class EBMHeaderType {

    @XmlElement(name = "EBMID")
    protected IdentifierType ebmid;
    @XmlElement(name = "EBMName")
    protected List<NameType> ebmName;
    @XmlElement(name = "EBOName")
    protected List<NameType> eboName;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "RequestEBMID")
    protected IdentifierType requestEBMID;
    @XmlElement(name = "VerbCode")
    protected CodeType verbCode;
    @XmlElement(name = "MessageProcessingInstruction")
    protected MessageProcessingInstructionType messageProcessingInstruction;
    @XmlElement(name = "Sender")
    protected SenderType sender;
    @XmlElement(name = "Target")
    protected TargetType target;
    @XmlElement(name = "BusinessScope")
    protected List<BusinessScopeType> businessScope;
    @XmlElement(name = "EBMTracking")
    protected List<EBMTrackingType> ebmTracking;
    @XmlElement(name = "FaultNotification")
    protected List<FaultNotificationType> faultNotification;
    @XmlElement(name = "MessageBatch")
    protected MessageBatchType messageBatch;
    @XmlElement(name = "Request", namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04")
    protected RequestType request;
    @XmlElement(name = "B2BProfile")
    protected B2BProfileType b2BProfile;
    @XmlElement(name = "Custom")
    protected CustomEBMHeaderType custom;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Gets the value of the ebmid property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEBMID() {
        return ebmid;
    }

    /**
     * Sets the value of the ebmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEBMID(IdentifierType value) {
        this.ebmid = value;
    }

    /**
     * Gets the value of the ebmName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebmName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBMName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getEBMName() {
        if (ebmName == null) {
            ebmName = new ArrayList<NameType>();
        }
        return this.ebmName;
    }

    /**
     * Gets the value of the eboName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eboName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBOName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getEBOName() {
        if (eboName == null) {
            eboName = new ArrayList<NameType>();
        }
        return this.eboName;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the requestEBMID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRequestEBMID() {
        return requestEBMID;
    }

    /**
     * Sets the value of the requestEBMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRequestEBMID(IdentifierType value) {
        this.requestEBMID = value;
    }

    /**
     * Gets the value of the verbCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVerbCode() {
        return verbCode;
    }

    /**
     * Sets the value of the verbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVerbCode(CodeType value) {
        this.verbCode = value;
    }

    /**
     * Gets the value of the messageProcessingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link MessageProcessingInstructionType }
     *     
     */
    public MessageProcessingInstructionType getMessageProcessingInstruction() {
        return messageProcessingInstruction;
    }

    /**
     * Sets the value of the messageProcessingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageProcessingInstructionType }
     *     
     */
    public void setMessageProcessingInstruction(MessageProcessingInstructionType value) {
        this.messageProcessingInstruction = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link TargetType }
     *     
     */
    public TargetType getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetType }
     *     
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

    /**
     * Gets the value of the businessScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessScopeType }
     * 
     * 
     */
    public List<BusinessScopeType> getBusinessScope() {
        if (businessScope == null) {
            businessScope = new ArrayList<BusinessScopeType>();
        }
        return this.businessScope;
    }

    /**
     * Gets the value of the ebmTracking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebmTracking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBMTracking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBMTrackingType }
     * 
     * 
     */
    public List<EBMTrackingType> getEBMTracking() {
        if (ebmTracking == null) {
            ebmTracking = new ArrayList<EBMTrackingType>();
        }
        return this.ebmTracking;
    }

    /**
     * Gets the value of the faultNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultNotificationType }
     * 
     * 
     */
    public List<FaultNotificationType> getFaultNotification() {
        if (faultNotification == null) {
            faultNotification = new ArrayList<FaultNotificationType>();
        }
        return this.faultNotification;
    }

    /**
     * Gets the value of the messageBatch property.
     * 
     * @return
     *     possible object is
     *     {@link MessageBatchType }
     *     
     */
    public MessageBatchType getMessageBatch() {
        return messageBatch;
    }

    /**
     * Sets the value of the messageBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageBatchType }
     *     
     */
    public void setMessageBatch(MessageBatchType value) {
        this.messageBatch = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * 
     *                         If the EBM is being used in a B2B flow, i.e. is used to either trigger an outbound Provider B2BCS Impl or is generated by an inbound Requestor B2BCS Impl, this element captures the sending and receiving trading partner information
     *                     
     * 
     * @return
     *     possible object is
     *     {@link B2BProfileType }
     *     
     */
    public B2BProfileType getB2BProfile() {
        return b2BProfile;
    }

    /**
     * Sets the value of the b2BProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2BProfileType }
     *     
     */
    public void setB2BProfile(B2BProfileType value) {
        this.b2BProfile = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomEBMHeaderType }
     *     
     */
    public CustomEBMHeaderType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomEBMHeaderType }
     *     
     */
    public void setCustom(CustomEBMHeaderType value) {
        this.custom = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
