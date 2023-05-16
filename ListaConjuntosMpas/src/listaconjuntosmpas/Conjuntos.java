/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaconjuntosmpas;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        // Agregar elementos al conjunto
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        // Verificar si un elemento existe en el conjunto
        boolean contieneDiez = numeros.contains(10);
        System.out.println("¿Contiene el número 10? " + contieneDiez);

        // Recorrer el conjunto
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
