package Tema4;
import java.util.Scanner;
public class Ejercicio4_8 {

	public static void main(String[] args) {
		/*Desarrolla un programa que pida al usuario la longitud de un array de float (es
decir, cuántos números quiere introducir). Después, recorrerá el array para calcular la media y
mostrarla por consola. */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la capacidad del array");
		int capacidad = teclado.nextInt();
		
		float[]numeros = new float[capacidad];
		float suma =0;
		
		for(int i=0; i<capacidad;i++) {
			System.out.println("Introduce un numero " + (i+1) + "=>");
			numeros[i] = teclado.nextFloat();
			suma += numeros[i];
		}
		
		double media =(double) suma / capacidad;
		System.out.println("La media es de =>" + media);
		
		
teclado.close();	}

}
