/*
 * Luego crea un objeto 
"rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package ejerectangulo;

public class RectanguloMain {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);

    }
}
