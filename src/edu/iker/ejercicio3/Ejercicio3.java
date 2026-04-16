package edu.iker.ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        mapa.put("Anillos", 2);
        mapa.put("Pulsera", 1);
        mapa.put("Piercing", 3);

        if (mapa.containsKey("Anillos")){
            mapa.put("Anillos",mapa.get("Anillos")+1);
            System.out.println(mapa);
        }
    }
}
