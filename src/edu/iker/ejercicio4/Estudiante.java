package edu.iker.ejercicio4;


import java.util.HashSet;
import java.util.Set;

public class Estudiante {

    private String nombre;
    private Set<String> asignaturasAprobadas;
    private Set<String> asignaturasPendientes;


public Estudiante(String nombre) {
    this.nombre = nombre;
    this.asignaturasAprobadas = new HashSet<String>();
    this.asignaturasPendientes=new HashSet<String>();
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Set<String> getAsignaturasAprobadas() {
    return asignaturasAprobadas;
}

public void setAsignaturasAprobadas(Set<String> asignaturasAprobadas) {
    this.asignaturasAprobadas = asignaturasAprobadas;
}

public Set<String> getAsignaturasPendientes() {
    return asignaturasPendientes;
}

public void setAsignaturasPendientes(Set<String> asignaturasPendientes) {
    this.asignaturasPendientes = asignaturasPendientes;
}

@Override
public String toString() {
    return "Estudiante{" +
            "nombre='" + nombre + '\'' +
            ", asignaturasAprobadas=" + asignaturasAprobadas +
            ", asignaturasPendientes=" + asignaturasPendientes +
            '}';
}

public void cursarAsignatura (String asignatura, boolean aprobada){

    if (aprobada){
        if(asignaturasAprobadas.contains(asignatura)){
            System.out.println("ya ha cursado esta asginatura");
        }
        else{
            asignaturasAprobadas.add(asignatura);
            if(asignaturasPendientes.contains(asignatura)){
                asignaturasPendientes.remove(asignatura);
            }
        }
    }
    else {
        asignaturasPendientes.add(asignatura);
    }
}

public Set<String> getTodas(){
    Set<String> asignaturasTotales=new HashSet<>();
    asignaturasTotales.addAll(asignaturasAprobadas);
    asignaturasTotales.addAll(asignaturasPendientes);
    return asignaturasTotales;
}
}






