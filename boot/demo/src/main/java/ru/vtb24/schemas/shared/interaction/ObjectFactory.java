
package ru.vtb24.schemas.shared.interaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vtb24.schemas.shared.interaction package. 
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

    private final static QName _Request_QNAME = new QName("urn:www.vtb24.ru:schemas:shared:interaction", "Request");
    private final static QName _Response_QNAME = new QName("urn:www.vtb24.ru:schemas:shared:interaction", "Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vtb24.schemas.shared.interaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BisDataType }
     * 
     */
    public BisDataType createBisDataType() {
        return new BisDataType();
    }

    /**
     * Create an instance of {@link RequestBaseType }
     * 
     */
    public RequestBaseType createRequestBaseType() {
        return new RequestBaseType();
    }

    /**
     * Create an instance of {@link ResponseBaseType }
     * 
     */
    public ResponseBaseType createResponseBaseType() {
        return new ResponseBaseType();
    }

    /**
     * Create an instance of {@link AppDataWithRequestType }
     * 
     */
    public AppDataWithRequestType createAppDataWithRequestType() {
        return new AppDataWithRequestType();
    }

    /**
     * Create an instance of {@link AppDataWithResponseType }
     * 
     */
    public AppDataWithResponseType createAppDataWithResponseType() {
        return new AppDataWithResponseType();
    }

    /**
     * Create an instance of {@link AppDataGlobalBaseType }
     * 
     */
    public AppDataGlobalBaseType createAppDataGlobalBaseType() {
        return new AppDataGlobalBaseType();
    }

    /**
     * Create an instance of {@link BisDataType.FromBranch }
     * 
     */
    public BisDataType.FromBranch createBisDataTypeFromBranch() {
        return new BisDataType.FromBranch();
    }

    /**
     * Create an instance of {@link BisDataType.BranchId }
     * 
     */
    public BisDataType.BranchId createBisDataTypeBranchId() {
        return new BisDataType.BranchId();
    }

    /**
     * Create an instance of {@link BisDataType.Who }
     * 
     */
    public BisDataType.Who createBisDataTypeWho() {
        return new BisDataType.Who();
    }

    /**
     * Create an instance of {@link BisDataType.XmlBroker }
     * 
     */
    public BisDataType.XmlBroker createBisDataTypeXmlBroker() {
        return new BisDataType.XmlBroker();
    }

    /**
     * Create an instance of {@link BisDataType.LogicalStage }
     * 
     */
    public BisDataType.LogicalStage createBisDataTypeLogicalStage() {
        return new BisDataType.LogicalStage();
    }

    /**
     * Create an instance of {@link BisDataType.TransID }
     * 
     */
    public BisDataType.TransID createBisDataTypeTransID() {
        return new BisDataType.TransID();
    }

    /**
     * Create an instance of {@link BisDataType.ZType }
     * 
     */
    public BisDataType.ZType createBisDataTypeZType() {
        return new BisDataType.ZType();
    }

    /**
     * Create an instance of {@link BisDataType.ZId }
     * 
     */
    public BisDataType.ZId createBisDataTypeZId() {
        return new BisDataType.ZId();
    }

    /**
     * Create an instance of {@link BisDataType.ZCode }
     * 
     */
    public BisDataType.ZCode createBisDataTypeZCode() {
        return new BisDataType.ZCode();
    }

    /**
     * Create an instance of {@link BisDataType.TargetSystemID }
     * 
     */
    public BisDataType.TargetSystemID createBisDataTypeTargetSystemID() {
        return new BisDataType.TargetSystemID();
    }

    /**
     * Create an instance of {@link BisDataType.SourceSystemID }
     * 
     */
    public BisDataType.SourceSystemID createBisDataTypeSourceSystemID() {
        return new BisDataType.SourceSystemID();
    }

    /**
     * Create an instance of {@link BisDataType.HeaderParams }
     * 
     */
    public BisDataType.HeaderParams createBisDataTypeHeaderParams() {
        return new BisDataType.HeaderParams();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www.vtb24.ru:schemas:shared:interaction", name = "Request")
    public JAXBElement<RequestBaseType> createRequest(RequestBaseType value) {
        return new JAXBElement<RequestBaseType>(_Request_QNAME, RequestBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:www.vtb24.ru:schemas:shared:interaction", name = "Response")
    public JAXBElement<ResponseBaseType> createResponse(ResponseBaseType value) {
        return new JAXBElement<ResponseBaseType>(_Response_QNAME, ResponseBaseType.class, null, value);
    }

}
