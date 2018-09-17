/**
 * Jugador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tanteaPocha;

public class Jugador  implements java.io.Serializable {
    private java.lang.String colorfavorito;

    private java.lang.String email;

    private java.lang.String fechanacimiento;

    private java.lang.String habilitado;

    private int idjugadores;

    private java.lang.String nombre;

    public Jugador() {
    }

    public Jugador(
           java.lang.String colorfavorito,
           java.lang.String email,
           java.lang.String fechanacimiento,
           java.lang.String habilitado,
           int idjugadores,
           java.lang.String nombre) {
           this.colorfavorito = colorfavorito;
           this.email = email;
           this.fechanacimiento = fechanacimiento;
           this.habilitado = habilitado;
           this.idjugadores = idjugadores;
           this.nombre = nombre;
    }


    /**
     * Gets the colorfavorito value for this Jugador.
     * 
     * @return colorfavorito
     */
    public java.lang.String getColorfavorito() {
        return colorfavorito;
    }


    /**
     * Sets the colorfavorito value for this Jugador.
     * 
     * @param colorfavorito
     */
    public void setColorfavorito(java.lang.String colorfavorito) {
        this.colorfavorito = colorfavorito;
    }


    /**
     * Gets the email value for this Jugador.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Jugador.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fechanacimiento value for this Jugador.
     * 
     * @return fechanacimiento
     */
    public java.lang.String getFechanacimiento() {
        return fechanacimiento;
    }


    /**
     * Sets the fechanacimiento value for this Jugador.
     * 
     * @param fechanacimiento
     */
    public void setFechanacimiento(java.lang.String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }


    /**
     * Gets the habilitado value for this Jugador.
     * 
     * @return habilitado
     */
    public java.lang.String getHabilitado() {
        return habilitado;
    }


    /**
     * Sets the habilitado value for this Jugador.
     * 
     * @param habilitado
     */
    public void setHabilitado(java.lang.String habilitado) {
        this.habilitado = habilitado;
    }


    /**
     * Gets the idjugadores value for this Jugador.
     * 
     * @return idjugadores
     */
    public int getIdjugadores() {
        return idjugadores;
    }


    /**
     * Sets the idjugadores value for this Jugador.
     * 
     * @param idjugadores
     */
    public void setIdjugadores(int idjugadores) {
        this.idjugadores = idjugadores;
    }


    /**
     * Gets the nombre value for this Jugador.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Jugador.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Jugador)) return false;
        Jugador other = (Jugador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colorfavorito==null && other.getColorfavorito()==null) || 
             (this.colorfavorito!=null &&
              this.colorfavorito.equals(other.getColorfavorito()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fechanacimiento==null && other.getFechanacimiento()==null) || 
             (this.fechanacimiento!=null &&
              this.fechanacimiento.equals(other.getFechanacimiento()))) &&
            ((this.habilitado==null && other.getHabilitado()==null) || 
             (this.habilitado!=null &&
              this.habilitado.equals(other.getHabilitado()))) &&
            this.idjugadores == other.getIdjugadores() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getColorfavorito() != null) {
            _hashCode += getColorfavorito().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFechanacimiento() != null) {
            _hashCode += getFechanacimiento().hashCode();
        }
        if (getHabilitado() != null) {
            _hashCode += getHabilitado().hashCode();
        }
        _hashCode += getIdjugadores();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Jugador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tanteaPocha", "Jugador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorfavorito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tanteaPocha", "colorfavorito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tanteaPocha", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechanacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tanteaPocha", "fechanacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habilitado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tanteaPocha", "habilitado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idjugadores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tanteaPocha", "idjugadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tanteaPocha", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
