/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Persona {

    private String nombre;
    private Perro perro;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.perro = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void adoptarPerro(Perro perro) {
        if (perro.isAdoptado()) {
            System.out.println("El perro " + perro.getNombre() + " ya ha sido adoptado.");
        } else {
            perro.setAdoptado(true);
            setPerro(perro);
            System.out.println("La persona " + nombre + " ha adoptado al perro " + perro.getNombre() + ".");
        }
    }
}
