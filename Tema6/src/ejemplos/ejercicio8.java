package ejemplos;

import java.util.Scanner;
import java.util.*;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Introduce un numero: ");
			int num1 = sc.nextInt();

			System.out.print("Introduce otro numero: ");
			int num2 = sc.nextInt();

			int resultado = (num1 / num2);

			System.out.print("El resultado es:" + resultado);
		} catch (ArithmeticException error) {
			System.out.print("No se puede dividir entre 0 " + error.getMessage());
			error.printStackTrace();
		} catch (InputMismatchException error) {
			System.out.print("No es un numero " + error.getMessage());
			error.printStackTrace();
		}

		sc.close();
	}

}

/*Desarrolla un programa que pida al usuario dos números enteros. Después los
dividirá y mostrará el resultado. Si el usuario introduce un valor no numérico o intenta dividir
entre cero, el programa mostrará un mensaje de error y la traza de la excepción.*/
