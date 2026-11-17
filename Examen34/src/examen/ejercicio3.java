package examen;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] juegos = { "Minecraft", "HALO", "FIFA", "Call of  Duty", "Class Royale", "Hollow Kinght", "Hay Day",
				"Subwaysurface", "Roblox", "Fortnite" };
		System.out.print(juegos);
		int contador = 0;
		System.out.print("Elige cual opcion quieres: ");
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			for (int i = 0; i < juegos.length; i++) {
				System.out.print("Cual juego quieres añadir al array:");
				juegos[i] = teclado.nextLine();
				contador++;
				break;
			}
		case 2:
			for (int i = 0; i < juegos.length; i++) {
				System.out.print("Dime el juego que quieres buscar:");
				juegos[i] = teclado.nextLine();
				boolean buscar = false;
				if (buscar == juegos.equals(juegos)) {
					System.out.print("El juego esta en la lista");
					buscar = true;
					if (!buscar) {
						System.out.print("El juego no esta en la lista: ");
					}
					contador++;
				}
			}
		case 3:
			for (int i = 0; i < juegos.length; i++) {
				System.out.print("Dime el juego que quieres eliminar: ");
				int eliminar = teclado.nextInt();
				juegos[i] = teclado.nextLine();
				eliminar--;
				System.out.print(juegos[i]);
				contador++;
				break;

			}
		case 4:
			for (int i = 0; i < juegos.length; i--) {
				System.out.print("Dime el juego a insertar:");
				String insertar = teclado.nextLine();

				for (int j = 0; j < juegos.length; j--) {
					juegos[j] = teclado.nextLine();
					System.out.print(juegos[j]);
					contador++;
					break;
				}
			}
		case 5:
			System.out.print("Dime salir para finalizar");
			String palabra = teclado.nextLine();
			break;
		default:
		}
		while (opcion != 5) {
			System.out.print("Vuelve a elegir una opcion:");
			int opcion1 = teclado.nextInt();
		}
	}

}