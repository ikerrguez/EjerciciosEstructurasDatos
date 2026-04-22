package edu.iker.ejercicio5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Estudiante {

    private String nombre;
    private Map<String,Integer> asignaturasCursadas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.asignaturasCursadas = new HashMap<String,Integer>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Integer> getAsignaturasCursadas() {
        return asignaturasCursadas;
    }

    public void setAsignaturasCursadas(Map<String, Integer> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", asignaturasCursadas=" + asignaturasCursadas +
                '}';
    }


    public void cursarAsignatura(String asignatura,int nota){
        if(asignaturasCursadas.containsKey(asignatura)&&asignaturasCursadas.get(asignatura)>=5){
            System.out.println("esta asignatura ya esta aprobada, no la puedes volver a cursar");
        }
        else{
            asignaturasCursadas.put(asignatura,nota);
            System.out.println("asignatura calificada en el expediente del alumno");
        }

    }

    public void mostrarAsignaturasAprobadasYSuspensas(){
        Set<String> asignaturasAprobadas = new HashSet<>();
        Set<String> asignaturasSuspensas = new HashSet<>();
        for (String asignatura : asignaturasCursadas.keySet()) {

            if(asignaturasCursadas.get(asignatura)>=5){
                asignaturasAprobadas.add(asignatura);
            }
            else {
                asignaturasSuspensas.add(asignatura);
            }

        }

        System.out.println("asignaturas aprobadas: " +asignaturasAprobadas);
        System.out.println("asignaturas suspensas: "+ asignaturasSuspensas);
    }
}
