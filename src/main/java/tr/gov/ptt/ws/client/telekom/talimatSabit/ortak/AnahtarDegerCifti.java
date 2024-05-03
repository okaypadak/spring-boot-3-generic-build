/**
 * AnahtarDegerCifti.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatSabit.ortak;

public class AnahtarDegerCifti  implements java.io.Serializable {
    private String anahtar;

    private String deger;

    public AnahtarDegerCifti() {
    }

    public AnahtarDegerCifti(
           String anahtar,
           String deger) {
           this.anahtar = anahtar;
           this.deger = deger;
    }


    /**
     * Gets the anahtar value for this AnahtarDegerCifti.
     * 
     * @return anahtar
     */
    public String getAnahtar() {
        return anahtar;
    }


    /**
     * Sets the anahtar value for this AnahtarDegerCifti.
     * 
     * @param anahtar
     */
    public void setAnahtar(String anahtar) {
        this.anahtar = anahtar;
    }


    /**
     * Gets the deger value for this AnahtarDegerCifti.
     * 
     * @return deger
     */
    public String getDeger() {
        return deger;
    }


    /**
     * Sets the deger value for this AnahtarDegerCifti.
     * 
     * @param deger
     */
    public void setDeger(String deger) {
        this.deger = deger;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AnahtarDegerCifti)) return false;
        AnahtarDegerCifti other = (AnahtarDegerCifti) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anahtar==null && other.getAnahtar()==null) || 
             (this.anahtar!=null &&
              this.anahtar.equals(other.getAnahtar()))) &&
            ((this.deger==null && other.getDeger()==null) || 
             (this.deger!=null &&
              this.deger.equals(other.getDeger())));
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
        if (getAnahtar() != null) {
            _hashCode += getAnahtar().hashCode();
        }
        if (getDeger() != null) {
            _hashCode += getDeger().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnahtarDegerCifti.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "AnahtarDegerCifti"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anahtar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anahtar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deger"));
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
