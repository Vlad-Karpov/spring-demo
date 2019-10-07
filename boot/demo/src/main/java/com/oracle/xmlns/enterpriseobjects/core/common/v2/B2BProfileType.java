
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.custom.common.v2.CustomB2BProfileType;


/**
 * <p>Java class for B2BProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="B2BProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}SenderTradingPartner" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}ReceiverTradingPartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2}CustomB2BProfileType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "B2BProfileType", propOrder = {
    "senderTradingPartner",
    "receiverTradingPartner",
    "custom"
})
public class B2BProfileType {

    @XmlElement(name = "SenderTradingPartner")
    protected SenderTradingPartnerType senderTradingPartner;
    @XmlElement(name = "ReceiverTradingPartner")
    protected List<ReceiverTradingPartnerType> receiverTradingPartner;
    @XmlElement(name = "Custom")
    protected CustomB2BProfileType custom;

    /**
     * Gets the value of the senderTradingPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SenderTradingPartnerType }
     *     
     */
    public SenderTradingPartnerType getSenderTradingPartner() {
        return senderTradingPartner;
    }

    /**
     * Sets the value of the senderTradingPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderTradingPartnerType }
     *     
     */
    public void setSenderTradingPartner(SenderTradingPartnerType value) {
        this.senderTradingPartner = value;
    }

    /**
     * 
     *                         The trading partner information as defined in the B2B gateway for the receiver of the B2B document. The multiiple cardinality of the receiver is to support the case when a single document needs to be sent to multiple trading partners, e.g., a shipment document needs to be send to customer as well as a carrier.
     *                     Gets the value of the receiverTradingPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverTradingPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverTradingPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverTradingPartnerType }
     * 
     * 
     */
    public List<ReceiverTradingPartnerType> getReceiverTradingPartner() {
        if (receiverTradingPartner == null) {
            receiverTradingPartner = new ArrayList<ReceiverTradingPartnerType>();
        }
        return this.receiverTradingPartner;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomB2BProfileType }
     *     
     */
    public CustomB2BProfileType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomB2BProfileType }
     *     
     */
    public void setCustom(CustomB2BProfileType value) {
        this.custom = value;
    }

}
