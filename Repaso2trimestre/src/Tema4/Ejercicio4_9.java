package Tema4;

import java.util.Scanner;

public class Ejercicio4_9 {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que pida al usuario 10 números reales de doble
		 * precisión. Se guardarán esos valores en un array, calculará la media y luego
		 * mostrará por consola todos los valores que estén por encima de la media.
		 */
		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10];
		double suma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero" + (i + 1) + "=>");
			numeros[i] = teclado.nextDouble();
			suma += numeros[i];
		}
		double media = suma / 10;
		System.out.println("La media es de => " + media);

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				System.out.println("Los numeros mayor a la media son =>" + numeros[i]);
			}
		}

		teclado.close();
	}

}
