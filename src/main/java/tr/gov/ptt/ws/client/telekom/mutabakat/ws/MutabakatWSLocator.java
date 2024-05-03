/**
 * MutabakatWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.mutabakat.ws;

public class MutabakatWSLocator extends org.apache.axis.client.Service implements MutabakatWS {

    public MutabakatWSLocator() {
    }


    public MutabakatWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MutabakatWSLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MutabakatWSPort
    private String MutabakatWSPort_address = "http://innova.com.tr/tts/mutabakat/MutabakatWS";

    public String getMutabakatWSPortAddress() {
        return MutabakatWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String MutabakatWSPortWSDDServiceName = "MutabakatWSPort";

    public String getMutabakatWSPortWSDDServiceName() {
        return MutabakatWSPortWSDDServiceName;
    }

    public void setMutabakatWSPortWSDDServiceName(String name) {
        MutabakatWSPortWSDDServiceName = name;
    }

    public MutabakatWSPortType getMutabakatWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MutabakatWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMutabakatWSPort(endpoint);
    }

    public MutabakatWSPortType getMutabakatWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MutabakatWSBindingStub _stub = new MutabakatWSBindingStub(portAddress, this);
            _stub.setPortName(getMutabakatWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMutabakatWSPortEndpointAddress(String address) {
        MutabakatWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MutabakatWSPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MutabakatWSBindingStub _stub = new MutabakatWSBindingStub(new java.net.URL(MutabakatWSPort_address), this);
                _stub.setPortName(getMutabakatWSPortWSDDServiceName());
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
        if ("MutabakatWSPort".equals(inputPortName)) {
            return getMutabakatWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://innova.com.tr.webservice.services.MutabakatWS.wsdl", "MutabakatWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://innova.com.tr.webservice.services.MutabakatWS.wsdl", "MutabakatWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("MutabakatWSPort".equals(portName)) {
            setMutabakatWSPortEndpointAddress(address);
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
