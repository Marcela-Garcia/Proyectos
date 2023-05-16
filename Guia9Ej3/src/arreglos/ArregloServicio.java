/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;



import java.util.Arrays;
import java.util.Random;

public class ArregloServicio {
    
    // Método para inicializar un arreglo con números aleatorios
    public void inicializarA(double[] arreglo) {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextDouble() * 100;
        }
    }
    
    // Método para mostrar un arreglo por pantalla
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
    
    // Método para ordenar un arreglo de mayor a menor
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }
    
    // Método para inicializar el arreglo B con los primeros 10 elementos del arreglo A y 10 valores 0.5
    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
    }
}
