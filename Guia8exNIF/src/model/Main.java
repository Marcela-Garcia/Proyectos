
package model;


public class Main {
    public static void main(String[] args) {
    
       NIF n = new NIF();
        NIFServicio nifService = new NIFServicio();
        
        nifService.crearNIF(n);
        nifService.mostrarNIF(n);
    }
}



