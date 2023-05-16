/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;


public class Pais {
    private String nombrePais;

    public Pais() {
    }

    public Pais(String pais) {
        this.nombrePais = pais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String pais) {
        this.nombrePais = pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + nombrePais + '}';
    }


}

