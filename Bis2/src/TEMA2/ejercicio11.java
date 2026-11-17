package TEMA2;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime un numero:");
		int numero = teclado.nextInt();
		int dias = numero *24;
		int horas = dias*24;
		int minutos = horas*60;
		System.out.print(minutos);
teclado.close();
	}

}
