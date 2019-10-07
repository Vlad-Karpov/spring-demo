
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FaultNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessComponentID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="ReportingDateTime" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="CorrectiveAction" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}FaultMessage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}FaultingService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultNotificationType", propOrder = {
    "businessComponentID",
    "reportingDateTime",
    "correctiveAction",
    "faultMessage",
    "faultingService"
})
public class FaultNotificationType {

    @XmlElement(name = "BusinessComponentID")
    protected IdentifierType businessComponentID;
    @XmlElement(name = "ReportingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportingDateTime;
    @XmlElement(name = "CorrectiveAction")
    protected List<TextType> correctiveAction;
    @XmlElement(name = "FaultMessage")
    protected FaultMessageType faultMessage;
    @XmlElement(name = "FaultingService")
    protected FaultingServiceType faultingService;

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
     * Gets the value of the reportingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDateTime() {
        return reportingDateTime;
    }

    /**
     * Sets the value of the reportingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDateTime(XMLGregorianCalendar value) {
        this.reportingDateTime = value;
    }

    /**
     * Gets the value of the correctiveAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctiveAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectiveAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getCorrectiveAction() {
        if (correctiveAction == null) {
            correctiveAction = new ArrayList<TextType>();
        }
        return this.correctiveAction;
    }

    /**
     * Gets the value of the faultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FaultMessageType }
     *     
     */
    public FaultMessageType getFaultMessage() {
        return faultMessage;
    }

    /**
     * Sets the value of the faultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultMessageType }
     *     
     */
    public void setFaultMessage(FaultMessageType value) {
        this.faultMessage = value;
    }

    /**
     * Gets the value of the faultingService property.
     * 
     * @return
     *     possible object is
     *     {@link FaultingServiceType }
     *     
     */
    public FaultingServiceType getFaultingService() {
        return faultingService;
    }

    /**
     * Sets the value of the faultingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultingServiceType }
     *     
     */
    public void setFaultingService(FaultingServiceType value) {
        this.faultingService = value;
    }

}
