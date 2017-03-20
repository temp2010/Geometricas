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
import vista.pinta;

/**
 *
 * @author Estudiantes
 */
public class Geometricas {

    public Geometricas() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        pinta vista = new pinta();
        bd coneccion = new bd();
        vista.setVisible(true);

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
}
