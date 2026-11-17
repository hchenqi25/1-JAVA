package Tema1;
import java.util.Scanner;
public class ejercicio213 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner (System.in);
		
		System.out.print("Dime la cantidad en metros: ");
		
		int metros = teclado.nextInt();
		
		  double kilometros = (double) metros /1000;
		  
		  System.out.printf("%.2f\n", kilometros);
		
	
teclado.close();
	}

}
