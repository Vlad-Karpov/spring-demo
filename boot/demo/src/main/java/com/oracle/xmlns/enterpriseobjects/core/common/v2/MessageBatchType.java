
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageBatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageBatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseMessage" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}TextType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}BatchParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageBatchType", propOrder = {
    "id",
    "name",
    "statusCode",
    "responseMessage",
    "batchParameter"
})
public class MessageBatchType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Name")
    protected NameType name;
    @XmlElement(name = "StatusCode")
    protected CodeType statusCode;
    @XmlElement(name = "ResponseMessage")
    protected TextType responseMessage;
    @XmlElement(name = "BatchParameter")
    protected List<BatchParameterType> batchParameter;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatusCode(CodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setResponseMessage(TextType value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the batchParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchParameterType }
     * 
     * 
     */
    public List<BatchParameterType> getBatchParameter() {
        if (batchParameter == null) {
            batchParameter = new ArrayList<BatchParameterType>();
        }
        return this.batchParameter;
    }

}
