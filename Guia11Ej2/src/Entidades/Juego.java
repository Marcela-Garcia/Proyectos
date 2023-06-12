
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Revolver r;

    public Juego() {
    }

    public Juego(Revolver r) {
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void llenarJuego() {
        System.out.println("Ingrese cantidad de Usuarios (1 a 6): ");
        int usuarios = leer.nextInt();

        for (int i = 0; i < usuarios; i++) {
            Jugador j1 = new Jugador((i + 1), "Jugador", false);
            jugadores.add(j1);
        }
    }

    public void ronda() {
        int jugadorAux = 0;
        boolean jugadorMojado = false;

        for (Jugador aux : jugadores) {
            aux.disparo(r);
            System.out.println("Disparo " + aux);
            if (aux.isMojado()) {
                jugadorMojado = true;
                break;
            }
        }

        if (!jugadorMojado) {
            System.out.println("¡Nadie se ha mojado! Siguiente ronda...");
            ronda();
        } else {
            System.out.println("¡Alguien se ha mojado!");
        }
    }
}
