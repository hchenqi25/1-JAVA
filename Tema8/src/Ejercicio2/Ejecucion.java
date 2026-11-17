package Ejercicio2;

import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Libros l = new Libros();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Vamos con libros");

		System.out.print("Titulo: ");
		l.Settitulo(teclado.nextLine());

		System.out.print("Autor: ");
		l.Setautor(teclado.nextLine());

		System.out.print("Ubicacion: ");
		l.Setubicacion(teclado.nextLine());
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Características del libro:");
		l.caracteristicas();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Vamos con el número de páginas");
		Documento d = new Documento();

		System.out.println("Información de las páginas");

		System.out.print("Introduce el número de páginas: ");
		d.setPaginas(teclado.nextInt());

		d.Settitulo(l.getTitulo());
		d.Setautor(l.getAutor());
		d.Setubicacion(l.getUbicacion());
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Características del documento:");
		d.caracteristicas();

		System.out.println("---------------------------------------------------------------------");
		Libros l2 = new Libros("Cervantes", "Don quijote");
		l2.caracteristicas();
		teclado.close();
	}
}