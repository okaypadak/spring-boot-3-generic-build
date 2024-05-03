/**
 * TalimatBilgiSorgulamaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatSabit.ortak;

public class TalimatBilgiSorgulamaRequest  extends GenelIstekMesaj implements java.io.Serializable {
    private ErisimBilgi erisimBilgi;

    private long talimatTipi;

    //private java.lang.Boolean esnekAlanDiziGetir;

    private AnahtarDegerCifti[] esnekAlanDizi;

    public TalimatBilgiSorgulamaRequest() {
    }

    public TalimatBilgiSorgulamaRequest(
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
           ErisimBilgi erisimBilgi,
           long talimatTipi,
           Boolean esnekAlanDiziGetir,
           AnahtarDegerCifti[] esnekAlanDizi) {
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
        this.erisimBilgi = erisimBilgi;
        this.talimatTipi = talimatTipi;
        //this.esnekAlanDiziGetir = esnekAlanDiziGetir;
        this.esnekAlanDizi = esnekAlanDizi;
    }


    /**
     * Gets the erisimBilgi value for this TalimatBilgiSorgulamaRequest.
     * 
     * @return erisimBilgi
     */
    public ErisimBilgi getErisimBilgi() {
        return erisimBilgi;
    }


    /**
     * Sets the erisimBilgi value for this TalimatBilgiSorgulamaRequest.
     * 
     * @param erisimBilgi
     */
    public void setErisimBilgi(ErisimBilgi erisimBilgi) {
        this.erisimBilgi = erisimBilgi;
    }


    /**
     * Gets the talimatTipi value for this TalimatBilgiSorgulamaRequest.
     * 
     * @return talimatTipi
     */
    public long getTalimatTipi() {
        return talimatTipi;
    }


    /**
     * Sets the talimatTipi value for this TalimatBilgiSorgulamaRequest.
     * 
     * @param talimatTipi
     */
    public void setTalimatTipi(long talimatTipi) {
        this.talimatTipi = talimatTipi;
    }


    /**
     * Gets the esnekAlanDiziGetir value for this TalimatBilgiSorgulamaRequest.
     * 
     * @return esnekAlanDiziGetir
     */
//    public java.lang.Boolean getEsnekAlanDiziGetir() {
//        return esnekAlanDiziGetir;
//    }


    /**
     * Sets the esnekAlanDiziGetir value for this TalimatBilgiSorgulamaRequest.
     * 
     * @param esnekAlanDiziGetir
     */
//    public void setEsnekAlanDiziGetir(java.lang.Boolean esnekAlanDiziGetir) {
//        this.esnekAlanDiziGetir = esnekAlanDiziGetir;
//    }


    /**
     * Gets the esnekAlanDizi value for this TalimatBilgiSorgulamaRequest.
     * 
     * @return esnekAlanDizi
     */
//    //public AnahtarDegerCifti[] getEsnekAlanDizi() {
//        return esnekAlanDizi;
//    }


    /**
     * Sets the esnekAlanDizi value for this TalimatBilgiSorgulamaRequest.
     * 
     * @param esnekAlanDizi
     */
//    public void setEsnekAlanDizi(AnahtarDegerCifti[] esnekAlanDizi) {
//        this.esnekAlanDizi = esnekAlanDizi;
//    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TalimatBilgiSorgulamaRequest)) return false;
        TalimatBilgiSorgulamaRequest other = (TalimatBilgiSorgulamaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.erisimBilgi==null && other.getErisimBilgi()==null) || 
             (this.erisimBilgi!=null &&
              this.erisimBilgi.equals(other.getErisimBilgi())));
//                &&
//            this.talimatTipi == other.getTalimatTipi() &&
//            ((this.esnekAlanDiziGetir==null && other.getEsnekAlanDiziGetir()==null) ||
//             (this.esnekAlanDiziGetir!=null &&
//              this.esnekAlanDiziGetir.equals(other.getEsnekAlanDiziGetir()))) &&
//            ((this.esnekAlanDizi==null && other.getEsnekAlanDizi()==null) ||
//             (this.esnekAlanDizi!=null &&
//              java.util.Arrays.equals(this.esnekAlanDizi, other.getEsnekAlanDizi())));
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
        if (getErisimBilgi() != null) {
            _hashCode += getErisimBilgi().hashCode();
        }
        _hashCode += new Long(getTalimatTipi()).hashCode();
//        if (getEsnekAlanDiziGetir() != null) {
//            _hashCode += getEsnekAlanDiziGetir().hashCode();
//        }
//        if (getEsnekAlanDizi() != null) {
//            for (int i=0;
//                 i<java.lang.reflect.Array.getLength(getEsnekAlanDizi());
//                 i++) {
//                java.lang.Object obj = java.lang.reflect.Array.get(getEsnekAlanDizi(), i);
//                if (obj != null &&
//                    !obj.getClass().isArray()) {
//                    _hashCode += obj.hashCode();
//                }
//            }
//        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TalimatBilgiSorgulamaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", ">TalimatBilgiSorgulamaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erisimBilgi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "erisimBilgi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "ErisimBilgi"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talimatTipi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "talimatTipi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esnekAlanDiziGetir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://talimat.server.webservice.business.tts.innova.com.tr", "esnekAlanDiziGetir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
