/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11extra4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

class Simulador {

    private List<String> nombres;
    private List<String> apellidos;
    private List<Alumno> listaAlumnos;

    public Simulador() {
        nombres = new ArrayList<>();
        apellidos = new ArrayList<>();
        listaAlumnos = new ArrayList<>();

        // Inicializar nombres y apellidos
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Pedro");
        // Agregar más nombres si es necesario

        apellidos.add("Gómez");
        apellidos.add("Rodríguez");
        apellidos.add("López");
        apellidos.add("Pérez");
        apellidos.add("Martínez");
        
    }

    public List<String> generarCombinacionesDNI(int cantidad) {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String dni = String.valueOf(10000000 + random.nextInt(90000000));
            dnis.add(dni);
        }

        return dnis;
    }

    public List<Alumno> generarListaAlumnos(int cantidad) {
        List<String> dnis = generarCombinacionesDNI(cantidad);
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres.get(random.nextInt(nombres.size()));
            String apellido = apellidos.get(random.nextInt(apellidos.size()));
            String nombreCompleto = nombre + " " + apellido;
            String dni = dnis.get(i);
            Alumno alumno = new Alumno(nombreCompleto, dni);
            listaAlumnos.add(alumno);
        }

        return listaAlumnos;
    }

    public void mostrarListaAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Nombre completo: " + alumno.getNombreCompleto());
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("-----------------------------");
        }
    }

    public void votacion(List<Alumno> alumnos) {
        Random random = new Random();
        HashSet<Alumno> votosRealizados = new HashSet<>();

        for (Alumno alumno : alumnos) {
            List<Alumno> votos = new ArrayList<>();
            int contadorVotos = 0;

            while (contadorVotos < 3) {
                Alumno alumnoVotado = alumnos.get(random.nextInt(alumnos.size()));

                if (!alumno.equals(alumnoVotado) && !votosRealizados.contains(alumnoVotado)) {
                    votos.add(alumnoVotado);
                    votosRealizados.add(alumnoVotado);
                    contadorVotos++;
                    alumnoVotado.incrementarVoto();
                }
            }

            Voto voto = new Voto(alumno, votos);
            System.out.println("Alumno que vota: " + voto.getAlumnoQueVota().getNombreCompleto());
            System.out.println("Votos realizados:");
            for (Alumno votado : voto.getAlumnosVotados()) {
                System.out.println("- " + votado.getNombreCompleto());
            }
            System.out.println("-----------------------------");
        }
    }

    public void mostrarResultados(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos realizados:");
            Iterable<Voto> listaVotos = null;
            for (Voto voto : listaVotos) {
                if (voto.getAlumnoQueVota().equals(alumno)) {
                    for (Alumno votado : voto.getAlumnosVotados()) {
                        System.out.println("- " + votado.getNombreCompleto());
                    }
                }
            }
            System.out.println("-----------------------------");
        }
    }

    public void hacerRecuentoVotos(List<Alumno> alumnos) {
        List<Alumno> alumnosOrdenados = new ArrayList<>(alumnos);
        alumnosOrdenados.sort((a1, a2) -> Integer.compare(a2.getCantidadVotos(), a1.getCantidadVotos()));

        System.out.println("Facilitadores elegidos:");
        for (int i = 0; i < 5; i++) {
            Alumno facilitador = alumnosOrdenados.get(i);
            System.out.println((i + 1) + ". " + facilitador.getNombreCompleto());
        }
        System.out.println("-----------------------------");

        System.out.println("Facilitadores suplentes:");
        for (int i = 5; i < 10; i++) {
            Alumno suplente = alumnosOrdenados.get(i);
            System.out.println((i - 4) + ". " + suplente.getNombreCompleto());
        }
        System.out.println("-----------------------------");
    }
}
