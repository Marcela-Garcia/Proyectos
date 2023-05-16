/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cine cine = new Cine();
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese el título de la película: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el director de la película: ");
            String director = scanner.nextLine();

            System.out.print("Ingrese la duración de la película (en horas): ");
            int duracion = Integer.parseInt(scanner.nextLine());

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            cine.agregarPelicula(pelicula);

            System.out.print("¿Desea agregar otra película? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println();

        cine.mostrarPeliculas();
        System.out.println();

        cine.mostrarPeliculasDuracionMayorA1Hora();
        System.out.println();

        cine.ordenarPeliculasPorDuracionDesc();
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        cine.mostrarPeliculas();
        System.out.println();

        cine.ordenarPeliculasPorDuracionAsc();
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        cine.mostrarPeliculas();
        System.out.println();

        cine.ordenarPeliculasPorTitulo();
        System.out.println("Películas ordenadas por título:");
        cine.mostrarPeliculas();
        System.out.println();

        cine.ordenarPeliculasPorDirector();
        System.out.println("Películas ordenadas por director:");
        cine.mostrarPeliculas();
    }
}




/*
 bucle do-while para solicitar al usuario los detalles de cada película y agregarlas a 
la lista de películas del cine utilizando el método agregarPelicula().
*/