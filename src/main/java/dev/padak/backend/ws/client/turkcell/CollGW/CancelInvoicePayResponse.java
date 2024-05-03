/**
 * CancelInvoicePayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class CancelInvoicePayResponse  extends BaseOutputResponse implements java.io.Serializable {
    private java.lang.String curr;

    public CancelInvoicePayResponse() {
    }

    public CancelInvoicePayResponse(
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
           java.lang.String curr) {
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
        this.curr = curr;
    }


    /**
     * Gets the curr value for this CancelInvoicePayResponse.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this CancelInvoicePayResponse.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelInvoicePayResponse)) return false;
        CancelInvoicePayResponse other = (CancelInvoicePayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.curr==null && other.getCurr()==null) || 
             (this.curr!=null &&
              this.curr.equals(other.getCurr())));
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
        if (getCurr() != null) {
            _hashCode += getCurr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelInvoicePayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "cancelInvoicePayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
