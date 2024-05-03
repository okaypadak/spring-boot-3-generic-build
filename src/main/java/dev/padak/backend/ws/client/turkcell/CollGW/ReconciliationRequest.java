/**
 * ReconciliationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class ReconciliationRequest  implements java.io.Serializable {
    private ReconciliationInfo[] reconInfoList;

    private java.lang.String accDate;

    private int bankId;

    private int compId;

    private java.lang.String curr;

    private java.lang.String msgDate;

    private Origin orig;

    private int reconCount;

    private java.lang.String sessionId;

    private long stan;

    public ReconciliationRequest() {
    }

    public ReconciliationRequest(
           ReconciliationInfo[] reconInfoList,
           java.lang.String accDate,
           int bankId,
           int compId,
           java.lang.String curr,
           java.lang.String msgDate,
           Origin orig,
           int reconCount,
           java.lang.String sessionId,
           long stan) {
           this.reconInfoList = reconInfoList;
           this.accDate = accDate;
           this.bankId = bankId;
           this.compId = compId;
           this.curr = curr;
           this.msgDate = msgDate;
           this.orig = orig;
           this.reconCount = reconCount;
           this.sessionId = sessionId;
           this.stan = stan;
    }


    /**
     * Gets the reconInfoList value for this ReconciliationRequest.
     * 
     * @return reconInfoList
     */
    public ReconciliationInfo[] getReconInfoList() {
        return reconInfoList;
    }


    /**
     * Sets the reconInfoList value for this ReconciliationRequest.
     * 
     * @param reconInfoList
     */
    public void setReconInfoList(ReconciliationInfo[] reconInfoList) {
        this.reconInfoList = reconInfoList;
    }


    /**
     * Gets the accDate value for this ReconciliationRequest.
     * 
     * @return accDate
     */
    public java.lang.String getAccDate() {
        return accDate;
    }


    /**
     * Sets the accDate value for this ReconciliationRequest.
     * 
     * @param accDate
     */
    public void setAccDate(java.lang.String accDate) {
        this.accDate = accDate;
    }


    /**
     * Gets the bankId value for this ReconciliationRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this ReconciliationRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the compId value for this ReconciliationRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this ReconciliationRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the curr value for this ReconciliationRequest.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this ReconciliationRequest.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }


    /**
     * Gets the msgDate value for this ReconciliationRequest.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this ReconciliationRequest.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the orig value for this ReconciliationRequest.
     * 
     * @return orig
     */
    public Origin getOrig() {
        return orig;
    }


    /**
     * Sets the orig value for this ReconciliationRequest.
     * 
     * @param orig
     */
    public void setOrig(Origin orig) {
        this.orig = orig;
    }


    /**
     * Gets the reconCount value for this ReconciliationRequest.
     * 
     * @return reconCount
     */
    public int getReconCount() {
        return reconCount;
    }


    /**
     * Sets the reconCount value for this ReconciliationRequest.
     * 
     * @param reconCount
     */
    public void setReconCount(int reconCount) {
        this.reconCount = reconCount;
    }


    /**
     * Gets the sessionId value for this ReconciliationRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this ReconciliationRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the stan value for this ReconciliationRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this ReconciliationRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationRequest)) return false;
        ReconciliationRequest other = (ReconciliationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reconInfoList==null && other.getReconInfoList()==null) || 
             (this.reconInfoList!=null &&
              java.util.Arrays.equals(this.reconInfoList, other.getReconInfoList()))) &&
            ((this.accDate==null && other.getAccDate()==null) || 
             (this.accDate!=null &&
              this.accDate.equals(other.getAccDate()))) &&
            this.bankId == other.getBankId() &&
            this.compId == other.getCompId() &&
            ((this.curr==null && other.getCurr()==null) || 
             (this.curr!=null &&
              this.curr.equals(other.getCurr()))) &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            ((this.orig==null && other.getOrig()==null) || 
             (this.orig!=null &&
              this.orig.equals(other.getOrig()))) &&
            this.reconCount == other.getReconCount() &&
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
        if (getAccDate() != null) {
            _hashCode += getAccDate().hashCode();
        }
        _hashCode += getBankId();
        _hashCode += getCompId();
        if (getCurr() != null) {
            _hashCode += getCurr().hashCode();
        }
        if (getMsgDate() != null) {
            _hashCode += getMsgDate().hashCode();
        }
        if (getOrig() != null) {
            _hashCode += getOrig().hashCode();
        }
        _hashCode += getReconCount();
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reconInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("curr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("orig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "origin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
