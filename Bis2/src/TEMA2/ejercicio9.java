package TEMA2;
import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime la temepratura en Celsius: ");
double Celsius = teclado.nextDouble();

double farenhight = (Celsius*9/5)+32;
System.out.printf("2.f/n", "La temepratura en Farenhigt es:" + farenhight);
	teclado.close();}

}
