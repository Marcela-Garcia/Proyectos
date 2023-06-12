/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejer1;

import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Administrador
 */
public class Main {

   
    public static void main(String[] args) {
   Perro perro = new Perro("Max", "croquetas", 5, "Labrador");
        perro.alimentarse(); // Muestra: El Max se alimenta de croquetas

        Gato gato = new Gato("Milo", "atún", 3, "Siames");
        gato.alimentarse(); // Muestra: El Milo se alimenta de atún

        Caballo caballo = new Caballo("Fury", "pasto", 10, "Frisón");
        caballo.alimentarse(); // Muestra: El Fury se alimenta de pasto
    }
}