package funciones;

import java.util.Scanner;

public class ejercicio717 {

	public static int[] generarTabla(int numero) {
		int[] tabla = new int[10];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = numero * (i + 1);
		}

		return tabla;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime cual tabla de multiplicar queires:");
		int numero = teclado.nextInt();
		int[] resultado = generarTabla(numero);

		System.out.println("Tabla de multiplicar del " + numero + ":");
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(numero + " x " + (i + 1) + " = " + resultado[i]);
		}
		teclado.close();
	}
}