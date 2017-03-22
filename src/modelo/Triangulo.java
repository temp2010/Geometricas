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

    Linea linea;

    public Triangulo() {
        super(null);
        Punto[] punto = new Punto[3];
        for (int i = 0; i < 3; i++) {
            punto[i] = new Punto();
        }
        super.puntos = punto;
    }

    public Triangulo(Punto[] punto) {
        super(punto);
    }

    @Override
    public double area() {
        double a, b, c;
        
        a = new Linea(this.puntos[0], this.puntos[1]).getDista();
        b = new Linea(this.puntos[1], this.puntos[2]).getDista();
        c = new Linea(this.puntos[2], this.puntos[0]).getDista();
        double s = (a + b + c) / 2;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public double perimetro() {
        double perimetro = 0;

        for (int i = 0; i < 3; i++) {
            int j = (i < 2) ? i + 1 : 0;
            linea = new Linea(puntos[i], puntos[j]);
            perimetro += linea.getDista();
        }

        return perimetro;
    }

}
