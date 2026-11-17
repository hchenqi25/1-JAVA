package ejercicios_repaso;

import java.util.Scanner;

public class ejercicio515 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime una frase: ");
		String frase = teclado.nextLine();

		StringBuilder frase1 = new StringBuilder(frase);
		// Muestro la frase
		System.out.println("La frase original es:" + frase.toString());
		// Elimino el primer caracter
		frase1.deleteCharAt(0);
		
		System.out.println(frase1.toString());

		teclado.close();
	}

}
