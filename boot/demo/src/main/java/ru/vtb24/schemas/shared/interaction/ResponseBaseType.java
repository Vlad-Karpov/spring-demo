
package ru.vtb24.schemas.shared.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Bis-Data" type="{urn:www.vtb24.ru:schemas:shared:interaction}BisDataType" minOccurs="0"/&gt;
 *         &lt;element name="App-Data" type="{urn:www.vtb24.ru:schemas:shared:interaction}AppDataGlobalBaseType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ErrorString" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBaseType", propOrder = {

})
public class ResponseBaseType {

    @XmlElement(name = "Bis-Data")
    protected BisDataType bisData;
    @XmlElement(name = "App-Data")
    protected AppDataGlobalBaseType appData;
    @XmlAttribute(name = "ResultCode")
    protected Integer resultCode;
    @XmlAttribute(name = "ErrorString")
    protected String errorString;

    /**
     * Gets the value of the bisData property.
     * 
     * @return
     *     possible object is
     *     {@link BisDataType }
     *     
     */
    public BisDataType getBisData() {
        return bisData;
    }

    /**
     * Sets the value of the bisData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BisDataType }
     *     
     */
    public void setBisData(BisDataType value) {
        this.bisData = value;
    }

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link AppDataGlobalBaseType }
     *     
     */
    public AppDataGlobalBaseType getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDataGlobalBaseType }
     *     
     */
    public void setAppData(AppDataGlobalBaseType value) {
        this.appData = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCode(Integer value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

}
