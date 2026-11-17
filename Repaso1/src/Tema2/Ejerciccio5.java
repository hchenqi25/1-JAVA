package Tema2;
import java.util.Scanner;
public class Ejerciccio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad en metros => ");
		
		int metros = teclado.nextInt();
		
		double  millas = metros /1609; 
		System.out.println("Millas = " + millas);

	teclado.close();}

}
