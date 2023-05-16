/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3operacion;


import java.util.Scanner;

public class Ej3Operacion {

    private int numero1;
    private int numero2;

    public Ej3Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Ej3Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        numero2 = scanner.nextInt();
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero.");
            return 0;
        }
        return numero1 * numero2;
    }

    public int dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
        return numero1 / numero2;
    }
}
