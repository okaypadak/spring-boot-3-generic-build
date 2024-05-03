/**
 * InvoiceInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.turkcell.CollGW;

public class InvoiceInfoRequest  extends BaseInputRequest implements java.io.Serializable {
    private InvoiceDetail[] invoiceDetailList;

    private int invCount;

    public InvoiceInfoRequest() {
    }

    public InvoiceInfoRequest(
           QueryKeyRequestReqMainParameterMapEntry[] reqMainParameterMap,
           java.lang.String queryKey,
           java.lang.String queryType,
           java.lang.String queryValue,
           int bankId,
           int compId,
           java.lang.String curr,
           java.lang.String msgDate,
           Origin orig,
           java.lang.String sessionId,
           long stan,
           InvoiceDetail[] invoiceDetailList,
           int invCount) {
        super(
            reqMainParameterMap,
            queryKey,
            queryType,
            queryValue,
            bankId,
            compId,
            curr,
            msgDate,
            orig,
            sessionId,
            stan);
        this.invoiceDetailList = invoiceDetailList;
        this.invCount = invCount;
    }


    /**
     * Gets the invoiceDetailList value for this InvoiceInfoRequest.
     * 
     * @return invoiceDetailList
     */
    public InvoiceDetail[] getInvoiceDetailList() {
        return invoiceDetailList;
    }


    /**
     * Sets the invoiceDetailList value for this InvoiceInfoRequest.
     * 
     * @param invoiceDetailList
     */
    public void setInvoiceDetailList(InvoiceDetail[] invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }


    /**
     * Gets the invCount value for this InvoiceInfoRequest.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this InvoiceInfoRequest.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceInfoRequest)) return false;
        InvoiceInfoRequest other = (InvoiceInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceDetailList==null && other.getInvoiceDetailList()==null) || 
             (this.invoiceDetailList!=null &&
              java.util.Arrays.equals(this.invoiceDetailList, other.getInvoiceDetailList()))) &&
            this.invCount == other.getInvCount();
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
        if (getInvoiceDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getInvCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://collgw.inf.webservice.turkcell.com", "invoiceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "invoiceDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invCount"));
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
