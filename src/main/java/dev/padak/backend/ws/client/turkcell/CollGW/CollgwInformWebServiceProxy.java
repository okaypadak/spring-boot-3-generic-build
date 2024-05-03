package dev.padak.backend.ws.client.turkcell.CollGW;

public class CollgwInformWebServiceProxy implements CollgwInformWebService_PortType {
  private String _endpoint = null;
  private CollgwInformWebService_PortType collgwInformWebService_PortType = null;
  
  public CollgwInformWebServiceProxy() {
    _initCollgwInformWebServiceProxy();
  }
  
  public CollgwInformWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCollgwInformWebServiceProxy();
  }
  
  private void _initCollgwInformWebServiceProxy() {
    try {
      collgwInformWebService_PortType = (new CollgwInformWebService_ServiceLocator()).getCollgwInformWebServicePort();
      if (collgwInformWebService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)collgwInformWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)collgwInformWebService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (collgwInformWebService_PortType != null)
      ((javax.xml.rpc.Stub)collgwInformWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public CollgwInformWebService_PortType getCollgwInformWebService_PortType() {
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType;
  }
  
  public LogonResponse informWebServiceLogon(LogonRequest logonRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.informWebServiceLogon(logonRequest);
  }
  
  public LogoffResponse informWebServiceLogoff(LogoffRequest logoffRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.informWebServiceLogoff(logoffRequest);
  }
  
  public PayInvoiceResponse payInvoiceByKey(PayInvoiceRequest payInvoiceRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.payInvoiceByKey(payInvoiceRequest);
  }
  
  public CancelInvoicePayResponse cancelInvoicePayByKey(CancelInvoicePayRequest cancelInvoicePayRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.cancelInvoicePayByKey(cancelInvoicePayRequest);
  }
  
  public SubscriberInfoResponse getSubscriberInfoByKey(BaseInputRequest subscriberInfoRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.getSubscriberInfoByKey(subscriberInfoRequest);
  }
  
  public BaseOutputResponse giveAutoPaymentOrderByKey(AutoPaymentRequest giveAutoPaymentOrderRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.giveAutoPaymentOrderByKey(giveAutoPaymentOrderRequest);
  }
  
  public BaseOutputResponse cancelAutoPaymentByKey(AutoPaymentRequest cancelAutoPaymentOrderRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.cancelAutoPaymentByKey(cancelAutoPaymentOrderRequest);
  }
  
  public GetOpenInvoicesResponse getAutoPaymentInvoiceByKey(BaseInputRequest getAutoPaymentInvoiceRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.getAutoPaymentInvoiceByKey(getAutoPaymentInvoiceRequest);
  }
  
  public PayInvoiceResponse payAutoPaymentInvoiceByKey(PayInvoiceRequest payAutoPaymentInvoiceRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.payAutoPaymentInvoiceByKey(payAutoPaymentInvoiceRequest);
  }
  
  public ReconciliationResponse sendReconciliation(ReconciliationRequest reconciliationRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.sendReconciliation(reconciliationRequest);
  }
  
  public InvoiceGetAutoPaymentDebitsResponse getAutoPaymentDebits(InvoiceGetAutoPaymentDebitsRequest invoiceGetAutoPaymentDebitsRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.getAutoPaymentDebits(invoiceGetAutoPaymentDebitsRequest);
  }
  
  public AllReconciliationDataResponse getAllReconciliationData(AllReconciliationDataRequest allReconciliationDataRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.getAllReconciliationData(allReconciliationDataRequest);
  }
  
  public AutoPaymentCancelInformResponse getAutoPaymentCancelInform(AutoPaymentCancelInformRequest autoPaymentCancelInformRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.getAutoPaymentCancelInform(autoPaymentCancelInformRequest);
  }
  
  public GetOpenInvoicesResponse getOpenInvoicesByKey(GetOpenInvoicesRequest getOpenInvoicesRequest) throws java.rmi.RemoteException{
    if (collgwInformWebService_PortType == null)
      _initCollgwInformWebServiceProxy();
    return collgwInformWebService_PortType.getOpenInvoicesByKey(getOpenInvoicesRequest);
  }
  
  
}