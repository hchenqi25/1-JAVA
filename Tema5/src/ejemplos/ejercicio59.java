package ejemplos;

import java.util.Scanner;

public class ejercicio59 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime una frase: ");
		String frase = teclado.nextLine();
		String[] partes = frase.split("");

		for (int i = partes.length - 1; i >= 0; i--) {
			System.out.println(partes[i]);
		}

		teclado.close();
	}
}
