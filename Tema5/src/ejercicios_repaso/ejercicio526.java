package ejercicios_repaso;

import java.util.Scanner;
import java.util.Random;

public class ejercicio526 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        // Lista de palabras posibles
        String[] palabras = {"java", "programa", "teclado", "pantalla", "raton", "codigo", "internet"};
        String palabraSecreta = palabras[rand.nextInt(palabras.length)];

        // Crear versión oculta con guiones bajos
        char[] palabraOculta = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }

        int intentosFallidos = 0;
        final int MAX_INTENTOS = 6;

        while (intentosFallidos < MAX_INTENTOS && new String(palabraOculta).contains("_")) {
            System.out.println("\nPalabra: " + String.valueOf(palabraOculta));
            System.out.print("Introduce una letra: ");
            char letra = teclado.nextLine().toLowerCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && palabraOculta[i] == '_') {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentosFallidos++;
                System.out.println("¡Fallaste! Intentos restantes: " + (MAX_INTENTOS - intentosFallidos));
            }
        }

        if (new String(palabraOculta).equals(palabraSecreta)) {
            System.out.println("\n¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
        } else {
            System.out.println("\n¡Has perdido! La palabra era: " + palabraSecreta);
        }

        teclado.close();
    }
}