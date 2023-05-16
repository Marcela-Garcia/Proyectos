/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9static.math;

public class Main {

    public static void main(String[] args) {

        // Crear objeto ParDeNumeros y objeto ParDeNumerosService
        PardeNumeros par = new PardeNumeros();
        ParDeNumerosService servicio = new ParDeNumerosService(par);

        // Mostrar los valores guardados en el objeto ParDeNumeros
        servicio.mostrarValores();

        // Calcular y mostrar el mayor de los dos números
        System.out.println("El número mayor es: " + servicio.devolverMayor());

        // Calcular y mostrar la potencia del mayor número elevado al menor número
        System.out.println("La potencia del mayor número elevado al menor número es: " + servicio.calcularPotencia());

        // Calcular y mostrar la raíz cuadrada del menor número
        System.out.println("La raíz cuadrada del menor número es: " + servicio.calculaRaiz());
    }
}
