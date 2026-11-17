package Encapsulacion;

import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Libro l = new Libro();

		System.out.println("Introduce el titulo del libro =>");
		l.setTiulo(teclado.nextLine());

		System.out.println("Introduce el autor del libro =>");
		l.setAtutor(teclado.nextLine());

		System.out.println("¿Disponible =>?");
		l.setDisponible(true);

		l.MostrarInfo();

		l.prestar();
		l.prestar();
		l.delvolver();
		l.delvolver();
		l.MostrarInfo();

		teclado.close();
	}

}
