/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiantes
 */
public class Convexo extends Figura {

    Punto[] puntoT;

    public Convexo() {
        super(null);
    }

    public Convexo(Punto[] punto) {
        super(punto);
    }

    @Override
    public double area() {
        int i;
        double area = 0;

        for (i = 0; i < super.puntos.length - 2; i++) {
            puntoT = new Punto[3];
            puntoT[0] = super.puntos[0];
            puntoT[1] = super.puntos[i + 1];
            puntoT[2] = super.puntos[i + 2];
            area += new Triangulo(puntoT).area();
        }

        return area;
    }

    @Override
    public double perimetro() {
        int i, j;
        double perimetro = 0;

        for (i = 0; i < super.puntos.length; i++) {
            j = (i < super.puntos.length - 1) ? i + 1 : 0;
            perimetro += new Linea(super.puntos[i], super.puntos[j]).getDista();
        }

        return perimetro;
    }

}
