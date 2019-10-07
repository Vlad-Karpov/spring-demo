
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}EBMReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}B2BMReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}FaultNotification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="languageCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}LanguageCodeType" default="en-US" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultType", propOrder = {
    "ebmReference",
    "b2BMReference",
    "faultNotification"
})
public class FaultType {

    @XmlElement(name = "EBMReference")
    protected EBMReferenceType ebmReference;
    @XmlElement(name = "B2BMReference")
    protected B2BMReferenceType b2BMReference;
    @XmlElement(name = "FaultNotification")
    protected List<FaultNotificationType> faultNotification;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Gets the value of the ebmReference property.
     * 
     * @return
     *     possible object is
     *     {@link EBMReferenceType }
     *     
     */
    public EBMReferenceType getEBMReference() {
        return ebmReference;
    }

    /**
     * Sets the value of the ebmReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBMReferenceType }
     *     
     */
    public void setEBMReference(EBMReferenceType value) {
        this.ebmReference = value;
    }

    /**
     * 
     *                         B2B related information for the failed transaction.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link B2BMReferenceType }
     *     
     */
    public B2BMReferenceType getB2BMReference() {
        return b2BMReference;
    }

    /**
     * Sets the value of the b2BMReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2BMReferenceType }
     *     
     */
    public void setB2BMReference(B2BMReferenceType value) {
        this.b2BMReference = value;
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        if (languageCode == null) {
            return "en-US";
        } else {
            return languageCode;
        }
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
