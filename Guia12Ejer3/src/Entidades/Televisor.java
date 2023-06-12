/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomesticos {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 0;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean hasSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la resolución (en pulgadas): ");
        int resolucion = scanner.nextInt();
        setResolucion(resolucion);

        System.out.print("¿Tiene sintonizador TDT incorporado? (Sí/No): ");
        String tieneSintonizador = scanner.next();
        setSintonizadorTDT(tieneSintonizador.equalsIgnoreCase("Sí"));
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (this.resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }

        if (this.sintonizadorTDT) {
            precioFinal += 500;
        }

        return precioFinal;
    }

}
