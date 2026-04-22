package edu.iker.ejercicio5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Principal {

    static void main() {

        Set<String> asignaturasTotales= Set.of("Ingles","Programacion","Marcas","BaseDatos","Sistemas");

        Estudiante estudiante1= new Estudiante("John");

        estudiante1.cursarAsignatura("Ingles",generarNotaAleatoria());
        estudiante1.cursarAsignatura("Programacion",generarNotaAleatoria());
        estudiante1.cursarAsignatura("Marcas",generarNotaAleatoria());
        estudiante1.cursarAsignatura("BaseDatos",generarNotaAleatoria());
        estudiante1.cursarAsignatura("Sistemas",generarNotaAleatoria());
        System.out.println(estudiante1);

        estudiante1.mostrarAsignaturasAprobadasYSuspensas();

    }

    public static int generarNotaAleatoria(){
        Random random = new Random();
        return random.nextInt(0,10);
    }
}
