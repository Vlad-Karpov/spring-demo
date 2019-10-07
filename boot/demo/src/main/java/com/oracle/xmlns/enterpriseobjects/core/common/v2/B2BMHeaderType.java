
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomB2BMHeaderType;


/**
 * <p>Java class for B2BMHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B2BMHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="B2BMID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="CollaborationID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="ReplyToMessageID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="GatewayID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}B2BDocumentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SenderTradingPartner" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ReceiverTradingPartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomB2BMHeaderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B2BMHeaderType", propOrder = {
    "b2BMID",
    "collaborationID",
    "replyToMessageID",
    "gatewayID",
    "b2BDocumentType",
    "senderTradingPartner",
    "receiverTradingPartner",
    "custom"
})
public class B2BMHeaderType {

    @XmlElement(name = "B2BMID")
    protected IdentifierType b2BMID;
    @XmlElement(name = "CollaborationID")
    protected IdentifierType collaborationID;
    @XmlElement(name = "ReplyToMessageID")
    protected IdentifierType replyToMessageID;
    @XmlElement(name = "GatewayID")
    protected IdentifierType gatewayID;
    @XmlElement(name = "B2BDocumentType")
    protected B2BDocumentTypeType b2BDocumentType;
    @XmlElement(name = "SenderTradingPartner")
    protected SenderTradingPartnerType senderTradingPartner;
    @XmlElement(name = "ReceiverTradingPartner")
    protected List<ReceiverTradingPartnerType> receiverTradingPartner;
    @XmlElement(name = "Custom")
    protected CustomB2BMHeaderType custom;

    /**
     * Gets the value of the b2BMID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getB2BMID() {
        return b2BMID;
    }

    /**
     * Sets the value of the b2BMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setB2BMID(IdentifierType value) {
        this.b2BMID = value;
    }

    /**
     * Gets the value of the collaborationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getCollaborationID() {
        return collaborationID;
    }

    /**
     * Sets the value of the collaborationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setCollaborationID(IdentifierType value) {
        this.collaborationID = value;
    }

    /**
     * Gets the value of the replyToMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getReplyToMessageID() {
        return replyToMessageID;
    }

    /**
     * Sets the value of the replyToMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setReplyToMessageID(IdentifierType value) {
        this.replyToMessageID = value;
    }

    /**
     * Gets the value of the gatewayID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getGatewayID() {
        return gatewayID;
    }

    /**
     * Sets the value of the gatewayID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setGatewayID(IdentifierType value) {
        this.gatewayID = value;
    }

    /**
     * 
     *                         Information about the B2B document type, standard and version being exchanged between the trading partners using the B2B software
     *                     
     * 
     * @return
     *     possible object is
     *     {@link B2BDocumentTypeType }
     *     
     */
    public B2BDocumentTypeType getB2BDocumentType() {
        return b2BDocumentType;
    }

    /**
     * Sets the value of the b2BDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2BDocumentTypeType }
     *     
     */
    public void setB2BDocumentType(B2BDocumentTypeType value) {
        this.b2BDocumentType = value;
    }

    /**
     * Gets the value of the senderTradingPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SenderTradingPartnerType }
     *     
     */
    public SenderTradingPartnerType getSenderTradingPartner() {
        return senderTradingPartner;
    }

    /**
     * Sets the value of the senderTradingPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderTradingPartnerType }
     *     
     */
    public void setSenderTradingPartner(SenderTradingPartnerType value) {
        this.senderTradingPartner = value;
    }

    /**
     * 
     *                         The trading partner information as defined in the B2B gateway for the receiver of the B2B document. The multiiple cardinality of the receiver is to support the case when a single document needs to be sent to multiple trading partners, e.g., a shipment document needs to be send to customer as well as a carrier.
     *                     Gets the value of the receiverTradingPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverTradingPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverTradingPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverTradingPartnerType }
     * 
     * 
     */
    public List<ReceiverTradingPartnerType> getReceiverTradingPartner() {
        if (receiverTradingPartner == null) {
            receiverTradingPartner = new ArrayList<ReceiverTradingPartnerType>();
        }
        return this.receiverTradingPartner;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomB2BMHeaderType }
     *     
     */
    public CustomB2BMHeaderType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomB2BMHeaderType }
     *     
     */
    public void setCustom(CustomB2BMHeaderType value) {
        this.custom = value;
    }

}
