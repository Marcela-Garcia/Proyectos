/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8cuenta;


 
public class Cuenta {
   
    public String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void retirar_dinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo para realizar la transacción.");
        } else {
            saldo -= cantidad;
            System.out.println("Transacción exitosa. Nuevo saldo: " + saldo);
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}


