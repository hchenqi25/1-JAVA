package Repaso;

import java.util.Scanner;

public class ejercicio48 {

	public static void main(String[] args) {
		
		float suma=0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime la longitud del array:");
		int longitud = teclado.nextInt();
		float[] numeros = new float[longitud];
		for (int i=0;i<numeros.length;i++) {
			System.out.print("Ingresa un numero" + (i+1) + ":");
		numeros[i]= teclado.nextFloat();
		}
		for (int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
		}
	float media = suma/numeros.length;
System.out.print("La media es de:" + media);
teclado.close();	}

}
