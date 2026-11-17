package Tema4;

import java.util.Scanner;

public class Ejercicio4_10 {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que declare un array para almacenar 100 nombres. Se
		 * pedirá al usuario que introduzca nombres de manera repetitiva hasta que se
		 * pulse la tecla “intro” (se representa con una cadena vacía). Después, el
		 * programa mostrará los nombres que se han introducido hasta ese momento.
		 */

		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[100];
		int contador = 0;
		while (contador < nombres.length) {
			System.out.print("Introduce un nombre (enter para terminar): ");
			String nombre = teclado.nextLine();
			if (nombre.equals("")) {
				break;
			}
			nombres[contador] = nombre;
			contador++;
		}
		System.out.println("Nombres introducidos:");
		for (int i = 0; i < contador; i++) {
			System.out.println(nombres[i]);
		}
	teclado.close();}
}