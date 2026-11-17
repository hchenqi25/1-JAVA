package Relacion1;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce una palabra: ");
            String palabra = teclado.nextLine();

            boolean resultado = esPalindromo(palabra);

            if (resultado) {
                System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
            } else {
                System.out.println("La palabra \"" + palabra + "\" NO es un palíndromo.");
            }

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } 
            teclado.close();
        
    }

 
    public static boolean esPalindromo(String palabra) {
        try {
            if (palabra == null || palabra.isEmpty()) {
                System.out.println("La palabra no puede estar vacía.");
                return false;
            }

            palabra = palabra.toLowerCase().replace(" ", "");

            Stack<Character> pila = new Stack<>();

          
            for (char c : palabra.toCharArray()) {
                pila.push(c);
            }

            StringBuilder invertida = new StringBuilder();
            while (!pila.isEmpty()) {
                invertida.append(pila.pop());
            }

            return palabra.equals(invertida.toString());

        } catch (Exception e) {
            System.out.println("Error al procesar la palabra: " + e.getMessage());
            return false;
        }
    }
}