package TEMA2;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Dame un numero :" );
 double num1 = sc.nextDouble();
 System.out.print("Dame los numero: ");
 double num2 = sc.nextDouble();
double total = num1 / num2;

System.out.printf("3.f/n", total);
sc.close();
 

	}

}
