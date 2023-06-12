/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia10;

public class Main {
public static void main(String[] args) {

        Perros sc = new Perros();

        System.out.println("------- Bienvenidos, agregue raza de perros a la lista -------");
        sc.imprimirLista();
        System.out.println("------- Eliminar y ordenar -------");
        sc.eliminarOrdenar();
    }
}