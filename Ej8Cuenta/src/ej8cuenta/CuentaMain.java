/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8cuenta;


public class CuentaMain {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Pepe", 1000.0);
        System.out.println("Titular de la cuenta: " + cuenta.getTitular());
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());

        cuenta.retirar_dinero(500.0);
        System.out.println("Nuevo saldo de la cuenta: " + cuenta.getSaldo());

        cuenta.retirar_dinero(700.0);
        System.out.println("Nuevo saldo de la cuenta: " + cuenta.getSaldo());
    }
}
