/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Administrador
 */
public class Yate extends Barco {
    protected int potenciaCV;
    protected int numCamarotes;

    public Yate(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }
}

/*
Yate: Es una subclase de Barco que representa un yate de lujo. Tiene dos atributos adicionales: 
potenciaCV que representa la potencia del motor en CV, y numCamarotes. Sobrescribe el método calcularModulo() 
para sumar la potencia en CV y el número de camarotes al módulo normal.
*/
