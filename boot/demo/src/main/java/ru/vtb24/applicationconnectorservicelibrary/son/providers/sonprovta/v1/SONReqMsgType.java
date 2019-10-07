
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.common.v2.EBMType;


/**
 * Запрос через шину Sonic
 * 
 * <p>Java class for SONReqMsgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SONReqMsgType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}EBMType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataArea" type="{http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1}SONProvTADataAreaRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SONReqMsgType", propOrder = {
    "dataArea"
})
public class SONReqMsgType
    extends EBMType
{

    @XmlElement(name = "DataArea", required = true)
    protected SONProvTADataAreaRequestType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link SONProvTADataAreaRequestType }
     *     
     */
    public SONProvTADataAreaRequestType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SONProvTADataAreaRequestType }
     *     
     */
    public void setDataArea(SONProvTADataAreaRequestType value) {
        this.dataArea = value;
    }

}
