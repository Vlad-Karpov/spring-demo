
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="syncActionCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SyncActionCodeType" /&gt;
 *       &lt;attribute name="responseCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ResponseCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncType")
public class SyncType {

    @XmlAttribute(name = "syncActionCode")
    protected SyncActionCodeType syncActionCode;
    @XmlAttribute(name = "responseCode")
    protected ResponseCodeType responseCode;

    /**
     * Gets the value of the syncActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link SyncActionCodeType }
     *     
     */
    public SyncActionCodeType getSyncActionCode() {
        return syncActionCode;
    }

    /**
     * Sets the value of the syncActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncActionCodeType }
     *     
     */
    public void setSyncActionCode(SyncActionCodeType value) {
        this.syncActionCode = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeType }
     *     
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeType }
     *     
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
    }

}
