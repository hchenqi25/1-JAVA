package clase_Tema5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime una frase: ");
		String frase = teclado.nextLine();

// Elimina los espacios al principio y al final. 
		String limpio = frase.trim();
		System.out.print(limpio);
//Convierte toda la frase a mayúsculas. 
		System.out.print(frase.toUpperCase());
//Convierte toda la frase a minusculas. 
		System.out.println(frase.toLowerCase());
// Muestra el primer carácter. 
		char letra = frase.charAt(0);
		System.out.println(letra);
//Muestra los primeros 5 caracteres. 
		for (int i = 0; i < 5; i++) {
			System.out.print(frase.charAt(i));
		}
//Cuenta cuántas veces aparece la letra 'a'. 	
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a') {
				contador++;
			}

		}
		System.out.print(contador);
		teclado.close();
	}
}
