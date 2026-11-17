package ejercicios_repaso;

import java.util.Scanner;

public class ejercicio521 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir una frase
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        // Pedir un carácter
        System.out.print("Introduce un carácter: ");
        char caracter = teclado.nextLine().charAt(0);

        // Crear un StringBuilder para modificar la frase
        StringBuilder fraseModificada = new StringBuilder(frase);

        // Calcular la posición central
        int posicionCentral = frase.length() / 2;
        if (frase.length() % 2 == 0) {
            posicionCentral--; // Si es par, usar el de la izquierda
        }

        // Reemplazar el carácter si coincide con el de la posición central
        if (frase.charAt(posicionCentral) == caracter) {
            fraseModificada.setCharAt(posicionCentral, '-');
        }

        // Mostrar el resultado
        System.out.println("Frase modificada: " + fraseModificada.toString());

        teclado.close();
    }
}