
package ru.tsconsulting.vtb24.soa.son.prov.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.tsconsulting.vtb24.soa.son.prov.v1 package. 
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

    private final static QName _SendSyncMessage_QNAME = new QName("http://v1.prov.son.soa.vtb24.tsconsulting.ru/", "sendSyncMessage");
    private final static QName _SendSyncMessageResponse_QNAME = new QName("http://v1.prov.son.soa.vtb24.tsconsulting.ru/", "sendSyncMessageResponse");
    private final static QName _SendAsyncMessage_QNAME = new QName("http://v1.prov.son.soa.vtb24.tsconsulting.ru/", "sendAsyncMessage");
    private final static QName _SendAsyncMessageResponse_QNAME = new QName("http://v1.prov.son.soa.vtb24.tsconsulting.ru/", "sendAsyncMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.tsconsulting.vtb24.soa.son.prov.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSyncMessage }
     * 
     */
    public SendSyncMessage createSendSyncMessage() {
        return new SendSyncMessage();
    }

    /**
     * Create an instance of {@link SendSyncMessageResponse }
     * 
     */
    public SendSyncMessageResponse createSendSyncMessageResponse() {
        return new SendSyncMessageResponse();
    }

    /**
     * Create an instance of {@link SendAsyncMessage }
     * 
     */
    public SendAsyncMessage createSendAsyncMessage() {
        return new SendAsyncMessage();
    }

    /**
     * Create an instance of {@link SendAsyncMessageResponse }
     * 
     */
    public SendAsyncMessageResponse createSendAsyncMessageResponse() {
        return new SendAsyncMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSyncMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.prov.son.soa.vtb24.tsconsulting.ru/", name = "sendSyncMessage")
    public JAXBElement<SendSyncMessage> createSendSyncMessage(SendSyncMessage value) {
        return new JAXBElement<SendSyncMessage>(_SendSyncMessage_QNAME, SendSyncMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSyncMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.prov.son.soa.vtb24.tsconsulting.ru/", name = "sendSyncMessageResponse")
    public JAXBElement<SendSyncMessageResponse> createSendSyncMessageResponse(SendSyncMessageResponse value) {
        return new JAXBElement<SendSyncMessageResponse>(_SendSyncMessageResponse_QNAME, SendSyncMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAsyncMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.prov.son.soa.vtb24.tsconsulting.ru/", name = "sendAsyncMessage")
    public JAXBElement<SendAsyncMessage> createSendAsyncMessage(SendAsyncMessage value) {
        return new JAXBElement<SendAsyncMessage>(_SendAsyncMessage_QNAME, SendAsyncMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAsyncMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.prov.son.soa.vtb24.tsconsulting.ru/", name = "sendAsyncMessageResponse")
    public JAXBElement<SendAsyncMessageResponse> createSendAsyncMessageResponse(SendAsyncMessageResponse value) {
        return new JAXBElement<SendAsyncMessageResponse>(_SendAsyncMessageResponse_QNAME, SendAsyncMessageResponse.class, null, value);
    }

}
