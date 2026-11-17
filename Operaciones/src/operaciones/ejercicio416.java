package operaciones;
import java.util.Scanner;

public class ejercicio416 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] colores = new String[4];

        // Entrada de colores
        for (int i = 0; i < colores.length; i++) {
            System.out.print("Introduce el color " + (i + 1) + ": ");
            colores[i] = teclado.nextLine();
        }

        // Preguntar qué color buscar
        System.out.print("¿Qué color quieres buscar?: ");
        String buscado = teclado.nextLine();

        // Buscar el color
        boolean encontrado = false;
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(buscado)) {
                System.out.println("Color encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Color no encontrado.");
        }

        teclado.close();
    }
}