/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Cafetera;
import java.util.Scanner;
import Servicios.CafeteraServicio;

public class Main {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();

        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        int capacidadMaxima = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de cafe en la cafetera: ");
        int cantidadActual = leer.nextInt();

        Cafetera cafetera = cs.getCafetera();
        System.out.println("La cafetera ha sido creada con una capacidad maxima de "
                + cafetera.getCapacidadMaxima() + " y una cantidad actual de "
                + cafetera.getCantidadActual() + ".");

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\n------- MENU -------");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.llenarCafetera();
                    System.out.println("La cafetera ha sido llenada.");
                    break;
                case 2:
                    System.out.print("Ingrese el tamaño de la taza en ml: ");
                    int tamanoTaza = leer.nextInt();
                    cs.servirTaza(tamanoTaza);
                    break;
                case 3:
                    cs.vaciarCafetera();
                    System.out.println("La cafetera ha sido vaciada.");
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de cafe a agregar: ");
                    int cantidadCafe = leer.nextInt();
                    cs.agregarCafe(cantidadCafe);
                    System.out.println("Se ha agregado " + cantidadCafe + " mililitros de cafe a la cafetera.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }

    }

}
