/**
 * GetOpenInvoicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class GetOpenInvoicesResponse  extends BaseOutputResponse implements java.io.Serializable {
    private InvoiceDetail[] invoiceDetailList;

    private java.lang.String curr;

    private int invCount;

    private long transactionId;

    public GetOpenInvoicesResponse() {
    }

    public GetOpenInvoicesResponse(
           java.lang.String errMsg,
           java.lang.String respCode,
           ParamResponseMainParameterMapEntry[] mainParameterMap,
           java.lang.String queryKey,
           java.lang.String queryType,
           java.lang.String queryValue,
           int bankId,
           int compId,
           java.lang.String msgDate,
           Origin orig,
           java.lang.String sessionId,
           long stan,
           InvoiceDetail[] invoiceDetailList,
           java.lang.String curr,
           int invCount,
           long transactionId) {
        super(
            errMsg,
            respCode,
            mainParameterMap,
            queryKey,
            queryType,
            queryValue,
            bankId,
            compId,
            msgDate,
            orig,
            sessionId,
            stan);
        this.invoiceDetailList = invoiceDetailList;
        this.curr = curr;
        this.invCount = invCount;
        this.transactionId = transactionId;
    }


    /**
     * Gets the invoiceDetailList value for this GetOpenInvoicesResponse.
     * 
     * @return invoiceDetailList
     */
    public InvoiceDetail[] getInvoiceDetailList() {
        return invoiceDetailList;
    }


    /**
     * Sets the invoiceDetailList value for this GetOpenInvoicesResponse.
     * 
     * @param invoiceDetailList
     */
    public void setInvoiceDetailList(InvoiceDetail[] invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }


    /**
     * Gets the curr value for this GetOpenInvoicesResponse.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this GetOpenInvoicesResponse.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }


    /**
     * Gets the invCount value for this GetOpenInvoicesResponse.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this GetOpenInvoicesResponse.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }


    /**
     * Gets the transactionId value for this GetOpenInvoicesResponse.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GetOpenInvoicesResponse.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOpenInvoicesResponse)) return false;
        GetOpenInvoicesResponse other = (GetOpenInvoicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceDetailList==null && other.getInvoiceDetailList()==null) || 
             (this.invoiceDetailList!=null &&
              java.util.Arrays.equals(this.invoiceDetailList, other.getInvoiceDetailList()))) &&
            ((this.curr==null && other.getCurr()==null) || 
             (this.curr!=null &&
              this.curr.equals(other.getCurr()))) &&
            this.invCount == other.getInvCount() &&
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
        if (getInvoiceDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurr() != null) {
            _hashCode += getCurr().hashCode();
        }
        _hashCode += getInvCount();
        _hashCode += new Long(getTransactionId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOpenInvoicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "invoiceDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
