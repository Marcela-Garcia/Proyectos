/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

public class CafeteraServicio {
    
    
    public Cafetera cafetera;

    public CafeteraServicio() {
        this.cafetera = new Cafetera();
    }

    public CafeteraServicio(int capacidadMaxima, int cantidadActual) {
        this.cafetera = new Cafetera(capacidadMaxima, cantidadActual);
    }

    public Cafetera getCafetera() {
        return this.cafetera;
    }

    public void llenarCafetera() {
        this.cafetera.setCantidadActual(this.cafetera.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada completamente.");
    }

    public void servirTaza(int tamanoTaza) {
        int cantidadServida = Math.min(tamanoTaza, this.cafetera.getCantidadActual());
        this.cafetera.setCantidadActual(this.cafetera.getCantidadActual() - cantidadServida);
        if (cantidadServida < tamanoTaza) {
            System.out.println("No se pudo llenar la taza por completo. Quedaron "
                    + (tamanoTaza - cantidadServida) + " unidades de café en la cafetera.");
        } else {
            System.out.println("Se ha llenado la taza por completo.");
        }
    }

    public void vaciarCafetera() {
        this.cafetera.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe(int cantidad) {
        int capacidadRestante = this.cafetera.getCapacidadMaxima() - this.cafetera.getCantidadActual();
        if (cantidad <= capacidadRestante) {
            this.cafetera.setCantidadActual(this.cafetera.getCantidadActual() + cantidad);
            System.out.println("Se han agregado " + cantidad + " unidades de café a la cafetera.");
        } else {
            this.cafetera.setCantidadActual(this.cafetera.getCapacidadMaxima());
            System.out.println("La cafetera ha sido llenada con " + capacidadRestante
                    + " unidades de café. No caben más.");
        }
    }
}