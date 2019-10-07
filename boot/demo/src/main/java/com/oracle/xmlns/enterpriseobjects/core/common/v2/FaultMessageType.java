
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Severity" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Stack" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationFaultData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IntermediateMessageHop" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultMessageType", propOrder = {
    "code",
    "text",
    "severity",
    "stack",
    "applicationFaultData",
    "intermediateMessageHop"
})
public class FaultMessageType {

    @XmlElement(name = "Code")
    protected CodeType code;
    @XmlElement(name = "Text")
    protected List<TextType> text;
    @XmlElement(name = "Severity")
    protected CodeType severity;
    @XmlElement(name = "Stack")
    protected List<TextType> stack;
    @XmlElement(name = "ApplicationFaultData")
    protected Object applicationFaultData;
    @XmlElement(name = "IntermediateMessageHop")
    protected IntermediateMessageHopType intermediateMessageHop;

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
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getText() {
        if (text == null) {
            text = new ArrayList<TextType>();
        }
        return this.text;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSeverity(CodeType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the stack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getStack() {
        if (stack == null) {
            stack = new ArrayList<TextType>();
        }
        return this.stack;
    }

    /**
     * Gets the value of the applicationFaultData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getApplicationFaultData() {
        return applicationFaultData;
    }

    /**
     * Sets the value of the applicationFaultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setApplicationFaultData(Object value) {
        this.applicationFaultData = value;
    }

    /**
     * Gets the value of the intermediateMessageHop property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateMessageHopType }
     *     
     */
    public IntermediateMessageHopType getIntermediateMessageHop() {
        return intermediateMessageHop;
    }

    /**
     * Sets the value of the intermediateMessageHop property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateMessageHopType }
     *     
     */
    public void setIntermediateMessageHop(IntermediateMessageHopType value) {
        this.intermediateMessageHop = value;
    }

}
