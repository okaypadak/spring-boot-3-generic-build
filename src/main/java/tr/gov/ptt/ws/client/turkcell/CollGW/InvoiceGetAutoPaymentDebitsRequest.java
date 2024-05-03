/**
 * InvoiceGetAutoPaymentDebitsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class InvoiceGetAutoPaymentDebitsRequest  extends BaseInputRequest implements java.io.Serializable {
    private int dayParam;

    private int invType;

    public InvoiceGetAutoPaymentDebitsRequest() {
    }

    public InvoiceGetAutoPaymentDebitsRequest(
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
           int dayParam,
           int invType) {
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
            stan);
        this.dayParam = dayParam;
        this.invType = invType;
    }


    /**
     * Gets the dayParam value for this InvoiceGetAutoPaymentDebitsRequest.
     * 
     * @return dayParam
     */
    public int getDayParam() {
        return dayParam;
    }


    /**
     * Sets the dayParam value for this InvoiceGetAutoPaymentDebitsRequest.
     * 
     * @param dayParam
     */
    public void setDayParam(int dayParam) {
        this.dayParam = dayParam;
    }


    /**
     * Gets the invType value for this InvoiceGetAutoPaymentDebitsRequest.
     * 
     * @return invType
     */
    public int getInvType() {
        return invType;
    }


    /**
     * Sets the invType value for this InvoiceGetAutoPaymentDebitsRequest.
     * 
     * @param invType
     */
    public void setInvType(int invType) {
        this.invType = invType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceGetAutoPaymentDebitsRequest)) return false;
        InvoiceGetAutoPaymentDebitsRequest other = (InvoiceGetAutoPaymentDebitsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.dayParam == other.getDayParam() &&
            this.invType == other.getInvType();
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
        _hashCode += getDayParam();
        _hashCode += getInvType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceGetAutoPaymentDebitsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceGetAutoPaymentDebitsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
