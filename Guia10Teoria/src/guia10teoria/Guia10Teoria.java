/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Guia10Teoria {

    public static void main(String[] args) {

        // MANOS A LA OBRA – DETECCIÓN DE ERRORES Corrige el siguiente código:
        ArrayList<Integer> listado = new ArrayList(); // Integer y los () al final.
        TreeSet<String> nombre = new TreeSet(); // Nombre de la variable y la palabra new.
        HashMap<Integer, String> personas = new HashMap(); // Pasarle 2(dos) valores en la creacion.

        /**
         * EJERCICIO COLECCIONES Toma la Lista, el Conjunto y el Mapa del
         * ejemplo y agrega 5 objetos a cada uno.
         */
        for (int i = 0; i < 5; i++) {
            listado.add(i);
            String e = "HolaMundo!" + i;
            nombre.add(e);
            personas.put(i, e);
        }

        System.out.println(listado);
        System.out.println(nombre);
        System.out.println(personas);

        /**
         * Toma la Lista, el Conjunto y el Mapa que hiciste previamente y
         * elimina en cada uno un objeto de cada forma que aprendiste arriba.
         */
        listado.remove(3);
        String args1 = "HolaMundo!3";
        nombre.remove(args1);
        personas.remove(3);

        System.out.println(listado);
        System.out.println(nombre);
        System.out.println(personas);

        // MANOS A LA OBRA – DETECCIÓN DE ERRORES
        HashMap<Integer, String> personas1 = new HashMap(); // Agregar String y () al final.
        String n1 = "Albus"; // Agregar Comillas.
        String n2 = "Severus"; // Cambiar por Comillas.
        personas.put(0, n1); // Posicion y put en vez de add.
        personas.put(1, n2); // Posicion y put en vez de add.

        //MANOS A LA OBRA - DETECCIÓN DE ERRORES
        ArrayList<String> bebidas = new ArrayList(); // Agregar el nombre "bebidas" y Agregar alfinal ;
        bebidas.add("café"); // add en vez de put y "" Comillas.
        bebidas.add("té"); // "" Comillas. 
        System.out.println(bebidas);
        Iterator<String> it = bebidas.iterator(); // Importar Clase
        while (it.hasNext()) { // palabra clave while y hasNext Arreglar.
            if (it.next().equals("café")) { // Comillas.
                it.remove();
            } // Faltaba Cerrar el if. 
        }
        System.out.println(bebidas);

        /**
         * EJERCICIO LISTA LIBROS ¡Es tu turno! Crea una lista de Libros y
         * muestra el título de cada uno con un bucle.
         */
        ArrayList<String> listaLibros = new ArrayList();
        listaLibros.add("El Señor de los Anillos");
        listaLibros.add("Martín Fierro");
        listaLibros.add("La Biblia");
        listaLibros.add("El diario de Ana Frank");

        for (String libroEjemplar : listaLibros) {
            System.out.println(libroEjemplar);
        }

    }

}



/*
ejemplo cuadernillo (lista conjuntos y mapas).

En este ejemplo, creamos un mapa utilizando la clase `HashMap`. Agregamos tres pares clave-valor al mapa, 
donde la clave es el nombre y el valor es la edad. Luego, utilizamos el método `get()` para obtener la 
edad asociada al nombre "Juan". También verificamos si la clave "María" existe utilizando el método 
`containsKey()`. Finalmente, recorremos el mapa utilizando un bucle `for-each` y la interfaz 
`Map.Entry` para obtener cada par clave-valor y mostrarlo en la consola.
Espero que esta explicación te haya ayudado a entender las colecciones en Java.
Recuerda que existen muchas más operaciones y métodos disponibles para trabajar con colecciones,
pero estos ejemplos básicos te darán una idea de cómo empezar a utilizarlas. ¡Si tienes más preguntas, 
no dudes en hacerlas!

*/