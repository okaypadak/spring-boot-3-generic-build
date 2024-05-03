/**
 * TalimatHesap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.telekom.talimatSabit.ortak;

public class TalimatHesap  implements java.io.Serializable {
    private String hesapNo;

    private long hesapId;

    private String adsoyadUnvan;

    private int bankaKodu;

    private String talimatCevapKodu;

    private AnahtarDegerCifti[] esnekAlanDizi;

    public TalimatHesap() {
    }

    public TalimatHesap(
           String hesapNo,
           long hesapId,
           String adsoyadUnvan,
           int bankaKodu,
           String talimatCevapKodu,
           AnahtarDegerCifti[] esnekAlanDizi) {
           this.hesapNo = hesapNo;
           this.hesapId = hesapId;
           this.adsoyadUnvan = adsoyadUnvan;
           this.bankaKodu = bankaKodu;
           this.talimatCevapKodu = talimatCevapKodu;
           this.esnekAlanDizi = esnekAlanDizi;
    }


    /**
     * Gets the hesapNo value for this TalimatHesap.
     * 
     * @return hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }


    /**
     * Sets the hesapNo value for this TalimatHesap.
     * 
     * @param hesapNo
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }


    /**
     * Gets the hesapId value for this TalimatHesap.
     * 
     * @return hesapId
     */
    public long getHesapId() {
        return hesapId;
    }


    /**
     * Sets the hesapId value for this TalimatHesap.
     * 
     * @param hesapId
     */
    public void setHesapId(long hesapId) {
        this.hesapId = hesapId;
    }


    /**
     * Gets the adsoyadUnvan value for this TalimatHesap.
     * 
     * @return adsoyadUnvan
     */
    public String getAdsoyadUnvan() {
        return adsoyadUnvan;
    }


    /**
     * Sets the adsoyadUnvan value for this TalimatHesap.
     * 
     * @param adsoyadUnvan
     */
    public void setAdsoyadUnvan(String adsoyadUnvan) {
        this.adsoyadUnvan = adsoyadUnvan;
    }


    /**
     * Gets the bankaKodu value for this TalimatHesap.
     * 
     * @return bankaKodu
     */
    public int getBankaKodu() {
        return bankaKodu;
    }


    /**
     * Sets the bankaKodu value for this TalimatHesap.
     * 
     * @param bankaKodu
     */
    public void setBankaKodu(int bankaKodu) {
        this.bankaKodu = bankaKodu;
    }


    /**
     * Gets the talimatCevapKodu value for this TalimatHesap.
     * 
     * @return talimatCevapKodu
     */
    public String getTalimatCevapKodu() {
        return talimatCevapKodu;
    }


    /**
     * Sets the talimatCevapKodu value for this TalimatHesap.
     * 
     * @param talimatCevapKodu
     */
    public void setTalimatCevapKodu(String talimatCevapKodu) {
        this.talimatCevapKodu = talimatCevapKodu;
    }


    /**
     * Gets the esnekAlanDizi value for this TalimatHesap.
     * 
     * @return esnekAlanDizi
     */
    public AnahtarDegerCifti[] getEsnekAlanDizi() {
        return esnekAlanDizi;
    }


    /**
     * Sets the esnekAlanDizi value for this TalimatHesap.
     * 
     * @param esnekAlanDizi
     */
    public void setEsnekAlanDizi(AnahtarDegerCifti[] esnekAlanDizi) {
        this.esnekAlanDizi = esnekAlanDizi;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TalimatHesap)) return false;
        TalimatHesap other = (TalimatHesap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hesapNo==null && other.getHesapNo()==null) || 
             (this.hesapNo!=null &&
              this.hesapNo.equals(other.getHesapNo()))) &&
            this.hesapId == other.getHesapId() &&
            ((this.adsoyadUnvan==null && other.getAdsoyadUnvan()==null) || 
             (this.adsoyadUnvan!=null &&
              this.adsoyadUnvan.equals(other.getAdsoyadUnvan()))) &&
            this.bankaKodu == other.getBankaKodu() &&
            ((this.talimatCevapKodu==null && other.getTalimatCevapKodu()==null) || 
             (this.talimatCevapKodu!=null &&
              this.talimatCevapKodu.equals(other.getTalimatCevapKodu()))) &&
            ((this.esnekAlanDizi==null && other.getEsnekAlanDizi()==null) || 
             (this.esnekAlanDizi!=null &&
              java.util.Arrays.equals(this.esnekAlanDizi, other.getEsnekAlanDizi())));
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
        if (getHesapNo() != null) {
            _hashCode += getHesapNo().hashCode();
        }
        _hashCode += new Long(getHesapId()).hashCode();
        if (getAdsoyadUnvan() != null) {
            _hashCode += getAdsoyadUnvan().hashCode();
        }
        _hashCode += getBankaKodu();
        if (getTalimatCevapKodu() != null) {
            _hashCode += getTalimatCevapKodu().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TalimatHesap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "TalimatHesap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hesapNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "hesapNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hesapId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "hesapId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adsoyadUnvan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "adsoyadUnvan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankaKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "bankaKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talimatCevapKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatCevapKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esnekAlanDizi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "esnekAlanDizi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ortak.model.server.webservice.business.tts.innova.com.tr", "AnahtarDegerCifti"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "anahtarDegerCifti"));
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
