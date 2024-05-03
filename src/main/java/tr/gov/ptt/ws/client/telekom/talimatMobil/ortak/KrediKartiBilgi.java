/**
 * KrediKartiBilgi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatMobil.ortak;

public class KrediKartiBilgi  implements java.io.Serializable {
    private String ovposId;

    private Long kartBankaKodu;

    private Long sonKullanmaTarihi;

    private String kartNo;

    public KrediKartiBilgi() {
    }

    public KrediKartiBilgi(
           String ovposId,
           Long kartBankaKodu,
           Long sonKullanmaTarihi,
           String kartNo) {
           this.ovposId = ovposId;
           this.kartBankaKodu = kartBankaKodu;
           this.sonKullanmaTarihi = sonKullanmaTarihi;
           this.kartNo = kartNo;
    }


    /**
     * Gets the ovposId value for this KrediKartiBilgi.
     * 
     * @return ovposId
     */
    public String getOvposId() {
        return ovposId;
    }


    /**
     * Sets the ovposId value for this KrediKartiBilgi.
     * 
     * @param ovposId
     */
    public void setOvposId(String ovposId) {
        this.ovposId = ovposId;
    }


    /**
     * Gets the kartBankaKodu value for this KrediKartiBilgi.
     * 
     * @return kartBankaKodu
     */
    public Long getKartBankaKodu() {
        return kartBankaKodu;
    }


    /**
     * Sets the kartBankaKodu value for this KrediKartiBilgi.
     * 
     * @param kartBankaKodu
     */
    public void setKartBankaKodu(Long kartBankaKodu) {
        this.kartBankaKodu = kartBankaKodu;
    }


    /**
     * Gets the sonKullanmaTarihi value for this KrediKartiBilgi.
     * 
     * @return sonKullanmaTarihi
     */
    public Long getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }


    /**
     * Sets the sonKullanmaTarihi value for this KrediKartiBilgi.
     * 
     * @param sonKullanmaTarihi
     */
    public void setSonKullanmaTarihi(Long sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }


    /**
     * Gets the kartNo value for this KrediKartiBilgi.
     * 
     * @return kartNo
     */
    public String getKartNo() {
        return kartNo;
    }


    /**
     * Sets the kartNo value for this KrediKartiBilgi.
     * 
     * @param kartNo
     */
    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof KrediKartiBilgi)) return false;
        KrediKartiBilgi other = (KrediKartiBilgi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ovposId==null && other.getOvposId()==null) || 
             (this.ovposId!=null &&
              this.ovposId.equals(other.getOvposId()))) &&
            ((this.kartBankaKodu==null && other.getKartBankaKodu()==null) || 
             (this.kartBankaKodu!=null &&
              this.kartBankaKodu.equals(other.getKartBankaKodu()))) &&
            ((this.sonKullanmaTarihi==null && other.getSonKullanmaTarihi()==null) || 
             (this.sonKullanmaTarihi!=null &&
              this.sonKullanmaTarihi.equals(other.getSonKullanmaTarihi()))) &&
            ((this.kartNo==null && other.getKartNo()==null) || 
             (this.kartNo!=null &&
              this.kartNo.equals(other.getKartNo())));
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
        if (getOvposId() != null) {
            _hashCode += getOvposId().hashCode();
        }
        if (getKartBankaKodu() != null) {
            _hashCode += getKartBankaKodu().hashCode();
        }
        if (getSonKullanmaTarihi() != null) {
            _hashCode += getSonKullanmaTarihi().hashCode();
        }
        if (getKartNo() != null) {
            _hashCode += getKartNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KrediKartiBilgi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "KrediKartiBilgi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovposId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "ovposId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartBankaKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "kartBankaKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonKullanmaTarihi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "sonKullanmaTarihi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "kartNo"));
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
