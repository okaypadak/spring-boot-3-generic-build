/**
 * QueryKeyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class QueryKeyRequest  implements java.io.Serializable {
    private QueryKeyRequestReqMainParameterMapEntry[] reqMainParameterMap;

    private java.lang.String queryKey;

    private java.lang.String queryType;

    private java.lang.String queryValue;

    public QueryKeyRequest() {
    }

    public QueryKeyRequest(
           QueryKeyRequestReqMainParameterMapEntry[] reqMainParameterMap,
           java.lang.String queryKey,
           java.lang.String queryType,
           java.lang.String queryValue) {
           this.reqMainParameterMap = reqMainParameterMap;
           this.queryKey = queryKey;
           this.queryType = queryType;
           this.queryValue = queryValue;
    }


    /**
     * Gets the reqMainParameterMap value for this QueryKeyRequest.
     * 
     * @return reqMainParameterMap
     */
    public QueryKeyRequestReqMainParameterMapEntry[] getReqMainParameterMap() {
        return reqMainParameterMap;
    }


    /**
     * Sets the reqMainParameterMap value for this QueryKeyRequest.
     * 
     * @param reqMainParameterMap
     */
    public void setReqMainParameterMap(QueryKeyRequestReqMainParameterMapEntry[] reqMainParameterMap) {
        this.reqMainParameterMap = reqMainParameterMap;
    }


    /**
     * Gets the queryKey value for this QueryKeyRequest.
     * 
     * @return queryKey
     */
    public java.lang.String getQueryKey() {
        return queryKey;
    }


    /**
     * Sets the queryKey value for this QueryKeyRequest.
     * 
     * @param queryKey
     */
    public void setQueryKey(java.lang.String queryKey) {
        this.queryKey = queryKey;
    }


    /**
     * Gets the queryType value for this QueryKeyRequest.
     * 
     * @return queryType
     */
    public java.lang.String getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this QueryKeyRequest.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.String queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the queryValue value for this QueryKeyRequest.
     * 
     * @return queryValue
     */
    public java.lang.String getQueryValue() {
        return queryValue;
    }


    /**
     * Sets the queryValue value for this QueryKeyRequest.
     * 
     * @param queryValue
     */
    public void setQueryValue(java.lang.String queryValue) {
        this.queryValue = queryValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryKeyRequest)) return false;
        QueryKeyRequest other = (QueryKeyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reqMainParameterMap==null && other.getReqMainParameterMap()==null) || 
             (this.reqMainParameterMap!=null &&
              java.util.Arrays.equals(this.reqMainParameterMap, other.getReqMainParameterMap()))) &&
            ((this.queryKey==null && other.getQueryKey()==null) || 
             (this.queryKey!=null &&
              this.queryKey.equals(other.getQueryKey()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.queryValue==null && other.getQueryValue()==null) || 
             (this.queryValue!=null &&
              this.queryValue.equals(other.getQueryValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReqMainParameterMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReqMainParameterMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReqMainParameterMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryKey() != null) {
            _hashCode += getQueryKey().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getQueryValue() != null) {
            _hashCode += getQueryValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryKeyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "queryKeyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqMainParameterMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqMainParameterMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>queryKeyRequest>reqMainParameterMap>entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryValue"));
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
