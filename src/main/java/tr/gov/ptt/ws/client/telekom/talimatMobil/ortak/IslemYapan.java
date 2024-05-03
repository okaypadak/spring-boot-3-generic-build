/**
 * IslemYapan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatMobil.ortak;

public class IslemYapan  implements java.io.Serializable {
    private int sehirKodu;

    private String subeKodu;

    private String giseKodu;

    private String kullaniciKodu;

    public IslemYapan() {
    }

    public IslemYapan(
           int sehirKodu,
           String subeKodu,
           String giseKodu,
           String kullaniciKodu) {
           this.sehirKodu = sehirKodu;
           this.subeKodu = subeKodu;
           this.giseKodu = giseKodu;
           this.kullaniciKodu = kullaniciKodu;
    }


    /**
     * Gets the sehirKodu value for this IslemYapan.
     * 
     * @return sehirKodu
     */
    public int getSehirKodu() {
        return sehirKodu;
    }


    /**
     * Sets the sehirKodu value for this IslemYapan.
     * 
     * @param sehirKodu
     */
    public void setSehirKodu(int sehirKodu) {
        this.sehirKodu = sehirKodu;
    }


    /**
     * Gets the subeKodu value for this IslemYapan.
     * 
     * @return subeKodu
     */
    public String getSubeKodu() {
        return subeKodu;
    }


    /**
     * Sets the subeKodu value for this IslemYapan.
     * 
     * @param subeKodu
     */
    public void setSubeKodu(String subeKodu) {
        this.subeKodu = subeKodu;
    }


    /**
     * Gets the giseKodu value for this IslemYapan.
     * 
     * @return giseKodu
     */
    public String getGiseKodu() {
        return giseKodu;
    }


    /**
     * Sets the giseKodu value for this IslemYapan.
     * 
     * @param giseKodu
     */
    public void setGiseKodu(String giseKodu) {
        this.giseKodu = giseKodu;
    }


    /**
     * Gets the kullaniciKodu value for this IslemYapan.
     * 
     * @return kullaniciKodu
     */
    public String getKullaniciKodu() {
        return kullaniciKodu;
    }


    /**
     * Sets the kullaniciKodu value for this IslemYapan.
     * 
     * @param kullaniciKodu
     */
    public void setKullaniciKodu(String kullaniciKodu) {
        this.kullaniciKodu = kullaniciKodu;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof IslemYapan)) return false;
        IslemYapan other = (IslemYapan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sehirKodu == other.getSehirKodu() &&
            ((this.subeKodu==null && other.getSubeKodu()==null) || 
             (this.subeKodu!=null &&
              this.subeKodu.equals(other.getSubeKodu()))) &&
            ((this.giseKodu==null && other.getGiseKodu()==null) || 
             (this.giseKodu!=null &&
              this.giseKodu.equals(other.getGiseKodu()))) &&
            ((this.kullaniciKodu==null && other.getKullaniciKodu()==null) || 
             (this.kullaniciKodu!=null &&
              this.kullaniciKodu.equals(other.getKullaniciKodu())));
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
        _hashCode += getSehirKodu();
        if (getSubeKodu() != null) {
            _hashCode += getSubeKodu().hashCode();
        }
        if (getGiseKodu() != null) {
            _hashCode += getGiseKodu().hashCode();
        }
        if (getKullaniciKodu() != null) {
            _hashCode += getKullaniciKodu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IslemYapan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "IslemYapan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sehirKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sehirKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subeKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subeKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giseKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "giseKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kullaniciKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kullaniciKodu"));
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
