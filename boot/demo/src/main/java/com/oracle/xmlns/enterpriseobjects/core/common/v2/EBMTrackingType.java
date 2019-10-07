
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomEBMTrackingType;


/**
 * <p>Java class for EBMTrackingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBMTrackingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumber" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NumericType" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionUnitID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionUnitName" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}NameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ImplementationCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ImplementationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ActivityDateTime" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IntermediateMessageHop" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomEBMTrackingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMTrackingType", propOrder = {
    "sequenceNumber",
    "executionUnitID",
    "executionUnitName",
    "implementationCode",
    "activityDateTime",
    "intermediateMessageHop",
    "custom"
})
public class EBMTrackingType {

    @XmlElement(name = "SequenceNumber")
    protected BigDecimal sequenceNumber;
    @XmlElement(name = "ExecutionUnitID")
    protected IdentifierType executionUnitID;
    @XmlElement(name = "ExecutionUnitName")
    protected List<NameType> executionUnitName;
    @XmlElement(name = "ImplementationCode")
    @XmlSchemaType(name = "string")
    protected ImplementationCodeType implementationCode;
    @XmlElement(name = "ActivityDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activityDateTime;
    @XmlElement(name = "IntermediateMessageHop")
    protected IntermediateMessageHopType intermediateMessageHop;
    @XmlElement(name = "Custom")
    protected CustomEBMTrackingType custom;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequenceNumber(BigDecimal value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the executionUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getExecutionUnitID() {
        return executionUnitID;
    }

    /**
     * Sets the value of the executionUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setExecutionUnitID(IdentifierType value) {
        this.executionUnitID = value;
    }

    /**
     * Gets the value of the executionUnitName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executionUnitName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutionUnitName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getExecutionUnitName() {
        if (executionUnitName == null) {
            executionUnitName = new ArrayList<NameType>();
        }
        return this.executionUnitName;
    }

    /**
     * Gets the value of the implementationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationCodeType }
     *     
     */
    public ImplementationCodeType getImplementationCode() {
        return implementationCode;
    }

    /**
     * Sets the value of the implementationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationCodeType }
     *     
     */
    public void setImplementationCode(ImplementationCodeType value) {
        this.implementationCode = value;
    }

    /**
     * Gets the value of the activityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDateTime() {
        return activityDateTime;
    }

    /**
     * Sets the value of the activityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDateTime(XMLGregorianCalendar value) {
        this.activityDateTime = value;
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

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomEBMTrackingType }
     *     
     */
    public CustomEBMTrackingType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomEBMTrackingType }
     *     
     */
    public void setCustom(CustomEBMTrackingType value) {
        this.custom = value;
    }

}
