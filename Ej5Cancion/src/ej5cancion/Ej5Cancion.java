/*
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá 
definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas
vacías y otro que reciba como parámetros el título y el autor de la canción. Se deberán 
además definir los métodos getters y setters correspondientes.

 */
package ej5cancion;

public class Ej5Cancion {

    public String titulo;
    public String autor;

    public Ej5Cancion() {
        //this.titulo = "";
        //this.autor = "";
    }

    public Ej5Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
