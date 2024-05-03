/**
 * TalimatWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatSabit.ws;

public class TalimatWSLocator extends org.apache.axis.client.Service implements TalimatWS {

    public TalimatWSLocator() {
    }


    public TalimatWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TalimatWSLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TalimatWSPort
    private String TalimatWSPort_address = "http://localhost:7001/services/talimat/TalimatWSPort";

    public String getTalimatWSPortAddress() {
        return TalimatWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String TalimatWSPortWSDDServiceName = "TalimatWSPort";

    public String getTalimatWSPortWSDDServiceName() {
        return TalimatWSPortWSDDServiceName;
    }

    public void setTalimatWSPortWSDDServiceName(String name) {
        TalimatWSPortWSDDServiceName = name;
    }

    public TalimatWSPortType getTalimatWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TalimatWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTalimatWSPort(endpoint);
    }

    public TalimatWSPortType getTalimatWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            TalimatWSBindingStub _stub = new TalimatWSBindingStub(portAddress, this);
            _stub.setPortName(getTalimatWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTalimatWSPortEndpointAddress(String address) {
        TalimatWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (TalimatWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                TalimatWSBindingStub _stub = new TalimatWSBindingStub(new java.net.URL(TalimatWSPort_address), this);
                _stub.setPortName(getTalimatWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("TalimatWSPort".equals(inputPortName)) {
            return getTalimatWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://innova.com.tr.webservice.services.TalimatWS.wsdl", "TalimatWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://innova.com.tr.webservice.services.TalimatWS.wsdl", "TalimatWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("TalimatWSPort".equals(portName)) {
            setTalimatWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
