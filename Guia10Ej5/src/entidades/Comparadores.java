/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import Entidades.Pais;
import java.util.Comparator;

public class Comparadores {

    public static Comparator <Pais> ordenar=new Comparator <Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombrePais().compareTo(t1.getNombrePais());

        }
    };



}
/*
Clase Comparadores:

Esta clase define un comparador personalizado llamado ordenar que se utiliza para ordenar los países
alfabéticamente.
El comparador compara los nombres de los países utilizando el método compareTo() de las cadenas.
*/


