

package Entidad;

public class main {

    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        Persona persona1 = new Persona("Joaquin", 15, "Calle 1");
        Persona persona2 = new Persona("Benjamin", 05, "Calle 2");

        // Imprimir información de los objetos
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Dirección: " + persona1.getDireccion());

        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Dirección: " + persona2.getDireccion());

    }
}
/*podria ser : 
        String nombrePersona1 = persona1.getNombre();
        int edadPersona1 = persona1.getEdad();
        String direccionPersona1 = persona1.getDireccion();

        String nombrePersona2 = persona2.getNombre();
        int edadPersona2 = persona2.getEdad();
        String direccionPersona2 = persona2.getDireccion();
 */
