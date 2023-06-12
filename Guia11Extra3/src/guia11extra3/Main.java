/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extra3;

import entidades.Cliente;
import entidades.Cuota;
import entidades.Poliza;
import entidades.Vehiculo;

public class Main {
    
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Pérez");
        cliente.setDocumento("123456789");
        cliente.setMail("juan@example.com");
        cliente.setDomicilio("Calle Principal 123");
        cliente.setTelefono("555-123456");

        // Crear un vehículo
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        vehiculo.setAño(2022);
        vehiculo.setNumeroMotor("ABC123");
        vehiculo.setChasis("XYZ789");
        vehiculo.setColor("Blanco");
        vehiculo.setTipo("Sedán");

        // Crear una póliza y asociar cliente y vehículo
        Poliza poliza = new Poliza();
        poliza.setNumeroPoliza(1);
        poliza.setFechaInicio("2023-01-01");
        poliza.setFechaFin("2024-01-01");
        poliza.setCantidadCuotas(12);
        poliza.setFormaPago("Tarjeta de crédito");
        poliza.setMontoTotalAsegurado(10000.0);
        poliza.setIncluyeGranizo(true);
        poliza.setMontoMaximoGranizo(5000.0);
        poliza.setTipoCobertura("Total");
        poliza.setCliente(cliente);
        poliza.setVehiculo(vehiculo);

        // Crear una cuota y asociarla a la póliza
        Cuota cuota = new Cuota();
        cuota.setNumeroCuota(1);
        cuota.setMontoTotalCuota(1000.0);
        cuota.setPagada(false);
        cuota.setFechaVencimiento("2023-02-01");
        cuota.setFormaPago("Efectivo");
        cuota.setPoliza(poliza);

        // Imprimir información de la póliza y la cuota
        System.out.println("Información de la póliza:");
        System.out.println("Número de póliza: " + poliza.getNumeroPoliza());
        System.out.println("Cliente: " + poliza.getCliente().getNombre() + " " + poliza.getCliente().getApellido());
        System.out.println("Vehículo: " + poliza.getVehiculo().getMarca() + " " + poliza.getVehiculo().getModelo());
        System.out.println("Monto total asegurado: " + poliza.getMontoTotalAsegurado());
        System.out.println();

        System.out.println("Información de la cuota:");
        System.out.println("Número de cuota: " + cuota.getNumeroCuota());
        System.out.println("Monto total de la cuota: " + cuota.getMontoTotalCuota());
        System.out.println("Estado de pago: " + (cuota.isPagada() ? "Pagada" : "Pendiente"));
        System.out.println("Fecha de vencimiento: " + cuota.getFechaVencimiento());
    }
}
