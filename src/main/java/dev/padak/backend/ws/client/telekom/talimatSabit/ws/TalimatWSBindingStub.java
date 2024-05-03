/**
 * TalimatWSBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.talimatSabit.ws;

import dev.padak.backend.ws.client.telekom.talimatSabit.ortak.*;

public class TalimatWSBindingStub extends org.apache.axis.client.Stub implements TalimatWSPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("talimatSorgulama");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatBilgiSorgulamaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatBilgiSorgulamaRequest"), TalimatBilgiSorgulamaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatBilgiSorgulamaResponse"));
        oper.setReturnClass(TalimatBilgiSorgulamaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatBilgiSorgulamaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("talimatEkle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatEkleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatEkleRequest"), TalimatEkleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatEkleResponse"));
        oper.setReturnClass(TalimatEkleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatEkleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("talimatCikar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatCikarRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatCikarRequest"), TalimatCikarRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatCikarResponse"));
        oper.setReturnClass(TalimatCikarResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatCikarResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public TalimatWSBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TalimatWSBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TalimatWSBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "AnahtarDegerCifti");
            cachedSerQNames.add(qName);
            cls = AnahtarDegerCifti.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "AnahtarDegerCiftiDizi");
            cachedSerQNames.add(qName);
            cls = AnahtarDegerCifti[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "AnahtarDegerCifti");
            qName2 = new javax.xml.namespace.QName("", "anahtarDegerCifti");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "GenelCevapMesaj");
            cachedSerQNames.add(qName);
            cls = GenelCevapMesaj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "GenelIstekMesaj");
            cachedSerQNames.add(qName);
            cls = GenelIstekMesaj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "IslemYapan");
            cachedSerQNames.add(qName);
            cls = IslemYapan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "OzetCevapMesaj");
            cachedSerQNames.add(qName);
            cls = OzetCevapMesaj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatBilgiSorgulamaRequest");
            cachedSerQNames.add(qName);
            cls = TalimatBilgiSorgulamaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatBilgiSorgulamaResponse");
            cachedSerQNames.add(qName);
            cls = TalimatBilgiSorgulamaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatCikarRequest");
            cachedSerQNames.add(qName);
            cls = TalimatCikarRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatCikarResponse");
            cachedSerQNames.add(qName);
            cls = TalimatCikarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatEkleRequest");
            cachedSerQNames.add(qName);
            cls = TalimatEkleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatEkleResponse");
            cachedSerQNames.add(qName);
            cls = TalimatEkleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "ErisimBilgi");
            cachedSerQNames.add(qName);
            cls = ErisimBilgi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "KrediKartiBilgi");
            cachedSerQNames.add(qName);
            cls = KrediKartiBilgi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatHesap");
            cachedSerQNames.add(qName);
            cls = TalimatHesap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatHesapDizi");
            cachedSerQNames.add(qName);
            cls = TalimatHesap[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatHesap");
            qName2 = new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatHesap");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
                String key = (String) keys.nextElement();
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
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
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
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public TalimatBilgiSorgulamaResponse talimatSorgulama(TalimatBilgiSorgulamaRequest talimatBilgiSorgulamaRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "talimatSorgulama"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {talimatBilgiSorgulamaRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TalimatBilgiSorgulamaResponse) _resp;
            } catch (Exception _exception) {
                return (TalimatBilgiSorgulamaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, TalimatBilgiSorgulamaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public TalimatEkleResponse talimatEkle(TalimatEkleRequest talimatEkleRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "talimatEkle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {talimatEkleRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TalimatEkleResponse) _resp;
            } catch (Exception _exception) {
                return (TalimatEkleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, TalimatEkleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public TalimatCikarResponse talimatCikar(TalimatCikarRequest talimatCikarRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "talimatCikar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {talimatCikarRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TalimatCikarResponse) _resp;
            } catch (Exception _exception) {
                return (TalimatCikarResponse) org.apache.axis.utils.JavaUtils.convert(_resp, TalimatCikarResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
