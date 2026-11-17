package ejercicios_repaso;

import java.util.Scanner;

public class ejercicio525 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = teclado.nextLine();

        System.out.print("Dime la palabra que quieres buscar: ");
        String palabra = teclado.nextLine();

       
        if (frase.toLowerCase().contains(palabra.toLowerCase())) {
            System.out.println("La palabra aparece en la frase.");
        } else {
            System.out.println("La palabra NO aparece en la frase.");
        }

        teclado.close();
    }
}