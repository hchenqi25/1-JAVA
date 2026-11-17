package arrays;

import java.util.Scanner;

public class Insertar {

	public static void main(String[] args) {
		int[] numeros = new int[6]; // SE CREA UN ARRAY CON ESPACIO EXTRA
		int[] originales = { 10, 20, 30, 40, 50 };
		int elementos = 5;

		// SE COPIA LOS COMPONENTES DEL ARRAY ORIGINAL AL NUEVO ARRAY
		for (int i = 0; i < elementos; i++) {
			numeros[i] = originales[i];
		}
		// LE PEDIMOS AL USUSARIO QUE INTRODUZCA EL NUMERO QUE QUIERE INSERTAR
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero a insertar:");
		int nuevo = teclado.nextInt();
		// LE PREGUNTAMOS AL USUSARIO EN QUE POSICIÓN LA QUIERE INSERTAR
		System.out.print("Introduce una posición del 0 al 5: ");
		int posicion = teclado.nextInt();

		// SI LA POSICIÓN ES MAYOR A 0 O LA POSICIÓN ES MAYOR QUE EL ELEMENTO
		if (posicion < 0 || posicion > elementos) {
			System.out.print("Posición invalida");
		} else {
			for (int i = elementos; i > posicion; i--) {
				numeros[i] = numeros[i - 1];
			}
			// IGUALO LOS NUMEROS DE LA POSICIÓN A LA VALAIBRE NUEVO
			numeros[posicion] = nuevo;
			elementos++;
			// MUESTRO EL ARRAY DESPUES DE HABER INSERTADO EL NUMERO QUE NOS DICE EL
			// USUSARIO
			System.out.println("Array después de insertar");
			for (int i = 0; i < elementos; i++) {
				System.out.print(numeros[i] + "");
			}
		}

		teclado.close();
	}

}
