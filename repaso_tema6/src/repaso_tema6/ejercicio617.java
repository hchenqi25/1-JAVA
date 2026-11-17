package repaso_tema6;

import java.util.Scanner;

public class ejercicio617 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {

			System.out.print("Introduce una cadena: ");
			String cadena = teclado.nextLine();

			System.out.print("Introduce un índice: ");
			int indice = teclado.nextInt();

			char letra = cadena.charAt(indice);
			System.out.println("La letra en la posición " + indice + " es: " + letra);

		} catch (Exception e) {
			System.out.println("Se ha producido una excepción:");
			System.out.println("Tipo: " + e.getClass().getSimpleName());
			System.out.println("Mensaje: " + e.getMessage());
		} finally {
			teclado.close();
		}
	}
}