/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto 
puntos usando un método crearPuntos() que le pide al usuario los dos números y los
ingresa en los atributos del objeto. Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 
 */
package ej6puntos;

import java.util.Scanner;

public class Ej6Puntos {

  
    private int x1, y1, x2, y2;

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de x1: ");
        x1 = leer.nextInt();
        System.out.print("Ingrese el valor de y1: ");
        y1 = leer.nextInt();
        System.out.print("Ingrese el valor de x2: ");
        x2 = leer.nextInt();
        System.out.print("Ingrese el valor de y2: ");
        y2 = leer.nextInt();
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); 
        return distancia;
    }

    // Getters y Setters
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
  

/*
//se usa la función Math.sqrt() para calcular la raíz cuadrada de la suma de los cuadrados 
de las diferencias entre las coordenadas en el eje x y en el eje y. La función Math.pow() se usa para 
elevar un número a una potencia determinada, en este caso se eleva la diferencia entre las coordenadas 
en el eje x y en el eje y a la potencia de 2.
 //el resultado de la distancia calculada se almacena en la variable distancia y se devuelve 
utilizando la instrucción return distancia
*/