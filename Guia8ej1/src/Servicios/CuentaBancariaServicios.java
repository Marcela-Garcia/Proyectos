/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import Entidades.CuentaBancaria;

public class CuentaBancariaServicios{
    
Scanner sc = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
     
        System.out.println("Ingrese el nuevo numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dniCliente = sc.nextLong();
        System.out.println("Ingrese el saldo inicial de la cuenta: ");
        double saldoActual = sc.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual );
    
    }
    
    public void ingresar(CuentaBancaria c){
        
        System.out.println("Tu saldo actual es: " + c.getSaldoActual());
        System.out.println("Cuanto dinero deseas ingresar? Ingrese el monto: ");
        double ingreso = sc.nextDouble();
        c.setSaldoActual(c.getSaldoActual() + ingreso);
        System.out.println("Ahora su saldo es: " + c.getSaldoActual());
        
    }
    
    public void retirar(CuentaBancaria c){
        
        System.out.println("Tu saldo actual es: " + c.getSaldoActual());
        System.out.println("Cuanto dinero deseas retirar? Ingrese el monto: ");
        double retiro = sc.nextDouble();
        
        if (retiro > c.getSaldoActual()) {
            System.out.println("Tienes fondos insuficientes, retiraremos el total de tu saldo actual: " + c.getSaldoActual());
            c.setSaldoActual(0);
        }else{
            c.setSaldoActual(c.getSaldoActual() - retiro);
            System.out.println("Retiraste: " + retiro + " Tu saldo quedó en : " + c.getSaldoActual());
        }
        
    }
    
    public void extraccionRapida(CuentaBancaria c){
        
        System.out.println("Tu saldo actual es: " + c.getSaldoActual());
        System.out.println("La extraccion rapida retira el 20% de tus fondos");
        System.out.println("Fondos a retirar: " + (c.getSaldoActual()*0.2));
        c.setSaldoActual(c.getSaldoActual() - (c.getSaldoActual()*0.2));
        System.out.println("Tu saldo actual es: " + c.getSaldoActual());
        
    }
    
    public void consultarSaldo(CuentaBancaria c){
        
        System.out.println("Tu saldo actual es: " + c.getSaldoActual());
        
    }
    
    public void consultarDatos(CuentaBancaria c){
        
        System.out.println("Numero de cuenta: " + c.getNumeroCuenta());
        System.out.println("DNI: " + c.getDniCliente());
        System.out.println("Saldo: " + c.getSaldoActual());
        
    }
            
}      
        
  
      