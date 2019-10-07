
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomIntermediateMessageHopType;


/**
 * 
 *                 This component allows for capturing of messaging properties in a multi-hopping messaging. The information can be used to support, for example, guaranteed delivery and auto recovery/resubmit of faulted messages. Note that the component does not capture the information of the first hop, the originator, because other fields in the EBMHeader already captures those such as the Sender and EBMID element.
 *             
 * 
 * <p>Java class for IntermediateMessageHopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntermediateMessageHopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SenderResourceTypeCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="SenderResourceID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="SenderMessageID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomIntermediateMessageHopType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntermediateMessageHopType", propOrder = {
    "senderResourceTypeCode",
    "senderResourceID",
    "senderMessageID",
    "custom"
})
public class IntermediateMessageHopType {

    @XmlElement(name = "SenderResourceTypeCode")
    protected CodeType senderResourceTypeCode;
    @XmlElement(name = "SenderResourceID")
    protected IdentifierType senderResourceID;
    @XmlElement(name = "SenderMessageID")
    protected IdentifierType senderMessageID;
    @XmlElement(name = "Custom")
    protected CustomIntermediateMessageHopType custom;

    /**
     * Gets the value of the senderResourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSenderResourceTypeCode() {
        return senderResourceTypeCode;
    }

    /**
     * Sets the value of the senderResourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSenderResourceTypeCode(CodeType value) {
        this.senderResourceTypeCode = value;
    }

    /**
     * Gets the value of the senderResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSenderResourceID() {
        return senderResourceID;
    }

    /**
     * Sets the value of the senderResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSenderResourceID(IdentifierType value) {
        this.senderResourceID = value;
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
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomIntermediateMessageHopType }
     *     
     */
    public CustomIntermediateMessageHopType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIntermediateMessageHopType }
     *     
     */
    public void setCustom(CustomIntermediateMessageHopType value) {
        this.custom = value;
    }

}
