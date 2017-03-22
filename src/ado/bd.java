/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author daniel
 */
public class bd {

    private Connection conexion = null;
    Properties propiedades = new Properties();
    private boolean estado = false;
    InputStream variables;

    public bd() throws FileNotFoundException, IOException {
        variables = new FileInputStream("configuracion.properties");
        propiedades.load(variables);
        
        String baseDatos = "jdbc:postgresql://"+propiedades.getProperty("host")+"/"+propiedades.getProperty("bd")+"?user="+propiedades.getProperty("usuario")+"&password="+propiedades.getProperty("contrasena");
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(baseDatos);
            this.estado = true;
            System.out.println("Conectado");
        } catch (Exception e) {
            this.estado = false;
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
    }

    public ResultSet ejecutar(String query) throws SQLException {
        Statement st = conexion.createStatement();
        st = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery(query);

        return rs;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
