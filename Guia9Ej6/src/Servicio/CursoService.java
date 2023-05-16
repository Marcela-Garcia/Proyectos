/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Curso;
import java.util.Scanner;

public class CursoService {

    public Curso crearCurso() {
        Scanner scanner = new Scanner(System.in);

        String nombreCurso;
        int cantidadHorasPorDia;
        int cantidadDiasPorSemana;
        String turno;
        double precioPorHora;
        String[] alumnos = new String[5];

        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();

        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = scanner.nextInt();

        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = scanner.nextLine();

        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = scanner.nextDouble();

        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
            alumnos[i] = scanner.nextLine();
        }

        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);

        return curso;
    }

}
