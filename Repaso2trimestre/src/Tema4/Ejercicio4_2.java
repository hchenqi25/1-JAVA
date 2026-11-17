package Tema4;

import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que declare un array de números reales de simple
		 * precisión (float). Después, pedirá al usuario 5 números y los almacenará
		 * dentro del array. Terminará mostrando por consola los números en orden
		 * inverso al que se introdujeron.
		 */
		Scanner teclado = new Scanner(System.in);
		float[] numeros = new float[5];

		System.out.println("---------NUMEROS EN ORDEN DE INGRESO----------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un nuemro " + (i + 1) + "=>");
			numeros[i] = teclado.nextFloat();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}

		System.out.println("-------------NUMEROS EN ORDEN INVERSO----------------");

		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	teclado.close();}
}
