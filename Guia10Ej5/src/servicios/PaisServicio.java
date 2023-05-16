/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import entidades.Comparadores;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public HashSet <Pais> listaPaises(){

        HashSet <Pais> listaPaises = new HashSet();
        String respuesta="";
        do {
            System.out.println("Agregar un País");
     String pais = leer.next();
            listaPaises.add(new Pais(pais));
            System.out.println("Desea agregar otro País? S/N");
            respuesta = leer.next();

        } while (!respuesta.equalsIgnoreCase("N"));
 return listaPaises;
    }

    public void mostrarPaises(HashSet <Pais> listaPaises){
        System.out.println(listaPaises.toString());
    }

    public void ordenarPaises(HashSet <Pais> listaPaises){
        TreeSet <Pais> paisesOrdenados = new TreeSet(Comparadores.ordenar);
        paisesOrdenados.addAll(listaPaises);
        System.out.println("Países Ordenados: "+paisesOrdenados.toString());
    }

    public void buscarPaises(HashSet <Pais> listaPaises){
        Iterator <Pais> iterator = listaPaises.iterator();

        System.out.println("Ingresar una País a buscar en la Lista");
        String respuesta=leer.next();
        boolean encontrada=false;

        while (iterator.hasNext()) {
 Pais next = iterator.next();

            if (next.getNombrePais().equalsIgnoreCase(respuesta)){
            iterator.remove ();
            encontrada = true;
            }
        } 
        if (encontrada==false) {
            System.out.println("No se encuentra el País en la Lista");
        }

        for (Pais aux : listaPaises){

            System.out.println(aux);
        }
    }

}
/*
Clase PaisServicio:

Esta clase proporciona los servicios relacionados con los países.
Tiene un atributo leer de tipo Scanner para leer la entrada del usuario.
El método listaPaises() solicita al usuario ingresar países en un bucle y los agrega al conjunto HashSet.
El bucle continúa hasta que el usuario responda "N" a la pregunta "Desea agregar otro país?".
El método devuelve el conjunto HashSet resultante.
El método mostrarPaises() recibe un conjunto HashSet de países y muestra su contenido utilizando el método toString().
El método ordenarPaises() recibe un conjunto HashSet de países y crea un TreeSet utilizando un comparador personalizado Comparadores.ordenar, que ordena los países alfabéticamente.
Luego muestra los países ordenados utilizando el método toString().
El método buscarPaises() recibe un conjunto HashSet de países y solicita al usuario que ingrese un país a buscar.
Utiliza un Iterator para recorrer el conjunto y buscar el país ingresado.
Si se encuentra el país, se elimina del conjunto utilizando el método remove() del Iterator.
Si el país no se encuentra, se muestra un mensaje indicando que no se encuentra en la lista.
Finalmente, muestra el contenido actualizado del conjunto.
*/



