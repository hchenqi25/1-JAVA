package clase_Tema5;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] frases = new String[5];

        // Pedir 5 frases al usuario
        for (int i = 0; i < frases.length; i++) {
            System.out.println("Dime la frase " + (i + 1) + ":");
            frases[i] = teclado.nextLine();
        }

        // Búsqueda de cadenas hasta que el usuario escriba "fin"
        while (true) {
            System.out.print("Escribe una cadena para buscar (o 'fin' para terminar): ");
            String cadena = teclado.nextLine();

            if (cadena.equalsIgnoreCase("fin")) {
                System.out.println("Programa finalizado.");
                break;
            }

            boolean encontrada = false;
            boolean enPrimeraPosicion = false;

            for (String frase : frases) {
                if (frase.contains(cadena)) {
                    encontrada = true;
                    if (frase.startsWith(cadena)) {
                        enPrimeraPosicion = true;
                    }
                }
            }

            if (encontrada) {
                System.out.println("La cadena se encuentra en alguna frase.");
                if (enPrimeraPosicion) {
                    System.out.println("Además, se encuentra en la primera posición de alguna frase.");
                }
            } else {
                System.out.println("La cadena NO se encuentra en ninguna frase.");
            }
        }

        teclado.close();
    }
}