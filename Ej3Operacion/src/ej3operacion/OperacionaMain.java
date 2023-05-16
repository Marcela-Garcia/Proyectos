/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3operacion;

public class OperacionaMain {

    public static void main(String[] args) {
       Ej3Operacion operacion = new Ej3Operacion();
        operacion.crearOperacion();

        System.out.println("La suma de los números es: " + operacion.sumar());
        System.out.println("La resta de los números es: " + operacion.restar());
        System.out.println("El resultado de la multiplicación es: " + operacion.multiplicar());
        System.out.println("El resultado de la división es: " + operacion.dividir());
    }
}
