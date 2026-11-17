package Tema2;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Introduce el radio del circulo => ");
		double radio = teclado.nextDouble();
		
		double area = 3.14 * radio *radio;
		
		System.out.println("El area es de => " + area);

	}

}
