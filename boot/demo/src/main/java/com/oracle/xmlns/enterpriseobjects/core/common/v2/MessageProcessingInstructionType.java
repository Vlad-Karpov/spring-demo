
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomMessageProcessingInstructionType;


/**
 * <p>Java class for MessageProcessingInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageProcessingInstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnvironmentCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DefinitionID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="InstanceID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomMessageProcessingInstructionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageProcessingInstructionType", propOrder = {
    "environmentCode",
    "definitionID",
    "instanceID",
    "custom"
})
public class MessageProcessingInstructionType {

    @XmlElement(name = "EnvironmentCode")
    protected CodeType environmentCode;
    @XmlElement(name = "DefinitionID")
    protected IdentifierType definitionID;
    @XmlElement(name = "InstanceID")
    protected IdentifierType instanceID;
    @XmlElement(name = "Custom")
    protected CustomMessageProcessingInstructionType custom;

    /**
     * Gets the value of the environmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getEnvironmentCode() {
        return environmentCode;
    }

    /**
     * Sets the value of the environmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setEnvironmentCode(CodeType value) {
        this.environmentCode = value;
    }

    /**
     * Gets the value of the definitionID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDefinitionID() {
        return definitionID;
    }

    /**
     * Sets the value of the definitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDefinitionID(IdentifierType value) {
        this.definitionID = value;
    }

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setInstanceID(IdentifierType value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomMessageProcessingInstructionType }
     *     
     */
    public CustomMessageProcessingInstructionType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomMessageProcessingInstructionType }
     *     
     */
    public void setCustom(CustomMessageProcessingInstructionType value) {
        this.custom = value;
    }

}
