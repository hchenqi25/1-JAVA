package REPASO;
import java.util.Scanner;
public class Primer_ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		int total = num1 + num2;
		
	System.out.print("El resultado es: " + total );
teclado.close();
	}

}
