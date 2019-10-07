
package ru.vtb24.schemas.shared.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type is used if a specific business response is supplied in App-Data section
 *             
 * 
 * <p>Java class for AppDataWithResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppDataWithResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:www.vtb24.ru:schemas:shared:interaction}AppDataGlobalBaseType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Response" type="{urn:www.vtb24.ru:schemas:shared:interaction}BusinessResponseAbstactType"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppDataWithResponseType", propOrder = {
    "response"
})
public class AppDataWithResponseType
    extends AppDataGlobalBaseType
{

    @XmlElement(name = "Response", required = true)
    protected BusinessResponseAbstactType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessResponseAbstactType }
     *     
     */
    public BusinessResponseAbstactType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessResponseAbstactType }
     *     
     */
    public void setResponse(BusinessResponseAbstactType value) {
        this.response = value;
    }

}
