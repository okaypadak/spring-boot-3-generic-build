/**
 * PayInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class PayInvoiceRequest  extends InvoiceInfoRequest implements java.io.Serializable {
    private java.lang.String accDate;

    private java.lang.String invData;

    private java.lang.Integer paymentSource;

    private long transactionId;

    public PayInvoiceRequest() {
    }

    public PayInvoiceRequest(
           QueryKeyRequestReqMainParameterMapEntry[] reqMainParameterMap,
           java.lang.String queryKey,
           java.lang.String queryType,
           java.lang.String queryValue,
           int bankId,
           int compId,
           java.lang.String curr,
           java.lang.String msgDate,
           Origin orig,
           java.lang.String sessionId,
           long stan,
           InvoiceDetail[] invoiceDetailList,
           int invCount,
           java.lang.String accDate,
           java.lang.String invData,
           java.lang.Integer paymentSource,
           long transactionId) {
        super(
            reqMainParameterMap,
            queryKey,
            queryType,
            queryValue,
            bankId,
            compId,
            curr,
            msgDate,
            orig,
            sessionId,
            stan,
            invoiceDetailList,
            invCount);
        this.accDate = accDate;
        this.invData = invData;
        this.paymentSource = paymentSource;
        this.transactionId = transactionId;
    }


    /**
     * Gets the accDate value for this PayInvoiceRequest.
     * 
     * @return accDate
     */
    public java.lang.String getAccDate() {
        return accDate;
    }


    /**
     * Sets the accDate value for this PayInvoiceRequest.
     * 
     * @param accDate
     */
    public void setAccDate(java.lang.String accDate) {
        this.accDate = accDate;
    }


    /**
     * Gets the invData value for this PayInvoiceRequest.
     * 
     * @return invData
     */
    public java.lang.String getInvData() {
        return invData;
    }


    /**
     * Sets the invData value for this PayInvoiceRequest.
     * 
     * @param invData
     */
    public void setInvData(java.lang.String invData) {
        this.invData = invData;
    }


    /**
     * Gets the paymentSource value for this PayInvoiceRequest.
     * 
     * @return paymentSource
     */
    public java.lang.Integer getPaymentSource() {
        return paymentSource;
    }


    /**
     * Sets the paymentSource value for this PayInvoiceRequest.
     * 
     * @param paymentSource
     */
    public void setPaymentSource(java.lang.Integer paymentSource) {
        this.paymentSource = paymentSource;
    }


    /**
     * Gets the transactionId value for this PayInvoiceRequest.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PayInvoiceRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayInvoiceRequest)) return false;
        PayInvoiceRequest other = (PayInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accDate==null && other.getAccDate()==null) || 
             (this.accDate!=null &&
              this.accDate.equals(other.getAccDate()))) &&
            ((this.invData==null && other.getInvData()==null) || 
             (this.invData!=null &&
              this.invData.equals(other.getInvData()))) &&
            ((this.paymentSource==null && other.getPaymentSource()==null) || 
             (this.paymentSource!=null &&
              this.paymentSource.equals(other.getPaymentSource()))) &&
            this.transactionId == other.getTransactionId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccDate() != null) {
            _hashCode += getAccDate().hashCode();
        }
        if (getInvData() != null) {
            _hashCode += getInvData().hashCode();
        }
        if (getPaymentSource() != null) {
            _hashCode += getPaymentSource().hashCode();
        }
        _hashCode += new Long(getTransactionId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "payInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
