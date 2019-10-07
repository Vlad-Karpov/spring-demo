package com.example.demo.ws.son;

import com.oracle.xmlns.enterpriseobjects.core.common.v2.EBMHeaderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.oxm.Marshaller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.addressing.core.MessageAddressingProperties;
import org.springframework.ws.soap.addressing.server.annotation.Action;
import org.springframework.ws.soap.addressing.version.Addressing10;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.AsyncSONProvTAImpl;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.CommonFaultMessage;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONReqMsgType;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONRespMsgType;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.ObjectFactory;

import javax.xml.bind.JAXBElement;
import java.net.URI;
import java.util.logging.Logger;

/**
 * No adapter for endpoint []: Is your endpoint annotated with @Endpoint, or does it implement a supported interface like MessageHandler or PayloadEndpoint
 */
@Endpoint
public class SONProvTAService {

    private static final Logger LOG = Logger.getLogger(AsyncSONProvTAImpl.class.getName());
    private WebServiceTemplate webServiceTemplate;
    private Addressing10 addressing10 = new Addressing10();
    private MessageConverter jacksonJmsMessageConverter;
    private JmsTemplate jmsTemplate;
    private MessageConverter jmsMessageConverter;

    public SONProvTAService(
            @Autowired Marshaller marshaller,
            @Autowired MessageConverter jacksonJmsMessageConverter,
            @Autowired JmsTemplate jmsTemplate,
            @Autowired MessageConverter jmsMessageConverter) {
        webServiceTemplate = new WebServiceTemplate(marshaller);
        this.jacksonJmsMessageConverter = jacksonJmsMessageConverter;
        this.jmsTemplate = jmsTemplate;
        this.jmsMessageConverter = jmsMessageConverter;
    }

    /**
     * @param asyncSONRequestEBM
     */
    @Transactional
    @Action("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1/async/request")
    public void asyncSONRequest(@RequestPayload SONReqMsgType asyncSONRequestEBM, MessageContext context) {
        LOG.info("Executing operation asyncSONRequest");
        System.out.println(asyncSONRequestEBM);
        try {

            SoapMessage message = (SoapMessage) context.getRequest();
            MessageAddressingProperties properties = addressing10.getMessageAddressingProperties(message);
            //MessageAddressingProperties replyProperties = properties.getReplyProperties(properties.getReplyTo(), properties.getAction(), properties.getMessageId());
            MessageAddressingProperties replyProperties = properties.getReplyProperties(properties.getReplyTo(), new URI("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1/async/response"), properties.getMessageId());
            webServiceTemplate.marshalSendAndReceive(properties.getReplyTo().getAddress().toString(), getSonRespMsgTypeJAXBElement(), respMessage -> addressing10.addAddressingHeaders(((SoapMessage) respMessage), replyProperties));

        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /**
     * @param asyncSONResponseEBM
     */
    @Transactional
    @Action("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1/async/response")
    public void asyncSONResponse(@RequestPayload SONRespMsgType asyncSONResponseEBM) {
        LOG.info("Executing operation asyncSONResponse");
        System.out.println(asyncSONResponseEBM);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /**
     * @param sonRequestEBM
     * @return
     * @throws CommonFaultMessage
     */
    @Transactional
    @Action("http://www.vtb24.ru/ApplicationConnectorServiceLibrary/SON/Providers/SONProvTA/V1/sync/request")
    @ResponsePayload
    public JAXBElement<SONRespMsgType> syncSONRequest(@RequestPayload SONReqMsgType sonRequestEBM) throws CommonFaultMessage {
        LOG.info("Executing operation syncSONRequest");
        System.out.println(sonRequestEBM);
        try {

///
            System.out.println("Sending a message.");
            jmsTemplate.convertAndSend(sonRequestEBM);

///

            return getSonRespMsgTypeJAXBElement();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new CommonFaultMessage("CommonFaultMessage...");
    }

    private JAXBElement<SONRespMsgType> getSonRespMsgTypeJAXBElement() {
        SONRespMsgType _return = new SONRespMsgType();
        EBMHeaderType ebmHeaderType = new EBMHeaderType();
        ebmHeaderType.setLanguageCode("Это ленгвидж код!");
        _return.setEBMHeader(ebmHeaderType);
        return new ObjectFactory().createSONResponseEBM(_return);
    }

    @JmsListener(destination = "testDestination", containerFactory = "myFactory")
    @Transactional
    public void receiveMessage(SONReqMsgType sonRequestEBM) {
        System.out.println("Received <" + sonRequestEBM + ">");
    }

}
