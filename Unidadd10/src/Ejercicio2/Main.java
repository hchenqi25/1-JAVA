package Ejercicio2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo =>");
		Shape c = new Circulo(teclado.nextDouble());
		System.out.println("Introduce las dimensiones del rectangulo =>");
		Shape r = new Rectangulo(teclado.nextDouble(), teclado.nextDouble());
		
		System.out.println("-----------CIRCULO-------------");
		System.out.println("Area => " + c.area());
		System.out.println("Perietro => " + c.perimetro());
		
		System.out.println("------------RECTANGULO------------");
		System.out.println("Area => " + r.area());
		System.out.println("Perimetro => " + r.perimetro());

	teclado.close();}

}
