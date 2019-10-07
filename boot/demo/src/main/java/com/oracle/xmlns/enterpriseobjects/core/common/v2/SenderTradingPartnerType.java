
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomSenderTradingPartnerType;


/**
 * <p>Java class for SenderTradingPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderTradingPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradingPartnerID" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}IdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomSenderTradingPartnerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderTradingPartnerType", propOrder = {
    "tradingPartnerID",
    "custom"
})
public class SenderTradingPartnerType {

    @XmlElement(name = "TradingPartnerID")
    protected List<IdentifierType> tradingPartnerID;
    @XmlElement(name = "Custom")
    protected CustomSenderTradingPartnerType custom;

    /**
     * Gets the value of the tradingPartnerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingPartnerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingPartnerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getTradingPartnerID() {
        if (tradingPartnerID == null) {
            tradingPartnerID = new ArrayList<IdentifierType>();
        }
        return this.tradingPartnerID;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomSenderTradingPartnerType }
     *     
     */
    public CustomSenderTradingPartnerType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomSenderTradingPartnerType }
     *     
     */
    public void setCustom(CustomSenderTradingPartnerType value) {
        this.custom = value;
    }

}
