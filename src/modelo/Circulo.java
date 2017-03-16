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
public class Circulo extends Figura {

    int radio;

    public Circulo(int radio, Punto[] centro) {
        super(centro);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

}
