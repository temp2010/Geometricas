/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricas;

/*
import java.util.Scanner;

import modelo.Circulo;
import modelo.Convexo;
import modelo.Figura;
import modelo.Punto;
import modelo.Triangulo;
 */
import ado.bd;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.pinta;

/**
 *
 * @author Estudiantes
 */
public class Geometricas {

    bd conexion;

    public Geometricas() throws SQLException, IOException {
        conexion = new bd();
        pinta vista = new pinta(conexion);
        
        if (conexion.isEstado()) {
            importar(vista);
        }
        vista.setVisible(true);
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, IOException {
        Geometricas geo = new Geometricas();

        /*
        // Mode Text
        Scanner teclado = new Scanner(System.in);
        Figura figura = null;
        Punto[] punto = null;
        String nombreFigura;
        System.out.println("Ingrese el tipo de figura");
        nombreFigura = teclado.next();

        switch (nombreFigura) {
            case "circulo":
                String radio;
                punto = new Punto[1];

                punto[0] = new Punto();
                do {
                    System.out.println("Ingrese el radio");
                    radio = teclado.next();
                } while (!punto[0].validaNumero(radio));

                figura = new Circulo(Integer.parseInt(radio), punto);
                break;

            case "triangulo":
                punto = new Punto[3];
                for (int i = 0; i < 3; i++) {
                    punto[i] = new Punto();
                }
                figura = new Triangulo(punto);

                break;

            case "convexo":
                System.out.println("Ingrese lados");
                radio = teclado.next();
                punto = new Punto[Integer.parseInt(radio)];
                for(int i = 0;i<Integer.parseInt(radio);i++) {
                    punto[i] = new Punto();
                }
                figura = new Convexo(punto);

                break;
        }

        System.out.println(figura.area());
        System.out.println(figura.perimetro());
         */
    }

    public void importar(pinta vista) throws SQLException {
        ResultSet figuras, forma;
        
        figuras = conexion.ejecutar("SELECT id_pol FROM poligonos");
        while (figuras.next()) {
            forma = conexion.ejecutar("SELECT id_pol FROM forma WHERE id_pol = " + figuras.getString("id_pol"));
            if (forma.last()) {
                int lados = forma.getRow();

                switch (lados) {
                    case 1:
                        vista.bdc.addItem(figuras.getString("id_pol"));
                        break;
                    case 3:
                        vista.bdt.addItem(figuras.getString("id_pol"));
                        break;
                    default:
                        vista.bdx.addItem(figuras.getString("id_pol"));
                        break;
                }
            }
        }
    }
}
