/**
 * ReconciliationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class ReconciliationResponse  extends BaseOutputResponse implements java.io.Serializable {
    private ReconciliationInfo[] reconInfoList;

    private int reconCount;

    public ReconciliationResponse() {
    }

    public ReconciliationResponse(
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
           ReconciliationInfo[] reconInfoList,
           int reconCount) {
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
        this.reconInfoList = reconInfoList;
        this.reconCount = reconCount;
    }


    /**
     * Gets the reconInfoList value for this ReconciliationResponse.
     * 
     * @return reconInfoList
     */
    public ReconciliationInfo[] getReconInfoList() {
        return reconInfoList;
    }


    /**
     * Sets the reconInfoList value for this ReconciliationResponse.
     * 
     * @param reconInfoList
     */
    public void setReconInfoList(ReconciliationInfo[] reconInfoList) {
        this.reconInfoList = reconInfoList;
    }


    /**
     * Gets the reconCount value for this ReconciliationResponse.
     * 
     * @return reconCount
     */
    public int getReconCount() {
        return reconCount;
    }


    /**
     * Sets the reconCount value for this ReconciliationResponse.
     * 
     * @param reconCount
     */
    public void setReconCount(int reconCount) {
        this.reconCount = reconCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationResponse)) return false;
        ReconciliationResponse other = (ReconciliationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reconInfoList==null && other.getReconInfoList()==null) || 
             (this.reconInfoList!=null &&
              java.util.Arrays.equals(this.reconInfoList, other.getReconInfoList()))) &&
            this.reconCount == other.getReconCount();
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
        if (getReconInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReconInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReconInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getReconCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reconInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconCount"));
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
