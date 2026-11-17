package ejercicios_repaso;

import java.util.Scanner;

public class ejercicio518 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = teclado.nextLine();

        // Muestro la frase original
        System.out.println("Frase original: " + frase);

        // La convierto en mayúsculas
        String mayusculas = frase.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);

        // La convierto en minúsculas
        String minusculas = frase.toLowerCase();
        System.out.println("En minúsculas: " + minusculas);

        // Quito los espacios del principio y del final
        String sinEspacios = frase.trim();
        System.out.println("Sin espacios al principio y al final: " + sinEspacios);

        teclado.close();
    }
}