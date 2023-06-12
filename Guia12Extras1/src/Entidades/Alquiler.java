/*
 Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
 */
package Entidades;

import java.time.LocalDate;

public class Alquiler {
    protected String nombreCliente;
    protected String documentoCliente;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected int posicionAmarre;
    protected Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion,
                    int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
             
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularPrecioAlquiler() {
        long diasOcupacion = fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay();
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
}

/*
Es la clase que representa un alquiler de un amarre para un barco. Tiene los atributos de nombre 
y documento del cliente, fecha de alquiler, fecha de devolución, posición del amarre y 
el objeto de barco que se alquilará. Tiene un método calcularPrecioAlquiler() que calcula el precio final 
del alquiler multiplicando el número de días de ocupación por el valor módulo del barco.
*/