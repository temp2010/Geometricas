/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author daniel
 */
public class bd {

    Connection conexion = null;

    public bd() {
        String baseDatos = "jdbc:postgresql://localhost/figuras?figuras";
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(baseDatos);
            System.out.println("La conexión se realizo sin problemas! =) ");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
    }
}
