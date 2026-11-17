package tema2;
import java.util.Scanner;
public class ejercicio215 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dame un numero: ");
	double num1 = teclado.nextDouble();
		System.out.print("Dame otro numero: ");
		double num2 = teclado.nextDouble();
	double resultado = num1/num2;
System.out.printf("%.3f%n", resultado);
teclado.close();
	}

}
