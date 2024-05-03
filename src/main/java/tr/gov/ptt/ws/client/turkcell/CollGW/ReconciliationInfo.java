/**
 * ReconciliationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class ReconciliationInfo  implements java.io.Serializable {
    private double amount;

    private java.math.BigDecimal bigAmount;

    private int opType;

    private int status;

    private long totalProcesCount;

    public ReconciliationInfo() {
    }

    public ReconciliationInfo(
           double amount,
           java.math.BigDecimal bigAmount,
           int opType,
           int status,
           long totalProcesCount) {
           this.amount = amount;
           this.bigAmount = bigAmount;
           this.opType = opType;
           this.status = status;
           this.totalProcesCount = totalProcesCount;
    }


    /**
     * Gets the amount value for this ReconciliationInfo.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ReconciliationInfo.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the bigAmount value for this ReconciliationInfo.
     * 
     * @return bigAmount
     */
    public java.math.BigDecimal getBigAmount() {
        return bigAmount;
    }


    /**
     * Sets the bigAmount value for this ReconciliationInfo.
     * 
     * @param bigAmount
     */
    public void setBigAmount(java.math.BigDecimal bigAmount) {
        this.bigAmount = bigAmount;
    }


    /**
     * Gets the opType value for this ReconciliationInfo.
     * 
     * @return opType
     */
    public int getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this ReconciliationInfo.
     * 
     * @param opType
     */
    public void setOpType(int opType) {
        this.opType = opType;
    }


    /**
     * Gets the status value for this ReconciliationInfo.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReconciliationInfo.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the totalProcesCount value for this ReconciliationInfo.
     * 
     * @return totalProcesCount
     */
    public long getTotalProcesCount() {
        return totalProcesCount;
    }


    /**
     * Sets the totalProcesCount value for this ReconciliationInfo.
     * 
     * @param totalProcesCount
     */
    public void setTotalProcesCount(long totalProcesCount) {
        this.totalProcesCount = totalProcesCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationInfo)) return false;
        ReconciliationInfo other = (ReconciliationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            ((this.bigAmount==null && other.getBigAmount()==null) || 
             (this.bigAmount!=null &&
              this.bigAmount.equals(other.getBigAmount()))) &&
            this.opType == other.getOpType() &&
            this.status == other.getStatus() &&
            this.totalProcesCount == other.getTotalProcesCount();
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
        _hashCode += new Double(getAmount()).hashCode();
        if (getBigAmount() != null) {
            _hashCode += getBigAmount().hashCode();
        }
        _hashCode += getOpType();
        _hashCode += getStatus();
        _hashCode += new Long(getTotalProcesCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "reconciliationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bigAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalProcesCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalProcesCount"));
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
