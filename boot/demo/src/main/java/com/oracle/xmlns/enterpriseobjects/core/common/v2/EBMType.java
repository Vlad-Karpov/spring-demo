
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONReqMsgType;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONRespMsgType;


/**
 * <p>Java class for EBMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}EBMHeader"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versionID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}StringType" /&gt;
 *       &lt;attribute name="languageCode" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}LanguageCodeType" default="en-US" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBMType", propOrder = {
    "ebmHeader"
})
@XmlSeeAlso({
    SONReqMsgType.class,
    SONRespMsgType.class
})
public class EBMType {

    @XmlElement(name = "EBMHeader", required = true)
    protected EBMHeaderType ebmHeader;
    @XmlAttribute(name = "versionID")
    protected String versionID;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Gets the value of the ebmHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EBMHeaderType }
     *     
     */
    public EBMHeaderType getEBMHeader() {
        return ebmHeader;
    }

    /**
     * Sets the value of the ebmHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBMHeaderType }
     *     
     */
    public void setEBMHeader(EBMHeaderType value) {
        this.ebmHeader = value;
    }

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
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
