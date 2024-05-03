/**
 * LogoffRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class LogoffRequest  implements java.io.Serializable {
    private int bankId;

    private int compId;

    private java.lang.String msgDate;

    private java.lang.String sessionId;

    private long stan;

    public LogoffRequest() {
    }

    public LogoffRequest(
           int bankId,
           int compId,
           java.lang.String msgDate,
           java.lang.String sessionId,
           long stan) {
           this.bankId = bankId;
           this.compId = compId;
           this.msgDate = msgDate;
           this.sessionId = sessionId;
           this.stan = stan;
    }


    /**
     * Gets the bankId value for this LogoffRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this LogoffRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the compId value for this LogoffRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this LogoffRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the msgDate value for this LogoffRequest.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this LogoffRequest.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the sessionId value for this LogoffRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this LogoffRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the stan value for this LogoffRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this LogoffRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogoffRequest)) return false;
        LogoffRequest other = (LogoffRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bankId == other.getBankId() &&
            this.compId == other.getCompId() &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.stan == other.getStan();
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
        _hashCode += getBankId();
        _hashCode += getCompId();
        if (getMsgDate() != null) {
            _hashCode += getMsgDate().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogoffRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "logoffRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stan"));
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
