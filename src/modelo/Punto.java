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
public class Punto {

    private int x, y;

    public Punto() {
        String _x, _y;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("x:");
            _x = teclado.next();
        } while (!validaNumero(_x));

        do {
            System.out.println("y:");
            _y = teclado.next();
        } while (!validaNumero(_y));

        this.x = Integer.parseInt(_x);
        this.y = Integer.parseInt(_y);
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean validaNumero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
