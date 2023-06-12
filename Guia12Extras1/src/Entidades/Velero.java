/*
 En los veleros se suma el número de mástiles,

 */
package Entidades;

public class Velero extends Barco {
    protected int numMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numMastiles;
    }
}

/*
Velero: Es una subclase de Barco que representa un barco tipo velero. Además de los atributos
heredados de Barco, tiene un atributo adicional llamado numMastiles que representa el número 
de mástiles del velero. Sobrescribe el método calcularModulo() para sumar el número de mástiles 
al módulo normal.
*/
