/**
 * GenelCevapMesaj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.mutabakat.model.ortak;

public class GenelCevapMesaj  extends GenelIstekMesaj  implements java.io.Serializable {
    private OzetCevapMesaj ozetCevapMesaj;

    public GenelCevapMesaj() {
    }

    public GenelCevapMesaj(
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
           OzetCevapMesaj ozetCevapMesaj) {
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
        this.ozetCevapMesaj = ozetCevapMesaj;
    }


    /**
     * Gets the ozetCevapMesaj value for this GenelCevapMesaj.
     * 
     * @return ozetCevapMesaj
     */
    public OzetCevapMesaj getOzetCevapMesaj() {
        return ozetCevapMesaj;
    }


    /**
     * Sets the ozetCevapMesaj value for this GenelCevapMesaj.
     * 
     * @param ozetCevapMesaj
     */
    public void setOzetCevapMesaj(OzetCevapMesaj ozetCevapMesaj) {
        this.ozetCevapMesaj = ozetCevapMesaj;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GenelCevapMesaj)) return false;
        GenelCevapMesaj other = (GenelCevapMesaj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ozetCevapMesaj==null && other.getOzetCevapMesaj()==null) || 
             (this.ozetCevapMesaj!=null &&
              this.ozetCevapMesaj.equals(other.getOzetCevapMesaj())));
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
        if (getOzetCevapMesaj() != null) {
            _hashCode += getOzetCevapMesaj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenelCevapMesaj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "GenelCevapMesaj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ozetCevapMesaj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "ozetCevapMesaj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "OzetCevapMesaj"));
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
