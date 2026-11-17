package Tema4;
import java.util.Scanner;
public class Ejercicio4_1 {

	public static void main(String[] args) {
		/* Desarrolla un programa que declare un array de tipo entero de 32 bits. Después,
		pedirá al usuario 4 números y los almacenará dentro del array. Terminará mostrando por
		consola la media aritmética de los números introducidos.*/
		
		Scanner teclado = new Scanner(System.in);
		int[]numeros = new int[4];
		int suma=0;
		
		for (int i=0; i<4;i++) {
			System.out.println("Introduzca un numero " + i+1 + "=>");
			numeros[i] = teclado.nextInt();
			suma +=numeros[i];
		}
		
		double media = (double) suma / numeros.length;
		
		System.out.println("La media de los numeros introducidos es de =>" + media);


	teclado.close();}

}
