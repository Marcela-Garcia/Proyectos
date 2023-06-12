/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extra4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        List<Alumno> listaAlumnos = simulador.generarListaAlumnos(10);
        simulador.mostrarListaAlumnos();
        simulador.votacion(listaAlumnos);
        simulador.mostrarResultados(listaAlumnos);
        simulador.hacerRecuentoVotos(listaAlumnos);
    }
}
