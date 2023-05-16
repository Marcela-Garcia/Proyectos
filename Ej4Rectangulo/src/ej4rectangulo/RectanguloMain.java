/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4rectangulo;


public class RectanguloMain {
    
    public static void main(String[] args) {
        Ej4Rectangulo rectangulo = new Ej4Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("Superficie: " + rectangulo.calcularSuperficie());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        rectangulo.dibujarRectangulo();
    }
}

