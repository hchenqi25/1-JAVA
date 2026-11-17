package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Introduce palabras (pulsa Intro sin escribir nada para terminar):");

        while (true) {
            String entrada = sc.nextLine();

            if (entrada.isEmpty()) {
                break;
            }

            palabras.add(entrada);
        }

        System.out.println("\nContenido de la lista:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

      
        Collections.sort(palabras);

        System.out.println("Lista ordenada alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        sc.close();
    }
}