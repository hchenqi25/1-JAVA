package Ejercicios;

import java.util.Scanner;

public class ejercicio72 {

	public static void multiplicacion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la tabla que quieres ver:");
		int tabla = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " x " + i + " = " + (tabla * i));
			teclado.close();
		}

	}

	public static void main(String[] args) {
		multiplicacion();

	}

}
