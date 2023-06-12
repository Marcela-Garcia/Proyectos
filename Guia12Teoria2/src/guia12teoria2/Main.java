/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12teoria2;

public class Main {
    public static void main(String[] args) {
        MiInterfaz objeto = new MiClase(); //La variable objeto es una referencia polimórfica que permite acceder a los métodos definidos en la interfaz MiInterfaz
        objeto.miMetodo();
    }

    interface MiInterfaz {
        void miMetodo();
    }

    static class MiClase implements MiInterfaz {
        @Override
        public void miMetodo() {
            System.out.println("Implementando método de interfaz");
        }
    }
}
