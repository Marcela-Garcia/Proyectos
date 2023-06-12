/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12teoria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);

        for (Animal animal : animales) {
            System.out.println(animal.hacerRuido());
        }
    }
}

/*
Creamos la clase base Animal con un método hacerRuido() que devuelve el saludo "Hola".
La clase Perro extiende la clase Animal y sobrescribe el método hacerRuido() para que devuelva "Guau".
La clase Gato también extiende la clase Animal y sobrescribe el método hacerRuido() para que devuelva 
"Miau".En la clase Main, creamos un ArrayList llamado animales para almacenar objetos de tipo Animal.
Creamos una instancia de Animal llamada a, una instancia de Perro llamada b y una instancia de Gato 
llamada c.Añadimos las instancias a, b y c al ArrayList animales.
Usamos un bucle for-each para recorrer el ArrayList animales y llamamos al método hacerRuido() 
para cada objeto Animal.
*/