/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9static.math;

// Clase ParDeNumerosService con los métodos solicitados
public class ParDeNumerosService {
    public PardeNumeros par;
    
    // Constructor que recibe un objeto ParDeNumeros para trabajar con él
    public ParDeNumerosService(PardeNumeros par) {
        this.par = par;
    }
    
    // Método para mostrar los dos números guardados en el objeto ParDeNumeros
    public void mostrarValores() {
        System.out.println("Los valores guardados son: " + par.getNum1() + " y " + par.getNum2());
    }
    
    // Método para retornar el mayor de los dos números
    public double devolverMayor() {
        return Math.max(par.getNum1(), par.getNum2());
    }
    
    // Método para calcular la potencia del mayor número elevado al menor número
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = Math.min(par.getNum1(), par.getNum2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    // Método para calcular la raíz cuadrada del menor número
    public double calculaRaiz() {
        double menor = Math.min(par.getNum1(), par.getNum2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
