/*
 en los barcos a motor se le suma la potencia en CV (caballos de vapor)
*/
package Entidades;

/**
 *
 * @author Administrador
 */
public class BarcoMotor extends Barco {
    protected int potenciaCV;

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}

/*
BarcoMotor: Es una subclase de Barco que representa un barco a motor. Tiene un atributo adicional 
llamado potenciaCV que representa la potencia del motor (CV). Sobrescribe 
el método calcularModulo() para sumar la potencia en CV al módulo normal.
*/