package rep;
import java.util.Scanner;
public class ejerciciio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime un numero: ");
		double num1 = teclado.nextDouble();
		System.out.print("Dime otro numero: ");
		double num2 = teclado.nextDouble();
		System.out.print("Dime otro numero: ");
		double num3 = teclado.nextDouble();
		
		double promedio = (num1+num2+num3)/3;
		
	System.out.printf("%.3f\n",   promedio);

	teclado.close();}

}
