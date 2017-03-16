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
    Linea[] linea;
    Triangulo[] convexo;

    public Convexo(Punto[] punto) {
        super(punto);

        int i, j, nTriangulos = punto.length - 2;
        linea = new Linea[punto.length];
        convexo = new Triangulo[nTriangulos];

        for (i = 0; i < punto.length; i++) {
            j = (i < punto.length - 1) ? i + 1 : 0;
            linea[i] = new Linea(puntos[i], this.puntos[j]);
        }

        for (i = 0; i < nTriangulos; i++) {
            puntoT = new Punto[3];
            puntoT[0] = punto[0];
            puntoT[1] = punto[i + 1];
            puntoT[2] = punto[i + 2];
            convexo[i] = new Triangulo(puntoT);
        }
    }

    @Override
    public double area() {
        int i;
        double area = 0;

        for (i = 0; i < convexo.length; i++) {
            area += convexo[i].area();
        }
        return area;
    }

    @Override
    public double perimetro() {
        int i;
        double perimetro = 0;

        for (i = 0; i < linea.length; i++) {
            perimetro += linea[i].getDista();
        }
        return perimetro;
    }

}
