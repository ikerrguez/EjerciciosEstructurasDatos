package edu.iker.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroComida {

    public static void main(String[] args) {
        List<String> listaComidas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        listaComidas.add("Pollo con patatas");
        listaComidas.add("Lasaña vegetal");
        listaComidas.add("Lasaña vegetal");
        listaComidas.add("Pollo con patatas");
        listaComidas.add("Caldo");
        listaComidas.add("Lasaña vegetal");
        listaComidas.add("Pollo con patatas");
        listaComidas.add("Tortilla española");

        System.out.println("Introduzca la comida");
        String comida = sc.nextLine();
        int iteradora=0;

        for (String listaComida : listaComidas) {
            if (listaComida.equals(comida)) {
                iteradora++;
            }
        }
        System.out.println(iteradora);
    }
}
