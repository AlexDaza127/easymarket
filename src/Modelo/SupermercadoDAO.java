/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael
 */
public class SupermercadoDAO {
    Cafam objC;
    Exito objE;
    Jumbo objJ;
    Metro objM;

    public SupermercadoDAO(Cafam objC, Exito objE, Jumbo objJ, Metro objM) {
        this.objC = objC;
        this.objE = objE;
        this.objJ = objJ;
        this.objM = objM;
    }
    
    public SupermercadoDAO() {
        this.objC = new Cafam();
        this.objE = new Exito();
        this.objJ = new Jumbo();
        this.objM = new Metro();
    }
    
    
    public DefaultTableModel consultaCafam() {
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();

        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("select * from Cafam");
            ResultSetMetaData campos = datos.getMetaData();

            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnClassName(i));
            }

            while (datos.next()) {
                Object[] fila = new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                    fila[i] = datos.getObject(i + 1);

                }
                plantilla.addRow(fila);
            }

            datos.close();
            objCon.getConexion().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return plantilla;
    }
    
    public DefaultTableModel consultaExito() {
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();

        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("select * from Exito");
            ResultSetMetaData campos = datos.getMetaData();

            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnClassName(i));
            }

            while (datos.next()) {
                Object[] fila = new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                    fila[i] = datos.getObject(i + 1);

                }
                plantilla.addRow(fila);
            }

            datos.close();
            objCon.getConexion().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return plantilla;
    }
    
    public DefaultTableModel consultaJumbo() {
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();

        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("select * from Jumbo");
            ResultSetMetaData campos = datos.getMetaData();

            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnClassName(i));
            }

            while (datos.next()) {
                Object[] fila = new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                    fila[i] = datos.getObject(i + 1);

                }
                plantilla.addRow(fila);
            }

            datos.close();
            objCon.getConexion().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return plantilla;
    }
    
    public DefaultTableModel consultaMetro() {
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();

        try {
            objCon.conectar();
            Statement consulta = objCon.getConexion().createStatement();
            ResultSet datos = consulta.executeQuery("select * from Metro");
            ResultSetMetaData campos = datos.getMetaData();

            for (int i = 1; i <= campos.getColumnCount(); i++) {
                plantilla.addColumn(campos.getColumnClassName(i));
            }

            while (datos.next()) {
                Object[] fila = new Object[campos.getColumnCount()];
                for (int i = 0; i < campos.getColumnCount(); i++) {
                    fila[i] = datos.getObject(i + 1);

                }
                plantilla.addRow(fila);
            }

            datos.close();
            objCon.getConexion().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return plantilla;
    }
    
    public DefaultTableModel insertarMercado(){
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();
        
        return plantilla;
    }
    
    public DefaultTableModel modificarMercado(){
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();
        
        return plantilla;
    } 
    
    public DefaultTableModel eliminarMercado(){
        DefaultTableModel plantilla = new DefaultTableModel();
        ConexionBD objCon = new ConexionBD();
        
        return plantilla;
    } 
    
}
