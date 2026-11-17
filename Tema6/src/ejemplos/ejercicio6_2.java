package ejemplos;

import java.util.*;
public class ejercicio6_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		try {
			System.out.print("Introduce un numero: ");
			int numero = teclado.nextInt();
		
		
		}
		catch (InputMismatchException e){
			System.out.print("No es un numero");
		}
	}

}
