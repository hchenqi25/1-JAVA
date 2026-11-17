package clase_Tema5;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime una frase: ");
		String frase = teclado.nextLine();

		System.out.println("Dime una palabra: ");
		String palabra = teclado.nextLine();

		// 1. Si la frase contiene esa palabra.
		boolean tienePalabra = frase.contains(palabra);
		System.out.println("¿Contiene la palabra?: " + tienePalabra);

		// 2. En qué posición empieza esa palabra (si está)
		int posicion = frase.indexOf(palabra);
		System.out.println("Posición de la palabra: " + posicion);

		// 3. Si la frase comienza con esa palabra.
		boolean empieza = frase.startsWith(palabra);
		System.out.println("¿Empieza con la palabra?: " + empieza);

		// 4. Mostrar desde el inicio de la palabra hasta el final de la frase
		if (posicion != -1) {
			String parte = frase.substring(posicion);
			System.out.println("Desde la palabra hasta el final: " + parte);
		} else {
			System.out.println("La palabra no se encuentra en la frase.");
		}

		teclado.close();
	}
}