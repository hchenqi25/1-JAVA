package repeticion;

import java.util.Scanner;

public class ejercicio41 {

		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
		int[]numeros = new int[4];
		numeros[0] = teclado.nextInt();
		numeros[1] = teclado.nextInt();
		numeros[2] = teclado.nextInt();
		numeros [3] = teclado.nextInt();
		System.out.print("Dentro del array:");
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
	int media = (numeros[0]  + numeros[1] +numeros[2]  + numeros [3] )/4;
	System.out.print("La media del arryse es: " + media);
	teclado.close();
		}


	}


