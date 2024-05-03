/**
 * InvoiceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dev.padak.backend.ws.client.turkcell.CollGW;

public class InvoiceDetail  implements java.io.Serializable {
    private InvoiceDetailParameterMapEntry[] parameterMap;

    private long controlId;

    private double creditAmount;

    private java.lang.String dueDate;

    private double installmentAmount;

    private double invAmount;

    private long invNo;

    private int invType;

    private double maxAmount;

    private double minAmount;

    private java.lang.Long msisdn;

    private java.lang.String nameSurname;

    private double newInstallmentAmount;

    private int orderNo;

    private double payAmount;

    private java.lang.String period;

    private java.lang.String remark;

    private double restCreditAmount;

    private double totalPaymentAmount;

    public InvoiceDetail() {
    }

    public InvoiceDetail(
           InvoiceDetailParameterMapEntry[] parameterMap,
           long controlId,
           double creditAmount,
           java.lang.String dueDate,
           double installmentAmount,
           double invAmount,
           long invNo,
           int invType,
           double maxAmount,
           double minAmount,
           java.lang.Long msisdn,
           java.lang.String nameSurname,
           double newInstallmentAmount,
           int orderNo,
           double payAmount,
           java.lang.String period,
           java.lang.String remark,
           double restCreditAmount,
           double totalPaymentAmount) {
           this.parameterMap = parameterMap;
           this.controlId = controlId;
           this.creditAmount = creditAmount;
           this.dueDate = dueDate;
           this.installmentAmount = installmentAmount;
           this.invAmount = invAmount;
           this.invNo = invNo;
           this.invType = invType;
           this.maxAmount = maxAmount;
           this.minAmount = minAmount;
           this.msisdn = msisdn;
           this.nameSurname = nameSurname;
           this.newInstallmentAmount = newInstallmentAmount;
           this.orderNo = orderNo;
           this.payAmount = payAmount;
           this.period = period;
           this.remark = remark;
           this.restCreditAmount = restCreditAmount;
           this.totalPaymentAmount = totalPaymentAmount;
    }


    /**
     * Gets the parameterMap value for this InvoiceDetail.
     * 
     * @return parameterMap
     */
    public InvoiceDetailParameterMapEntry[] getParameterMap() {
        return parameterMap;
    }


    /**
     * Sets the parameterMap value for this InvoiceDetail.
     * 
     * @param parameterMap
     */
    public void setParameterMap(InvoiceDetailParameterMapEntry[] parameterMap) {
        this.parameterMap = parameterMap;
    }


    /**
     * Gets the controlId value for this InvoiceDetail.
     * 
     * @return controlId
     */
    public long getControlId() {
        return controlId;
    }


    /**
     * Sets the controlId value for this InvoiceDetail.
     * 
     * @param controlId
     */
    public void setControlId(long controlId) {
        this.controlId = controlId;
    }


    /**
     * Gets the creditAmount value for this InvoiceDetail.
     * 
     * @return creditAmount
     */
    public double getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this InvoiceDetail.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the dueDate value for this InvoiceDetail.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InvoiceDetail.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the installmentAmount value for this InvoiceDetail.
     * 
     * @return installmentAmount
     */
    public double getInstallmentAmount() {
        return installmentAmount;
    }


    /**
     * Sets the installmentAmount value for this InvoiceDetail.
     * 
     * @param installmentAmount
     */
    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }


    /**
     * Gets the invAmount value for this InvoiceDetail.
     * 
     * @return invAmount
     */
    public double getInvAmount() {
        return invAmount;
    }


    /**
     * Sets the invAmount value for this InvoiceDetail.
     * 
     * @param invAmount
     */
    public void setInvAmount(double invAmount) {
        this.invAmount = invAmount;
    }


    /**
     * Gets the invNo value for this InvoiceDetail.
     * 
     * @return invNo
     */
    public long getInvNo() {
        return invNo;
    }


    /**
     * Sets the invNo value for this InvoiceDetail.
     * 
     * @param invNo
     */
    public void setInvNo(long invNo) {
        this.invNo = invNo;
    }


    /**
     * Gets the invType value for this InvoiceDetail.
     * 
     * @return invType
     */
    public int getInvType() {
        return invType;
    }


    /**
     * Sets the invType value for this InvoiceDetail.
     * 
     * @param invType
     */
    public void setInvType(int invType) {
        this.invType = invType;
    }


    /**
     * Gets the maxAmount value for this InvoiceDetail.
     * 
     * @return maxAmount
     */
    public double getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this InvoiceDetail.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the minAmount value for this InvoiceDetail.
     * 
     * @return minAmount
     */
    public double getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this InvoiceDetail.
     * 
     * @param minAmount
     */
    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the msisdn value for this InvoiceDetail.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InvoiceDetail.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the nameSurname value for this InvoiceDetail.
     * 
     * @return nameSurname
     */
    public java.lang.String getNameSurname() {
        return nameSurname;
    }


    /**
     * Sets the nameSurname value for this InvoiceDetail.
     * 
     * @param nameSurname
     */
    public void setNameSurname(java.lang.String nameSurname) {
        this.nameSurname = nameSurname;
    }


    /**
     * Gets the newInstallmentAmount value for this InvoiceDetail.
     * 
     * @return newInstallmentAmount
     */
    public double getNewInstallmentAmount() {
        return newInstallmentAmount;
    }


    /**
     * Sets the newInstallmentAmount value for this InvoiceDetail.
     * 
     * @param newInstallmentAmount
     */
    public void setNewInstallmentAmount(double newInstallmentAmount) {
        this.newInstallmentAmount = newInstallmentAmount;
    }


    /**
     * Gets the orderNo value for this InvoiceDetail.
     * 
     * @return orderNo
     */
    public int getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this InvoiceDetail.
     * 
     * @param orderNo
     */
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Gets the payAmount value for this InvoiceDetail.
     * 
     * @return payAmount
     */
    public double getPayAmount() {
        return payAmount;
    }


    /**
     * Sets the payAmount value for this InvoiceDetail.
     * 
     * @param payAmount
     */
    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }


    /**
     * Gets the period value for this InvoiceDetail.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this InvoiceDetail.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }


    /**
     * Gets the remark value for this InvoiceDetail.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this InvoiceDetail.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the restCreditAmount value for this InvoiceDetail.
     * 
     * @return restCreditAmount
     */
    public double getRestCreditAmount() {
        return restCreditAmount;
    }


    /**
     * Sets the restCreditAmount value for this InvoiceDetail.
     * 
     * @param restCreditAmount
     */
    public void setRestCreditAmount(double restCreditAmount) {
        this.restCreditAmount = restCreditAmount;
    }


    /**
     * Gets the totalPaymentAmount value for this InvoiceDetail.
     * 
     * @return totalPaymentAmount
     */
    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }


    /**
     * Sets the totalPaymentAmount value for this InvoiceDetail.
     * 
     * @param totalPaymentAmount
     */
    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceDetail)) return false;
        InvoiceDetail other = (InvoiceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterMap==null && other.getParameterMap()==null) || 
             (this.parameterMap!=null &&
              java.util.Arrays.equals(this.parameterMap, other.getParameterMap()))) &&
            this.controlId == other.getControlId() &&
            this.creditAmount == other.getCreditAmount() &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            this.installmentAmount == other.getInstallmentAmount() &&
            this.invAmount == other.getInvAmount() &&
            this.invNo == other.getInvNo() &&
            this.invType == other.getInvType() &&
            this.maxAmount == other.getMaxAmount() &&
            this.minAmount == other.getMinAmount() &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.nameSurname==null && other.getNameSurname()==null) || 
             (this.nameSurname!=null &&
              this.nameSurname.equals(other.getNameSurname()))) &&
            this.newInstallmentAmount == other.getNewInstallmentAmount() &&
            this.orderNo == other.getOrderNo() &&
            this.payAmount == other.getPayAmount() &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            this.restCreditAmount == other.getRestCreditAmount() &&
            this.totalPaymentAmount == other.getTotalPaymentAmount();
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
        if (getParameterMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getControlId()).hashCode();
        _hashCode += new Double(getCreditAmount()).hashCode();
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        _hashCode += new Double(getInstallmentAmount()).hashCode();
        _hashCode += new Double(getInvAmount()).hashCode();
        _hashCode += new Long(getInvNo()).hashCode();
        _hashCode += getInvType();
        _hashCode += new Double(getMaxAmount()).hashCode();
        _hashCode += new Double(getMinAmount()).hashCode();
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getNameSurname() != null) {
            _hashCode += getNameSurname().hashCode();
        }
        _hashCode += new Double(getNewInstallmentAmount()).hashCode();
        _hashCode += getOrderNo();
        _hashCode += new Double(getPayAmount()).hashCode();
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        _hashCode += new Double(getRestCreditAmount()).hashCode();
        _hashCode += new Double(getTotalPaymentAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterMap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", ">>invoiceDetail>parameterMap>entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSurname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameSurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newInstallmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newInstallmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restCreditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restCreditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPaymentAmount"));
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
