/**
 * AllReconciliationDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class AllReconciliationDataResponse  extends BaseOutputResponse implements java.io.Serializable {
    private byte[] attachment;

    private int dayParam;

    private java.lang.String fileName;

    private int reconType;

    private int requestType;

    public AllReconciliationDataResponse() {
    }

    public AllReconciliationDataResponse(
           java.lang.String errMsg,
           java.lang.String respCode,
           ParamResponseMainParameterMapEntry[] mainParameterMap,
           java.lang.String queryKey,
           java.lang.String queryType,
           java.lang.String queryValue,
           int bankId,
           int compId,
           java.lang.String msgDate,
           Origin orig,
           java.lang.String sessionId,
           long stan,
           byte[] attachment,
           int dayParam,
           java.lang.String fileName,
           int reconType,
           int requestType) {
        super(
            errMsg,
            respCode,
            mainParameterMap,
            queryKey,
            queryType,
            queryValue,
            bankId,
            compId,
            msgDate,
            orig,
            sessionId,
            stan);
        this.attachment = attachment;
        this.dayParam = dayParam;
        this.fileName = fileName;
        this.reconType = reconType;
        this.requestType = requestType;
    }


    /**
     * Gets the attachment value for this AllReconciliationDataResponse.
     * 
     * @return attachment
     */
    public byte[] getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this AllReconciliationDataResponse.
     * 
     * @param attachment
     */
    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the dayParam value for this AllReconciliationDataResponse.
     * 
     * @return dayParam
     */
    public int getDayParam() {
        return dayParam;
    }


    /**
     * Sets the dayParam value for this AllReconciliationDataResponse.
     * 
     * @param dayParam
     */
    public void setDayParam(int dayParam) {
        this.dayParam = dayParam;
    }


    /**
     * Gets the fileName value for this AllReconciliationDataResponse.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this AllReconciliationDataResponse.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the reconType value for this AllReconciliationDataResponse.
     * 
     * @return reconType
     */
    public int getReconType() {
        return reconType;
    }


    /**
     * Sets the reconType value for this AllReconciliationDataResponse.
     * 
     * @param reconType
     */
    public void setReconType(int reconType) {
        this.reconType = reconType;
    }


    /**
     * Gets the requestType value for this AllReconciliationDataResponse.
     * 
     * @return requestType
     */
    public int getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this AllReconciliationDataResponse.
     * 
     * @param requestType
     */
    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllReconciliationDataResponse)) return false;
        AllReconciliationDataResponse other = (AllReconciliationDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachment==null && other.getAttachment()==null) || 
             (this.attachment!=null &&
              java.util.Arrays.equals(this.attachment, other.getAttachment()))) &&
            this.dayParam == other.getDayParam() &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.reconType == other.getReconType() &&
            this.requestType == other.getRequestType();
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
        if (getAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDayParam();
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += getReconType();
        _hashCode += getRequestType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllReconciliationDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "allReconciliationDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestType"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
