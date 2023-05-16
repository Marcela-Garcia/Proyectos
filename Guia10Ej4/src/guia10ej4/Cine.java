/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Cine {

    private List<Pelicula> peliculas = new ArrayList<>();

    public Cine() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        boolean add = peliculas.add(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("Lista de películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("--------------------");
        }
    }

    public void mostrarPeliculasDuracionMayorA1Hora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
                System.out.println("--------------------");
            }
        }
    }

    public void ordenarPeliculasPorDuracionDesc() {
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());

    }

    public void ordenarPeliculasPorDuracionAsc() {
        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion));
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
    }
}




/*
La clase Cine representa el sistema del cine y contiene una lista de películas. Tiene los siguientes 
métodos:
agregarPelicula(Pelicula pelicula): agrega una película a la lista de películas del cine. 
Recibe un objeto de tipo Pelicula como parámetro y lo añade a la lista de películas.
mostrarPeliculas(): muestra en pantalla todas las películas de la lista. Recorre la lista 
de películas y muestra el título, el director y la duración de cada película en la consola.
mostrarPeliculasDuracionMayorA1Hora(): muestra en pantalla todas las películas de la lista 
cuya duración es mayor a 1 hora. Recorre la lista de películas y verifica si la duración 
de cada película es mayor a 1 hora antes de mostrarla.

ordenarPeliculasPorDuracionDesc(): ordena la lista de películas por duración de mayor a menor
Utiliza el método sort() de la clase Collections junto con un Comparator que compara las duraciones 
de las películas en orden descendente.
ordenarPeliculasPorDuracionAsc(): ordena la lista de películas por duración de menor a mayor. 
Utiliza el método sort() de la clase Collections junto con un Comparator que compara las 
duraciones de las películas en orden ascendente.
ordenarPeliculasPorTitulo(): ordena la lista de películas por título en orden alfabético. 
Utiliza el método sort() de la clase Collections junto con un Comparator que compara los 

títulos de las películas.
ordenarPeliculasPorDirector(): ordena la lista de películas por director en orden alfabético.
Utiliza el método sort() de la clase Collections junto con un Comparator que compara los nombres
de los directores de las películas.
*/