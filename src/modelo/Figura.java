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
public abstract class Figura {
    Punto[] puntos;

    public Figura(Punto[] punto) {
        this.puntos = punto;
    }
    
    public abstract double area();
    public abstract double perimetro();    
}
