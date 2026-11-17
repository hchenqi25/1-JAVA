package rep;
import java.util.Scanner;
public class ejerciciio47 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	int[]numeros = new int[6];
	
	for (int i = 0; i<numeros.length;i++) {
		System.out.print("Introduce un numero" + (i+1) + ":");
		numeros[i] = teclado.nextInt();
	}
	
	for (int i=numeros.length-1;i>=0;i--) {
		System.out.println(numeros[i]);
	}
	teclado.close();
	}

}
