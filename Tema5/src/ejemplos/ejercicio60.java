package ejemplos;
import java.util.Scanner;

public class ejercicio60 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar entrada
        System.out.println("Introduce varios números enteros separados por espacios:");
        String entrada = teclado.nextLine();

        // Separar la cadena por espacios
        String[] partes = entrada.split(" ");

        // Inicializar suma
        int suma = 0;

        // Convertir cada parte a entero y sumar
        for (int i = 0; i < partes.length; i++) {
            int numero = Integer.parseInt(partes[i]); // sin try-catch
            suma += numero;
        }

        // Mostrar resultado
        System.out.println("La suma de los números es: " + suma);
   teclado.close(); }
}  