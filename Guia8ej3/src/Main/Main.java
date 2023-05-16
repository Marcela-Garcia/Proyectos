/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaServicio personaServicio = new PersonaServicio();

        // Crear 4 personas
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        System.out.println("Introduzca los datos de la primera persona:");
        personaServicio.crearPersona(persona1);

        System.out.println("Introduzca los datos de la segunda persona:");
        personaServicio.crearPersona(persona2);

        System.out.println("Introduzca los datos de la tercera persona:");
        personaServicio.crearPersona(persona3);

        System.out.println("Introduzca los datos de la cuarta persona:");
        personaServicio.crearPersona(persona4);

        // Calcular IMC y determinar si son mayores de edad
        Persona[] personas = {persona1, persona2, persona3, persona4};
        int[] imcCount = {0, 0, 0}; // Contador de personas con IMC bajo, normal y alto
        int mayorEdadCount = 0;
        for (Persona p : personas) {
            int imcResult = personaServicio.calcularIMC(p);
            switch (imcResult) {
                case -1:
                    System.out.println(p.getNombre() + " está por debajo de su peso ideal");
                    imcCount[0]++;
                    break;
                case 0:
                    System.out.println(p.getNombre() + " está en su peso ideal");
                    imcCount[1]++;
                    break;
                case 1:
                    System.out.println(p.getNombre() + " tiene sobrepeso");
                    imcCount[2]++;
                    break;
            }
            if (personaServicio.esMayorDeEdad(p)) {
                System.out.println(p.getNombre() + " es mayor de edad");
                mayorEdadCount++;
            } else {
                System.out.println(p.getNombre() + " es menor de edad");
            }
        }

        // Calcular porcentaje de IMC y mayor de edad
        double imcBajoPercent = imcCount[0] / 4.0 * 100.0;
        double imcNormalPercent = imcCount[1] / 4.0 * 100.0;
        double imcAltoPercent = imcCount[2] / 4.0 * 100.0;
        System.out.println("Porcentaje de personas con IMC bajo: " + imcBajoPercent + "%");
        System.out.println("Porcentaje de personas con IMC normal: " + imcNormalPercent + "%");
        System.out.println("Porcentaje de personas con IMC alto: " + imcAltoPercent + "%");
        double mayorEdadPercent = mayorEdadCount / 4.0 * 100.0;
        double menorEdadPercent = (4 - mayorEdadCount) / 4.0 * 100.0;
        System.out.println("Porcentaje de personas mayores de edad: " + mayorEdadPercent + "%");
        System.out.println("Porcentaje de personas menores de edad: " + menorEdadPercent + "%");
    }
}
