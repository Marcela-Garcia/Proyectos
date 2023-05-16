/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9empleado;

public class EmpleadoMain {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan Pérez", 25, 1000);
        Empleado empleado2 = new Empleado("María Paz", 35, 2000);

        System.out.println("Empleado 1: " + empleado1.getNombre() + " | Edad: " + empleado1.getEdad() + " | Salario: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.getNombre() + " | Edad: " + empleado2.getEdad() + " | Salario: " + empleado2.getSalario());

        empleado1.calcular_aumento();
        empleado2.calcular_aumento();
    }
}
