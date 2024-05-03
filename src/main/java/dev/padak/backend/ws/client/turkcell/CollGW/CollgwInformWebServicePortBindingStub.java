/**
 * CollgwInformWebServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class CollgwInformWebServicePortBindingStub extends org.apache.axis.client.Stub implements CollgwInformWebService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("informWebServiceLogon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LogonRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logonRequest"), LogonRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logonResponse"));
        oper.setReturnClass(LogonResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("informWebServiceLogoff");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LogoffRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logoffRequest"), LogoffRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logoffResponse"));
        oper.setReturnClass(LogoffResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("payInvoiceByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PayInvoiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceRequest"), PayInvoiceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceResponse"));
        oper.setReturnClass(PayInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PayInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelInvoicePayByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CancelInvoicePayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelInvoicePayRequest"), CancelInvoicePayRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelInvoicePayResponse"));
        oper.setReturnClass(CancelInvoicePayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CancelInvoicePayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberInfoByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubscriberInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseInputRequest"), BaseInputRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "subscriberInfoResponse"));
        oper.setReturnClass(SubscriberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SubscriberInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giveAutoPaymentOrderByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GiveAutoPaymentOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentRequest"), AutoPaymentRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseOutputResponse"));
        oper.setReturnClass(BaseOutputResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GiveAutoPaymentOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelAutoPaymentByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CancelAutoPaymentOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentRequest"), AutoPaymentRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseOutputResponse"));
        oper.setReturnClass(BaseOutputResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CancelAutoPaymentOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoPaymentInvoiceByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetAutoPaymentInvoiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseInputRequest"), BaseInputRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesResponse"));
        oper.setReturnClass(GetOpenInvoicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GetAutoPaymentInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("payAutoPaymentInvoiceByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PayAutoPaymentInvoiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceRequest"), PayInvoiceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceResponse"));
        oper.setReturnClass(PayInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PayAutoPaymentInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendReconciliation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReconciliationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationRequest"), ReconciliationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationResponse"));
        oper.setReturnClass(ReconciliationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoPaymentDebits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "InvoiceGetAutoPaymentDebitsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceGetAutoPaymentDebitsRequest"), InvoiceGetAutoPaymentDebitsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceGetAutoPaymentDebitsResponse"));
        oper.setReturnClass(InvoiceGetAutoPaymentDebitsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllReconciliationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AllReconciliationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "allReconciliationDataRequest"), AllReconciliationDataRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "allReconciliationDataResponse"));
        oper.setReturnClass(AllReconciliationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoPaymentCancelInform");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AutoPaymentCancelInformRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelInformRequest"), AutoPaymentCancelInformRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelInformResponse"));
        oper.setReturnClass(AutoPaymentCancelInformResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "AutoPaymentCancelInformResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOpenInvoicesByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetOpenInvoicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesRequest"), GetOpenInvoicesRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesResponse"));
        oper.setReturnClass(GetOpenInvoicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

    }

    public CollgwInformWebServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CollgwInformWebServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CollgwInformWebServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>invoiceDetail>parameterMap>entry");
            cachedSerQNames.add(qName);
            cls = InvoiceDetailParameterMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>paramResponse>mainParameterMap>entry");
            cachedSerQNames.add(qName);
            cls = ParamResponseMainParameterMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>queryKeyRequest>reqMainParameterMap>entry");
            cachedSerQNames.add(qName);
            cls = QueryKeyRequestReqMainParameterMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">autoPaymentCancelInformResponse>autoPaymentCancelList");
            cachedSerQNames.add(qName);
            cls = AutoPaymentCancelDto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelDto");
            qName2 = new javax.xml.namespace.QName("", "autoPaymentCancel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">getOpenInvoicesResponse>invoiceDetailList");
            cachedSerQNames.add(qName);
            cls = InvoiceDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceDetail");
            qName2 = new javax.xml.namespace.QName("", "invoiceDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">invoiceDetail>parameterMap");
            cachedSerQNames.add(qName);
            cls = InvoiceDetailParameterMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>invoiceDetail>parameterMap>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">invoiceInfoRequest>invoiceDetailList");
            cachedSerQNames.add(qName);
            cls = InvoiceDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceDetail");
            qName2 = new javax.xml.namespace.QName("", "invoiceDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">paramResponse>mainParameterMap");
            cachedSerQNames.add(qName);
            cls = ParamResponseMainParameterMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>paramResponse>mainParameterMap>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">queryKeyRequest>reqMainParameterMap");
            cachedSerQNames.add(qName);
            cls = QueryKeyRequestReqMainParameterMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>queryKeyRequest>reqMainParameterMap>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">reconciliationRequest>reconInfoList");
            cachedSerQNames.add(qName);
            cls = ReconciliationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationInfo");
            qName2 = new javax.xml.namespace.QName("", "reconInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">reconciliationResponse>reconInfoList");
            cachedSerQNames.add(qName);
            cls = ReconciliationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationInfo");
            qName2 = new javax.xml.namespace.QName("", "reconInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "allReconciliationDataRequest");
            cachedSerQNames.add(qName);
            cls = AllReconciliationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "allReconciliationDataResponse");
            cachedSerQNames.add(qName);
            cls = AllReconciliationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelDto");
            cachedSerQNames.add(qName);
            cls = AutoPaymentCancelDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelInformRequest");
            cachedSerQNames.add(qName);
            cls = AutoPaymentCancelInformRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelInformResponse");
            cachedSerQNames.add(qName);
            cls = AutoPaymentCancelInformResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentRequest");
            cachedSerQNames.add(qName);
            cls = AutoPaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseInputRequest");
            cachedSerQNames.add(qName);
            cls = BaseInputRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseOutputResponse");
            cachedSerQNames.add(qName);
            cls = BaseOutputResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "baseResponse");
            cachedSerQNames.add(qName);
            cls = BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelInvoicePayRequest");
            cachedSerQNames.add(qName);
            cls = CancelInvoicePayRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelInvoicePayResponse");
            cachedSerQNames.add(qName);
            cls = CancelInvoicePayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "customerInformation");
            cachedSerQNames.add(qName);
            cls = CustomerInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesRequest");
            cachedSerQNames.add(qName);
            cls = GetOpenInvoicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesResponse");
            cachedSerQNames.add(qName);
            cls = GetOpenInvoicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceDetail");
            cachedSerQNames.add(qName);
            cls = InvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceGetAutoPaymentDebitsRequest");
            cachedSerQNames.add(qName);
            cls = InvoiceGetAutoPaymentDebitsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceGetAutoPaymentDebitsResponse");
            cachedSerQNames.add(qName);
            cls = InvoiceGetAutoPaymentDebitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceInfoRequest");
            cachedSerQNames.add(qName);
            cls = InvoiceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logoffRequest");
            cachedSerQNames.add(qName);
            cls = LogoffRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logoffResponse");
            cachedSerQNames.add(qName);
            cls = LogoffResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logonRequest");
            cachedSerQNames.add(qName);
            cls = LogonRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logonResponse");
            cachedSerQNames.add(qName);
            cls = LogonResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "origin");
            cachedSerQNames.add(qName);
            cls = Origin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "paramResponse");
            cachedSerQNames.add(qName);
            cls = ParamResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = PayInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = PayInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "queryKeyRequest");
            cachedSerQNames.add(qName);
            cls = QueryKeyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationInfo");
            cachedSerQNames.add(qName);
            cls = ReconciliationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationRequest");
            cachedSerQNames.add(qName);
            cls = ReconciliationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationResponse");
            cachedSerQNames.add(qName);
            cls = ReconciliationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "subscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = SubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public LogonResponse informWebServiceLogon(LogonRequest logonRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "informWebServiceLogon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logonRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LogonResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (LogonResponse) org.apache.axis.utils.JavaUtils.convert(_resp, LogonResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LogoffResponse informWebServiceLogoff(LogoffRequest logoffRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "informWebServiceLogoff"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logoffRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LogoffResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (LogoffResponse) org.apache.axis.utils.JavaUtils.convert(_resp, LogoffResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayInvoiceResponse payInvoiceByKey(PayInvoiceRequest payInvoiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payInvoiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, PayInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CancelInvoicePayResponse cancelInvoicePayByKey(CancelInvoicePayRequest cancelInvoicePayRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelInvoicePayByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelInvoicePayRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CancelInvoicePayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (CancelInvoicePayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, CancelInvoicePayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SubscriberInfoResponse getSubscriberInfoByKey(BaseInputRequest subscriberInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getSubscriberInfoByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subscriberInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SubscriberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SubscriberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SubscriberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public BaseOutputResponse giveAutoPaymentOrderByKey(AutoPaymentRequest giveAutoPaymentOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "giveAutoPaymentOrderByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {giveAutoPaymentOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BaseOutputResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (BaseOutputResponse) org.apache.axis.utils.JavaUtils.convert(_resp, BaseOutputResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public BaseOutputResponse cancelAutoPaymentByKey(AutoPaymentRequest cancelAutoPaymentOrderRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelAutoPaymentByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cancelAutoPaymentOrderRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BaseOutputResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (BaseOutputResponse) org.apache.axis.utils.JavaUtils.convert(_resp, BaseOutputResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetOpenInvoicesResponse getAutoPaymentInvoiceByKey(BaseInputRequest getAutoPaymentInvoiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getAutoPaymentInvoiceByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAutoPaymentInvoiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetOpenInvoicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (GetOpenInvoicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetOpenInvoicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayInvoiceResponse payAutoPaymentInvoiceByKey(PayInvoiceRequest payAutoPaymentInvoiceRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payAutoPaymentInvoiceByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {payAutoPaymentInvoiceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, PayInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ReconciliationResponse sendReconciliation(ReconciliationRequest reconciliationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "sendReconciliation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reconciliationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ReconciliationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ReconciliationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ReconciliationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public InvoiceGetAutoPaymentDebitsResponse getAutoPaymentDebits(InvoiceGetAutoPaymentDebitsRequest invoiceGetAutoPaymentDebitsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getAutoPaymentDebits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoiceGetAutoPaymentDebitsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (InvoiceGetAutoPaymentDebitsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (InvoiceGetAutoPaymentDebitsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, InvoiceGetAutoPaymentDebitsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AllReconciliationDataResponse getAllReconciliationData(AllReconciliationDataRequest allReconciliationDataRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getAllReconciliationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {allReconciliationDataRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AllReconciliationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (AllReconciliationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, AllReconciliationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AutoPaymentCancelInformResponse getAutoPaymentCancelInform(AutoPaymentCancelInformRequest autoPaymentCancelInformRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getAutoPaymentCancelInform"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {autoPaymentCancelInformRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AutoPaymentCancelInformResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (AutoPaymentCancelInformResponse) org.apache.axis.utils.JavaUtils.convert(_resp, AutoPaymentCancelInformResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetOpenInvoicesResponse getOpenInvoicesByKey(GetOpenInvoicesRequest getOpenInvoicesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOpenInvoicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetOpenInvoicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (GetOpenInvoicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetOpenInvoicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
