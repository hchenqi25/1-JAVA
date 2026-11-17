package Relacion_ejercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Introduce una palabra para comprobar si es palíndromo:");
            String palabra = in.nextLine();

            String invertida = invertirCadena(palabra);

            System.out.println("Palabra invertida: " + invertida);

            if (palabra.equalsIgnoreCase(invertida)) {
                System.out.println("Es un palíndromo.");
            } else {
                System.out.println("No es un palíndromo.");
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    
    public static String invertirCadena(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }

        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()) {
            invertida.append(pila.pop());
        }

        return invertida.toString();
    }
}