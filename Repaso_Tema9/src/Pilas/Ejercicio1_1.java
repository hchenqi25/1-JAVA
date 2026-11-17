package Pilas;

import java.util.Stack;
import java.util.Scanner;

public class Ejercicio1_1 {

    public static void main(String[] args) {

        Stack<Character> pila = new Stack<>();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce una cadena => ");
            String cadena = teclado.nextLine();

            // Meter cada carácter en la pila
            for (int i = 0; i < cadena.length(); i++) {
                pila.push(cadena.charAt(i));
            }

            // Sacar en orden inverso
            String invertida = "";
            while (!pila.isEmpty()) {
                invertida += pila.pop();
            }

            System.out.println("Cadena invertida => " + invertida);

        } catch (Exception e) {
            System.out.println("Error al introducir la cadena.");
        }

        teclado.close();
    }
}