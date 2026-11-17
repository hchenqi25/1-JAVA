package antonio;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        // Paso 1: Pedir la longitud del array
        System.out.print("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        teclado.nextLine(); 

        String[] palabras = new String[longitud];

        // Paso 2: Rellenar el array con palabras
        for (int i = 0; i < longitud; i++) {
            System.out.print("Introduce la palabra en la posición " + i + ": ");
            palabras[i] = teclado.nextLine();
        }

        // Paso 3: Buscar palabras por índice hasta que se introduzca un número negativo
        while (true) {
            System.out.print("Introduce un número para buscar (negativo para salir): ");
            int indice = teclado.nextInt();

            if (indice < 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (indice >= 0 && indice < palabras.length) {
                String palabraBuscada = palabras[indice];
                int contador = 0;

	
                for (String palabra : palabras) {
                    if (palabra.equals(palabraBuscada)) {
                        contador++;
                    }
                }

                System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces.");

                if (contador > 2) {
                    System.out.println("¡La palabra aparece más de dos veces!");
                }
            } else {
                System.out.println("Índice fuera de rango.");
            }
        }

        teclado.close();
    }

}


