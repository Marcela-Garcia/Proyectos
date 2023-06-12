/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11teoria;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {  //para solicitar la informacion de dos personas
            System.out.println("Ingrese su nombre: ");
            String nombre = leer.next();
            
            System.out.println("Ingrese su apellido: ");
            String apellido = leer.next();
            
            System.out.println("Ingrese la serie del DNI: ");
            char serie = leer.next().charAt(0);
            
            System.out.println("Ingrese el número del DNI: ");
            int numero = leer.nextInt();
            
            leer.nextLine(); // Limpiar el búfer:después de leer un entero con nextInt(),agregar leer.nextLine() 

            
            Dni dni = new Dni(); //creamos un objeto Dni, establecemos los valores ingresados utilizando los métodos set, y lo asignamos al objeto Persona 
            dni.setSerie(serie);
            dni.setNumero(numero);
            
            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDni(dni);
            
            System.out.println("Información de la persona:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("DNI: " + persona.getDni().getSerie() + persona.getDni().getNumero());
            System.out.println("------------------------");
        }
    }
}
  
