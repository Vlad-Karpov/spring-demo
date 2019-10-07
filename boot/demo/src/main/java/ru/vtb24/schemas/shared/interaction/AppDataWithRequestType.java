
package ru.vtb24.schemas.shared.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type is used if a specific business request is supplied in App-Data section
 *             
 * 
 * <p>Java class for AppDataWithRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppDataWithRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:www.vtb24.ru:schemas:shared:interaction}AppDataGlobalBaseType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Request" type="{urn:www.vtb24.ru:schemas:shared:interaction}BusinessRequestAbstractType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppDataWithRequestType", propOrder = {
    "request"
})
public class AppDataWithRequestType
    extends AppDataGlobalBaseType
{

    @XmlElement(name = "Request")
    protected BusinessRequestAbstractType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRequestAbstractType }
     *     
     */
    public BusinessRequestAbstractType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRequestAbstractType }
     *     
     */
    public void setRequest(BusinessRequestAbstractType value) {
        this.request = value;
    }

}
