package Tema4;
import java.util.Scanner;
public class Ejercicio4_7 {

	public static void main(String[] args) {
		/* Desarrolla un programa que pida al usuario 6 números enteros largos y luego los
		muestre por consola en orden inverso al que se introdujeron.*/
		
		Scanner teclado = new Scanner(System.in);
		long[]numeros = new long[6];
		
		System.out.println("-------------------NUMEROS EN ORDEN--------------");
		for(int i =0;i<6;i++ ) {
			System.out.println("Introduce un nuemro "+ (i+1) + "=>");
			numeros[i] = teclado.nextLong();
		}
		
		System.out.println("------------------------NUEMROS EN ORDEN INVERSO---------------");
		for(int i= numeros.length-1; i>=0; i--) {
			System.out.println(numeros[i]);
		}

	teclado.close();}

}
