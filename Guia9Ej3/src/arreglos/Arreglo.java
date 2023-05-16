/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;


import java.util.Arrays;

public class Arreglo {
    private double[] numeros;
    
    //Constructor vacío
    public Arreglo() {
        this.numeros = new double[0];
    }
    
    //Constructor parametrizado
    public Arreglo(int tamano) {
        this.numeros = new double[tamano];
    }
    
    //Getter y Setter
    public double[] getNumeros() {
        return numeros;
    }
    
    public void setNumeros(double[] numeros) {
        this.numeros = numeros;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(numeros);
    }
}
