/**
 * TanteaPochaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tanteaPocha;

public interface TanteaPochaWS extends java.rmi.Remote {
    public boolean cerrarConexion() throws java.rmi.RemoteException;
    public boolean levantarConexion() throws java.rmi.RemoteException;
    public tanteaPocha.Jugador[] listarJugadores() throws java.rmi.RemoteException;
}
