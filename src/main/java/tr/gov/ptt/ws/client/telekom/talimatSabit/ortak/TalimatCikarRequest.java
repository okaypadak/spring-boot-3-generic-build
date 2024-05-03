/**
 * TalimatCikarRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatSabit.ortak;

public class TalimatCikarRequest  extends GenelIstekMesaj implements java.io.Serializable {
    private long hesapId;

    private int islemKabulTarihi;

    private Long talimatKanalKurumKodu;

    public TalimatCikarRequest() {
    }

    public TalimatCikarRequest(
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
           long hesapId,
           int islemKabulTarihi,
           Long talimatKanalKurumKodu) {
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
        this.hesapId = hesapId;
        this.islemKabulTarihi = islemKabulTarihi;
        this.talimatKanalKurumKodu = talimatKanalKurumKodu;
    }


    /**
     * Gets the hesapId value for this TalimatCikarRequest.
     * 
     * @return hesapId
     */
    public long getHesapId() {
        return hesapId;
    }


    /**
     * Sets the hesapId value for this TalimatCikarRequest.
     * 
     * @param hesapId
     */
    public void setHesapId(long hesapId) {
        this.hesapId = hesapId;
    }


    /**
     * Gets the islemKabulTarihi value for this TalimatCikarRequest.
     * 
     * @return islemKabulTarihi
     */
    public int getIslemKabulTarihi() {
        return islemKabulTarihi;
    }


    /**
     * Sets the islemKabulTarihi value for this TalimatCikarRequest.
     * 
     * @param islemKabulTarihi
     */
    public void setIslemKabulTarihi(int islemKabulTarihi) {
        this.islemKabulTarihi = islemKabulTarihi;
    }


    /**
     * Gets the talimatKanalKurumKodu value for this TalimatCikarRequest.
     * 
     * @return talimatKanalKurumKodu
     */
    public Long getTalimatKanalKurumKodu() {
        return talimatKanalKurumKodu;
    }


    /**
     * Sets the talimatKanalKurumKodu value for this TalimatCikarRequest.
     * 
     * @param talimatKanalKurumKodu
     */
    public void setTalimatKanalKurumKodu(Long talimatKanalKurumKodu) {
        this.talimatKanalKurumKodu = talimatKanalKurumKodu;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TalimatCikarRequest)) return false;
        TalimatCikarRequest other = (TalimatCikarRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.hesapId == other.getHesapId() &&
            this.islemKabulTarihi == other.getIslemKabulTarihi() &&
            ((this.talimatKanalKurumKodu==null && other.getTalimatKanalKurumKodu()==null) || 
             (this.talimatKanalKurumKodu!=null &&
              this.talimatKanalKurumKodu.equals(other.getTalimatKanalKurumKodu())));
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
        _hashCode += new Long(getHesapId()).hashCode();
        _hashCode += getIslemKabulTarihi();
        if (getTalimatKanalKurumKodu() != null) {
            _hashCode += getTalimatKanalKurumKodu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TalimatCikarRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatCikarRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hesapId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "hesapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemKabulTarihi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "islemKabulTarihi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talimatKanalKurumKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatKanalKurumKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
