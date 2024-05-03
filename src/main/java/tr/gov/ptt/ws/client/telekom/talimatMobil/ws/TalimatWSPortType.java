/**
 * TalimatWSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.ptt.ws.client.telekom.talimatMobil.ws;
import tr.gov.ptt.ws.client.telekom.talimatMobil.ortak.*;
import tr.gov.ptt.ws.client.telekom.talimatMobil.ortak.*;
import tr.gov.ptt.ws.client.telekom.talimatMobil.ortak.*;

public interface TalimatWSPortType extends java.rmi.Remote {
    public TalimatBilgiSorgulamaResponse talimatSorgulama(TalimatBilgiSorgulamaRequest talimatBilgiSorgulamaRequest) throws java.rmi.RemoteException;
    public TalimatEkleResponse talimatEkle(TalimatEkleRequest talimatEkleRequest) throws java.rmi.RemoteException;
    public TalimatCikarResponse talimatCikar(TalimatCikarRequest talimatCikarRequest) throws java.rmi.RemoteException;
}
