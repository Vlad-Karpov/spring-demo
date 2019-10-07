
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessComponentID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ContextID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ApplicationObjectKey" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}AlternateObjectKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}Revision" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeIdentificationType", propOrder = {
    "businessComponentID",
    "code",
    "contextID",
    "applicationObjectKey",
    "alternateObjectKey",
    "revision"
})
public class CodeIdentificationType {

    @XmlElement(name = "BusinessComponentID")
    protected IdentifierType businessComponentID;
    @XmlElement(name = "Code")
    protected CodeType code;
    @XmlElement(name = "ContextID")
    protected List<IdentifierType> contextID;
    @XmlElement(name = "ApplicationObjectKey")
    protected ObjectKeyType applicationObjectKey;
    @XmlElement(name = "AlternateObjectKey")
    protected List<ObjectKeyType> alternateObjectKey;
    @XmlElement(name = "Revision")
    protected RevisionType revision;

    /**
     * Gets the value of the businessComponentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBusinessComponentID() {
        return businessComponentID;
    }

    /**
     * Sets the value of the businessComponentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBusinessComponentID(IdentifierType value) {
        this.businessComponentID = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the contextID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getContextID() {
        if (contextID == null) {
            contextID = new ArrayList<IdentifierType>();
        }
        return this.contextID;
    }

    /**
     * Gets the value of the applicationObjectKey property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectKeyType }
     *     
     */
    public ObjectKeyType getApplicationObjectKey() {
        return applicationObjectKey;
    }

    /**
     * Sets the value of the applicationObjectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectKeyType }
     *     
     */
    public void setApplicationObjectKey(ObjectKeyType value) {
        this.applicationObjectKey = value;
    }

    /**
     * Gets the value of the alternateObjectKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateObjectKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateObjectKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectKeyType }
     * 
     * 
     */
    public List<ObjectKeyType> getAlternateObjectKey() {
        if (alternateObjectKey == null) {
            alternateObjectKey = new ArrayList<ObjectKeyType>();
        }
        return this.alternateObjectKey;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionType }
     *     
     */
    public RevisionType getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionType }
     *     
     */
    public void setRevision(RevisionType value) {
        this.revision = value;
    }

}
