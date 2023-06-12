/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyint;

public class Main {

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Tina", 7.5);
        estudiantes[1] = new Estudiante("Tine", 6.2);
        estudiantes[2] = new Estudiante("Tini", 9.3);
        estudiantes[3] = new Estudiante("Tino", 8.7);
        estudiantes[4] = new Estudiante("Tinu", 5.8);
        estudiantes[5] = new Estudiante("Tano", 7.8);
        estudiantes[6] = new Estudiante("Tana", 8.1);
        estudiantes[7] = new Estudiante("Tanito", 6.9);

        Escuela escuela = new Escuela(estudiantes);

        double promedio = escuela.calcularPromedio();
        System.out.println("El promedio de notas de todo el curso es: " + promedio);

        Estudiante[] estudiantesSobrePromedio = escuela.obtenerEstudiantesSobrePromedio();
        System.out.println("Los siguientes estudiantes obtuvieron una nota por encima del promedio:");

        for (Estudiante estudiante : estudiantesSobrePromedio) {
            if (estudiante != null) {
                System.out.println(estudiante.getNombre());
            }
        }

        escuela.mostrarEstudiantesSobrePromedio();
    }
}


/*
La clase Estudiante tiene dos atributos: nombre y nota, y se utiliza para crear objetos que representan a cada estudiante.
La clase Escuela tiene un atributo llamado estudiantes, que es un arreglo de objetos tipo Estudiante. Esta clase tiene tres métodos:
calcularPromedio(): que calcula el promedio de notas de todos los estudiantes.
obtenerEstudiantesSobrePromedio(): que retorna un arreglo con los estudiantes que recibieron una nota mayor al promedio de la escuela.
mostrarEstudiantesSobrePromedio(): que muestra por pantalla los estudiantes que recibieron una nota mayor al promedio.
La clase Main es la clase principal del programa y es la que instancia los objetos necesarios para realizar las operaciones requeridas. 
En su método main() se crean los objetos tipo Estudiante y se agregan al arreglo de objetos tipo Estudiante de la clase Escuela. 
Luego, se llama a los métodos calcularPromedio(), obtenerEstudiantesSobrePromedio() y mostrarEstudiantesSobrePromedio() de la clase 
Escuela para realizar las operaciones requeridas y mostrar los resultados por pantalla.
*/