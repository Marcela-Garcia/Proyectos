/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomesticos {
    private double carga;

    public Lavadora() {
        super();
        this.carga = 0;
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la carga: ");
        double carga = scanner.nextDouble();
        setCarga(carga);
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (this.carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
