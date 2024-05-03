/**
 * GetOpenInvoicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class GetOpenInvoicesRequest  extends BaseInputRequest implements java.io.Serializable {
    private java.lang.String custId;

    private int invCount;

    private java.lang.String period;

    public GetOpenInvoicesRequest() {
    }

    public GetOpenInvoicesRequest(
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
           java.lang.String custId,
           int invCount,
           java.lang.String period) {
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
        this.custId = custId;
        this.invCount = invCount;
        this.period = period;
    }


    /**
     * Gets the custId value for this GetOpenInvoicesRequest.
     * 
     * @return custId
     */
    public java.lang.String getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this GetOpenInvoicesRequest.
     * 
     * @param custId
     */
    public void setCustId(java.lang.String custId) {
        this.custId = custId;
    }


    /**
     * Gets the invCount value for this GetOpenInvoicesRequest.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this GetOpenInvoicesRequest.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }


    /**
     * Gets the period value for this GetOpenInvoicesRequest.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this GetOpenInvoicesRequest.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOpenInvoicesRequest)) return false;
        GetOpenInvoicesRequest other = (GetOpenInvoicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            this.invCount == other.getInvCount() &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod())));
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
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        _hashCode += getInvCount();
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOpenInvoicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "getOpenInvoicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
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
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
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
