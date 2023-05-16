/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Circunferencia;

import java.util.Scanner;

public class Ej2Circunferencia {
    private double radio;
    
    public Ej2Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        this.radio = leer.nextDouble();
    }
    
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

  
    }

