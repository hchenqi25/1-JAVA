package Ejercicio1;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio1 {

	public static void main(String[] args) {

		Stack pila = new Stack();
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce un numero =>");
			int num = in.nextInt();
			in.nextLine();

			System.out.println("Introduce palabras =>");
			String cadena = in.nextLine();

			pila.push(num + " " + cadena);

		}
		int total = pila.size();

		for (int i = 0; i < total; i++) {
			System.out.println("Orden inverso: " + pila.pop());
		}

	}
}
