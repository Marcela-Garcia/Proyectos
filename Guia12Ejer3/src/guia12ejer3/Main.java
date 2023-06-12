/*
 LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package guia12ejer3;

import java.util.ArrayList;
import Entidades.Lavadora;
import Entidades.Televisor;
import Entidades.Electrodomesticos;

public class Main {

    public static void main(String[] args) {

        // Crear un ArrayList de Electrodomésticos
        ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<>();

     
        electrodomesticos.add(new Lavadora(1500, "blanco", 'A', 25, 10));
        electrodomesticos.add(new Lavadora(2000, "azul", 'B', 30, 12));
        electrodomesticos.add(new Televisor(3000, "gris", 'C', 40, 70, true));
        electrodomesticos.add(new Televisor(2500, "negro", 'D', 55, 32, false));

        // Variables para almacenar el precio total de los electrodomésticos
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        // Recorrer el ArrayList de Electrodomésticos
        for (Electrodomesticos electrodomestico : electrodomesticos) {
            // Ejecutar el método precioFinal() en cada electrodoméstico
            double precioFinal = electrodomestico.precioFinal();

            // Mostrar el precio de cada tipo de objeto (lavadora o televisor)
            //Se verifica si electrodomestico es una instancia de la clase Televisor o lavadora. 
            //Si lo es,se ejecuta el bloque dentro del else if, que imprime el precio del televisor o lav y 
            //suma ese precio a la variable precioTotal...
            if (electrodomestico instanceof Lavadora) {
                System.out.println("Precio de la lavadora: $" + precioFinal);
                // Sumar el precio de las lavadoras
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                System.out.println("Precio del televisor: $" + precioFinal);
                // Sumar el precio de los televisores
                precioTotalTelevisores += precioFinal;
            }

            // Sumar el precio de todos los electrodomésticos
            precioTotalElectrodomesticos += precioFinal;
        }

        System.out.println("Precio total de los electrodomésticos: $" + precioTotalElectrodomesticos);

        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);

        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
    }
}

/*instanceof se utiliza en este código para determinar el tipo de objeto almacenado en la variable 
electrodomestico y realizar acciones específicas en base a ese tipo.
 */

/*
 Electrodomesticos lavadora = new Lavadora();
        Electrodomesticos televisor = new Televisor();

        imprimirPrecio(lavadora);
        imprimirPrecio(televisor);
    }

    public static void imprimirPrecio(Electrodomesticos electrodomestico) {
        double precioFinal = electrodomestico.calcularPrecio();
        String tipo = electrodomestico.getTipo();

        System.out.println("Tipo de electrodoméstico: " + tipo);
        System.out.println("Precio: $" + precioFinal);
    }
}
*/
