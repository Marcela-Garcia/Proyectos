/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

public class Main {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];

        ArregloServicio arregloService = new ArregloServicio();

        arregloService.inicializarA(A);
        System.out.println("Arreglo A inicializado:");
        arregloService.mostrar(A);

        arregloService.ordenar(A);
        System.out.println("\nArreglo A ordenado de mayor a menor:");
        arregloService.mostrar(A);

        arregloService.inicializarB(A, B);
        System.out.println("\nArreglo B inicializado:");
        arregloService.mostrar(B);

        System.out.println("\nArreglo A:");
        arregloService.mostrar(A);
    }
}
