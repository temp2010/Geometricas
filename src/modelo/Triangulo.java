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
public class Triangulo extends Figura {

    Linea[] linea = new Linea[3];

    public Triangulo(Punto[] punto) {
        super(punto);

        linea[0] = new Linea(this.puntos[0], this.puntos[1]);
        linea[1] = new Linea(this.puntos[1], this.puntos[2]);
        linea[2] = new Linea(this.puntos[2], this.puntos[0]);
    }

    @Override
    public double area() {
        double s = (linea[0].getDista() + linea[1].getDista() + linea[2].getDista()) / 2;
        return Math.sqrt((s * (s - linea[0].getDista()) * (s - linea[1].getDista()) * (s - linea[2].getDista())));
    }

    @Override
    public double perimetro() {
        return linea[0].getDista() + linea[1].getDista() + linea[2].getDista();
    }

}
