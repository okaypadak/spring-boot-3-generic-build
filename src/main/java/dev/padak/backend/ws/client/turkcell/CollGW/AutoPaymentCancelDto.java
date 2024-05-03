/**
 * AutoPaymentCancelDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class AutoPaymentCancelDto  implements java.io.Serializable {
    private java.lang.String cancelDate;

    private java.lang.String cancelReason;

    private long msisdn;

    public AutoPaymentCancelDto() {
    }

    public AutoPaymentCancelDto(
           java.lang.String cancelDate,
           java.lang.String cancelReason,
           long msisdn) {
           this.cancelDate = cancelDate;
           this.cancelReason = cancelReason;
           this.msisdn = msisdn;
    }


    /**
     * Gets the cancelDate value for this AutoPaymentCancelDto.
     * 
     * @return cancelDate
     */
    public java.lang.String getCancelDate() {
        return cancelDate;
    }


    /**
     * Sets the cancelDate value for this AutoPaymentCancelDto.
     * 
     * @param cancelDate
     */
    public void setCancelDate(java.lang.String cancelDate) {
        this.cancelDate = cancelDate;
    }


    /**
     * Gets the cancelReason value for this AutoPaymentCancelDto.
     * 
     * @return cancelReason
     */
    public java.lang.String getCancelReason() {
        return cancelReason;
    }


    /**
     * Sets the cancelReason value for this AutoPaymentCancelDto.
     * 
     * @param cancelReason
     */
    public void setCancelReason(java.lang.String cancelReason) {
        this.cancelReason = cancelReason;
    }


    /**
     * Gets the msisdn value for this AutoPaymentCancelDto.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AutoPaymentCancelDto.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPaymentCancelDto)) return false;
        AutoPaymentCancelDto other = (AutoPaymentCancelDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelDate==null && other.getCancelDate()==null) || 
             (this.cancelDate!=null &&
              this.cancelDate.equals(other.getCancelDate()))) &&
            ((this.cancelReason==null && other.getCancelReason()==null) || 
             (this.cancelReason!=null &&
              this.cancelReason.equals(other.getCancelReason()))) &&
            this.msisdn == other.getMsisdn();
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
        if (getCancelDate() != null) {
            _hashCode += getCancelDate().hashCode();
        }
        if (getCancelReason() != null) {
            _hashCode += getCancelReason().hashCode();
        }
        _hashCode += new Long(getMsisdn()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPaymentCancelDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "autoPaymentCancelDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
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
