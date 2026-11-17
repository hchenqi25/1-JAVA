package ejercicios_repaso;

import java.util.Scanner;

public class ejercicio524 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        if (frase.length() >= 4) {
           
            String resultado = frase.substring(2, frase.length() - 2);
            System.out.println("Frase modificada: " + resultado);
        } else {
            System.out.println("La frase es demasiado corta para eliminar 4 caracteres.");
        }

        teclado.close();
    }
}