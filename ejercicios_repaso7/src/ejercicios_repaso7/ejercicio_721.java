package ejercicios_repaso7;

import java.util.Scanner;

public class ejercicio_721 {

	public static void Resultado() {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime un numero: ");
		int num1 = teclado.nextInt();
		System.out.print("Dime otro numero:");
		int num2 = teclado.nextInt();

		int division = num1 / num2;
		System.out.print("El resultado de la division es de " + division);

		teclado.close();
	}

	public static void main(String[] args) {
		Resultado();

	}

}
