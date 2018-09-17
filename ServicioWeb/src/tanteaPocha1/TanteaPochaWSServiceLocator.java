/**
 * TanteaPochaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tanteaPocha;

public class TanteaPochaWSServiceLocator extends org.apache.axis.client.Service implements tanteaPocha.TanteaPochaWSService {

    public TanteaPochaWSServiceLocator() {
    }


    public TanteaPochaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TanteaPochaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TanteaPochaWS
    private java.lang.String TanteaPochaWS_address = "http://localhost:8080/tanteaPocha/services/TanteaPochaWS";

    public java.lang.String getTanteaPochaWSAddress() {
        return TanteaPochaWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TanteaPochaWSWSDDServiceName = "TanteaPochaWS";

    public java.lang.String getTanteaPochaWSWSDDServiceName() {
        return TanteaPochaWSWSDDServiceName;
    }

    public void setTanteaPochaWSWSDDServiceName(java.lang.String name) {
        TanteaPochaWSWSDDServiceName = name;
    }

    public tanteaPocha.TanteaPochaWS getTanteaPochaWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TanteaPochaWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTanteaPochaWS(endpoint);
    }

    public tanteaPocha.TanteaPochaWS getTanteaPochaWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tanteaPocha.TanteaPochaWSSoapBindingStub _stub = new tanteaPocha.TanteaPochaWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getTanteaPochaWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTanteaPochaWSEndpointAddress(java.lang.String address) {
        TanteaPochaWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tanteaPocha.TanteaPochaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                tanteaPocha.TanteaPochaWSSoapBindingStub _stub = new tanteaPocha.TanteaPochaWSSoapBindingStub(new java.net.URL(TanteaPochaWS_address), this);
                _stub.setPortName(getTanteaPochaWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TanteaPochaWS".equals(inputPortName)) {
            return getTanteaPochaWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tanteaPocha", "TanteaPochaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tanteaPocha", "TanteaPochaWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TanteaPochaWS".equals(portName)) {
            setTanteaPochaWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
