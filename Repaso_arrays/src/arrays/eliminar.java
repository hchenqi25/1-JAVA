package arrays;

import java.util.Scanner;

public class eliminar {

	public static void main(String[] args) {
		int[] numeros = { 10, 20, 30, 40, 50 };
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero para eliminar:");
		int eliminar = teclado.nextInt();

		int nuevoTam = numeros.length;
		boolean encontrado = false;

		for (int i = 0; i < nuevoTam; i++) {
			if (numeros[i] == eliminar) {

				for (int j = i; j < nuevoTam - 1; j++) {
					numeros[j] = numeros[j + 1];
				}

				nuevoTam--;
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("Array despues de eliminar:");
			for (int i = 0; i < nuevoTam; i++) {
				System.out.print(numeros[i] + "");
			}
		} else {
			System.out.print("Numero no encontrado");
		}
		teclado.close();
	}

}
