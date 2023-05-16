/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

public class Movie {

    private String title;
    private String director;
    private int duration;

    public Movie() {
    }

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + Objects.hashCode(this.director);
        hash = 59 * hash + this.duration;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.duration != other.duration) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + ", duration=" + duration + '}';
    }
}

/*
Constructor sin argumentos: public Movie()
Crea una instancia de la clase Movie sin inicializar los atributos.
Constructor con argumentos: public Movie(String title, String director, int duration)
Crea una instancia de la clase Movie y asigna los valores proporcionados a los atributos title, 
director y duration.

Métodos Getter y Setter:

public String getTitle(): Retorna el título de la película.
public void setTitle(String title): Establece el título de la película.
public String getDirector(): Retorna el director de la película.
public void setDirector(String director): Establece el director de la película.
public int getDuration(): Retorna la duración de la película.
public void setDuration(int duration): Establece la duración de la película.
Sobrescritura de métodos:

@Override public int hashCode(): Calcula y retorna un valor hash único basado en los atributos title, 
director y duration. Este método es utilizado para comparar objetos de forma eficiente en estructuras 
de datos como HashMap o HashSet.
@Override public boolean equals(Object obj): Compara si el objeto actual es igual al objeto pasado 
como parámetro. La comparación se realiza en base a los atributos title, director y duration. 
Devuelve true si los objetos son iguales y false en caso contrario.
@Override public String toString(): Retorna una representación en forma de cadena de caracteres 
de la película, mostrando los valores de los atributos title, director y duration.
*/