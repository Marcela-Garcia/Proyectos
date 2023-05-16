/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Scanner;

public class NIFServicio {
   Scanner sc = new Scanner(System.in);
    
    public void crearNIF(NIF n) {
        System.out.print("Introduce el número de DNI: ");
        n.setDni(sc.nextLong());
        char letra = calcularLetra(n);
        n.setLetra(letra);
    }

    public void mostrarNIF(NIF n) {
        String dniStr = String.format("%08d", n.getDni());
        System.out.println(dniStr + "-" + n.getLetra());
    }
    
    public char [] vector (){
        char [] letrasNif = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrasNif;
    }
    
    public char calcularLetra(NIF n) {
        long dni = n.getDni();
        int resto = (int) (dni % 23);
        char [] letra= vector();
        return letra [resto];
    }
      }