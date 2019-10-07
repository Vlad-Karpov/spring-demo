
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.xmlsoap.schemas.ws._2003._03.addressing.AttributedURI;
import org.xmlsoap.schemas.ws._2003._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for WSAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/addressing}From" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/addressing}To" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/addressing}ReplyTo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/addressing}FaultTo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2003/03/addressing}Recipient" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAddressType", propOrder = {
    "from",
    "to",
    "replyTo",
    "faultTo",
    "recipient"
})
public class WSAddressType {

    @XmlElement(name = "From", namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing")
    protected EndpointReferenceType from;
    @XmlElement(name = "To", namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing")
    protected AttributedURI to;
    @XmlElement(name = "ReplyTo", namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing")
    protected EndpointReferenceType replyTo;
    @XmlElement(name = "FaultTo", namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing")
    protected EndpointReferenceType faultTo;
    @XmlElement(name = "Recipient", namespace = "http://schemas.xmlsoap.org/ws/2003/03/addressing")
    protected EndpointReferenceType recipient;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setFrom(EndpointReferenceType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURI }
     *     
     */
    public AttributedURI getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURI }
     *     
     */
    public void setTo(AttributedURI value) {
        this.to = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setReplyTo(EndpointReferenceType value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the faultTo property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getFaultTo() {
        return faultTo;
    }

    /**
     * Sets the value of the faultTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setFaultTo(EndpointReferenceType value) {
        this.faultTo = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setRecipient(EndpointReferenceType value) {
        this.recipient = value;
    }

}
