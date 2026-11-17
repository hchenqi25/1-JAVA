package repaso;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime un numero: ");
		int numero = teclado.nextInt();
		byte num1 = (byte) numero;
		double num2 = (double) numero;
		System.out.print(num1);
		System.out.print(num2);
		teclado.close();

	}

}
