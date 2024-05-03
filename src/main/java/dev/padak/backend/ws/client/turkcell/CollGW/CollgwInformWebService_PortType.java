/**
 * CollgwInformWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public interface CollgwInformWebService_PortType extends java.rmi.Remote {
    public LogonResponse informWebServiceLogon(LogonRequest logonRequest) throws java.rmi.RemoteException;
    public LogoffResponse informWebServiceLogoff(LogoffRequest logoffRequest) throws java.rmi.RemoteException;
    public PayInvoiceResponse payInvoiceByKey(PayInvoiceRequest payInvoiceRequest) throws java.rmi.RemoteException;
    public CancelInvoicePayResponse cancelInvoicePayByKey(CancelInvoicePayRequest cancelInvoicePayRequest) throws java.rmi.RemoteException;
    public SubscriberInfoResponse getSubscriberInfoByKey(BaseInputRequest subscriberInfoRequest) throws java.rmi.RemoteException;
    public BaseOutputResponse giveAutoPaymentOrderByKey(AutoPaymentRequest giveAutoPaymentOrderRequest) throws java.rmi.RemoteException;
    public BaseOutputResponse cancelAutoPaymentByKey(AutoPaymentRequest cancelAutoPaymentOrderRequest) throws java.rmi.RemoteException;
    public GetOpenInvoicesResponse getAutoPaymentInvoiceByKey(BaseInputRequest getAutoPaymentInvoiceRequest) throws java.rmi.RemoteException;
    public PayInvoiceResponse payAutoPaymentInvoiceByKey(PayInvoiceRequest payAutoPaymentInvoiceRequest) throws java.rmi.RemoteException;
    public ReconciliationResponse sendReconciliation(ReconciliationRequest reconciliationRequest) throws java.rmi.RemoteException;
    public InvoiceGetAutoPaymentDebitsResponse getAutoPaymentDebits(InvoiceGetAutoPaymentDebitsRequest invoiceGetAutoPaymentDebitsRequest) throws java.rmi.RemoteException;
    public AllReconciliationDataResponse getAllReconciliationData(AllReconciliationDataRequest allReconciliationDataRequest) throws java.rmi.RemoteException;
    public AutoPaymentCancelInformResponse getAutoPaymentCancelInform(AutoPaymentCancelInformRequest autoPaymentCancelInformRequest) throws java.rmi.RemoteException;
    public GetOpenInvoicesResponse getOpenInvoicesByKey(GetOpenInvoicesRequest getOpenInvoicesRequest) throws java.rmi.RemoteException;
}
