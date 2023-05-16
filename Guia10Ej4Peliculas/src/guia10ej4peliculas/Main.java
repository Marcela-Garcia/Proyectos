/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej4peliculas;

import servicios.MovieService;

public class Main {

    public static void main(String[] args) {
        MovieService mvs = new MovieService();

        mvs.createMovie();
        mvs.showAllMovies(mvs.getMoviesList());
        mvs.showLongestMovies(mvs.getMoviesList());
        mvs.orderByDuration(mvs.getMoviesList());
        mvs.orderByLessDuration(mvs.getMoviesList());
        mvs.orderByTitle(mvs.getMoviesList());
        mvs.orderByDirector(mvs.getMoviesList());
    }
}


/*
public static void main(String[] args) { ... }: El método main es el punto de entrada del 
programa y se ejecuta cuando se inicia la aplicación.
MovieService mvs = new MovieService();: Crea una instancia de la clase MovieService llamada mvs.
mvs.createMovie();: Llama al método createMovie() de la instancia de MovieService para crear películas. 
Este método permite al usuario ingresar información sobre una película y la agrega a la lista de películas.
mvs.showAllMovies(mvs.getMoviesList());: Llama al método showAllMovies() de la instancia de MovieService 
para mostrar todas las películas de la lista. Este método recorre la lista de películas y muestra la 
información de cada una de ellas.
mvs.showLongestMovies(mvs.getMoviesList());: Llama al método showLongestMovies() de la instancia 
de MovieService para mostrar las películas con una duración mayor a 1 hora. Este método recorre
la lista de películas y muestra la información de las películas que cumplen con el criterio de duración.
mvs.orderByDuration(mvs.getMoviesList());: Llama al método orderByDuration() de la instancia de 
MovieService para ordenar las películas por duración de mayor a menor. Este método utiliza el 
método Comparators.sortByDuration() para realizar el ordenamiento y luego muestra la lista 
ordenada por duración.
mvs.orderByLessDuration(mvs.getMoviesList());: Llama al método orderByLessDuration() de la 
instancia de MovieService para ordenar las películas por duración de menor a mayor. 
Este método utiliza el método Comparators.sortByLessDuration() para realizar el ordenamiento
y luego muestra la lista ordenada por duración.
mvs.orderByTitle(mvs.getMoviesList());: Llama al método orderByTitle() de la instancia de 
MovieService para ordenar las películas por título. Este método utiliza el método 
Comparators.sortByTitle() para realizar el ordenamiento y luego muestra la lista ordenada por título.
mvs.orderByDirector(mvs.getMoviesList());: Llama al método orderByDirector() de la instancia de 
MovieService para ordenar las películas por director. Este método utiliza el método 
Comparators.sortByDirector() para realizar el ordenamiento y luego muestra la lista ordenada por director.
*/