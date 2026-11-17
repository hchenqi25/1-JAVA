package Array;

import java.util.Scanner;

public class ejercicio4_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10];
		double suma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero " + i + 1 + "=>");
			numeros[i] = teclado.nextDouble();
			suma += numeros[i];
		}

		double media = suma / numeros.length;
		System.out.println("La media es de => " + media);

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				System.out.println("Numeros por encima de la media =>" + numeros[i]);
			}
		}

		teclado.close();
	}

}
