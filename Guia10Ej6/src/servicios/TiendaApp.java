/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaApp {

    private Map<String, Double> productos;
    private Scanner scanner;

    public TiendaApp() {
        productos = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        String opcion;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarProducto();
                    break;
                case "2":
                    modificarPrecio();
                    break;
                case "3":
                    eliminarProducto();
                    break;
                case "4":
                    mostrarProductos();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (!opcion.equals("5"));
    }

    public void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya existe en la tienda.");
        } else {
            System.out.print("Ingrese el precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());
//usuario ingrese el precio del producto como una cadena de texto.
//Utilizar parseDouble(scanner.nextLine()) permite obtener ese valor numérico como double
            productos.put(nombre, precio);
            System.out.println("Producto agregado correctamente.");
        }
    }

    public void modificarPrecio() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {   //evalúa si el HashMap productos contiene una clave igual a nombre.
//Si la condición es verdadera, significa que ya existe un producto con ese nombre en el HashMap
//y se ejecuta el bloque de código dentro del if
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());

            productos.put(nombre, precio);
            System.out.println("Precio del producto modificado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) { //se utiliza para verificar si un HashMap está vacío, es decir, si no contiene ningún par clave-valor.
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String nombre = entry.getKey(); //extrae el nombre
                double precio = entry.getValue(); //extrae el precio
                System.out.println("Producto: " + nombre + " | Precio: " + precio);
            }

        }
    }

}




/*
            isEmpty para comprobar si el HashMap productos está vacío antes de mostrar los productos 
            en la tienda.
            Si el HashMap está vacío, se imprime el mensaje "No hay productos Esto indica que no se ha agregado 
            ningún producto al HashMap y, por lo tanto, no hay productos para mostrar.
            si el HashMap no está vacío, se imprime el encabezado "Productos en la tienda 
            y se recorre el HashMap utilizando un bucle for para mostrar cada producto junto con su precio.
            La variable entry representa cada par clave-valor en el HashMap, donde la clave es el nombre 
            del producto y el valor es su precio.
 */
