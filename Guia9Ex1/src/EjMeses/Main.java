/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjMeses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Meses meses = new Meses();
            boolean acierto = false;
            while (!acierto) {
                System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
                String mesUsuario = scanner.nextLine();
                acierto = meses.adivinarMes(mesUsuario);
            }
        }
    }
}
/*
La clase Main crea un objeto Meses y establece la variable booleana acierto en false. 
Luego, entra en un ciclo while que se ejecuta hasta que el usuario acierta el mes secreto. 
Dentro del ciclo, se le pide al usuario que ingrese un mes, y el método adivinarMes de la 
clase Meses verifica si coincide con el mes secreto. Si coincide, adivinarMes devuelve true
y se establece acierto en true, lo que hace que el ciclo while termine. 
Si no coincide, adivinarMes devuelve false y el ciclo while continúa. 
Una vez que el usuario adivina el mes secreto, el ciclo while termina y el programa finaliza.
*/