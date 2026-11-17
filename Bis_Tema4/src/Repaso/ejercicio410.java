package Repaso;
import java.util.Scanner;
public class ejercicio410 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	String[]nombres = new String[100];
	for (int i=0;i<nombres.length;i++) {
		System.out.print("Ingresa un nombre" + (i+1) + ":");
		nombres[i] = teclado.nextLine();
	}
	

	}

}
