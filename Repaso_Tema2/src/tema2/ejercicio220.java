package tema2;
import java.util.Scanner;
public class ejercicio220 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dame un numero: ");
double num1 = teclado.nextDouble();
System.out.print("Dame otro numero: ");
double num2 = teclado.nextDouble();
System.out.print("Dame otro numero: ");
double num3 = teclado.nextDouble();

double promedio = (num1+num2+num3)/3;

System.out.printf("%.2f%n", promedio);
teclado.close();
	}

}
