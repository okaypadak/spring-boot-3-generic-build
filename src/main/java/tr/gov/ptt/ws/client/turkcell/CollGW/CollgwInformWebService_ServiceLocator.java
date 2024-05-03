/**
 * CollgwInformWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class CollgwInformWebService_ServiceLocator extends org.apache.axis.client.Service implements CollgwInformWebService_Service {

    public CollgwInformWebService_ServiceLocator() {
    }


    public CollgwInformWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CollgwInformWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CollgwInformWebServicePort
    private java.lang.String CollgwInformWebServicePort_address = "https://sertifikasyon-ist.turkcell.com.tr:443/collgwWebServices/CollgwInformWebService";

    public java.lang.String getCollgwInformWebServicePortAddress() {
        return CollgwInformWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CollgwInformWebServicePortWSDDServiceName = "CollgwInformWebServicePort";

    public java.lang.String getCollgwInformWebServicePortWSDDServiceName() {
        return CollgwInformWebServicePortWSDDServiceName;
    }

    public void setCollgwInformWebServicePortWSDDServiceName(java.lang.String name) {
        CollgwInformWebServicePortWSDDServiceName = name;
    }

    public CollgwInformWebService_PortType getCollgwInformWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CollgwInformWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCollgwInformWebServicePort(endpoint);
    }

    public CollgwInformWebService_PortType getCollgwInformWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CollgwInformWebServicePortBindingStub _stub = new CollgwInformWebServicePortBindingStub(portAddress, this);
            _stub.setPortName(getCollgwInformWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCollgwInformWebServicePortEndpointAddress(java.lang.String address) {
        CollgwInformWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CollgwInformWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                CollgwInformWebServicePortBindingStub _stub = new CollgwInformWebServicePortBindingStub(new java.net.URL(CollgwInformWebServicePort_address), this);
                _stub.setPortName(getCollgwInformWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CollgwInformWebServicePort".equals(inputPortName)) {
            return getCollgwInformWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "CollgwInformWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "CollgwInformWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CollgwInformWebServicePort".equals(portName)) {
            setCollgwInformWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
