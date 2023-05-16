/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Scanner;
import Entidades.Persona;

public class PersonaServicio {

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }

    public void crearPersona(Persona p) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre: ");
        p.setNombre(sc.nextLine());
        System.out.print("Introduzca la edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.print("Introduzca el sexo (H/M/O): ");
        char sexo = sc.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo incorrecto, introduzca de nuevo (H/M/O): ");
            sexo = sc.nextLine().charAt(0);
        }
        p.setSexo(sexo);
        System.out.print("Introduzca el peso en kg: ");
        p.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.print("Introduzca la altura en metros: ");
        p.setAltura(Double.parseDouble(sc.nextLine()));
    }

    public int calcularIMC(Persona p) {
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
