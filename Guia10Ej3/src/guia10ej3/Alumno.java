/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej3;

import java.util.List;

public class Alumno {

    private String nombre;
    private List<Integer> notas;

    public Alumno() {
    }
    
        public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public double notaFinal() {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (double) sum / notas.size();
    }
}
/*
La clase Alumno tiene dos atributos: nombre de tipo String y notas de tipo List<Integer>.
El constructor recibe el nombre y la lista de notas. Los métodos getNombre y getNotas devuelven 
los respectivos atributos. El método setNombre y setNotas establecen los valores de los atributos. 
El método notaFinal calcula el promedio de las notas y lo devuelve como un valor de tipo double
*/
