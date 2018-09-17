package tanteaPocha;

public class TanteaPochaWSProxy implements tanteaPocha.TanteaPochaWS {
  private String _endpoint = null;
  private tanteaPocha.TanteaPochaWS tanteaPochaWS = null;
  
  public TanteaPochaWSProxy() {
    _initTanteaPochaWSProxy();
  }
  
  public TanteaPochaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initTanteaPochaWSProxy();
  }
  
  private void _initTanteaPochaWSProxy() {
    try {
      tanteaPochaWS = (new tanteaPocha.TanteaPochaWSServiceLocator()).getTanteaPochaWS();
      if (tanteaPochaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tanteaPochaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tanteaPochaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tanteaPochaWS != null)
      ((javax.xml.rpc.Stub)tanteaPochaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tanteaPocha.TanteaPochaWS getTanteaPochaWS() {
    if (tanteaPochaWS == null)
      _initTanteaPochaWSProxy();
    return tanteaPochaWS;
  }
  
  public tanteaPocha.Jugador[] listarJugadores(){
    if (tanteaPochaWS == null)
      _initTanteaPochaWSProxy();
    return tanteaPochaWS.listarJugadores();
  }
  
  
}