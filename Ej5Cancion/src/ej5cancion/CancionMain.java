/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5cancion;

public class CancionMain {

    public static void main(String[] args) {
        
        Ej5Cancion cancion1 = new Ej5Cancion();

        cancion1.setTitulo("Is this love ");
        cancion1.setAutor("Bob Marley");
        System.out.println("Titulo de la canción: " + cancion1.getTitulo());
        System.out.println("El autor: " + cancion1.getAutor());
    }
    }
