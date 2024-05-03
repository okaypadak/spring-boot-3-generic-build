/**
 * TalimatBilgiSorgulamaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatMobil.ortak;

public class TalimatBilgiSorgulamaResponse  extends GenelCevapMesaj implements java.io.Serializable {
    private TalimatHesap[] talimatHesapDizi;

    public TalimatBilgiSorgulamaResponse() {
    }

    public TalimatBilgiSorgulamaResponse(
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
           OzetCevapMesaj ozetCevapMesaj,
           TalimatHesap[] talimatHesapDizi) {
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
            islemSaati,
            ozetCevapMesaj);
        this.talimatHesapDizi = talimatHesapDizi;
    }


    /**
     * Gets the talimatHesapDizi value for this TalimatBilgiSorgulamaResponse.
     * 
     * @return talimatHesapDizi
     */
    public TalimatHesap[] getTalimatHesapDizi() {
        return talimatHesapDizi;
    }


    /**
     * Sets the talimatHesapDizi value for this TalimatBilgiSorgulamaResponse.
     * 
     * @param talimatHesapDizi
     */
    public void setTalimatHesapDizi(TalimatHesap[] talimatHesapDizi) {
        this.talimatHesapDizi = talimatHesapDizi;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TalimatBilgiSorgulamaResponse)) return false;
        TalimatBilgiSorgulamaResponse other = (TalimatBilgiSorgulamaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.talimatHesapDizi==null && other.getTalimatHesapDizi()==null) || 
             (this.talimatHesapDizi!=null &&
              java.util.Arrays.equals(this.talimatHesapDizi, other.getTalimatHesapDizi())));
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
        if (getTalimatHesapDizi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTalimatHesapDizi());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTalimatHesapDizi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TalimatBilgiSorgulamaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatBilgiSorgulamaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talimatHesapDizi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatHesapDizi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatHesap"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatHesap"));
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
