/*
 * En este caso, como solo hay dos atributos y se accede directamente a ellos en la clase Meses, 
no es necesario implementar una clase separada para getters y setters
 */
package EjMeses;

public class Meses {
    public String[] meses;
    public String mesSecreto;
    
    public Meses() {
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = meses[8]; // Mes secreto es septiembre, arranca de 0
    }
    
    public boolean adivinarMes(String mesUsuario) {
        if (mesUsuario.equals(mesSecreto)) {
            System.out.println("¡Ha acertado!");
            return true;
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            return false;
        }
    }
}

/*
 la clase Meses tiene un constructor que inicializa la variable de instancia meses 
como un arreglo de strings que contiene los doce meses del año en minúsculas, y establece 
el mes secreto como septiembre en la posición 8 del arreglo, ya que los índices comienzan en cero
La clase Meses también tiene un método adivinarMes que toma el mes que el usuario 
ingresa como parámetro y verifica si coincide con el mes secreto. Si coincide, se imprime 
un mensaje de felicitación. Si no coincide, devuelve false.
*/