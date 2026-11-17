package Tema4;

import java.util.InputMismatchException; //Importo la clase debido a que no se encuentra predefinido 
import java.util.Scanner;

public class Ejercicio_Examen {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] datos = new int[20];
		int elementos = 0;
		int opcion = 0;
		try {
			do {
				System.out.println("---MENU---");
				System.out.println("1. Añadir valor");
				System.out.println("2. Borrar valor por posicion");
				System.out.println("3. Insertar valor ");
				System.out.println("4. Mostrar Array");
				System.out.println("5. Salir");
				System.out.print("Elige una opción: ");
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1: // Opcion de añadir
					if (elementos < datos.length) {
						System.out.print("Introduce un número para añadir: ");
						datos[elementos] = teclado.nextInt();
						elementos++;
					} else {
						System.out.println("No hay espacio");
					}
					break;
				case 2: // Opcion de borrar
					System.out.print("Introduce el valor a borrar: ");
					int borrar = teclado.nextInt();
					boolean borrado = false;
					for (int i = 0; i < elementos; i++) {
						if (datos[i] == borrar) {
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

				case 3: // Opcion de insertar en el array
					if (elementos < datos.length) {
						System.out.print("Introduce el valor: ");
						int valor = teclado.nextInt();
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

				case 4: // Opcion de mostrar array
					if (elementos == 0) {
						System.out.println("Array vacío");
					} else {
						System.out.print("ARRAY: ");
						for (int i = 0; i < elementos; i++) {
							System.out.print(datos[i]);
						}
						System.out.println();
					}
					break;
				case 5: // Opcion de salida
					System.out.println("Programa finalizado, saliendo");
					break;
				default: // Si introduce un numero que no esta en el menu
					System.out.println("Opción incorrecta ");
					break;
				}
			} while (opcion != 5); // Mientras que el usuario no elija la opcion 5 se seguira mosntrando el menu
									// para que elija opcion
			// Posibles excepciones que puede haber
		} catch (InputMismatchException e) {
			System.out.println("Error:Opcion no disponible .");
			teclado.nextLine();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Fuera del limite del array");
		}
		teclado.close();
	}
}