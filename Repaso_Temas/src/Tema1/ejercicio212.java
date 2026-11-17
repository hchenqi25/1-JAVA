package Tema1;

import java.util.Scanner;

public class ejercicio212 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Dime tus apellidos: ");
		String apellidos = teclado.nextLine();

		
		System.out.print("El nombre completo es: " + nombre + " " + apellidos);
		teclado.close();
	}

}
