







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas = new ArrayList(); //listas para almacenar las cartas en la baraja y las cartas que se han sacado de la baraja
    private List<Carta> monton = new ArrayList();
    private List<String>palos = new ArrayList();

    public Baraja() { //constructor
        palos.add("espadas");
        palos.add("bastos");
        palos.add("oros");
        palos.add("copas");
        
        
       // String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Carta carta = new Carta(numero, palo);
                    cartas.add(carta);
     /*Estos bucles anidados crean objetos Carta para cada combinación de palo y número, y los agregan 
      a la lista "cartas". Los números 8 y 9 son excluidos               
                     */
                }
            }
        }
    }

    public void barajar() {    //Este método utiliza el método shuffle de la clase Collections para barajar aleatoriamente las cartas en la lista "cartas".
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            Carta carta = cartas.remove(0);
            monton.add(carta);
            return carta;
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) { //extrae la siguiente carta de la lista cartas y la coloca en la lista monton
        if (cantidad > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        } else {
            List<Carta> cartasEntregadas = new ArrayList();
            for (int i = 0; i < cantidad; i++) {
                Carta carta = siguienteCarta();
                cartasEntregadas.add(carta);
            }
            return cartasEntregadas;
        }
    }

    public void cartasMonton() {
        if (!monton.isEmpty()) {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No ha salido ninguna carta todavía.");
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
