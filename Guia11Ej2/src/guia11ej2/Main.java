
package guia11ej2;

import Entidades.Juego;
import Entidades.Revolver;

public class Main {

    public static void main(String[] args) {
        Revolver revolver = new Revolver();
        revolver.llenarRevolver();

        Juego juego = new Juego(revolver);
        juego.llenarJuego();
        juego.ronda();
    }
}
