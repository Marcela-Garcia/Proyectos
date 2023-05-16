
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    CuentaBancariaServicios c = new CuentaBancariaServicios();

    CuentaBancaria nuevaCuenta = c.crearCuenta();

    boolean salir = false;

    do {

        System.out.println("--MENU DE OPCIONES--");
        System.out.println("\n 1. Ingresar dinero"
                + "\n 2. Retirar dinero"
                + "\n 3. Extraccion rapida"
                + "\n 4. Consultar saldo"
                + "\n 5. Consultar datos"
                + "\n 6. Salir"
                + "\n Elija una opcion");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                c.ingresar(nuevaCuenta);
                break;
            case 2:
                c.retirar(nuevaCuenta);
                break;
            case 3:
                c.extraccionRapida(nuevaCuenta);
                break;
            case 4:
                c.consultarSaldo(nuevaCuenta);
                break;
            case 5:
                c.consultarDatos(nuevaCuenta);
                break;
            case 6:
                salir = true;
                System.out.println("Gracias por usar nuestro cajero");
                break;
            default:
                System.out.println("Opcion invalida");
        }

    } while (salir != true);
   }
   
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

