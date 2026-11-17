package ejemplos;
import java.util.Scanner;
import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		int[] numeros = {10, 20, 30, 40};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un índice: ");
            int indice = scanner.nextInt();

            System.out.println("Valor en la posición " + indice + ": " + numeros[indice]);

        } catch (InputMismatchException e) {
            System.out.println("Error debes introducir un numero entero.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error indice fuera de rango debe estar entre 0 y 3.");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
            scanner.close();
        }

}