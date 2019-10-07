
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vtb24.schemas.shared.interaction.RequestBaseType;


/**
 * <p>Java class for SONProvTADataAreaRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SONProvTADataAreaRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:www.vtb24.ru:schemas:shared:interaction}Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SONProvTADataAreaRequestType", propOrder = {
    "request"
})
public class SONProvTADataAreaRequestType {

    @XmlElement(name = "Request", namespace = "urn:www.vtb24.ru:schemas:shared:interaction", required = true)
    protected RequestBaseType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestBaseType }
     *     
     */
    public RequestBaseType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestBaseType }
     *     
     */
    public void setRequest(RequestBaseType value) {
        this.request = value;
    }

}
