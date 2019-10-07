package com.example.demo;

import com.example.demo.hello.ConsoleHelloService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.ObjectFactory;
import ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1.SONReqMsgType;

import javax.jms.*;
import java.util.Properties;

@EnableTransactionManagement
@EnableWs
@RestController
@SpringBootApplication
@Configuration
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World from java class DemoApplication!";
    }

    @Bean
    public ConsoleHelloService beanConsoleHelloService() {
        return new ConsoleHelloService("Howdy", "!");
    }

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        //servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "country")
    public Wsdl11Definition defaultWsdl11DefinitionCountries(@Qualifier("countriesSchema") XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setLocationUri("/ws/country");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(countriesSchema);

        // fix for adding soapAction to the dynamic generated wsdl
        Properties soapActions = new Properties();
        soapActions.setProperty("deleteCountry", "http://spring.io/guides/gs-producing-web-service/CountriesPort/deleteCountryRequest");
        wsdl11Definition.setSoapActions(soapActions);

        return wsdl11Definition;
    }

    @Bean("countriesSchema")
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries/countries.xsd"));
    }

    @Bean(name = "SONProvTAWrapper1")
    public Wsdl11Definition wsdlSONProvTAWrapper1() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/SONProvTAWrapper1.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "SONProvTAWrapper")
    public Wsdl11Definition wsdlSONProvTAWrapper() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/SONProvTAWrapper.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "SONProvTA")
    public Wsdl11Definition wsdlSONProvTA() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/SONProvTA.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "SendingMessageService")
    public Wsdl11Definition wsdlSendingMessageService() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/SendingMessageService.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "AsyncSONProvTAImpl_properties")
    public Wsdl11Definition wsdlAsyncSONProvTAImpl_properties() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/AsyncSONProvTAImpl_properties.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "AsyncMsgRespService")
    public Wsdl11Definition wsdlAsyncMsgRespService() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/AsyncMsgRespService.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "AsyncCorrelationHelperWsdl")
    public Wsdl11Definition wsdlAsyncCorrelationHelper() {
        Wsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        ((SimpleWsdl11Definition) wsdl11Definition).setWsdl(new ClassPathResource("son/AsyncCorrelationHelperWsdl.wsdl"));
        return wsdl11Definition;
    }

    @Bean("InteractionTypes")
    public XsdSchema beanXsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/InteractionTypes.xsd"));
    }

    @Bean("Meta")
    public XsdSchema beanMetaXsd() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/Meta.xsd"));
    }

    @Bean("CustomMeta")
    public XsdSchema beanCustomMeta() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/CustomMeta.xsd"));
    }

    @Bean("CodeLists")
    public XsdSchema beanCodeLists() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/CodeLists.xsd"));
    }

    @Bean("context-schema-cd-04")
    public XsdSchema beanContextSchemaCd04() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/context-schema-cd-04.xsd"));
    }

    @Bean("DataTypes")
    public XsdSchema beanDataTypes() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/DataTypes.xsd"));
    }

    @Bean("policy-schema-cd-04")
    public XsdSchema beanCustomMeta1() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/policy-schema-cd-04.xsd"));
    }

    @Bean("WS-Addressing")
    public XsdSchema beanCustomMeta2() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/WS-Addressing.xsd"));
    }

    @Bean("XSDBuiltInTypes")
    public XsdSchema beanCustomMeta3() {
        return new SimpleXsdSchema(new ClassPathResource("son/Infrastructure/V1/XSDBuiltInTypes.xsd"));
    }

    @Bean("AsyncCorrelationHelper")
    public XsdSchema beanCustomMeta4() {
        return new SimpleXsdSchema(new ClassPathResource("son/xsd/AsyncCorrelationHelper.xsd"));
    }

    @Bean("marshaller")
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPaths(
                "ru.vtb24.applicationconnectorservicelibrary.son.providers.sonprovta.v1",
                "org.xmlsoap.schemas.ws._2003._03.addressing",
                "ru.tsconsulting.vtb24.soa.son.prov.v1.types",
                "ru.tsconsulting.vtb24.soa.son.prov.v1",
                "ru.vtb24.schemas.shared.interaction",
                "oasis.names.tc.xacml._2_0.policy.schema.cd._04",
                "oasis.names.tc.xacml._2_0.context.schema.cd._04",
                "io.spring.guides.gs_producing_web_service",
                "com.oracle.xmlns.utilitycomposites.sonprovtav1.asynccorrelationhelper",
                "com.oracle.xmlns.enterpriseobjects.core.custom.common.v2",
                "com.oracle.xmlns.enterpriseobjects.core.common.v2");
        marshaller.setMtomEnabled(true);
        return marshaller;
    }


    @Bean("myFactory")
    public JmsListenerContainerFactory<?> myFactory(@Autowired ConnectionFactory connectionFactory,
                                                    @Autowired DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        // This provides all boot's default to this factory, including the message converter
        configurer.configure(factory, connectionFactory);
        // You could still override some of Boot's default if necessary.
        return factory;
    }

    @Bean // Serialize message content to json using TextMessage
    public MessageConverter jmsMessageConverter(
            @Autowired Jaxb2Marshaller marshaller
    ) {
        MessageConverter converter = new MessageConverter() {

            @Override
            public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
                StringResult strResult = new StringResult();
                marshaller.marshal((new ObjectFactory()).createSONRequestEBM((SONReqMsgType) object), strResult);
                return session.createTextMessage(strResult.toString());
            }

            @Override
            public Object fromMessage(Message message) throws JMSException, MessageConversionException {
                marshaller.setMappedClass(SONReqMsgType.class);
                SONReqMsgType msg = (SONReqMsgType) marshaller.unmarshal(new StringSource(((ActiveMQTextMessage) message).getText()));
                return msg;
            }
        };
        return converter;
    }

//    @Bean
//    public CachingConnectionFactory cachingConnectionFactory(
//            @Autowired ConnectionFactory connectionFactory) {
//        CachingConnectionFactory cachingConnectionFactory =
//                new CachingConnectionFactory(connectionFactory);
//        cachingConnectionFactory.setSessionCacheSize(10);
//
//        return cachingConnectionFactory;
//    }

    @Bean
    public Destination testDestination() {
        return new ActiveMQQueue("testDestination");
    }

    @Bean
    public JmsTemplate orderJmsTemplate(
            @Autowired Destination testDestination,
            @Autowired ConnectionFactory connectionFactory,
            @Autowired MessageConverter jmsMessageConverter) {
        JmsTemplate jmsTemplate =
                new JmsTemplate(connectionFactory);
        jmsTemplate.setMessageConverter(jmsMessageConverter);
        jmsTemplate.setDefaultDestination(testDestination);
        jmsTemplate.setReceiveTimeout(5000);

        return jmsTemplate;
    }


}
