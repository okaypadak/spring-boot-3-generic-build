/**
 * ErisimBilgi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.talimatSabit.ortak;

public class ErisimBilgi  implements java.io.Serializable {
    private int erisimTipi;

    private String erisimNo;

    public ErisimBilgi() {
    }

    public ErisimBilgi(
           int erisimTipi,
           String erisimNo) {
           this.erisimTipi = erisimTipi;
           this.erisimNo = erisimNo;
    }


    /**
     * Gets the erisimTipi value for this ErisimBilgi.
     * 
     * @return erisimTipi
     */
    public int getErisimTipi() {
        return erisimTipi;
    }


    /**
     * Sets the erisimTipi value for this ErisimBilgi.
     * 
     * @param erisimTipi
     */
    public void setErisimTipi(int erisimTipi) {
        this.erisimTipi = erisimTipi;
    }


    /**
     * Gets the erisimNo value for this ErisimBilgi.
     * 
     * @return erisimNo
     */
    public String getErisimNo() {
        return erisimNo;
    }


    /**
     * Sets the erisimNo value for this ErisimBilgi.
     * 
     * @param erisimNo
     */
    public void setErisimNo(String erisimNo) {
        this.erisimNo = erisimNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ErisimBilgi)) return false;
        ErisimBilgi other = (ErisimBilgi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.erisimTipi == other.getErisimTipi() &&
            ((this.erisimNo==null && other.getErisimNo()==null) || 
             (this.erisimNo!=null &&
              this.erisimNo.equals(other.getErisimNo())));
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
        _hashCode += getErisimTipi();
        if (getErisimNo() != null) {
            _hashCode += getErisimNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErisimBilgi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "ErisimBilgi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erisimTipi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "erisimTipi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erisimNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "erisimNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
