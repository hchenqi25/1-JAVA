package operaciones;
import java.util.Scanner;
public class Foreach {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[]numeros = new int [5];
	for (int i=0;i<numeros.length;i++) {
		System.out.print("Introduce un numero" + (i+1) +":");
		numeros[i] = teclado.nextInt();
	}
	for (int n:numeros) {
		System.out.print( n);
	}
teclado.close();
	}

}
