
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectCrossReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectCrossReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SenderObjectIdentification" minOccurs="0"/&gt;
 *         &lt;element name="EBOID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectCrossReferenceType", propOrder = {
    "senderObjectIdentification",
    "eboid"
})
public class ObjectCrossReferenceType {

    @XmlElement(name = "SenderObjectIdentification")
    protected IdentificationType senderObjectIdentification;
    @XmlElement(name = "EBOID")
    protected IdentifierType eboid;

    /**
     * Gets the value of the senderObjectIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getSenderObjectIdentification() {
        return senderObjectIdentification;
    }

    /**
     * Sets the value of the senderObjectIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setSenderObjectIdentification(IdentificationType value) {
        this.senderObjectIdentification = value;
    }

    /**
     * Gets the value of the eboid property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEBOID() {
        return eboid;
    }

    /**
     * Sets the value of the eboid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEBOID(IdentifierType value) {
        this.eboid = value;
    }

}
