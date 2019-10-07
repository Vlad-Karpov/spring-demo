
package com.oracle.xmlns.enterpriseobjects.core.common.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterpriseobjects.core.common.v2 package. 
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

    private final static QName _EBM_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBM");
    private final static QName _EBMHeader_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMHeader");
    private final static QName _Application_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Application");
    private final static QName _MessageProcessingInstruction_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MessageProcessingInstruction");
    private final static QName _ObjectCrossReference_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ObjectCrossReference");
    private final static QName _SenderObjectIdentification_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderObjectIdentification");
    private final static QName _Sender_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Sender");
    private final static QName _WSAddress_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "WSAddress");
    private final static QName _IntermediateMessageHop_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IntermediateMessageHop");
    private final static QName _EBMTracking_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMTracking");
    private final static QName _Target_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Target");
    private final static QName _BusinessScope_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BusinessScope");
    private final static QName _ESBHeaderExtension_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ESBHeaderExtension");
    private final static QName _Create_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Create");
    private final static QName _CreateResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CreateResponse");
    private final static QName _Delete_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "DeleteResponse");
    private final static QName _Process_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Process");
    private final static QName _ProcessResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ProcessResponse");
    private final static QName _QueryCriteria_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteria");
    private final static QName _ValueExpression_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ValueExpression");
    private final static QName _ResponseFilter_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ResponseFilter");
    private final static QName _SortCriteria_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SortCriteria");
    private final static QName _SortElement_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SortElement");
    private final static QName _QueryExpression_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryExpression");
    private final static QName _QueryResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponse");
    private final static QName _Update_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Update");
    private final static QName _UpdateResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "UpdateResponse");
    private final static QName _Sync_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Sync");
    private final static QName _SyncResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SyncResponse");
    private final static QName _Validate_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Validate");
    private final static QName _ValidateResponse_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ValidateResponse");
    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault");
    private final static QName _FaultNotification_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultNotification");
    private final static QName _FaultMessage_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultMessage");
    private final static QName _FaultingService_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultingService");
    private final static QName _SenderReference_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderReference");
    private final static QName _BusinessScopeReference_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BusinessScopeReference");
    private final static QName _EBMReference_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMReference");
    private final static QName _Identification_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Identification");
    private final static QName _CodeIdentification_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeIdentification");
    private final static QName _ObjectKey_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ObjectKey");
    private final static QName _Revision_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Revision");
    private final static QName _ApplicationObjectKey_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ApplicationObjectKey");
    private final static QName _AlternateObjectKey_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AlternateObjectKey");
    private final static QName _BatchParameter_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BatchParameter");
    private final static QName _MessageBatch_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MessageBatch");
    private final static QName _B2BDocumentType_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "B2BDocumentType");
    private final static QName _B2BMHeader_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "B2BMHeader");
    private final static QName _B2BMReference_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "B2BMReference");
    private final static QName _B2BM_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "B2BM");
    private final static QName _B2BProfile_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "B2BProfile");
    private final static QName _SenderTradingPartner_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderTradingPartner");
    private final static QName _ReceiverTradingPartner_QNAME = new QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceiverTradingPartner");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterpriseobjects.core.common.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EBMType }
     * 
     */
    public EBMType createEBMType() {
        return new EBMType();
    }

    /**
     * Create an instance of {@link EBMHeaderType }
     * 
     */
    public EBMHeaderType createEBMHeaderType() {
        return new EBMHeaderType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link MessageProcessingInstructionType }
     * 
     */
    public MessageProcessingInstructionType createMessageProcessingInstructionType() {
        return new MessageProcessingInstructionType();
    }

    /**
     * Create an instance of {@link ObjectCrossReferenceType }
     * 
     */
    public ObjectCrossReferenceType createObjectCrossReferenceType() {
        return new ObjectCrossReferenceType();
    }

    /**
     * Create an instance of {@link IdentificationType }
     * 
     */
    public IdentificationType createIdentificationType() {
        return new IdentificationType();
    }

    /**
     * Create an instance of {@link SenderType }
     * 
     */
    public SenderType createSenderType() {
        return new SenderType();
    }

    /**
     * Create an instance of {@link WSAddressType }
     * 
     */
    public WSAddressType createWSAddressType() {
        return new WSAddressType();
    }

    /**
     * Create an instance of {@link IntermediateMessageHopType }
     * 
     */
    public IntermediateMessageHopType createIntermediateMessageHopType() {
        return new IntermediateMessageHopType();
    }

    /**
     * Create an instance of {@link EBMTrackingType }
     * 
     */
    public EBMTrackingType createEBMTrackingType() {
        return new EBMTrackingType();
    }

    /**
     * Create an instance of {@link TargetType }
     * 
     */
    public TargetType createTargetType() {
        return new TargetType();
    }

    /**
     * Create an instance of {@link BusinessScopeType }
     * 
     */
    public BusinessScopeType createBusinessScopeType() {
        return new BusinessScopeType();
    }

    /**
     * Create an instance of {@link ESBHeaderExtensionType }
     * 
     */
    public ESBHeaderExtensionType createESBHeaderExtensionType() {
        return new ESBHeaderExtensionType();
    }

    /**
     * Create an instance of {@link CreateType }
     * 
     */
    public CreateType createCreateType() {
        return new CreateType();
    }

    /**
     * Create an instance of {@link CreateResponseType }
     * 
     */
    public CreateResponseType createCreateResponseType() {
        return new CreateResponseType();
    }

    /**
     * Create an instance of {@link DeleteType }
     * 
     */
    public DeleteType createDeleteType() {
        return new DeleteType();
    }

    /**
     * Create an instance of {@link DeleteResponseType }
     * 
     */
    public DeleteResponseType createDeleteResponseType() {
        return new DeleteResponseType();
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link ProcessResponseType }
     * 
     */
    public ProcessResponseType createProcessResponseType() {
        return new ProcessResponseType();
    }

    /**
     * Create an instance of {@link QueryCriteriaType }
     * 
     */
    public QueryCriteriaType createQueryCriteriaType() {
        return new QueryCriteriaType();
    }

    /**
     * Create an instance of {@link ValueExpressionType }
     * 
     */
    public ValueExpressionType createValueExpressionType() {
        return new ValueExpressionType();
    }

    /**
     * Create an instance of {@link ResponseFilterType }
     * 
     */
    public ResponseFilterType createResponseFilterType() {
        return new ResponseFilterType();
    }

    /**
     * Create an instance of {@link SortCriteriaType }
     * 
     */
    public SortCriteriaType createSortCriteriaType() {
        return new SortCriteriaType();
    }

    /**
     * Create an instance of {@link SortElementType }
     * 
     */
    public SortElementType createSortElementType() {
        return new SortElementType();
    }

    /**
     * Create an instance of {@link QueryExpressionType }
     * 
     */
    public QueryExpressionType createQueryExpressionType() {
        return new QueryExpressionType();
    }

    /**
     * Create an instance of {@link QueryResponseType }
     * 
     */
    public QueryResponseType createQueryResponseType() {
        return new QueryResponseType();
    }

    /**
     * Create an instance of {@link UpdateType }
     * 
     */
    public UpdateType createUpdateType() {
        return new UpdateType();
    }

    /**
     * Create an instance of {@link UpdateResponseType }
     * 
     */
    public UpdateResponseType createUpdateResponseType() {
        return new UpdateResponseType();
    }

    /**
     * Create an instance of {@link SyncType }
     * 
     */
    public SyncType createSyncType() {
        return new SyncType();
    }

    /**
     * Create an instance of {@link SyncResponseType }
     * 
     */
    public SyncResponseType createSyncResponseType() {
        return new SyncResponseType();
    }

    /**
     * Create an instance of {@link ValidateType }
     * 
     */
    public ValidateType createValidateType() {
        return new ValidateType();
    }

    /**
     * Create an instance of {@link ValidateResponseType }
     * 
     */
    public ValidateResponseType createValidateResponseType() {
        return new ValidateResponseType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link FaultNotificationType }
     * 
     */
    public FaultNotificationType createFaultNotificationType() {
        return new FaultNotificationType();
    }

    /**
     * Create an instance of {@link FaultMessageType }
     * 
     */
    public FaultMessageType createFaultMessageType() {
        return new FaultMessageType();
    }

    /**
     * Create an instance of {@link FaultingServiceType }
     * 
     */
    public FaultingServiceType createFaultingServiceType() {
        return new FaultingServiceType();
    }

    /**
     * Create an instance of {@link SenderReferenceType }
     * 
     */
    public SenderReferenceType createSenderReferenceType() {
        return new SenderReferenceType();
    }

    /**
     * Create an instance of {@link BusinessScopeReferenceType }
     * 
     */
    public BusinessScopeReferenceType createBusinessScopeReferenceType() {
        return new BusinessScopeReferenceType();
    }

    /**
     * Create an instance of {@link EBMReferenceType }
     * 
     */
    public EBMReferenceType createEBMReferenceType() {
        return new EBMReferenceType();
    }

    /**
     * Create an instance of {@link CodeIdentificationType }
     * 
     */
    public CodeIdentificationType createCodeIdentificationType() {
        return new CodeIdentificationType();
    }

    /**
     * Create an instance of {@link ObjectKeyType }
     * 
     */
    public ObjectKeyType createObjectKeyType() {
        return new ObjectKeyType();
    }

    /**
     * Create an instance of {@link RevisionType }
     * 
     */
    public RevisionType createRevisionType() {
        return new RevisionType();
    }

    /**
     * Create an instance of {@link BatchParameterType }
     * 
     */
    public BatchParameterType createBatchParameterType() {
        return new BatchParameterType();
    }

    /**
     * Create an instance of {@link MessageBatchType }
     * 
     */
    public MessageBatchType createMessageBatchType() {
        return new MessageBatchType();
    }

    /**
     * Create an instance of {@link B2BDocumentTypeType }
     * 
     */
    public B2BDocumentTypeType createB2BDocumentTypeType() {
        return new B2BDocumentTypeType();
    }

    /**
     * Create an instance of {@link B2BMHeaderType }
     * 
     */
    public B2BMHeaderType createB2BMHeaderType() {
        return new B2BMHeaderType();
    }

    /**
     * Create an instance of {@link B2BMReferenceType }
     * 
     */
    public B2BMReferenceType createB2BMReferenceType() {
        return new B2BMReferenceType();
    }

    /**
     * Create an instance of {@link B2BMType }
     * 
     */
    public B2BMType createB2BMType() {
        return new B2BMType();
    }

    /**
     * Create an instance of {@link B2BProfileType }
     * 
     */
    public B2BProfileType createB2BProfileType() {
        return new B2BProfileType();
    }

    /**
     * Create an instance of {@link SenderTradingPartnerType }
     * 
     */
    public SenderTradingPartnerType createSenderTradingPartnerType() {
        return new SenderTradingPartnerType();
    }

    /**
     * Create an instance of {@link ReceiverTradingPartnerType }
     * 
     */
    public ReceiverTradingPartnerType createReceiverTradingPartnerType() {
        return new ReceiverTradingPartnerType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     * 
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link AnyDateTimePointType }
     * 
     */
    public AnyDateTimePointType createAnyDateTimePointType() {
        return new AnyDateTimePointType();
    }

    /**
     * Create an instance of {@link ComplexQueryType }
     * 
     */
    public ComplexQueryType createComplexQueryType() {
        return new ComplexQueryType();
    }

    /**
     * Create an instance of {@link SimpleQueryType }
     * 
     */
    public SimpleQueryType createSimpleQueryType() {
        return new SimpleQueryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "EBM")
    public JAXBElement<EBMType> createEBM(EBMType value) {
        return new JAXBElement<EBMType>(_EBM_QNAME, EBMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "EBMHeader")
    public JAXBElement<EBMHeaderType> createEBMHeader(EBMHeaderType value) {
        return new JAXBElement<EBMHeaderType>(_EBMHeader_QNAME, EBMHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Application")
    public JAXBElement<ApplicationType> createApplication(ApplicationType value) {
        return new JAXBElement<ApplicationType>(_Application_QNAME, ApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageProcessingInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "MessageProcessingInstruction")
    public JAXBElement<MessageProcessingInstructionType> createMessageProcessingInstruction(MessageProcessingInstructionType value) {
        return new JAXBElement<MessageProcessingInstructionType>(_MessageProcessingInstruction_QNAME, MessageProcessingInstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectCrossReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ObjectCrossReference")
    public JAXBElement<ObjectCrossReferenceType> createObjectCrossReference(ObjectCrossReferenceType value) {
        return new JAXBElement<ObjectCrossReferenceType>(_ObjectCrossReference_QNAME, ObjectCrossReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "SenderObjectIdentification")
    public JAXBElement<IdentificationType> createSenderObjectIdentification(IdentificationType value) {
        return new JAXBElement<IdentificationType>(_SenderObjectIdentification_QNAME, IdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Sender")
    public JAXBElement<SenderType> createSender(SenderType value) {
        return new JAXBElement<SenderType>(_Sender_QNAME, SenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "WSAddress")
    public JAXBElement<WSAddressType> createWSAddress(WSAddressType value) {
        return new JAXBElement<WSAddressType>(_WSAddress_QNAME, WSAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntermediateMessageHopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "IntermediateMessageHop")
    public JAXBElement<IntermediateMessageHopType> createIntermediateMessageHop(IntermediateMessageHopType value) {
        return new JAXBElement<IntermediateMessageHopType>(_IntermediateMessageHop_QNAME, IntermediateMessageHopType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMTrackingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "EBMTracking")
    public JAXBElement<EBMTrackingType> createEBMTracking(EBMTrackingType value) {
        return new JAXBElement<EBMTrackingType>(_EBMTracking_QNAME, EBMTrackingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Target")
    public JAXBElement<TargetType> createTarget(TargetType value) {
        return new JAXBElement<TargetType>(_Target_QNAME, TargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessScopeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "BusinessScope")
    public JAXBElement<BusinessScopeType> createBusinessScope(BusinessScopeType value) {
        return new JAXBElement<BusinessScopeType>(_BusinessScope_QNAME, BusinessScopeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBHeaderExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ESBHeaderExtension")
    public JAXBElement<ESBHeaderExtensionType> createESBHeaderExtension(ESBHeaderExtensionType value) {
        return new JAXBElement<ESBHeaderExtensionType>(_ESBHeaderExtension_QNAME, ESBHeaderExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Create")
    public JAXBElement<CreateType> createCreate(CreateType value) {
        return new JAXBElement<CreateType>(_Create_QNAME, CreateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "CreateResponse")
    public JAXBElement<CreateResponseType> createCreateResponse(CreateResponseType value) {
        return new JAXBElement<CreateResponseType>(_CreateResponse_QNAME, CreateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Delete")
    public JAXBElement<DeleteType> createDelete(DeleteType value) {
        return new JAXBElement<DeleteType>(_Delete_QNAME, DeleteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "DeleteResponse")
    public JAXBElement<DeleteResponseType> createDeleteResponse(DeleteResponseType value) {
        return new JAXBElement<DeleteResponseType>(_DeleteResponse_QNAME, DeleteResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Process")
    public JAXBElement<ProcessType> createProcess(ProcessType value) {
        return new JAXBElement<ProcessType>(_Process_QNAME, ProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ProcessResponse")
    public JAXBElement<ProcessResponseType> createProcessResponse(ProcessResponseType value) {
        return new JAXBElement<ProcessResponseType>(_ProcessResponse_QNAME, ProcessResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "QueryCriteria")
    public JAXBElement<QueryCriteriaType> createQueryCriteria(QueryCriteriaType value) {
        return new JAXBElement<QueryCriteriaType>(_QueryCriteria_QNAME, QueryCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ValueExpression")
    public JAXBElement<ValueExpressionType> createValueExpression(ValueExpressionType value) {
        return new JAXBElement<ValueExpressionType>(_ValueExpression_QNAME, ValueExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ResponseFilter")
    public JAXBElement<ResponseFilterType> createResponseFilter(ResponseFilterType value) {
        return new JAXBElement<ResponseFilterType>(_ResponseFilter_QNAME, ResponseFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "SortCriteria")
    public JAXBElement<SortCriteriaType> createSortCriteria(SortCriteriaType value) {
        return new JAXBElement<SortCriteriaType>(_SortCriteria_QNAME, SortCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "SortElement")
    public JAXBElement<SortElementType> createSortElement(SortElementType value) {
        return new JAXBElement<SortElementType>(_SortElement_QNAME, SortElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "QueryExpression")
    public JAXBElement<QueryExpressionType> createQueryExpression(QueryExpressionType value) {
        return new JAXBElement<QueryExpressionType>(_QueryExpression_QNAME, QueryExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "QueryResponse")
    public JAXBElement<QueryResponseType> createQueryResponse(QueryResponseType value) {
        return new JAXBElement<QueryResponseType>(_QueryResponse_QNAME, QueryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Update")
    public JAXBElement<UpdateType> createUpdate(UpdateType value) {
        return new JAXBElement<UpdateType>(_Update_QNAME, UpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "UpdateResponse")
    public JAXBElement<UpdateResponseType> createUpdateResponse(UpdateResponseType value) {
        return new JAXBElement<UpdateResponseType>(_UpdateResponse_QNAME, UpdateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Sync")
    public JAXBElement<SyncType> createSync(SyncType value) {
        return new JAXBElement<SyncType>(_Sync_QNAME, SyncType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "SyncResponse")
    public JAXBElement<SyncResponseType> createSyncResponse(SyncResponseType value) {
        return new JAXBElement<SyncResponseType>(_SyncResponse_QNAME, SyncResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Validate")
    public JAXBElement<ValidateType> createValidate(ValidateType value) {
        return new JAXBElement<ValidateType>(_Validate_QNAME, ValidateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ValidateResponse")
    public JAXBElement<ValidateResponseType> createValidateResponse(ValidateResponseType value) {
        return new JAXBElement<ValidateResponseType>(_ValidateResponse_QNAME, ValidateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "FaultNotification")
    public JAXBElement<FaultNotificationType> createFaultNotification(FaultNotificationType value) {
        return new JAXBElement<FaultNotificationType>(_FaultNotification_QNAME, FaultNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "FaultMessage")
    public JAXBElement<FaultMessageType> createFaultMessage(FaultMessageType value) {
        return new JAXBElement<FaultMessageType>(_FaultMessage_QNAME, FaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultingServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "FaultingService")
    public JAXBElement<FaultingServiceType> createFaultingService(FaultingServiceType value) {
        return new JAXBElement<FaultingServiceType>(_FaultingService_QNAME, FaultingServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "SenderReference")
    public JAXBElement<SenderReferenceType> createSenderReference(SenderReferenceType value) {
        return new JAXBElement<SenderReferenceType>(_SenderReference_QNAME, SenderReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessScopeReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "BusinessScopeReference")
    public JAXBElement<BusinessScopeReferenceType> createBusinessScopeReference(BusinessScopeReferenceType value) {
        return new JAXBElement<BusinessScopeReferenceType>(_BusinessScopeReference_QNAME, BusinessScopeReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EBMReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "EBMReference")
    public JAXBElement<EBMReferenceType> createEBMReference(EBMReferenceType value) {
        return new JAXBElement<EBMReferenceType>(_EBMReference_QNAME, EBMReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Identification")
    public JAXBElement<IdentificationType> createIdentification(IdentificationType value) {
        return new JAXBElement<IdentificationType>(_Identification_QNAME, IdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "CodeIdentification")
    public JAXBElement<CodeIdentificationType> createCodeIdentification(CodeIdentificationType value) {
        return new JAXBElement<CodeIdentificationType>(_CodeIdentification_QNAME, CodeIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ObjectKey")
    public JAXBElement<ObjectKeyType> createObjectKey(ObjectKeyType value) {
        return new JAXBElement<ObjectKeyType>(_ObjectKey_QNAME, ObjectKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "Revision")
    public JAXBElement<RevisionType> createRevision(RevisionType value) {
        return new JAXBElement<RevisionType>(_Revision_QNAME, RevisionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ApplicationObjectKey")
    public JAXBElement<ObjectKeyType> createApplicationObjectKey(ObjectKeyType value) {
        return new JAXBElement<ObjectKeyType>(_ApplicationObjectKey_QNAME, ObjectKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "AlternateObjectKey")
    public JAXBElement<ObjectKeyType> createAlternateObjectKey(ObjectKeyType value) {
        return new JAXBElement<ObjectKeyType>(_AlternateObjectKey_QNAME, ObjectKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "BatchParameter")
    public JAXBElement<BatchParameterType> createBatchParameter(BatchParameterType value) {
        return new JAXBElement<BatchParameterType>(_BatchParameter_QNAME, BatchParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageBatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "MessageBatch")
    public JAXBElement<MessageBatchType> createMessageBatch(MessageBatchType value) {
        return new JAXBElement<MessageBatchType>(_MessageBatch_QNAME, MessageBatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2BDocumentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "B2BDocumentType")
    public JAXBElement<B2BDocumentTypeType> createB2BDocumentType(B2BDocumentTypeType value) {
        return new JAXBElement<B2BDocumentTypeType>(_B2BDocumentType_QNAME, B2BDocumentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2BMHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "B2BMHeader")
    public JAXBElement<B2BMHeaderType> createB2BMHeader(B2BMHeaderType value) {
        return new JAXBElement<B2BMHeaderType>(_B2BMHeader_QNAME, B2BMHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2BMReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "B2BMReference")
    public JAXBElement<B2BMReferenceType> createB2BMReference(B2BMReferenceType value) {
        return new JAXBElement<B2BMReferenceType>(_B2BMReference_QNAME, B2BMReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2BMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "B2BM")
    public JAXBElement<B2BMType> createB2BM(B2BMType value) {
        return new JAXBElement<B2BMType>(_B2BM_QNAME, B2BMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2BProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "B2BProfile")
    public JAXBElement<B2BProfileType> createB2BProfile(B2BProfileType value) {
        return new JAXBElement<B2BProfileType>(_B2BProfile_QNAME, B2BProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderTradingPartnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "SenderTradingPartner")
    public JAXBElement<SenderTradingPartnerType> createSenderTradingPartner(SenderTradingPartnerType value) {
        return new JAXBElement<SenderTradingPartnerType>(_SenderTradingPartner_QNAME, SenderTradingPartnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiverTradingPartnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", name = "ReceiverTradingPartner")
    public JAXBElement<ReceiverTradingPartnerType> createReceiverTradingPartner(ReceiverTradingPartnerType value) {
        return new JAXBElement<ReceiverTradingPartnerType>(_ReceiverTradingPartner_QNAME, ReceiverTradingPartnerType.class, null, value);
    }

}
