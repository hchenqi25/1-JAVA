package tema2;
import java.util.Scanner;
public class ejercicio223 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime el lado del cuadrado");
		double lado = teclado.nextDouble();
	double permietro = lado + lado + lado + lado;
	System.out.println("El perimentro del cuadrado es: " + permietro);
	double area = lado * lado;
System.out.println("El area del cuadrado es: " + area);
teclado.close();

	}

}
