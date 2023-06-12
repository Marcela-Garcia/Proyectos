/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejer2;

import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de la Lavadora, presione Enter para continuar");

        String lavadoraColor = scanner.nextLine();

        Lavadora lavadora = new Lavadora();
        lavadora.setColor(lavadoraColor);
        lavadora.crearLavadora();

        System.out.println("Creación del Televisor, presione Enter para continuar");
        String televisorColor = scanner.nextLine();

        Televisor televisor = new Televisor();
        televisor.setColor(televisorColor);
        televisor.crearTelevisor();

        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());
    }
}
