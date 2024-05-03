/**
 * MutabakatWSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.mutabakat.ws;

import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatRequest;
import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatResponse;

public interface MutabakatWSPortType extends java.rmi.Remote {
    public MutabakatResponse mutabakatBildir(MutabakatRequest mutabakat) throws java.rmi.RemoteException;
}
