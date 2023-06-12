/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extra1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // List<Persona> personas = new ArrayList();
        ArrayList<Persona> personas = new ArrayList<Persona>();
         //List<Perro> perros = new ArrayList();
        ArrayList<Perro> perros = new ArrayList<Perro>();
       
       
        // Crear perros
        perros.add(new Perro("Fatiga"));
        perros.add(new Perro("Toby"));
        perros.add(new Perro("Sultan"));

        // Crear personas
        personas.add(new Persona("Juan"));
        personas.add(new Persona("María"));
        personas.add(new Persona("Pepe"));

        Scanner sc = new Scanner(System.in);

        // Asignar perros a personas
        for (Persona persona : personas) {
            System.out.println("Hola, " + persona.getNombre() + "! ¿Qué perro quieres adoptar?");

            for (Perro perro : perros) {
                System.out.println(" - " + perro.getNombre());
            }

            String nombrePerro = sc.nextLine();

            Perro perroElegido = null;

            for (Perro perro : perros) {
                if (perro.getNombre().equalsIgnoreCase(nombrePerro)) {
                    perroElegido = perro;
                    break;
                }
            }

            if (perroElegido != null) {
                persona.adoptarPerro(perroElegido);
            } else {
                System.out.println("No se encontró un perro con ese nombre.");
            }

            System.out.println();
        }

        // Mostrar las personas con sus respectivos perros
        System.out.println("Personas con sus respectivos perros:");
        for (Persona persona : personas) {
            String nombrePerro = persona.getPerro() != null ? persona.getPerro().getNombre() : "Ninguno";
            System.out.println(persona.getNombre() + " - " + nombrePerro);
        }
    }
}
