/**
 * InvoiceGetAutoPaymentDebitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class InvoiceGetAutoPaymentDebitsResponse  extends BaseResponse implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String msgDate;

    private long stan;

    private int compId;

    private int bankId;

    private int invCount;

    private java.lang.String respCode;

    private byte[] attachment;

    private int dayParam;

    private java.lang.String fileName;

    private double totalDeptAmount;

    public InvoiceGetAutoPaymentDebitsResponse() {
    }

    public InvoiceGetAutoPaymentDebitsResponse(
           java.lang.String errMsg,
           java.lang.String _respCode,
           java.lang.String sessionId,
           java.lang.String msgDate,
           long stan,
           int compId,
           int bankId,
           int invCount,
           java.lang.String respCode,
           byte[] attachment,
           int dayParam,
           java.lang.String fileName,
           double totalDeptAmount) {
        super(
            errMsg,
            _respCode);
        this.sessionId = sessionId;
        this.msgDate = msgDate;
        this.stan = stan;
        this.compId = compId;
        this.bankId = bankId;
        this.invCount = invCount;
        this.respCode = respCode;
        this.attachment = attachment;
        this.dayParam = dayParam;
        this.fileName = fileName;
        this.totalDeptAmount = totalDeptAmount;
    }


    /**
     * Gets the sessionId value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the msgDate value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the stan value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }


    /**
     * Gets the compId value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the bankId value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the invCount value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }


    /**
     * Gets the respCode value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the attachment value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return attachment
     */
    public byte[] getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param attachment
     */
    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the dayParam value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return dayParam
     */
    public int getDayParam() {
        return dayParam;
    }


    /**
     * Sets the dayParam value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param dayParam
     */
    public void setDayParam(int dayParam) {
        this.dayParam = dayParam;
    }


    /**
     * Gets the fileName value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the totalDeptAmount value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @return totalDeptAmount
     */
    public double getTotalDeptAmount() {
        return totalDeptAmount;
    }


    /**
     * Sets the totalDeptAmount value for this InvoiceGetAutoPaymentDebitsResponse.
     * 
     * @param totalDeptAmount
     */
    public void setTotalDeptAmount(double totalDeptAmount) {
        this.totalDeptAmount = totalDeptAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceGetAutoPaymentDebitsResponse)) return false;
        InvoiceGetAutoPaymentDebitsResponse other = (InvoiceGetAutoPaymentDebitsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            this.stan == other.getStan() &&
            this.compId == other.getCompId() &&
            this.bankId == other.getBankId() &&
            this.invCount == other.getInvCount() &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.attachment==null && other.getAttachment()==null) || 
             (this.attachment!=null &&
              java.util.Arrays.equals(this.attachment, other.getAttachment()))) &&
            this.dayParam == other.getDayParam() &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.totalDeptAmount == other.getTotalDeptAmount();
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getMsgDate() != null) {
            _hashCode += getMsgDate().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        _hashCode += getCompId();
        _hashCode += getBankId();
        _hashCode += getInvCount();
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
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
        _hashCode += new Double(getTotalDeptAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceGetAutoPaymentDebitsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceGetAutoPaymentDebitsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "compId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("totalDeptAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDeptAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
