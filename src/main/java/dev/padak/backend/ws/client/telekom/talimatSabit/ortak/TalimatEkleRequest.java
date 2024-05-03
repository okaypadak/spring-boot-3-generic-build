/**
 * TalimatEkleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.talimatSabit.ortak;

public class TalimatEkleRequest  extends GenelIstekMesaj implements java.io.Serializable {
    private long hesapId;

    private Integer talimatKanalKurumKodu;

    private int islemKabulTarihi;

    private Long talimatTipi;

    private AnahtarDegerCifti[] esnekAlanDizi;

    //private KrediKartiBilgi krediKartiBilgi;

    public TalimatEkleRequest() {
    }

    public TalimatEkleRequest(
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
           Integer talimatKanalKurumKodu,
           int islemKabulTarihi,
           Long talimatTipi,
           AnahtarDegerCifti[] esnekAlanDizi,
           KrediKartiBilgi krediKartiBilgi) {
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
        this.talimatKanalKurumKodu = talimatKanalKurumKodu;
        this.islemKabulTarihi = islemKabulTarihi;
        this.talimatTipi = talimatTipi;
        this.esnekAlanDizi = esnekAlanDizi;
        //this.krediKartiBilgi = krediKartiBilgi;
    }


    /**
     * Gets the hesapId value for this TalimatEkleRequest.
     * 
     * @return hesapId
     */
    public long getHesapId() {
        return hesapId;
    }


    /**
     * Sets the hesapId value for this TalimatEkleRequest.
     * 
     * @param hesapId
     */
    public void setHesapId(long hesapId) {
        this.hesapId = hesapId;
    }


    /**
     * Gets the talimatKanalKurumKodu value for this TalimatEkleRequest.
     * 
     * @return talimatKanalKurumKodu
     */
    public Integer getTalimatKanalKurumKodu() {
        return talimatKanalKurumKodu;
    }


    /**
     * Sets the talimatKanalKurumKodu value for this TalimatEkleRequest.
     * 
     * @param talimatKanalKurumKodu
     */
    public void setTalimatKanalKurumKodu(Integer talimatKanalKurumKodu) {
        this.talimatKanalKurumKodu = talimatKanalKurumKodu;
    }


    /**
     * Gets the islemKabulTarihi value for this TalimatEkleRequest.
     * 
     * @return islemKabulTarihi
     */
    public int getIslemKabulTarihi() {
        return islemKabulTarihi;
    }


    /**
     * Sets the islemKabulTarihi value for this TalimatEkleRequest.
     * 
     * @param islemKabulTarihi
     */
    public void setIslemKabulTarihi(int islemKabulTarihi) {
        this.islemKabulTarihi = islemKabulTarihi;
    }


    /**
     * Gets the talimatTipi value for this TalimatEkleRequest.
     * 
     * @return talimatTipi
     */
    public Long getTalimatTipi() {
        return talimatTipi;
    }


    /**
     * Sets the talimatTipi value for this TalimatEkleRequest.
     * 
     * @param talimatTipi
     */
    public void setTalimatTipi(Long talimatTipi) {
        this.talimatTipi = talimatTipi;
    }


    /**
     * Gets the esnekAlanDizi value for this TalimatEkleRequest.
     * 
     * @return esnekAlanDizi
     */
    public AnahtarDegerCifti[] getEsnekAlanDizi() {
        return esnekAlanDizi;
    }


    /**
     * Sets the esnekAlanDizi value for this TalimatEkleRequest.
     * 
     * @param esnekAlanDizi
     */
    public void setEsnekAlanDizi(AnahtarDegerCifti[] esnekAlanDizi) {
        this.esnekAlanDizi = esnekAlanDizi;
    }


    /**
     * Gets the krediKartiBilgi value for this TalimatEkleRequest.
     * 
     * @return krediKartiBilgi
     */
//    public KrediKartiBilgi getKrediKartiBilgi() {
//        return krediKartiBilgi;
//    }


    /**
     * Sets the krediKartiBilgi value for this TalimatEkleRequest.
     * 
     * @param krediKartiBilgi
     */
//    public void setKrediKartiBilgi(KrediKartiBilgi krediKartiBilgi) {
//        this.krediKartiBilgi = krediKartiBilgi;
//    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TalimatEkleRequest)) return false;
        TalimatEkleRequest other = (TalimatEkleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.hesapId == other.getHesapId() &&
            ((this.talimatKanalKurumKodu==null && other.getTalimatKanalKurumKodu()==null) || 
             (this.talimatKanalKurumKodu!=null &&
              this.talimatKanalKurumKodu.equals(other.getTalimatKanalKurumKodu()))) &&
            this.islemKabulTarihi == other.getIslemKabulTarihi() &&
            ((this.talimatTipi==null && other.getTalimatTipi()==null) || 
             (this.talimatTipi!=null &&
              this.talimatTipi.equals(other.getTalimatTipi()))) &&
            ((this.esnekAlanDizi==null && other.getEsnekAlanDizi()==null) || 
             (this.esnekAlanDizi!=null));
//                     &&
//              java.util.Arrays.equals(this.esnekAlanDizi, other.getEsnekAlanDizi()))) &&
//            ((this.krediKartiBilgi==null && other.getKrediKartiBilgi()==null) ||
//             (this.krediKartiBilgi!=null &&
//              this.krediKartiBilgi.equals(other.getKrediKartiBilgi())));
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
        if (getTalimatKanalKurumKodu() != null) {
            _hashCode += getTalimatKanalKurumKodu().hashCode();
        }
        _hashCode += getIslemKabulTarihi();
        if (getTalimatTipi() != null) {
            _hashCode += getTalimatTipi().hashCode();
        }
        if (getEsnekAlanDizi() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEsnekAlanDizi());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEsnekAlanDizi(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
//        if (getKrediKartiBilgi() != null) {
//            _hashCode += getKrediKartiBilgi().hashCode();
//        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TalimatEkleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatEkleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hesapId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "hesapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talimatKanalKurumKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatKanalKurumKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islemKabulTarihi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "islemKabulTarihi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talimatTipi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatTipi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esnekAlanDizi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "esnekAlanDizi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "AnahtarDegerCifti"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "anahtarDegerCifti"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("krediKartiBilgi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "krediKartiBilgi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "KrediKartiBilgi"));
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
