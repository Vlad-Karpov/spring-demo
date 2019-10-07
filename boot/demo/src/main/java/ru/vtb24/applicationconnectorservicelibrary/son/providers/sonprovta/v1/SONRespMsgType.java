
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.enterpriseobjects.core.common.v2.EBMType;


/**
 * Ответное сообщение
 * 
 * <p>Java class for SONRespMsgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SONRespMsgType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2}EBMType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataArea" type="{http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1}SONProvTADataAreaResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SONRespMsgType", propOrder = {
    "dataArea"
})
public class SONRespMsgType
    extends EBMType
{

    @XmlElement(name = "DataArea", required = true)
    protected SONProvTADataAreaResponseType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link SONProvTADataAreaResponseType }
     *     
     */
    public SONProvTADataAreaResponseType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SONProvTADataAreaResponseType }
     *     
     */
    public void setDataArea(SONProvTADataAreaResponseType value) {
        this.dataArea = value;
    }

}
