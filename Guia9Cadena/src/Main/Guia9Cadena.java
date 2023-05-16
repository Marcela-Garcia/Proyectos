/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import entidades.Cadena;
import servicios.CadenaServicio;

public class Guia9Cadena {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Creamos una instancia de la clase Cadena
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        Cadena cadena = new Cadena(frase);
        
        // Creamos una instancia de la clase CadenaServicio
        CadenaServicio servicio = new CadenaServicio();
        
        // Mostramos la cantidad de vocales en la frase
        System.out.println("La cantidad de vocales en la frase es: " + servicio.mostrarVocales(cadena));
        
        // Invertimos la frase y la mostramos
        System.out.println("La frase invertida es: " + servicio.invertirFrase(cadena));
        
        // Pedimos una letra al usuario y contamos cuantas veces se repite
        System.out.print("Ingrese una letra: ");
        String letra = sc.nextLine();
        System.out.println("La letra '" + letra + "' se repite " + servicio.vecesRepetido(cadena, letra) + " veces en la frase.");
        
        // Pedimos otra frase al usuario y comparamos su longitud con la frase original
        System.out.print("Ingrese otra frase: ");
        String otraFrase = sc.nextLine();
        System.out.println("La longitud de la frase original es " + cadena.getLongitud() + " y la longitud de la nueva frase es " + otraFrase.length());
        servicio.compararLongitud(cadena, otraFrase);
        
        // Pedimos otra frase al usuario y la unimos con la original
        System.out.print("Ingrese otra frase: ");
        String unaFraseMas = sc.nextLine();
        System.out.println("La frase resultante es: " + servicio.unirFrases(cadena, unaFraseMas));
        
        // Pedimos una letra al usuario y la reemplazamos en la frase original
        System.out.print("Ingrese una letra para reemplazar las 'a' de la frase original: ");
        String nuevaLetra = sc.nextLine();
        System.out.println("La frase reemplazando las 'a' por '" + nuevaLetra + "' es: " + servicio.reemplazar(cadena, "a", nuevaLetra));
        
        // Pedimos una letra al usuario y comprobamos si está en la frase original
        System.out.print("Ingrese una letra para comprobar si está en la frase original: ");
        String otraLetra = sc.nextLine();
        if (servicio.contiene(cadena, otraLetra)) {
            System.out.println("La frase contiene la letra '" + otraLetra + "'");
        } else {
            System.out.println("La frase no contiene la letra '" + otraLetra + "'");
        }
        
    }
}
