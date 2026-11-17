package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.reflect.Method;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Introduce palabras (pulsa Intro sin escribir nada para terminar):");

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.isEmpty()) break;
            palabras.add(entrada);
        }

        System.out.println("\nContenido de la lista:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        Collections.sort(palabras);

        System.out.println("\nLista ordenada alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

      
        System.out.println("\nMétodos disponibles en ArrayList:");
        Method[] metodos = ArrayList.class.getMethods();
        for (Method m : metodos) {
            System.out.println(m.getName());
        }

   
        System.out.println("--- Probando 3 métodos de ArrayList ---");

        
        System.out.println("Tamaño de la lista: " + palabras.size());

        
        System.out.println("¿La lista contiene la palabra 'hola'? " + palabras.contains("hola"));

   
        if (!palabras.isEmpty()) {
            System.out.println("Eliminando la primera palabra: " + palabras.get(0));
            palabras.remove(0);
        }

        System.out.println("\nLista final después de usar los métodos:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        sc.close();
    }
}