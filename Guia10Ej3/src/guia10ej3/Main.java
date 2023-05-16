/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej3;

public class Main {

    public static void main(String[] args) {
        ServicioAlumno servicio = new ServicioAlumno();

        servicio.crearAlumnos();
        System.out.println();

        servicio.notaFinal();
    }
}
/*
 crea una instancia de ServicioAlumno llamada servicio y luego llama a los métodos crearAlumnos
y notaFinal de servicio.
*/
