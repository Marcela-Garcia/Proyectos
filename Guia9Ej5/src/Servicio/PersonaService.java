/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento de la persona (en formato dd/mm/yyyy): ");
        String fechaStr = sc.nextLine();
        Date fechaNacimiento = new Date(fechaStr);
        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Persona persona) {
        LocalDate fechaNacimiento = persona.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
    
    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }
    
    public void mostrarPersona(Persona persona) {
    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    System.out.println("Edad: " + calcularEdad(persona));
}
}
