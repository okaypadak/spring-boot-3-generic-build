/**
 * AutoPaymentCancelInformResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class AutoPaymentCancelInformResponse  extends BaseOutputResponse implements java.io.Serializable {
    private AutoPaymentCancelDto[] autoPaymentCancelList;

    private int cancelCount;

    public AutoPaymentCancelInformResponse() {
    }

    public AutoPaymentCancelInformResponse(
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
           AutoPaymentCancelDto[] autoPaymentCancelList,
           int cancelCount) {
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
        this.autoPaymentCancelList = autoPaymentCancelList;
        this.cancelCount = cancelCount;
    }


    /**
     * Gets the autoPaymentCancelList value for this AutoPaymentCancelInformResponse.
     * 
     * @return autoPaymentCancelList
     */
    public AutoPaymentCancelDto[] getAutoPaymentCancelList() {
        return autoPaymentCancelList;
    }


    /**
     * Sets the autoPaymentCancelList value for this AutoPaymentCancelInformResponse.
     * 
     * @param autoPaymentCancelList
     */
    public void setAutoPaymentCancelList(AutoPaymentCancelDto[] autoPaymentCancelList) {
        this.autoPaymentCancelList = autoPaymentCancelList;
    }


    /**
     * Gets the cancelCount value for this AutoPaymentCancelInformResponse.
     * 
     * @return cancelCount
     */
    public int getCancelCount() {
        return cancelCount;
    }


    /**
     * Sets the cancelCount value for this AutoPaymentCancelInformResponse.
     * 
     * @param cancelCount
     */
    public void setCancelCount(int cancelCount) {
        this.cancelCount = cancelCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPaymentCancelInformResponse)) return false;
        AutoPaymentCancelInformResponse other = (AutoPaymentCancelInformResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoPaymentCancelList==null && other.getAutoPaymentCancelList()==null) || 
             (this.autoPaymentCancelList!=null &&
              java.util.Arrays.equals(this.autoPaymentCancelList, other.getAutoPaymentCancelList()))) &&
            this.cancelCount == other.getCancelCount();
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
        if (getAutoPaymentCancelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoPaymentCancelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoPaymentCancelList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCancelCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPaymentCancelInformResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelInformResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPaymentCancelList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoPaymentCancelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "autoPaymentCancel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelCount"));
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
