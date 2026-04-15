package edu.iker.ejercicio1;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashSet<String> lista = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce una palabra: ");
            String palabra = teclado.nextLine();
            lista.add(palabra);
        }

        System.out.println("Palabras guardadas:");
        for (String p : lista) {
            System.out.println(p);
        }

        teclado.close();
    }
}
