/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package Entidades;

public class EdificioDeOficinas extends Edificio {

    protected int numeroOficinas;
    protected int personasPorOficina;
    protected int numeroPisos;

    public EdificioDeOficinas(int ancho, int alto, int largo, int numeroOficinas, int personasPorOficina, int numeroPisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public int cantPersonas() {
        int personasPorPiso = personasPorOficina * numeroOficinas;
        int totalPersonas = personasPorPiso * numeroPisos;

        System.out.println("Personas por piso: " + personasPorPiso);
        System.out.println("Personas en todo el edificio: " + totalPersonas);
        return 0;
    }

}
