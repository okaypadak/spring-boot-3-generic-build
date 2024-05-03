/**
 * OzetCevapMesaj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.mutabakat.model.ortak;

public class OzetCevapMesaj  implements java.io.Serializable {
    private String hataMesaji;

    private String islemSonucKodu;

    public OzetCevapMesaj() {
    }

    public OzetCevapMesaj(
           String hataMesaji,
           String islemSonucKodu) {
           this.hataMesaji = hataMesaji;
           this.islemSonucKodu = islemSonucKodu;
    }


    /**
     * Gets the hataMesaji value for this OzetCevapMesaj.
     * 
     * @return hataMesaji
     */
    public String getHataMesaji() {
        return hataMesaji;
    }


    /**
     * Sets the hataMesaji value for this OzetCevapMesaj.
     * 
     * @param hataMesaji
     */
    public void setHataMesaji(String hataMesaji) {
        this.hataMesaji = hataMesaji;
    }


    /**
     * Gets the islemSonucKodu value for this OzetCevapMesaj.
     * 
     * @return islemSonucKodu
     */
    public String getIslemSonucKodu() {
        return islemSonucKodu;
    }


    /**
     * Sets the islemSonucKodu value for this OzetCevapMesaj.
     * 
     * @param islemSonucKodu
     */
    public void setIslemSonucKodu(String islemSonucKodu) {
        this.islemSonucKodu = islemSonucKodu;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OzetCevapMesaj)) return false;
        OzetCevapMesaj other = (OzetCevapMesaj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hataMesaji==null && other.getHataMesaji()==null) || 
             (this.hataMesaji!=null &&
              this.hataMesaji.equals(other.getHataMesaji()))) &&
            ((this.islemSonucKodu==null && other.getIslemSonucKodu()==null) || 
             (this.islemSonucKodu!=null &&
              this.islemSonucKodu.equals(other.getIslemSonucKodu())));
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
        if (getHataMesaji() != null) {
            _hashCode += getHataMesaji().hashCode();
        }
        if (getIslemSonucKodu() != null) {
            _hashCode += getIslemSonucKodu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OzetCevapMesaj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "OzetCevapMesaj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hataMesaji");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "hataMesaji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemSonucKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "islemSonucKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
