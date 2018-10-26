/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aviles
 */
public class Conexion {

    private String password = "root";
    private String usuario = "root";
    private String direccionServidor = "localhost";
    private String nombreBaseDatos = "conta2";
    private Connection conexion = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception msj) {
            JOptionPane.showMessageDialog(null, msj.getMessage());
        }
        try {

            conexion = DriverManager.getConnection("jdbc:mysql://" + direccionServidor
                    + "/" + nombreBaseDatos, usuario, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Conexion 1: " + ex.getMessage());
        }
        return conexion;
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Conexion 2: " + ex.getMessage());
        }
    }
}
