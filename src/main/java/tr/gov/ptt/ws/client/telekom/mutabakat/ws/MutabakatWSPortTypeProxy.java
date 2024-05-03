package tr.gov.ptt.ws.client.telekom.mutabakat.ws;

import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatRequest;
import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatResponse;

public class MutabakatWSPortTypeProxy implements MutabakatWSPortType {
  private String _endpoint = null;
  private MutabakatWSPortType mutabakatWSPortType = null;
  
  public MutabakatWSPortTypeProxy() {
    _initMutabakatWSPortTypeProxy();
  }
  
  public MutabakatWSPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMutabakatWSPortTypeProxy();
  }
  
  private void _initMutabakatWSPortTypeProxy() {
    try {
      mutabakatWSPortType = (new MutabakatWSLocator()).getMutabakatWSPort();
      if (mutabakatWSPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mutabakatWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mutabakatWSPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mutabakatWSPortType != null)
      ((javax.xml.rpc.Stub)mutabakatWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public MutabakatWSPortType getMutabakatWSPortType() {
    if (mutabakatWSPortType == null)
      _initMutabakatWSPortTypeProxy();
    return mutabakatWSPortType;
  }
  
  public MutabakatResponse mutabakatBildir(MutabakatRequest mutabakat) throws java.rmi.RemoteException{
    if (mutabakatWSPortType == null)
      _initMutabakatWSPortTypeProxy();
    return mutabakatWSPortType.mutabakatBildir(mutabakat);
  }
  
  
}