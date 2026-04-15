package edu.iker.ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(4);
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);

        System.out.println("Números de la lista:");
        int numerosTotales=0;
        int sumaNumeros=0;
        int numeroMayor=numeros.get(0);
        for (Integer numero : numeros) {
            System.out.println(numero);
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
            numerosTotales++;
            sumaNumeros+=numero;
        }
        System.out.println(numerosTotales);
        System.out.println(sumaNumeros);
        System.out.println(numeroMayor);


    }

}
