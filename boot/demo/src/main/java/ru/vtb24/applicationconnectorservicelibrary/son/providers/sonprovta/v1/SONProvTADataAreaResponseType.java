
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vtb24.schemas.shared.interaction.ResponseBaseType;


/**
 * <p>Java class for SONProvTADataAreaResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SONProvTADataAreaResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:www.vtb24.ru:schemas:shared:interaction}Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SONProvTADataAreaResponseType", propOrder = {
    "response"
})
public class SONProvTADataAreaResponseType {

    @XmlElement(name = "Response", namespace = "urn:www.vtb24.ru:schemas:shared:interaction", required = true)
    protected ResponseBaseType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBaseType }
     *     
     */
    public ResponseBaseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBaseType }
     *     
     */
    public void setResponse(ResponseBaseType value) {
        this.response = value;
    }

}
