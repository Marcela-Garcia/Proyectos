/*
 En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco.
 */
package Entidades;


public class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo() {
        return eslora * 10;  //la eslora se utiliza para calcular el valor módulo de cada barco, multiplicándola por 10
    }
}

/*
el modificador de acceso protected permite que las
subclases puedan acceder a los atributos sin la necesidad de getters y setters.
Tiene los atributos de matrícula, eslora (longitud en metros) y año de fabricación. 
También tiene un método calcularModulo() que calcula el valor módulo del barco 
multiplicando la eslora por 10.
*/