/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import Entidades.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {

    public static void sortByDuration(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Integer.compare(m2.getDuration(), m1.getDuration());
            }
        });
    }

    public static void sortByLessDuration(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Integer.compare(m1.getDuration(), m2.getDuration());
            }
        });
    }

    public static void sortByTitle(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getTitle().compareTo(m2.getTitle());
            }
        });
    }

    public static void sortByDirector(ArrayList<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getDirector().compareTo(m2.getDirector());
            }
        });
    }
}



/*
Método sortByDuration(ArrayList<Movie> movies):

Recibe una lista de películas como argumento.
Utiliza Collections.sort() para ordenar la lista de películas en función de la duración de mayor a menor.
Se crea una instancia de Comparator<Movie> anónimo que compara dos películas (m1 y m2) en función de su duración utilizando Integer.compare().
La implementación de compare() compara la duración de las películas y retorna el resultado en orden inverso (m2.getDuration() - m1.getDuration()).
Método sortByLessDuration(ArrayList<Movie> movies):

Recibe una lista de películas como argumento.
Utiliza Collections.sort() para ordenar la lista de películas en función de la duración de menor a mayor.
Se crea una instancia de Comparator<Movie> anónimo que compara dos películas (m1 y m2) en función de su duración utilizando Integer.compare().
La implementación de compare() compara la duración de las películas y retorna el resultado en orden ascendente (m1.getDuration() - m2.getDuration()).
Método sortByTitle(ArrayList<Movie> movies):

Recibe una lista de películas como argumento.
Utiliza Collections.sort() para ordenar la lista de películas en función del título en orden alfabético.
Se crea una instancia de Comparator<Movie> anónimo que compara dos películas (m1 y m2) en función de sus títulos utilizando el método compareTo() de String.
La implementación de compare() compara los títulos de las películas utilizando el método compareTo() y retorna el resultado de la comparación.
Método sortByDirector(ArrayList<Movie> movies):

Recibe una lista de películas como argumento.
Utiliza Collections.sort() para ordenar la lista de películas en función del director en orden alfabético.
Se crea una instancia de Comparator<Movie> anónimo que compara dos películas (m1 y m2) en función de sus directores utilizando el método compareTo() de String.
La implementación de compare() compara los directores de las películas utilizando el método compareTo() y retorna el resultado de la comparación.
En resumen, la clase Comparators proporciona métodos estáticos que permiten ordenar la lista de películas según diferentes criterios, como la duración, el título y el director. Utiliza la clase Collections y la interfaz Comparator para realizar los ordenamientos.
*/