package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejeercicio612 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = { 0, 2, 5, 7, 8 };
		System.out.print("Dime una posición del 0-4;");
		int posicion = teclado.nextInt();
		try {
			int valor = numeros[posicion];
			System.out.print(valor);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("La posición que ha elegido esta fuera de rango");
		}
		catch (InputMismatchException e) {
			System.out.print("La posición indicada no es valida");
		}

	teclado.close();}

}
