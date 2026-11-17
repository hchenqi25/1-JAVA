package Relacion_ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Introduce una palabra para comprobar si es palíndromo:");
            String palabra = in.nextLine();

            if (esPalindromo(palabra)) {
                System.out.println("La palabra SÍ es un palíndromo.");
            } else {
                System.out.println("La palabra NO es un palíndromo.");
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

   
    public static boolean esPalindromo(String palabra) {
        Stack<Character> pila = new Stack<>();
        Queue<Character> cola = new LinkedList<>();

       
        palabra = palabra.replace(" ", "").toLowerCase();

        
        for (char c : palabra.toCharArray()) {
            pila.push(c);
            cola.add(c);
        }

      
        while (!pila.isEmpty()) {
            if (!pila.pop().equals(cola.remove())) {
                return false;
            }
        }

        return true;
    }
}