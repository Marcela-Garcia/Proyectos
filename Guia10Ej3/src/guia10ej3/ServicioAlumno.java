/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {

    private List<Alumno> listaAlumnos;
    private Scanner scanner;
    
        public ServicioAlumno() {
        listaAlumnos = new ArrayList();
        scanner = new Scanner(System.in);
    }

    public void crearAlumnos() {
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = scanner.nextInt();
                notas.add(nota);
            }

            scanner.nextLine(); // Limpiar el buffer de entrada

            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.print("¿Desea crear otro alumno? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void notaFinal() {
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = scanner.nextLine();

        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                double notaFinal = alumno.notaFinal();
                System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El alumno " + nombreAlumno + " no se encuentra en la lista.");
        }
    }
}

/*
La clase ServicioAlumno tiene una lista de objetos Alumno llamada listaAlumnos y un objeto 
Scanner para leer la entrada del usuario. En el método crearAlumnos, se solicita al usuario
que ingrese el nombre y las notas de cada alumno, y se crea un objeto `Alumno a partir de los datos 
proporcionados por el usuario. Luego, el objeto Alumno se agrega a la lista listaAlumnos. El bucle 
se repite hasta que el usuario decida no crear más alumnos.
El método notaFinal solicita al usuario que ingrese el nombre del alumno para calcular
su nota final. Luego, busca el alumno en la lista listaAlumnos. Si se encuentra, se llama 
al método notaFinal del objeto Alumno correspondiente y se muestra el resultado en el formato 
adecuado. Si el alumno no se encuentra en la lista, se muestra un mensaje de que no se encontró al alumno.
*/