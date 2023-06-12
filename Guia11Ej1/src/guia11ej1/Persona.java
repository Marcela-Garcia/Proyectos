/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej1;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private Perro perro;
    
    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    
    public void adoptarPerro(Perro perro) {
        this.perro = perro;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getDocumento() {
        return documento;
    }
    
    public Perro getPerro() {
        return perro;
    }
}