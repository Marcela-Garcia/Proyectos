/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyint;

public class Escuela {

    public Estudiante[] estudiantes;

    public Escuela(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double calcularPromedio() {
        double sumaNotas = 0;

        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }

        return sumaNotas / estudiantes.length;
    }

    public Estudiante[] obtenerEstudiantesSobrePromedio() {
        double promedio = calcularPromedio();
        Estudiante[] estudiantesSobrePromedio = new Estudiante[estudiantes.length];
        int contador = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                estudiantesSobrePromedio[contador] = estudiante;
                contador++;
            }
        }

        return estudiantesSobrePromedio;
    }

    public void mostrarEstudiantesSobrePromedio() {
        Estudiante[] estudiantesSobrePromedio = obtenerEstudiantesSobrePromedio();

        System.out.println("Estudiantes con notas sobre el promedio:");

        for (Estudiante estudiante : estudiantesSobrePromedio) {
            if (estudiante != null) {
                System.out.println(estudiante.getNombre() + ": " + estudiante.getNota());
            }
        }
    }
}
