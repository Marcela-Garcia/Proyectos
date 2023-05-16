/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7juego;


import java.util.Scanner;

public class Ej7Juego {

    public int numJugador1;
    public int numJugador2;
    public int intentosJugador2;
    public int ganadasJugador1;
    public int ganadasJugador2;

    public Ej7Juego() {
        ganadasJugador1 = 0;
        ganadasJugador2 = 0;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        System.out.println("Jugador 1, elige un número entre 1 y 100: ");
        numJugador1 = leer.nextInt();
        System.out.println("Jugador 2, tienes 10 intentos para adivinar el número de Jugador 1.");
        intentosJugador2 = 10;
        boolean adivinado = false;
        while (!adivinado && intentosJugador2 > 0) {
            System.out.println("Intento #" + (11 - intentosJugador2) + ". Adivina el número: ");
            numJugador2 = leer.nextInt();
            if (numJugador2 == numJugador1) {
                adivinado = true;
                System.out.println("¡Felicidades, adivinaste el número!");
                ganadasJugador2++;
            } else if (numJugador2 > numJugador1) {
                System.out.println("El número es más bajo.");
            } else {
                System.out.println("El número es más alto.");
            }
            intentosJugador2--;
        }
        if (!adivinado) {
            System.out.println("Lo siento, te has quedado sin intentos. El número era: " + numJugador1);
            ganadasJugador1++;
        }
        System.out.println("Resultados:");
        System.out.println("Jugador 1 ganó " + ganadasJugador1 + " veces.");
        System.out.println("Jugador 2 ganó " + ganadasJugador2 + " veces.");
    }
}