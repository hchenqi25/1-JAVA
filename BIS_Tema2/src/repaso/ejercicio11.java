package repaso;
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dame el numero de dias");
		double dias = teclado.nextDouble();
		double horas = dias/24;
		double minutos= horas*60;
		double segundos = horas*3600;
		System.out.print(minutos);
		System.out.print(segundos);
		teclado.close();

	}

}
