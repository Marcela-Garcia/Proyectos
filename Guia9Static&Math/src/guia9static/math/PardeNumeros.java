/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9static.math;

// Clase ParDeNumeros con dos atributos num1 y num2
public class PardeNumeros {
    private double num1;
    private double num2;
    
    // Constructor vacío que genera dos números aleatorios con Math.random()
    public PardeNumeros() {
        this.num1 = Math.random();
        this.num2 = Math.random();
    }
    
    // Getters y setters para num1 y num2
    public double getNum1() {
        return num1;
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public double getNum2() {
        return num2;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
