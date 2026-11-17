package Ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--------COCHE--------");
		ICualidades c = new Coche();
		System.out.println("Introduce la aceleracion =>");
		c.acelerar(teclado.nextInt());
		
		c.frenar();
		
		System.out.println("---------Guepardo---------");
		ICualidades g = new Guepardo();
		System.out.println("Introduce la aceleracion =>");
		g.acelerar(teclado.nextInt());
		g.frenar();
		
		
		System.out.println("---------------HUMANO---------------");
		ICualidades h = new Humano();
		System.out.println("Introduce la aceleracion =>");
		h.acelerar(teclado.nextInt());
		
		h.frenar();
		

	teclado.close();}

}
