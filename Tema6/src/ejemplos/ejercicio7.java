package ejemplos;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 5 numeros separados por espacios:");

		String letra = sc.nextLine();
		String[] partes = letra.split(" ");

		int suma = 0;
		try {
			for (String parte : partes) {
				int numero = Integer.parseInt(parte);
				suma += numero;
			}
			System.out.println("La suma es: " + suma);
		} catch (NumberFormatException e) {
			System.out.println("Error todos los valores deben ser numeros enteros.");
		} catch (Exception e) {
			System.out.println("Error inesperado.");
		}

		sc.close();
	}

}

