package Ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la capacidad de almacenamiento => ");
		int capacidad = teclado.nextInt();

		Libro[] li = new Libro[capacidad];

		for (int i = 0; i < capacidad; i++) {
			System.out.println("Introduce una opcion 1 - Novela , 2 -Libro tecnico , 3- Mostrar  , 4 -Salir");

			int opcion = teclado.nextInt();

			while (opcion != 4) {

				if (opcion == 1) {
					teclado.nextLine();
					Novela nv = new Novela();
					System.out.println("Introduce el titulo de la novela => ");
					nv.setTitulo(teclado.nextLine());
					System.out.println("Introduce el autor de la novela => ");
					nv.setAutor(teclado.nextLine());

					System.out.println("Introduce el año => ");
					nv.setAño(teclado.nextInt());
					teclado.nextLine();
					System.out.println("Introduce el genero => ");
					nv.setGenero(teclado.nextLine());
					teclado.nextLine();

					li[i] = nv;
					System.out.println("Introduce una opcion 1 - Novela , 2 -Libro tecnico , 3- Mostrar  , 4 -Salir");
				}
				
				if(opcion == 2) {
					teclado.next();
					
				}

			}

		}

	}

}
