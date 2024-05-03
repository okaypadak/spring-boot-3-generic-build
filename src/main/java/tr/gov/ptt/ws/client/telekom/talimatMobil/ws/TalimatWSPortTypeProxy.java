package tr.gov.ptt.ws.client.telekom.talimatMobil.ws;
import tr.gov.ptt.ws.client.telekom.talimatMobil.ortak.*;
import tr.gov.ptt.ws.client.telekom.talimatMobil.ortak.*;
import tr.gov.ptt.ws.client.telekom.talimatMobil.ortak.*;

public class TalimatWSPortTypeProxy implements TalimatWSPortType {
  private String _endpoint = null;
  private TalimatWSPortType talimatWSPortType = null;
  
  public TalimatWSPortTypeProxy() {
    _initTalimatWSPortTypeProxy();
  }
  
  public TalimatWSPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTalimatWSPortTypeProxy();
  }
  
  private void _initTalimatWSPortTypeProxy() {
    try {
      talimatWSPortType = (new TalimatWSLocator()).getTalimatWSPort();
      if (talimatWSPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)talimatWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)talimatWSPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (talimatWSPortType != null)
      ((javax.xml.rpc.Stub)talimatWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public TalimatWSPortType getTalimatWSPortType() {
    if (talimatWSPortType == null)
      _initTalimatWSPortTypeProxy();
    return talimatWSPortType;
  }
  
  public TalimatBilgiSorgulamaResponse talimatSorgulama(TalimatBilgiSorgulamaRequest talimatBilgiSorgulamaRequest) throws java.rmi.RemoteException{
    if (talimatWSPortType == null)
      _initTalimatWSPortTypeProxy();
    return talimatWSPortType.talimatSorgulama(talimatBilgiSorgulamaRequest);
  }
  
  public TalimatEkleResponse talimatEkle(TalimatEkleRequest talimatEkleRequest) throws java.rmi.RemoteException{
    if (talimatWSPortType == null)
      _initTalimatWSPortTypeProxy();
    return talimatWSPortType.talimatEkle(talimatEkleRequest);
  }
  
  public TalimatCikarResponse talimatCikar(TalimatCikarRequest talimatCikarRequest) throws java.rmi.RemoteException{
    if (talimatWSPortType == null)
      _initTalimatWSPortTypeProxy();
    return talimatWSPortType.talimatCikar(talimatCikarRequest);
  }
  
  
}