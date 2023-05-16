/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaconjuntosmpas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos al mapa
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 35);
        // Obtener el valor asociado a una clave
        int edadJuan = edades.get("Juan");
        System.out.println("Edad de Juan: " + edadJuan);

        // Verificar si una clave existe en el mapa
        boolean contieneMaria = edades.containsKey("María");
        System.out.println("¿Contiene la clave 'María'? " + contieneMaria);

        // Recorrer el mapa
        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println(nombre + ": " + edad);
        }

    }
    
}

/* 1: Eliminar un elemento del mapa

    import java.util.HashMap ;
    import java.util.Map ;

    public class Mapas {

            public static void main(String[] args) {
                Map<String, Integer> edades = new HashMap<>();
                edades.put("Juan", 25);
                edades.put("María", 30);
                edades.put("Pedro", 35);

                System.out.println("Antes de eliminar: " + edades);

                // Eliminar un elemento del mapa
                edades.remove("Juan");

                System.out.println("Después de eliminar: " + edades);
            }
        }

    }
*/
/*
  2: Verificar si un valor existe en el mapa

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 35);

        int edad = 30;

        // Verificar si un valor existe en el mapa
        boolean contieneEdad = edades.containsValue(edad);

        if (contieneEdad) {
            System.out.println("El mapa contiene la edad " + edad);
        } else {
            System.out.println("El mapa no contiene la edad " + edad);
        }
    }
}
En este ejemplo, creamos un mapa llamado edades y agregamos tres pares clave-valor. 
Luego, definimos una variable edad y utilizamos el método containsValue() para 
verificar si ese valor existe en el mapa. Dependiendo del resultado, mostramos un 
mensaje indicando si el mapa contiene o no la edad especificada.
*/
/*
ejemplo actualizado que solicita al usuario que ingrese una clave y luego imprime 
el valor correspondiente del mapa:

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> nombres = new HashMap<>();
        nombres.put("Juan", "Pérez");
        nombres.put("María", "Gómez");
        nombres.put("Pedro", "López");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.nextLine();

        String apellido = nombres.get(nombre);

        if (apellido != null) {
            System.out.println("El apellido de " + nombre + " es " + apellido);
        } else {
            System.out.println("No se encontró un apellido para " + nombre);
        }
    }
}
En este ejemplo, creamos un mapa llamado nombres que asocia nombres con apellidos. 
Luego, utilizamos la clase Scanner para solicitar al usuario que ingrese un nombre. 
A continuación, utilizamos el método get() del mapa para obtener el valor (apellido) 
correspondiente a la clave (nombre) ingresada por el usuario. Si se encuentra un apellido, 
lo imprimimos. De lo contrario, mostramos un mensaje indicando que no se encontró un 
apellido para ese nombre.
*/