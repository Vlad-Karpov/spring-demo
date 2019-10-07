
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBMReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBMReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EBMID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="EBMName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EBOName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VerbCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}BusinessScopeReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SenderReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMReferenceType", propOrder = {
    "ebmid",
    "ebmName",
    "eboName",
    "verbCode",
    "businessScopeReference",
    "senderReference"
})
public class EBMReferenceType {

    @XmlElement(name = "EBMID")
    protected IdentifierType ebmid;
    @XmlElement(name = "EBMName")
    protected List<NameType> ebmName;
    @XmlElement(name = "EBOName")
    protected List<NameType> eboName;
    @XmlElement(name = "VerbCode")
    protected CodeType verbCode;
    @XmlElement(name = "BusinessScopeReference")
    protected BusinessScopeReferenceType businessScopeReference;
    @XmlElement(name = "SenderReference")
    protected SenderReferenceType senderReference;

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
     * Gets the value of the businessScopeReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeReferenceType }
     *     
     */
    public BusinessScopeReferenceType getBusinessScopeReference() {
        return businessScopeReference;
    }

    /**
     * Sets the value of the businessScopeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeReferenceType }
     *     
     */
    public void setBusinessScopeReference(BusinessScopeReferenceType value) {
        this.businessScopeReference = value;
    }

    /**
     * Gets the value of the senderReference property.
     * 
     * @return
     *     possible object is
     *     {@link SenderReferenceType }
     *     
     */
    public SenderReferenceType getSenderReference() {
        return senderReference;
    }

    /**
     * Sets the value of the senderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderReferenceType }
     *     
     */
    public void setSenderReference(SenderReferenceType value) {
        this.senderReference = value;
    }

}
