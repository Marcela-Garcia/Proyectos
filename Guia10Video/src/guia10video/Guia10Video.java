/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10video;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Guia10Video {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        //lea y guarde
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        boolean confirmacion = true;//bucle a travez de un booleano
        do {
            System.out.println("Ingrese la raza del perro");
            razas.add(leer.next());//hacemos dentro del argumento, con el add lo estamos guardando en la lista
            System.out.println("Desea agregar otro perro? s/n");
            if (leer.next().equalsIgnoreCase("n")) {  //se puede usar el leer.next dentro del mismo if
                confirmacion = false; //va a salir del bucle si la pernosa ingresa n
            }
        } while (confirmacion);
        

        for (String raza : razas){
            // el for each dentro de la condicion tenemos que aclarar el tipo de dato que queremos que recorrer que va a ser la lista 
            // para diferenciar elementos de lista, tiene q ver algo q referencie el elemento, ejemplo arrayList perros que sea perro alqo que segmente los elementos de la lista, raza es la lista razas es cada elemento de la lista, siempre queremos mostrar los elementos de la lista 
            System.out.println(raza); 
        }
            System.out.println("Ingrese el perro que desa eliminar");
            String perroEliminar = leer.next();
            //iterator
            
    }

    }



