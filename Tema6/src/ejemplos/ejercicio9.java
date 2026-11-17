package ejemplos;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = { 10, 20, 30, 40, 50 };

		System.out.print("Introduce una posicion del 0 al 4: ");
		int posicion = scanner.nextInt();

		try {
			int valor = numeros[posicion];
			System.out.println("El valor en la posicion " + posicion + " es: " + valor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error indice fuera de rango");
			e.printStackTrace();
		}

		scanner.close();

	}

}

/*Crea un programa que declare un array de 5 enteros. Luego pide al usuario una
posición para mostrar el valor almacenado en esa posición. Si el índice está fuera de rango, el
programa debe mostrar el mensaje del error y la traza correspondiente.*/