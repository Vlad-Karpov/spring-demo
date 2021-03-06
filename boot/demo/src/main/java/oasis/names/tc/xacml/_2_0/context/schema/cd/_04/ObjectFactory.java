
package oasis.names.tc.xacml._2_0.context.schema.cd._04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.xacml._2_0.context.schema.cd._04 package. 
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

    private final static QName _Request_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Request");
    private final static QName _Response_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Response");
    private final static QName _Subject_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Subject");
    private final static QName _Resource_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Resource");
    private final static QName _ResourceContent_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ResourceContent");
    private final static QName _Action_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Action");
    private final static QName _Environment_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Environment");
    private final static QName _Attribute_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Attribute");
    private final static QName _AttributeValue_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "AttributeValue");
    private final static QName _Result_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Result");
    private final static QName _Decision_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Decision");
    private final static QName _Status_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Status");
    private final static QName _StatusCode_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "StatusCode");
    private final static QName _StatusMessage_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "StatusMessage");
    private final static QName _StatusDetail_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "StatusDetail");
    private final static QName _MissingAttributeDetail_QNAME = new QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "MissingAttributeDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.xacml._2_0.context.schema.cd._04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ResourceContentType }
     * 
     */
    public ResourceContentType createResourceContentType() {
        return new ResourceContentType();
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link EnvironmentType }
     * 
     */
    public EnvironmentType createEnvironmentType() {
        return new EnvironmentType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link AttributeValueType }
     * 
     */
    public AttributeValueType createAttributeValueType() {
        return new AttributeValueType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     * 
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link StatusDetailType }
     * 
     */
    public StatusDetailType createStatusDetailType() {
        return new StatusDetailType();
    }

    /**
     * Create an instance of {@link MissingAttributeDetailType }
     * 
     */
    public MissingAttributeDetailType createMissingAttributeDetailType() {
        return new MissingAttributeDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Subject")
    public JAXBElement<SubjectType> createSubject(SubjectType value) {
        return new JAXBElement<SubjectType>(_Subject_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Resource")
    public JAXBElement<ResourceType> createResource(ResourceType value) {
        return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "ResourceContent")
    public JAXBElement<ResourceContentType> createResourceContent(ResourceContentType value) {
        return new JAXBElement<ResourceContentType>(_ResourceContent_QNAME, ResourceContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Action")
    public JAXBElement<ActionType> createAction(ActionType value) {
        return new JAXBElement<ActionType>(_Action_QNAME, ActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Environment")
    public JAXBElement<EnvironmentType> createEnvironment(EnvironmentType value) {
        return new JAXBElement<EnvironmentType>(_Environment_QNAME, EnvironmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Attribute")
    public JAXBElement<AttributeType> createAttribute(AttributeType value) {
        return new JAXBElement<AttributeType>(_Attribute_QNAME, AttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "AttributeValue")
    public JAXBElement<AttributeValueType> createAttributeValue(AttributeValueType value) {
        return new JAXBElement<AttributeValueType>(_AttributeValue_QNAME, AttributeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Decision")
    public JAXBElement<DecisionType> createDecision(DecisionType value) {
        return new JAXBElement<DecisionType>(_Decision_QNAME, DecisionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "StatusCode")
    public JAXBElement<StatusCodeType> createStatusCode(StatusCodeType value) {
        return new JAXBElement<StatusCodeType>(_StatusCode_QNAME, StatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "StatusMessage")
    public JAXBElement<String> createStatusMessage(String value) {
        return new JAXBElement<String>(_StatusMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "StatusDetail")
    public JAXBElement<StatusDetailType> createStatusDetail(StatusDetailType value) {
        return new JAXBElement<StatusDetailType>(_StatusDetail_QNAME, StatusDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingAttributeDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", name = "MissingAttributeDetail")
    public JAXBElement<MissingAttributeDetailType> createMissingAttributeDetail(MissingAttributeDetailType value) {
        return new JAXBElement<MissingAttributeDetailType>(_MissingAttributeDetail_QNAME, MissingAttributeDetailType.class, null, value);
    }

}
