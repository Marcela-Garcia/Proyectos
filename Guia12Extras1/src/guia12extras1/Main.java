/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extras1;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Crear instancias de barco  
        Barco velero = new Velero("V123", 10.5, 2015, 2);//matricula,eslora,año de fabricacion,nummastiles
        BarcoMotor barcoMotor = new BarcoMotor("BM456", 15.2, 2018, 200);//matricula, eslora, anioFabricacion, potenciaCV
        Yate yate = new Yate("Y789", 20.0, 2020, 300, 4);//matricula, eslora, anioFabricacion, potenciaCVYate, numCamarotes

        // Crear instancia de alquiler
        LocalDate fechaAlquiler = LocalDate.of(2023, 6, 1);//LocalDate se utilizan más adelante en el programa para determinar la duración del alquiler y calcular el precio correspondiente.
        LocalDate fechaDevolucion = LocalDate.of(2023, 6, 8);

     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los detalles del barco:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Eslora en metros: ");
        double eslora = scanner.nextDouble();
        System.out.print("Año de fabricación: ");
        int anioFabricacion = scanner.nextInt();

        
        System.out.println("¿Qué tipo de barco desea alquilar?");
        System.out.println("1. Velero");
        System.out.println("2. Barco a motor");
        System.out.println("3. Yate");
        int opcion = scanner.nextInt();

        
        Barco barcoSeleccionado;
        switch (opcion) {
            case 1:
                System.out.print("Número de mástiles: ");
                int numMastiles = scanner.nextInt();
                barcoSeleccionado = new Velero(matricula, eslora, anioFabricacion, numMastiles);
                break;
            case 2:
                System.out.print("Potencia en CV: ");
                double potenciaCV = scanner.nextDouble();
                barcoSeleccionado = new BarcoMotor(matricula, eslora, anioFabricacion, (int) potenciaCV);
                break;
            case 3:
                System.out.print("Potencia en CV: ");
                double potenciaCVYate = scanner.nextDouble();
                System.out.print("Número de camarotes: ");
                int numCamarotes = scanner.nextInt();
                barcoSeleccionado = new Yate(matricula, eslora, anioFabricacion, (int) potenciaCVYate, numCamarotes);
                break;
            default:
                System.out.println("Opción inválida. Se seleccionará el Velero por defecto.");
                barcoSeleccionado = new Velero(matricula, eslora, anioFabricacion, 2);
        }

       
        Alquiler alquiler = new Alquiler("Juan Perez", "22055222", fechaAlquiler, fechaDevolucion, 1, barcoSeleccionado);

       
        double precioAlquiler = alquiler.calcularPrecioAlquiler();

        
        System.out.println("Información del alquiler:");
        System.out.println("Nombre del cliente: " + alquiler.getNombreCliente());
        System.out.println("Documento del cliente: " + alquiler.getDocumentoCliente());
        System.out.println("Fecha de alquiler: " + alquiler.getFechaAlquiler());
        System.out.println("Fecha de devolución: " + alquiler.getFechaDevolucion());
        System.out.println("Posición del amarre: " + alquiler.getPosicionAmarre());
        System.out.println("Barco seleccionado: " + barcoSeleccionado.getClass().getSimpleName());
        System.out.println("Precio del alquiler: $" + precioAlquiler);
    }
}
