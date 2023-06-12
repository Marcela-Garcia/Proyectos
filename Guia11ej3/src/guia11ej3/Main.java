/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej3;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        System.out.println("Barajando...");
        baraja.barajar();

        System.out.println("Siguiente carta: " + baraja.siguienteCarta());

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Dando 5 cartas...");
        List<Carta> cartasEntregadas = baraja.darCartas(5);

        if (cartasEntregadas != null) {
            for (Carta carta : cartasEntregadas) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas en el montón:");
        baraja.cartasMonton();

        System.out.println("Mostrando todas las cartas de la baraja:");
        baraja.mostrarBaraja();
    }
}
