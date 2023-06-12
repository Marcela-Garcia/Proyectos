/*CREAr protectos con la clase persona 
sumarle tres atributos
crear objetos en tu main utilizando los contrusctores
creamos los getters y setter y despues lo invocamos desde la clase main com añfimops de ñps objetps que iniciasyw.
 */
package Entidad;

public class Persona {

    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters y setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
