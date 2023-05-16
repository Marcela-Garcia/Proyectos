/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1libro;

import java.util.Scanner;

public class Ej1Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Ej1Libro() {
        this.isbn = "";
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
    }

    public Ej1Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public static Ej1Libro cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el ISBN del libro:");
        String isbn = leer.nextLine();
        System.out.println("Introduce el título del libro:");
        String titulo = leer.nextLine();
        System.out.println("Introduce el autor del libro:");
        String autor = leer.nextLine();
        System.out.println("Introduce el número de páginas del libro:");
        int numPaginas = leer.nextInt();
        leer.nextLine();
        return new Ej1Libro(isbn, titulo, autor, numPaginas);
    }

    public static void imprimirDatosLibro(Ej1Libro l) {
        System.out.println("ISBN: " + l.getIsbn());
        System.out.println("Titulo: " + l.getTitulo());
        System.out.println("Autor " + l.getAutor());
        System.out.println("Paginas: " + l.getNumPaginas());
    }

}
