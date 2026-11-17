package Ejercicio4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();

        String frase = " "; 

        System.out.println("Introduce frases (deja la línea vacía para terminar):");

       
        for (int i = 0; !frase.equals(""); i++) {

            frase = teclado.nextLine();

            if (!frase.equals("")) {
                cola.offer(frase);   
            }
        }

        System.out.println("Has introducido las siguientes frases:");

      
        int tamaño = cola.size();
        for (int i = 0; i < tamaño; i++) {
            System.out.println(cola.poll());
        }

        teclado.close();
    }
}