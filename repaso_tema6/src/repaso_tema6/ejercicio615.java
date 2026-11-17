package repaso_tema6;

import java.util.Scanner;

public class ejercicio615 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Introduce una palabra: ");
			String palabra = scanner.nextLine();

			System.out.print("Introduce una posición (empezando desde 0): ");
			int posicion = scanner.nextInt();

			char caracter = palabra.charAt(posicion);
			System.out.println("El carácter en la posición " + posicion + " es: " + caracter);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: la posición está fuera de los límites de la palabra.");
		} catch (Exception e) {
			System.out.println("Error: entrada no válida.");
		} finally {
			scanner.close();
		}
	}
}