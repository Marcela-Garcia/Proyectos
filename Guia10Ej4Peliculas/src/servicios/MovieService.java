/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidades.Movie;
import utilidades.Comparators;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Movie> moviesList = new ArrayList<>();
    /*
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
Scanner es una clase de Java que se utiliza para leer la entrada del usuario desde la consola.
sc es el nombre de la variable que se utiliza para referenciar el objeto Scanner.
new Scanner(System.in) crea una nueva instancia de Scanner que toma la entrada del usuario desde
    la consola..useDelimiter("\n") establece el delimitador de lectura para el objeto Scanner. 
    En este caso, se establece como "\n", lo que significa que cada vez que el usuario presione
    la tecla "Enter" se considerará como un delimitador, lo que permite leer una línea completa 
    de entrada en lugar de solo una palabra.
private ArrayList<Movie> moviesList = new ArrayList<>();
ArrayList<Movie> es una declaración de variable que crea una lista de objetos Movie utilizando 
    la clase ArrayList de Java.
moviesList es el nombre de la variable que se utiliza para referenciar el objeto ArrayList.
new ArrayList<>() crea una nueva instancia de ArrayList vacía que almacenará objetos de tipo Movie.
En resumen, esta declaración crea una lista vacía llamada moviesList que se utilizará para almacenar 
    objetos de la clase Movie.
    
    */
    public MovieService() {
    }

    public MovieService(ArrayList<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }

    public void createMovie() {
        String answer;

        do {
            Movie m = new Movie();
            System.out.print("Ingrese el título de la película: ");
            m.setTitle(sc.next());
            System.out.print("Ingrese el director de la película: ");
            m.setDirector(sc.next());
            System.out.print("Ingrese la duración de la película (en horas): ");
            m.setDuration(sc.nextInt());

            moviesList.add(m);

            System.out.println("¿Desea agregar otra película? (S/N)");
            answer = sc.next();

        } while (answer.equalsIgnoreCase("S"));
    }

    public void showAllMovies(ArrayList<Movie> moviesList) {
        for (Movie aux : moviesList) {
            System.out.println(aux);
        }
    }

    public void showLongestMovies(ArrayList<Movie> moviesList) {
        System.out.println("\nPelículas con duración mayor a 1 hora:");
        for (Movie movie : moviesList) {
            if (movie.getDuration() > 1) {
                System.out.println(movie);
            }
        }
    }

    public void orderByDuration(ArrayList<Movie> moviesList) {
        Comparators.sortByDuration(moviesList);
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Movie aux : moviesList) {
            System.out.println(aux.getTitle() + " (" + aux.getDirector() + ") - Duración: " + aux.getDuration() + " horas");
        }
    }

    public void orderByLessDuration(ArrayList<Movie> moviesList) {
        Comparators.sortByLessDuration(moviesList);
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        for (Movie aux : moviesList) {
            System.out.println(aux.getTitle() + " (" + aux.getDirector() + ") - Duración: " + aux.getDuration() + " horas");
        }
    }

    public void orderByTitle(ArrayList<Movie> moviesList) {
        Comparators.sortByTitle(moviesList);
        System.out.println("Películas ordenadas por título:");
        for (Movie movie : moviesList) {
            System.out.println(movie.getTitle());
        }
    }

    public void orderByDirector(ArrayList<Movie> moviesList) {
        Comparators.sortByDirector(moviesList);
        System.out.println("Películas ordenadas por director:");
        for (Movie movie : moviesList) {
            System.out.println(movie.getDirector());
        }
    }
}


/*
La clase MovieService es una clase que proporciona servicios relacionados con las películas. 

Atributos:
Scanner sc: Un objeto Scanner utilizado para leer la entrada del usuario.
private ArrayList<Movie> moviesList: Una lista de películas representada como un ArrayList.
Constructor sin argumentos: public MovieService()

Crea una instancia de la clase MovieService sin inicializar la lista de películas.
Constructor con argumentos: public MovieService(ArrayList<Movie> moviesList)

Crea una instancia de la clase MovieService y asigna la lista de películas proporcionada.
Método getMoviesList(): public ArrayList<Movie> getMoviesList()

Retorna la lista de películas.
Método createMovie(): public void createMovie()

Permite al usuario crear una nueva película.
Crea una nueva instancia de la clase Movie.
Solicita al usuario que ingrese el título, el director y la duración de la película.
Agrega la película a la lista de películas.
Pregunta al usuario si desea agregar otra película. Si la respuesta es "S" (Sí), se repite el proceso.
Método showAllMovies(): public void showAllMovies(ArrayList<Movie> moviesList)

Muestra todas las películas en la lista de películas.
Recorre la lista de películas y muestra cada película llamando a su método toString().
Método showLongestMovies(): public void showLongestMovies(ArrayList<Movie> moviesList)

Muestra todas las películas en la lista de películas con una duración mayor a 1 hora.
Recorre la lista de películas y verifica si la duración de cada película es mayor a 1 hora. Si es así, muestra la película llamando a su método toString().
Método orderByDuration(): public void orderByDuration(ArrayList<Movie> moviesList)

Ordena la lista de películas por duración de mayor a menor.
Llama al método estático Comparators.sortByDuration() pasando la lista de películas como argumento.
Muestra las películas ordenadas por duración, mostrando el título, el director y la duración de cada película.
Método orderByLessDuration(): public void orderByLessDuration(ArrayList<Movie> moviesList)

Ordena la lista de películas por duración de menor a mayor.
Llama al método estático Comparators.sortByLessDuration() pasando la lista de películas como argumento.
Muestra las películas ordenadas por duración, mostrando el título, el director y la duración de cada película.
Método orderByTitle(): public void orderByTitle(ArrayList<Movie> moviesList)

Ordena la lista de películas por título en orden alfabético.
Llama al método estático Comparators.sortByTitle() pasando la lista de películas como argumento.
Muestra los títulos de las películas ordenados alfabéticamente.
Método orderByDirector(): public void orderByDirector(ArrayList<Movie> moviesList)

Ordena la lista de películas por director en orden alfabético.
Llama al método estático Comparators.sortByDirector() pasando la lista de películas como argumento.
Muestra los directores de las películas
*/