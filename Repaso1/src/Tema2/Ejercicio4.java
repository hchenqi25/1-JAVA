package Tema2;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el nombre =>");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduce la edad => ");
		int edad = teclado.nextInt();
		
		System.out.println("Introduce tu peso => ");
		double peso = teclado.nextDouble();
		
		
		System.out.println("Hola, " +  nombre + " .Tienes =>  " + edad + " peso => " + peso);
		  

teclado.close();	}

}
