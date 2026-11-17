package Colas;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase => ");
        String frase = teclado.nextLine();

        while (!frase.isEmpty()) {  
            cola.add(frase);        

            System.out.println("Introduce una frase => ");
            frase = teclado.nextLine();  
        }

        
        int total = cola.size();
        for(int i = 0; i < total; i++) {
            System.out.println("La posicion " + i + " la frase es => " + cola.poll());
        }

        teclado.close();
    }
}