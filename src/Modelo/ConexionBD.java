/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Michael
 */
public class ConexionBD {
    
    private Connection conexion;
    private String usuario, clave ,bd,mensaje;

    public ConexionBD(Connection conexion, String usuario, String clave, String bd, String mensaje) {
        this.conexion = conexion;
        this.usuario = usuario;
        this.clave = clave;
        this.bd = bd;
        this.mensaje = mensaje;
    }
    public ConexionBD() {
        this.conexion = null;
        this.usuario = "root";
        this.clave = "123456";
        this.bd = "agenda";
        this.mensaje = "";
    }
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String ruta = "jdbc:mysql://localhost/"+bd;
            conexion = DriverManager.getConnection(ruta, usuario, clave);
            mensaje = "conexion exitosa "+bd;
        } catch (ClassNotFoundException ex) {
            mensaje="Driver no encontrado";
        } catch (SQLException ex) {
            mensaje = "Error en la conexion..."+bd+"\n"+ex;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString() {
        return "Conexion{" + "conexion=" + conexion + ", usuario=" + usuario + ", clave=" + clave + ", bd=" + bd + ", mensaje=" + mensaje + '}';
    }
    
}
