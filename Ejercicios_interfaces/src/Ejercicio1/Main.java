package Ejercicio1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo");
		Figura c = new Circulo(teclado.nextDouble());
		c.calcularArea();
		
		System.out.println("---------------Rectangulo----------------");

		System.out.println("Introduce la base del rectangulo:");
		double base = teclado.nextDouble();

		System.out.println("Introduce la altura del rectangulo:");
		double altura = teclado.nextDouble();

		Figura r = new Rectangulo(base, altura);
		r.calcularArea();

	teclado.close();}

}
