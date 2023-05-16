/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej6;

import entidades.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.crearCurso();
        System.out.println("La ganancia semanal del curso es: " + curso1.calcularGananciaSemanal());
    }
}
