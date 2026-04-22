package edu.iker.ejercicio4;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Principal {
    static void main() {

        Set<String> asignaturasTotales = Set.of("ingles", "programacion", "basesDatos", "marcas", "sostenibilidad");

        Estudiante estudiante1 = new Estudiante("John");
        Estudiante estudiante2 = new Estudiante("Wick");

        for (String asignatura : asignaturasTotales) {
            estudiante1.cursarAsignatura(asignatura, generarBoolean());
            estudiante2.cursarAsignatura(asignatura, generarBoolean());
        }

        System.out.println(estudiante1);
        System.out.println(estudiante2);

        System.out.println(estudiante1.getTodas());

        estudiante1.cursarAsignatura(conseguirAsignaturaAleatoriaPendiente(estudiante1),true);

        System.out.println(estudiante1);
    }

    public static boolean generarBoolean() {
        Random aleatorio = new Random();
        return aleatorio.nextBoolean();

    }

    public static String conseguirAsignaturaAleatoriaPendiente(Estudiante estudiante) {
        List<String> lista = List.copyOf(estudiante.getAsignaturasPendientes());
        return lista.get(generarEnteroAleatorio(lista));
    }

    public static int generarEnteroAleatorio(List<String> lista) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(0, lista.size() - 1);

    }

}
