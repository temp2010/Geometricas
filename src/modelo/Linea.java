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
public class Linea {

    private Punto desde, hasta;
    private double dista;

    public Linea() {
    }
    
    public Linea(Punto desde, Punto hasta) {
        this.desde = desde;
        this.hasta = hasta;
        this.dista = distancia(desde, hasta);
    }

    public Double distancia(Punto desde, Punto hasta) {
        return Math.sqrt(Math.pow(desde.getX() - hasta.getX(), 2) + Math.pow(desde.getY() - hasta.getY(), 2));
    }

    public double getDista() {
        return dista;
    }

    public void setDista(double dista) {
        this.dista = dista;
    }

}
