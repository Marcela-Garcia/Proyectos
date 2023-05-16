/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9clasedate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    public Scanner scanner = new Scanner(System.in);
    
    public FechaService() {
    }
    
    public Fecha fechaNacimiento(String fechaString) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formatoFecha.parse(fechaString); //se llama al método parse de SimpleDateFormat que convierte la cadena de texto fechaString en un objeto Date.
            return new Fecha(fecha.getDate(), fecha.getMonth() + 1, fecha.getYear() + 1900);
        } catch (ParseException e) { //En caso de que la cadena de texto fechaString no pueda ser parseada correctamente, el método lanza una excepción de tipo ParseException y retorna null.
            System.out.println("Error al parsear la fecha.");
            return null;
        }
    }
    
    public Fecha fechaActual() {
        return new Fecha(new Date().getDate(), new Date().getMonth() + 1, new Date().getYear() + 1900);
    }
    
    //Este método diferencia recibe dos objetos de tipo Fecha como parámetros y devuelve 
    //un valor entero que representa la diferencia en años entre ambas fechas.
    //Para calcular esta diferencia en años, primero se realiza una resta entre los valores 
    //en milisegundos de ambas fechas (convertidas a objetos Date mediante el método toDate()),
    //lo que nos da la cantidad de milisegundos de diferencia
    
    
    public int diferencia(Fecha fecha1, Fecha fecha2) {
        long diff = fecha2.toDate().getTime() - fecha1.toDate().getTime();
        long diffAnios = (long) (diff / (1000 * 60 * 60 * 24 * 365.25));//1000 milisegundos por segundo, 60 segundos por minuto, 60 minutos por hora, 24 horas por día, y 365.25 días por año para tener en cuenta los años bisiestos
        return (int) diffAnios;
    }
    
}

/*
El método fechaNacimiento recibe un String llamado fechaString que representa una fecha 
en formato "dd/MM/yyyy". El método utiliza un objeto de la clase SimpleDateFormat para 
parsear la cadena de texto a un objeto Date.
En la línea Date fecha = formatoFecha.parse(fechaString); se llama al método
parse de SimpleDateFormat que convierte la cadena de texto fechaString en un objeto Date.
Luego, se utiliza el objeto fecha para crear un objeto de la clase Fecha con el día, mes y año 
correspondiente. Para obtener los valores de día, mes y año, se utiliza los métodos getDate(), getMonth()
y getYear() del objeto Date.
*/