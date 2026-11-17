package Relacion_ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Queue<Integer> cola = new LinkedList<Integer>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce el número " + (i + 1) + ": ");
			cola.add(teclado.nextInt());
		}

		System.out.print("Introduce posicion a mover: ");
		int n = teclado.nextInt();

		moverElementos(cola, n);

		System.out.println("Cola resultante: " + cola);
	}

	public static void moverElementos(Queue<Integer> cola, int n) {
		for (int i = 0; i < n; i++) {
			int elemento = cola.remove();
			cola.add(elemento);
		}
	}
}