package clase_Tema5;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime tu nombre:");
		String nombre = teclado.nextLine();
		System.out.print("Dime tus apellidos:");
		String apellidos = teclado.nextLine();
//Eliminará espacios al principio y al final de cada dato si los hubiera. 
		String nombre2 = nombre.trim();
		String apellidos2 = apellidos.trim();
		System.out.println(nombre2);
		System.out.println(apellidos2);
//Unirá el nombre y los apellidos en una sola cadena utilizando concat(). 
		String completo = nombre.concat(" ").concat(apellidos);
		System.out.println(completo);
//Mostrará el nombre completo en mayúsculas y en minúsculas. 
		System.out.println(completo.toUpperCase());
		System.out.println(completo.toLowerCase());
// Mostrará uno a uno los caracteres del nombre completo usando toCharArray(). 
		char[] letras = completo.toCharArray();
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		teclado.close();
	}

}
