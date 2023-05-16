/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej5;

import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.HashSet;


public class Main {


    public static void main(String[] args) {

        PaisServicio p = new PaisServicio();

        HashSet <Pais> paises = p.listaPaises();
        p.mostrarPaises(paises);
        p.ordenarPaises(paises);
        p.buscarPaises(paises);

    }

}




/*import servicios.PaisService;

public class Main {

    public static void main(String[] args) {
        PaisService paisService = new PaisService();

        paisService.agregarPais("Argentina");
        paisService.agregarPais("Brasil");
        paisService.agregarPais("Chile");
        paisService.agregarPais("Perú");
        paisService.agregarPais("Colombia");

        System.out.println("Paises ingresados:");
        paisService.mostrarPaises();

        System.out.println("Paises ordenados alfabéticamente:");
        paisService.ordenarPaises();

        paisService.eliminarPais("Brasil");

        System.out.println("Paises después de eliminar:");
        paisService.mostrarPaises();
    }
}
*/