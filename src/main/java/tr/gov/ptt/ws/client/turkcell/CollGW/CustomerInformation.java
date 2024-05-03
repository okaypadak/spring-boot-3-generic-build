/**
 * CustomerInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class CustomerInformation  extends BaseResponse implements java.io.Serializable {
    private java.lang.Integer apCompany;

    private java.lang.String apDate;

    private java.lang.Integer apFound;

    private java.lang.String apOrdererName;

    private java.lang.String billCycle;

    private java.lang.Long creditCardNum;

    private java.lang.String nameSurname;

    public CustomerInformation() {
    }

    public CustomerInformation(
           java.lang.String errMsg,
           java.lang.String respCode,
           java.lang.Integer apCompany,
           java.lang.String apDate,
           java.lang.Integer apFound,
           java.lang.String apOrdererName,
           java.lang.String billCycle,
           java.lang.Long creditCardNum,
           java.lang.String nameSurname) {
        super(
            errMsg,
            respCode);
        this.apCompany = apCompany;
        this.apDate = apDate;
        this.apFound = apFound;
        this.apOrdererName = apOrdererName;
        this.billCycle = billCycle;
        this.creditCardNum = creditCardNum;
        this.nameSurname = nameSurname;
    }


    /**
     * Gets the apCompany value for this CustomerInformation.
     * 
     * @return apCompany
     */
    public java.lang.Integer getApCompany() {
        return apCompany;
    }


    /**
     * Sets the apCompany value for this CustomerInformation.
     * 
     * @param apCompany
     */
    public void setApCompany(java.lang.Integer apCompany) {
        this.apCompany = apCompany;
    }


    /**
     * Gets the apDate value for this CustomerInformation.
     * 
     * @return apDate
     */
    public java.lang.String getApDate() {
        return apDate;
    }


    /**
     * Sets the apDate value for this CustomerInformation.
     * 
     * @param apDate
     */
    public void setApDate(java.lang.String apDate) {
        this.apDate = apDate;
    }


    /**
     * Gets the apFound value for this CustomerInformation.
     * 
     * @return apFound
     */
    public java.lang.Integer getApFound() {
        return apFound;
    }


    /**
     * Sets the apFound value for this CustomerInformation.
     * 
     * @param apFound
     */
    public void setApFound(java.lang.Integer apFound) {
        this.apFound = apFound;
    }


    /**
     * Gets the apOrdererName value for this CustomerInformation.
     * 
     * @return apOrdererName
     */
    public java.lang.String getApOrdererName() {
        return apOrdererName;
    }


    /**
     * Sets the apOrdererName value for this CustomerInformation.
     * 
     * @param apOrdererName
     */
    public void setApOrdererName(java.lang.String apOrdererName) {
        this.apOrdererName = apOrdererName;
    }


    /**
     * Gets the billCycle value for this CustomerInformation.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this CustomerInformation.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the creditCardNum value for this CustomerInformation.
     * 
     * @return creditCardNum
     */
    public java.lang.Long getCreditCardNum() {
        return creditCardNum;
    }


    /**
     * Sets the creditCardNum value for this CustomerInformation.
     * 
     * @param creditCardNum
     */
    public void setCreditCardNum(java.lang.Long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }


    /**
     * Gets the nameSurname value for this CustomerInformation.
     * 
     * @return nameSurname
     */
    public java.lang.String getNameSurname() {
        return nameSurname;
    }


    /**
     * Sets the nameSurname value for this CustomerInformation.
     * 
     * @param nameSurname
     */
    public void setNameSurname(java.lang.String nameSurname) {
        this.nameSurname = nameSurname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerInformation)) return false;
        CustomerInformation other = (CustomerInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apCompany==null && other.getApCompany()==null) || 
             (this.apCompany!=null &&
              this.apCompany.equals(other.getApCompany()))) &&
            ((this.apDate==null && other.getApDate()==null) || 
             (this.apDate!=null &&
              this.apDate.equals(other.getApDate()))) &&
            ((this.apFound==null && other.getApFound()==null) || 
             (this.apFound!=null &&
              this.apFound.equals(other.getApFound()))) &&
            ((this.apOrdererName==null && other.getApOrdererName()==null) || 
             (this.apOrdererName!=null &&
              this.apOrdererName.equals(other.getApOrdererName()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.creditCardNum==null && other.getCreditCardNum()==null) || 
             (this.creditCardNum!=null &&
              this.creditCardNum.equals(other.getCreditCardNum()))) &&
            ((this.nameSurname==null && other.getNameSurname()==null) || 
             (this.nameSurname!=null &&
              this.nameSurname.equals(other.getNameSurname())));
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
        if (getApCompany() != null) {
            _hashCode += getApCompany().hashCode();
        }
        if (getApDate() != null) {
            _hashCode += getApDate().hashCode();
        }
        if (getApFound() != null) {
            _hashCode += getApFound().hashCode();
        }
        if (getApOrdererName() != null) {
            _hashCode += getApOrdererName().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getCreditCardNum() != null) {
            _hashCode += getCreditCardNum().hashCode();
        }
        if (getNameSurname() != null) {
            _hashCode += getNameSurname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "customerInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apFound");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apOrdererName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apOrdererName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardNum"));
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
