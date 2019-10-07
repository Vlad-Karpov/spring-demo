
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for B2BMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B2BMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}B2BMHeader" minOccurs="0"/&gt;
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B2BMType", propOrder = {
    "b2BMHeader",
    "payload"
})
public class B2BMType {

    @XmlElement(name = "B2BMHeader")
    protected B2BMHeaderType b2BMHeader;
    @XmlElement(name = "Payload")
    protected Object payload;

    /**
     * 
     *                         Header information describing the B2B document and trading partner identifiers
     *                     
     * 
     * @return
     *     possible object is
     *     {@link B2BMHeaderType }
     *     
     */
    public B2BMHeaderType getB2BMHeader() {
        return b2BMHeader;
    }

    /**
     * Sets the value of the b2BMHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2BMHeaderType }
     *     
     */
    public void setB2BMHeader(B2BMHeaderType value) {
        this.b2BMHeader = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPayload(Object value) {
        this.payload = value;
    }

}
