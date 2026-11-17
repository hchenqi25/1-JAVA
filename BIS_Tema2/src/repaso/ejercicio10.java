package repaso;
import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dame un numero");
	float num1 = teclado.nextFloat();
	System.out.print("Dame otro numero");
	float num2 = teclado.nextFloat();
	System.out.print("Dame otro numero:");
	float num3 = teclado.nextFloat();
	
	float promedio = (num1+num2+num3)/3;
	
	System.out.printf("%.2f\n", promedio);
	teclado.close();

	}

}
