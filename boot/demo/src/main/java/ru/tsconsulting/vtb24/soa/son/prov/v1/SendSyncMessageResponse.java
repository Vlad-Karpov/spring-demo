
package ru.tsconsulting.vtb24.soa.son.prov.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.tsconsulting.vtb24.soa.son.prov.v1.types.ResponseParameters;


/**
 * <p>Java class for sendSyncMessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSyncMessageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://v1.prov.son.soa.vtb24.tsconsulting.ru/types}responseParameters"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSyncMessageResponse", propOrder = {
    "_return"
})
public class SendSyncMessageResponse {

    @XmlElement(name = "return", required = true)
    protected ResponseParameters _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParameters }
     *     
     */
    public ResponseParameters getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParameters }
     *     
     */
    public void setReturn(ResponseParameters value) {
        this._return = value;
    }

}
