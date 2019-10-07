
package ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SONRequestEBM_QNAME = new QName("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", "SONRequestEBM");
    private final static QName _SONResponseEBM_QNAME = new QName("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", "SONResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SONReqMsgType }
     * 
     */
    public SONReqMsgType createSONReqMsgType() {
        return new SONReqMsgType();
    }

    /**
     * Create an instance of {@link SONRespMsgType }
     * 
     */
    public SONRespMsgType createSONRespMsgType() {
        return new SONRespMsgType();
    }

    /**
     * Create an instance of {@link SONProvTADataAreaRequestType }
     * 
     */
    public SONProvTADataAreaRequestType createSONProvTADataAreaRequestType() {
        return new SONProvTADataAreaRequestType();
    }

    /**
     * Create an instance of {@link SONProvTADataAreaResponseType }
     * 
     */
    public SONProvTADataAreaResponseType createSONProvTADataAreaResponseType() {
        return new SONProvTADataAreaResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SONReqMsgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", name = "SONRequestEBM")
    public JAXBElement<SONReqMsgType> createSONRequestEBM(SONReqMsgType value) {
        return new JAXBElement<SONReqMsgType>(_SONRequestEBM_QNAME, SONReqMsgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SONRespMsgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1", name = "SONResponseEBM")
    public JAXBElement<SONRespMsgType> createSONResponseEBM(SONRespMsgType value) {
        return new JAXBElement<SONRespMsgType>(_SONResponseEBM_QNAME, SONRespMsgType.class, null, value);
    }

}
