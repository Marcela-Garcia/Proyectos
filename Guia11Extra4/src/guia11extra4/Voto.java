/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extra4;

import java.util.List;

class Voto {

    private Alumno alumnoQueVota;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno alumnoQueVota, List<Alumno> alumnosVotados) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }
}
