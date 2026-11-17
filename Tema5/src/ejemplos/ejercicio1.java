package ejemplos;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime una palabra:");
		String palabra = teclado.nextLine();

		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
			teclado.close();
		}
	}
}
