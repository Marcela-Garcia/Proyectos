/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7juego;

import java.util.Scanner;

public class JuegoMain {

    public static void main(String[] args) {
          Ej7Juego juego = new Ej7Juego();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("¿Deseas iniciar un nuevo juego?");
            System.out.println("1 - Sí");
            System.out.println("2 - No");
            opcion = leer.nextInt();
            if (opcion == 1) {
                juego.iniciar_juego();
            }
        } while (opcion != 2);
    }
}