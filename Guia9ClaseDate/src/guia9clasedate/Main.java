/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos la fecha de nacimiento al usuario
        System.out.println("Ingrese su fecha de nacimiento (en formato dd/mm/aaaa):");
        String fechaNacimiento = scanner.nextLine();
        
        // Creamos un objeto FechaService
        FechaService fechaService = new FechaService();
        
        // Convertimos la fecha de nacimiento en un objeto Fecha
        Fecha fechaNac = fechaService.fechaNacimiento(fechaNacimiento);
        
        // Obtenemos la fecha actual
        Fecha fechaActual = fechaService.fechaActual();
        
        // Calculamos la diferencia de años
        int edad = fechaService.diferencia(fechaNac, fechaActual);
        
        // Mostramos la edad por pantalla
        System.out.println("Usted tiene " + edad + " años.");
    }

}
