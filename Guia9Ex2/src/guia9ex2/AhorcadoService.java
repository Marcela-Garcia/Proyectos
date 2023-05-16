/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ex2;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    private char[] palabra;
    private int letrasEncontradas;
    private int intentosMaximos;
    private int intentosRestantes;

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra: ");
        String inputPalabra = scanner.nextLine().toLowerCase();
        this.palabra = inputPalabra.toCharArray();
        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next();
        }
        this.intentosMaximos = scanner.nextInt();
        this.intentosRestantes = this.intentosMaximos;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a adivinar es: " + this.palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        char letraMinuscula = Character.toLowerCase(letra);
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i] == letraMinuscula) {
                encontrada = true;
                this.palabra[i] = '#'; // para marcar que ya se encontró esa letra
                this.letrasEncontradas++;
            }
        }
        if (encontrada) {
            System.out.println("La letra pertenece a la palabra.");
        } else {
            System.out.println("La letra no pertenece a la palabra.");
            this.intentosRestantes--;
        }
        return encontrada;
    }

    public boolean encontradas(char letra) {
        int encontradas = 0;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i] == '#') {
                encontradas++;
            }
        }
        int faltantes = this.palabra.length - encontradas;
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");
        return Arrays.toString(this.palabra).indexOf(letra) != -1;
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + this.intentosRestantes);
    }

    public void juego() {
        Scanner sc = new Scanner(System.in);
        while (this.intentosRestantes > 0 && this.letrasEncontradas < this.palabra.length) {
            System.out.print("Ingrese una letra: ");
            char letraIngresada = sc.nextLine().toUpperCase().charAt(0);
            buscar(letraIngresada);
            encontradas(letraIngresada);
            intentos();
            System.out.println("----------------------------------------------");
        }
        if (this.letrasEncontradas == this.palabra.length) {
            System.out.println("¡Felicidades, has ganado!");
        } else {
            System.out.println("Lo sentimos, no hay más oportunidades. La palabra era " + Arrays.toString(this.palabra));
        }
    }
}
