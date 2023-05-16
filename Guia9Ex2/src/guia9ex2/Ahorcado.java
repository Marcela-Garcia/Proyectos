/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ex2;

public class Ahorcado {

    private char[] palabra;
    private int encontradas;
    private final int maxIntentos;

    public Ahorcado(char[] palabra, int maxIntentos) {
        this.palabra = palabra;
        this.encontradas = 0;
        this.maxIntentos = maxIntentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
}
