/**
 * MutabakatBilgi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat;

public class MutabakatBilgi  implements java.io.Serializable {
    private int islemKodu;

    private int mutabakatDurumu;

    private int toplamIslemSayisi;

    private long toplamIslemTutari;

    public MutabakatBilgi() {
    }

    public MutabakatBilgi(
           int islemKodu,
           int mutabakatDurumu,
           int toplamIslemSayisi,
           long toplamIslemTutari) {
           this.islemKodu = islemKodu;
           this.mutabakatDurumu = mutabakatDurumu;
           this.toplamIslemSayisi = toplamIslemSayisi;
           this.toplamIslemTutari = toplamIslemTutari;
    }


    /**
     * Gets the islemKodu value for this MutabakatBilgi.
     * 
     * @return islemKodu
     */
    public int getIslemKodu() {
        return islemKodu;
    }


    /**
     * Sets the islemKodu value for this MutabakatBilgi.
     * 
     * @param islemKodu
     */
    public void setIslemKodu(int islemKodu) {
        this.islemKodu = islemKodu;
    }


    /**
     * Gets the mutabakatDurumu value for this MutabakatBilgi.
     * 
     * @return mutabakatDurumu
     */
    public int getMutabakatDurumu() {
        return mutabakatDurumu;
    }


    /**
     * Sets the mutabakatDurumu value for this MutabakatBilgi.
     * 
     * @param mutabakatDurumu
     */
    public void setMutabakatDurumu(int mutabakatDurumu) {
        this.mutabakatDurumu = mutabakatDurumu;
    }


    /**
     * Gets the toplamIslemSayisi value for this MutabakatBilgi.
     * 
     * @return toplamIslemSayisi
     */
    public int getToplamIslemSayisi() {
        return toplamIslemSayisi;
    }


    /**
     * Sets the toplamIslemSayisi value for this MutabakatBilgi.
     * 
     * @param toplamIslemSayisi
     */
    public void setToplamIslemSayisi(int toplamIslemSayisi) {
        this.toplamIslemSayisi = toplamIslemSayisi;
    }


    /**
     * Gets the toplamIslemTutari value for this MutabakatBilgi.
     * 
     * @return toplamIslemTutari
     */
    public long getToplamIslemTutari() {
        return toplamIslemTutari;
    }


    /**
     * Sets the toplamIslemTutari value for this MutabakatBilgi.
     * 
     * @param toplamIslemTutari
     */
    public void setToplamIslemTutari(long toplamIslemTutari) {
        this.toplamIslemTutari = toplamIslemTutari;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MutabakatBilgi)) return false;
        MutabakatBilgi other = (MutabakatBilgi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.islemKodu == other.getIslemKodu() &&
            this.mutabakatDurumu == other.getMutabakatDurumu() &&
            this.toplamIslemSayisi == other.getToplamIslemSayisi() &&
            this.toplamIslemTutari == other.getToplamIslemTutari();
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
        _hashCode += getIslemKodu();
        _hashCode += getMutabakatDurumu();
        _hashCode += getToplamIslemSayisi();
        _hashCode += new Long(getToplamIslemTutari()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MutabakatBilgi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "MutabakatBilgi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "islemKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutabakatDurumu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "mutabakatDurumu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toplamIslemSayisi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "toplamIslemSayisi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toplamIslemTutari");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mutabakat.model.server.webservice.business.tts.innova.com.tr", "toplamIslemTutari"));
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
