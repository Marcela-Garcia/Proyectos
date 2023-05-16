/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;

public class CadenaServicio {
    
    public int mostrarVocales(Cadena cadena) {
        int cantidad = 0;
        String frase = cadena.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public String invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        return invertida;
    }
    
    public int vecesRepetido(Cadena cadena, String letra) {
        int cantidad = 0;
        String frase = cadena.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public void compararLongitud(Cadena cadena, String otraFrase) {
        int longitud1 = cadena.getLongitud();
        int longitud2 = otraFrase.length();
        if (longitud1 == longitud2) {
            System.out.println("Las frases tienen la misma longitud.");
        } else if (longitud1 > longitud2) {
            System.out.println("La frase original es más larga.");
        } else {
            System.out.println("La nueva frase es más larga.");
        }
    }
    
    public String unirFrases(Cadena cadena, String otraFrase) {
        return cadena.getFrase() + " " + otraFrase;
    }
    
    public String reemplazar(Cadena cadena, String letra, String nuevaLetra) {
        return cadena.getFrase().replace(letra.charAt(0), nuevaLetra.charAt(0));
    }
    
    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().contains(letra);
    }
    
}
