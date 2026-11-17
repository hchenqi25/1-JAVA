package Relacion1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduce una palabra: ");
            String palabra = teclado.nextLine();

            boolean es = esPalindromo(palabra);

            if (es) {
                System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
            } else {
                System.out.println("La palabra \"" + palabra + "\" NO es un palíndromo.");
            }

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }

    public static boolean esPalindromo(String palabra) {
        try {
            if (palabra == null || palabra.isEmpty()) {
                System.out.println("La palabra no puede estar vacía.");
                return false;
            }

            palabra = palabra.toLowerCase().replace(" ", "");

            Queue<Character> cola = new LinkedList<>();
            Stack<Character> pila = new Stack<>();

         
            for (char c : palabra.toCharArray()) {
                cola.add(c);   
                pila.push(c);  
            }

            
            while (!cola.isEmpty()) {
                char desdeCola = cola.remove();
                char desdePila = pila.pop();

                if (desdeCola != desdePila) {
                    return false;
                }
            }

            return true;

        } catch (Exception e) {
            System.out.println("Error al procesar la palabra: " + e.getMessage());
            return false;
        }
    }
}