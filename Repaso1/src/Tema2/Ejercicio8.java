package Tema2;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el valor del radio =>");
		double radio = teclado.nextDouble();
		
		double volumen = 3.14 * radio * radio * radio * 4/3;
		
		System.out.println("El volumens es de => " + volumen);
		
	

	teclado.close();}

}
