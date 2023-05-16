/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaconjuntosmpas;

  import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        // Agregar elementos a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        // Acceder a un elemento por índice
        String primerNombre = nombres.get(0);
        System.out.println("Primer nombre: " + primerNombre);

        // Recorrer la lista
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
