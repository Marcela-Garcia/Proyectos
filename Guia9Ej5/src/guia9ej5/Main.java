/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej5;

import Servicio.PersonaService;
import Entidad.Persona;

public class Main {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();

        // crear una persona
        Persona persona = personaService.crearPersona();

        // calcular su edad
        int edad = personaService.calcularEdad(persona);
        System.out.println("La edad de la persona es: " + edad);

        // verificar si es menor que una edad determinada
        int edadConsultada = 18;
        boolean esMenor = personaService.menorQue(persona, edadConsultada);
        if (esMenor) {
            System.out.println("La persona es menor que " + edadConsultada + " años.");
        } else {
            System.out.println("La persona es mayor o igual que " + edadConsultada + " años.");
        }

        // mostrar la información de la persona
        personaService.mostrarPersona(persona);
    }
}
