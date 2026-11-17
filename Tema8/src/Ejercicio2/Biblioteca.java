package Ejercicio2;

import java.util.Scanner;

public class Biblioteca {

	private Libros[] libros = new Libros[1000];
	private int contador = 0;

	public void menu() {
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("--------------------------------------------------");
			System.out.println("                 MENÚ BIBLIOTECA");
			System.out.println("--------------------------------------------------");
			System.out.println("1. Añadir libro");
			System.out.println("2. Ver libros");
			System.out.println("3. Salir");
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				añadirLibro(sc);
				break;

			case 2:
				mostrarLibros();
				break;

			case 3:
				System.out.println("Saliendo del menú...");
				break;

			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 3);
	}

	private void añadirLibro(Scanner sc) {
		if (contador >= 1000) {
			System.out.println("La biblioteca está llena.");
			return;
		}

		System.out.print("Título: ");
		String titulo = sc.nextLine();

		System.out.print("Autor: ");
		String autor = sc.nextLine();

		System.out.print("Ubicación: ");
		String ubicacion = sc.nextLine();

		Libros nuevo = new Libros();
		nuevo.Settitulo(titulo);
		nuevo.Setautor(autor);
		nuevo.Setubicacion(ubicacion);

		libros[contador] = nuevo;
		contador++;

		System.out.println("Libro añadido correctamente.");
	}

	private void mostrarLibros() {
		if (contador == 0) {
			System.out.println("No hay libros registrados.");
			return;
		}

		for (int i = 0; i < contador; i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("Libro " + (i + 1));
			libros[i].caracteristicas();
		}
	}
}