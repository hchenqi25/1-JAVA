package Array;

import java.util.Scanner;

public class ejercicio4_8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos nuemros quieres que almacene =>");
		int capacidad = teclado.nextInt();
		float[]numeros = new float[capacidad];
		float suma =0;
		
		for(int i =0; i<capacidad;i++) {
			System.out.println("Introduce un numero "+ i+1 + "=>");
			numeros[i] = teclado.nextFloat();
			suma+=numeros[i];
		}
		
		float media = suma/capacidad;
		
		System.out.println("La media es de =>" + media);
	teclado.close();}
}