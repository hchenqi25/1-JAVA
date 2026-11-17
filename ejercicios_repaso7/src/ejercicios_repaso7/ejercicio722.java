package ejercicios_repaso7;

import java.util.Scanner;

public class ejercicio722 {

	public static void Suma() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime una numero:");
		int num1 = teclado.nextInt();
		System.out.print("Dime otro numero: ");
		int num2 = teclado.nextInt();

		int suma = num1 + num2;
		System.out.print("El resultado de la suma es de:" + suma);
		teclado.close();
	}

	public static void Resta() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero:");
		int num3 = sc.nextInt();

		System.out.print("Dime otro numero:");
		int num4 = sc.nextInt();

		int resta = num3 - num4;
		System.out.print("El resultado de la resta es de:" + resta);
		sc.close();
	}

	public static void main(String[] args) {
		Suma();
		Resta();

	}

}
