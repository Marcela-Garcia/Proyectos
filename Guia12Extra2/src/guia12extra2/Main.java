/*
 en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package guia12extra2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> Edificios = new ArrayList<>(); 
        
        // Agregar dos polideportivos
        Edificios.add(new Polideportivo("Polideportivo 1", true, 30, 20, 10));
        Edificios.add(new Polideportivo("Polideportivo 2", false, 25, 15, 12));
  
        // Agregar dos edificios de oficinas
        Edificios.add(new EdificioDeOficinas(40, 30, 20, 5, 10, 3));
        Edificios.add(new EdificioDeOficinas(35, 25, 18, 7, 8, 4));
        
        // Calcular y mostrar superficie y volumen de cada edificio
        for (Edificio edificio : Edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());
            System.out.println("-----------------------------");
        }

        // Contar polideportivos techados y abiertos
        int techados = 0;
        int abiertos = 0;

        for (Edificio edificio : Edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoInstalacion()) {
                    techados++;
                } else {
                    abiertos++;
                }
            }
        }

        System.out.println("Polideportivos techados: " + techados);
        System.out.println("Polideportivos abiertos: " + abiertos);

        // Mostrar cantidad de personas en edificios de oficinas
        for (Edificio edificio : Edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPersonas();
                System.out.println("-----------------------------");
            }
        }
        
    }

}