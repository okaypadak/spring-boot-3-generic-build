/**
 * GenelIstekMesaj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.talimatMobil.ortak;

public class GenelIstekMesaj  implements java.io.Serializable {
    private int mesajTipi;

    private int islemKodu;

    private int stan;

    private int kurumKodu;

    private IslemYapan islemYapan;

    private int sirketKodu;

    private int paraKodu;

    private int islemKaynagi;

    private int islemTarihi;

    private int islemSaati;

    public GenelIstekMesaj() {
    }

    public GenelIstekMesaj(
           int mesajTipi,
           int islemKodu,
           int stan,
           int kurumKodu,
           IslemYapan islemYapan,
           int sirketKodu,
           int paraKodu,
           int islemKaynagi,
           int islemTarihi,
           int islemSaati) {
           this.mesajTipi = mesajTipi;
           this.islemKodu = islemKodu;
           this.stan = stan;
           this.kurumKodu = kurumKodu;
           this.islemYapan = islemYapan;
           this.sirketKodu = sirketKodu;
           this.paraKodu = paraKodu;
           this.islemKaynagi = islemKaynagi;
           this.islemTarihi = islemTarihi;
           this.islemSaati = islemSaati;
    }


    /**
     * Gets the mesajTipi value for this GenelIstekMesaj.
     * 
     * @return mesajTipi
     */
    public int getMesajTipi() {
        return mesajTipi;
    }


    /**
     * Sets the mesajTipi value for this GenelIstekMesaj.
     * 
     * @param mesajTipi
     */
    public void setMesajTipi(int mesajTipi) {
        this.mesajTipi = mesajTipi;
    }


    /**
     * Gets the islemKodu value for this GenelIstekMesaj.
     * 
     * @return islemKodu
     */
    public int getIslemKodu() {
        return islemKodu;
    }


    /**
     * Sets the islemKodu value for this GenelIstekMesaj.
     * 
     * @param islemKodu
     */
    public void setIslemKodu(int islemKodu) {
        this.islemKodu = islemKodu;
    }


    /**
     * Gets the stan value for this GenelIstekMesaj.
     * 
     * @return stan
     */
    public int getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this GenelIstekMesaj.
     * 
     * @param stan
     */
    public void setStan(int stan) {
        this.stan = stan;
    }


    /**
     * Gets the kurumKodu value for this GenelIstekMesaj.
     * 
     * @return kurumKodu
     */
    public int getKurumKodu() {
        return kurumKodu;
    }


    /**
     * Sets the kurumKodu value for this GenelIstekMesaj.
     * 
     * @param kurumKodu
     */
    public void setKurumKodu(int kurumKodu) {
        this.kurumKodu = kurumKodu;
    }


    /**
     * Gets the islemYapan value for this GenelIstekMesaj.
     * 
     * @return islemYapan
     */
    public IslemYapan getIslemYapan() {
        return islemYapan;
    }


    /**
     * Sets the islemYapan value for this GenelIstekMesaj.
     * 
     * @param islemYapan
     */
    public void setIslemYapan(IslemYapan islemYapan) {
        this.islemYapan = islemYapan;
    }


    /**
     * Gets the sirketKodu value for this GenelIstekMesaj.
     * 
     * @return sirketKodu
     */
    public int getSirketKodu() {
        return sirketKodu;
    }


    /**
     * Sets the sirketKodu value for this GenelIstekMesaj.
     * 
     * @param sirketKodu
     */
    public void setSirketKodu(int sirketKodu) {
        this.sirketKodu = sirketKodu;
    }


    /**
     * Gets the paraKodu value for this GenelIstekMesaj.
     * 
     * @return paraKodu
     */
    public int getParaKodu() {
        return paraKodu;
    }


    /**
     * Sets the paraKodu value for this GenelIstekMesaj.
     * 
     * @param paraKodu
     */
    public void setParaKodu(int paraKodu) {
        this.paraKodu = paraKodu;
    }


    /**
     * Gets the islemKaynagi value for this GenelIstekMesaj.
     * 
     * @return islemKaynagi
     */
    public int getIslemKaynagi() {
        return islemKaynagi;
    }


    /**
     * Sets the islemKaynagi value for this GenelIstekMesaj.
     * 
     * @param islemKaynagi
     */
    public void setIslemKaynagi(int islemKaynagi) {
        this.islemKaynagi = islemKaynagi;
    }


    /**
     * Gets the islemTarihi value for this GenelIstekMesaj.
     * 
     * @return islemTarihi
     */
    public int getIslemTarihi() {
        return islemTarihi;
    }


    /**
     * Sets the islemTarihi value for this GenelIstekMesaj.
     * 
     * @param islemTarihi
     */
    public void setIslemTarihi(int islemTarihi) {
        this.islemTarihi = islemTarihi;
    }


    /**
     * Gets the islemSaati value for this GenelIstekMesaj.
     * 
     * @return islemSaati
     */
    public int getIslemSaati() {
        return islemSaati;
    }


    /**
     * Sets the islemSaati value for this GenelIstekMesaj.
     * 
     * @param islemSaati
     */
    public void setIslemSaati(int islemSaati) {
        this.islemSaati = islemSaati;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GenelIstekMesaj)) return false;
        GenelIstekMesaj other = (GenelIstekMesaj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mesajTipi == other.getMesajTipi() &&
            this.islemKodu == other.getIslemKodu() &&
            this.stan == other.getStan() &&
            this.kurumKodu == other.getKurumKodu() &&
            ((this.islemYapan==null && other.getIslemYapan()==null) || 
             (this.islemYapan!=null &&
              this.islemYapan.equals(other.getIslemYapan()))) &&
            this.sirketKodu == other.getSirketKodu() &&
            this.paraKodu == other.getParaKodu() &&
            this.islemKaynagi == other.getIslemKaynagi() &&
            this.islemTarihi == other.getIslemTarihi() &&
            this.islemSaati == other.getIslemSaati();
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
        _hashCode += getMesajTipi();
        _hashCode += getIslemKodu();
        _hashCode += getStan();
        _hashCode += getKurumKodu();
        if (getIslemYapan() != null) {
            _hashCode += getIslemYapan().hashCode();
        }
        _hashCode += getSirketKodu();
        _hashCode += getParaKodu();
        _hashCode += getIslemKaynagi();
        _hashCode += getIslemTarihi();
        _hashCode += getIslemSaati();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenelIstekMesaj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "GenelIstekMesaj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesajTipi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesajTipi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islemKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kurumKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kurumKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemYapan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islemYapan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "IslemYapan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sirketKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sirketKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paraKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paraKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemKaynagi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islemKaynagi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemTarihi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islemTarihi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemSaati");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islemSaati"));
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
