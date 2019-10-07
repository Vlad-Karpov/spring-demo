
package ru.vtb24.schemas.shared.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Bis-Data" type="{urn:www.vtb24.ru:schemas:shared:interaction}BisDataType"/&gt;
 *         &lt;element name="App-Data" type="{urn:www.vtb24.ru:schemas:shared:interaction}AppDataGlobalBaseType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="ToBranch" type="{urn:www.vtb24.ru:schemas:shared:interaction}branchType" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBaseType", propOrder = {

})
public class RequestBaseType {

    @XmlElement(name = "Bis-Data", required = true)
    protected BisDataType bisData;
    @XmlElement(name = "App-Data", required = true)
    protected AppDataGlobalBaseType appData;
    @XmlAttribute(name = "ToBranch")
    protected String toBranch;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;

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
     * Gets the value of the toBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBranch() {
        return toBranch;
    }

    /**
     * Sets the value of the toBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBranch(String value) {
        this.toBranch = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
