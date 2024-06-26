/**
 * Origin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class Origin  implements java.io.Serializable {
    private java.lang.String branch;

    private int city;

    private java.lang.String teller;

    private java.lang.String user;

    public Origin() {
    }

    public Origin(
           java.lang.String branch,
           int city,
           java.lang.String teller,
           java.lang.String user) {
           this.branch = branch;
           this.city = city;
           this.teller = teller;
           this.user = user;
    }


    /**
     * Gets the branch value for this Origin.
     * 
     * @return branch
     */
    public java.lang.String getBranch() {
        return branch;
    }


    /**
     * Sets the branch value for this Origin.
     * 
     * @param branch
     */
    public void setBranch(java.lang.String branch) {
        this.branch = branch;
    }


    /**
     * Gets the city value for this Origin.
     * 
     * @return city
     */
    public int getCity() {
        return city;
    }


    /**
     * Sets the city value for this Origin.
     * 
     * @param city
     */
    public void setCity(int city) {
        this.city = city;
    }


    /**
     * Gets the teller value for this Origin.
     * 
     * @return teller
     */
    public java.lang.String getTeller() {
        return teller;
    }


    /**
     * Sets the teller value for this Origin.
     * 
     * @param teller
     */
    public void setTeller(java.lang.String teller) {
        this.teller = teller;
    }


    /**
     * Gets the user value for this Origin.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Origin.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Origin)) return false;
        Origin other = (Origin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branch==null && other.getBranch()==null) || 
             (this.branch!=null &&
              this.branch.equals(other.getBranch()))) &&
            this.city == other.getCity() &&
            ((this.teller==null && other.getTeller()==null) || 
             (this.teller!=null &&
              this.teller.equals(other.getTeller()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getBranch() != null) {
            _hashCode += getBranch().hashCode();
        }
        _hashCode += getCity();
        if (getTeller() != null) {
            _hashCode += getTeller().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Origin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "origin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
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
