/**
 * MutabakatRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat;

import dev.padak.backend.ws.client.telekom.mutabakat.model.ortak.GenelIstekMesaj;
import dev.padak.backend.ws.client.telekom.mutabakat.model.ortak.IslemYapan;

public class MutabakatRequest extends GenelIstekMesaj implements java.io.Serializable {
    private int mutabakatTipi;

    private MutabakatBilgi[] mutabakatBilgiDizi;

    private int mutabakatIslemSayisi;

    private int mutabakatTarihi;

    public MutabakatRequest() {
    }

    public MutabakatRequest(
           int mesajTipi,
           int islemKodu,
           int stan,
           int kurumKodu,
           IslemYapan islemYapan,
           int sirketKodu,
           int paraKodu,
           int islemKaynagi,
           int islemTarihi,
           int islemSaati,
           int mutabakatTipi,
           MutabakatBilgi[] mutabakatBilgiDizi,
           int mutabakatIslemSayisi,
           int mutabakatTarihi) {
        super(
            mesajTipi,
            islemKodu,
            stan,
            kurumKodu,
            islemYapan,
            sirketKodu,
            paraKodu,
            islemKaynagi,
            islemTarihi,
            islemSaati);
        this.mutabakatTipi = mutabakatTipi;
        this.mutabakatBilgiDizi = mutabakatBilgiDizi;
        this.mutabakatIslemSayisi = mutabakatIslemSayisi;
        this.mutabakatTarihi = mutabakatTarihi;
    }


    /**
     * Gets the mutabakatTipi value for this MutabakatRequest.
     * 
     * @return mutabakatTipi
     */
    public int getMutabakatTipi() {
        return mutabakatTipi;
    }


    /**
     * Sets the mutabakatTipi value for this MutabakatRequest.
     * 
     * @param mutabakatTipi
     */
    public void setMutabakatTipi(int mutabakatTipi) {
        this.mutabakatTipi = mutabakatTipi;
    }


    /**
     * Gets the mutabakatBilgiDizi value for this MutabakatRequest.
     * 
     * @return mutabakatBilgiDizi
     */
    public MutabakatBilgi[] getMutabakatBilgiDizi() {
        return mutabakatBilgiDizi;
    }


    /**
     * Sets the mutabakatBilgiDizi value for this MutabakatRequest.
     * 
     * @param mutabakatBilgiDizi
     */
    public void setMutabakatBilgiDizi(MutabakatBilgi[] mutabakatBilgiDizi) {
        this.mutabakatBilgiDizi = mutabakatBilgiDizi;
    }


    /**
     * Gets the mutabakatIslemSayisi value for this MutabakatRequest.
     * 
     * @return mutabakatIslemSayisi
     */
    public int getMutabakatIslemSayisi() {
        return mutabakatIslemSayisi;
    }


    /**
     * Sets the mutabakatIslemSayisi value for this MutabakatRequest.
     * 
     * @param mutabakatIslemSayisi
     */
    public void setMutabakatIslemSayisi(int mutabakatIslemSayisi) {
        this.mutabakatIslemSayisi = mutabakatIslemSayisi;
    }


    /**
     * Gets the mutabakatTarihi value for this MutabakatRequest.
     * 
     * @return mutabakatTarihi
     */
    public int getMutabakatTarihi() {
        return mutabakatTarihi;
    }


    /**
     * Sets the mutabakatTarihi value for this MutabakatRequest.
     * 
     * @param mutabakatTarihi
     */
    public void setMutabakatTarihi(int mutabakatTarihi) {
        this.mutabakatTarihi = mutabakatTarihi;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MutabakatRequest)) return false;
        MutabakatRequest other = (MutabakatRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.mutabakatTipi == other.getMutabakatTipi() &&
            ((this.mutabakatBilgiDizi==null && other.getMutabakatBilgiDizi()==null) || 
             (this.mutabakatBilgiDizi!=null &&
              java.util.Arrays.equals(this.mutabakatBilgiDizi, other.getMutabakatBilgiDizi()))) &&
            this.mutabakatIslemSayisi == other.getMutabakatIslemSayisi() &&
            this.mutabakatTarihi == other.getMutabakatTarihi();
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
        _hashCode += getMutabakatTipi();
        if (getMutabakatBilgiDizi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMutabakatBilgiDizi());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMutabakatBilgiDizi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMutabakatIslemSayisi();
        _hashCode += getMutabakatTarihi();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MutabakatRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", ">MutabakatRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutabakatTipi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "mutabakatTipi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutabakatBilgiDizi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "mutabakatBilgiDizi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "MutabakatBilgi"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "mutabakatBilgiDizi"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutabakatIslemSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "mutabakatIslemSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutabakatTarihi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "mutabakatTarihi"));
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
