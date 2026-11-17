package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] datos = new String[10]; //Creo el arrayse
		int elementos = 0; //Creo la variable elementos y la igualo a 0
		int opcion = 0; //Creo la valibare opcion y la igualo a 0
     
		try {
			do { //Utilizo un do while para crear el menu
				System.out.println("---MENU---");
				System.out.println("1. Añadir valor");
				System.out.println("2. Insertar valor en una posición");
				System.out.println("3. Buscar valor");
				System.out.println("4. Borrar valor");
				System.out.println("5. Mostrar todos los valores");
				System.out.println("6. Salir");
				System.out.print("Elige una opción: ");

				opcion = teclado.nextInt();

				switch (opcion) {
				case 1: // Opcion de añadir
					if (elementos < datos.length) {
						System.out.print("Introduce un número para añadir: ");
						datos[elementos] = teclado.nextLine();
						elementos++;
					} else {
						System.out.println("No hay espacio");
					}
					break;

				case 2: // Opcion de insertar en el array
					if (elementos < datos.length) {
						System.out.print("Introduce el valor: ");
						String valor = teclado.nextLine();
						System.out.print("Introduce la posición (0 -" + elementos + "): ");
						int pos = teclado.nextInt();

						if (pos >= 0 && pos <= elementos) {
							for (int i = elementos; i > pos; i--) {
								datos[i] = datos[i - 1];
							}
							datos[pos] = valor;
							elementos++;
						} else {
							System.out.println(" ERROR al elegir posicion");
						}
					} else {
						System.out.println("No hay espacio disponible ");
					}
					break;

				case 3: // Opcion de buscar dentro del array
					System.out.print("Introduce el valor a buscar: ");
					String buscado = teclado.nextLine();
					boolean encontrado = false;

					for (int i = 0; i < elementos; i++) {
						if (datos[i].equals(buscado)) {
							System.out.println("Valor encontrado en la posición: " + i);
							encontrado = true;
							break;
						}
					}
					if (!encontrado) {
						System.out.println("No se encuentra el valor");
					}
					break;

				case 4: // Opcion de borrar
					System.out.print("Introduce el valor a borrar: ");
					String borrar = teclado.nextLine();
					boolean borrado = false;

					for (int i = 0; i < elementos; i++) {
						if (datos[i].equals(borrar)) {
							for (int j = i; j < elementos - 1; j++) {
								datos[j] = datos[j + 1];
							}
							elementos--;
							borrado = true;
							System.out.println("Borrando");
							break;
						}
					}
					if (!borrado) {
						System.out.println("El elemento no se puede borrar");
					}
					break;

				case 5: // Opcion de mostrar array
					if (elementos == 0) {
						System.out.println("Array vacío");
					} else {
						System.out.print("ARRAY: ");
						for (int i = 0; i < elementos; i++) {
							System.out.print(datos[i] + " ");
						}
						System.out.println();
					}
					break;

				case 6: // Opcion de salida
					System.out.println("Programa finalizado, saliendo");
					break;

				default: // Si introduce un numero que no esta en el menu
					System.out.println("Opción incorrecta ");
					break;
				}

			} while (opcion != 6); //Mientras que la opcion sea distinta a 6 se seguira ejecutando
  //Muestro las posibles excepciones que pueden surgir y una excepcion generica 
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes introducir un número entero.");
			teclado.nextLine();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Fuera del limite del array");
		}  

		teclado.close();
	}
}
