/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura {

    int radio;

    public Circulo() {
        super(null);
        String radio;
        Punto[] punto = new Punto[1];
        Scanner teclado = new Scanner(System.in);

        punto[0] = new Punto();
        do {
            System.out.println("Ingrese el radio");
            radio = teclado.next();
        } while (!punto[0].validaNumero(radio));

        super.puntos = punto;
        this.radio = Integer.parseInt(radio);
    }

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
