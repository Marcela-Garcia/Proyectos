/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej1;

public class Main {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Tito", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Cata", "Bulldog", 5, "Mediano");

        Persona persona1 = new Persona("Juan", "Perez", 30, "12345678");
        Persona persona2 = new Persona("Julia", "Garcia", 25, "98765432");

        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        System.out.println("Información de la Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Documento: " + persona1.getDocumento());

        System.out.println("Información del Perro adoptado por Persona 1:");
        Perro perroPersona1 = persona1.getPerro();
        System.out.println("Nombre: " + perroPersona1.getNombre());
        System.out.println("Raza: " + perroPersona1.getRaza());
        System.out.println("Edad: " + perroPersona1.getEdad());
        System.out.println("Tamaño: " + perroPersona1.getTamaño());

        System.out.println("------------------------");

        System.out.println("Información de la Persona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Documento: " + persona2.getDocumento());

        System.out.println("Información del Perro adoptado por Persona 2:");
        Perro perroPersona2 = persona2.getPerro();

        System.out.println("Nombre: " + perroPersona2.getNombre());
        System.out.println("Raza: " + perroPersona2.getRaza());
        System.out.println("Edad: " + perroPersona2.getEdad());
        System.out.println("Tamaño: " + perroPersona2.getTamaño());
    }
}
