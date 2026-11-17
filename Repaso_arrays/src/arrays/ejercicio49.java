package arrays;
import java.util.Scanner;
public class ejercicio49 {

	public static void main(String[] args) {
		int suma =0;
		double[]numeros = new double[10];
		Scanner teclado = new Scanner (System.in);
		
		for (int i=0; i<numeros.length;i++) {
			System.out.print("Ingresa los numeros" + (i+1) + ":");
			numeros[i] = teclado.nextDouble();
			suma+= numeros[i];
		}
		double media= (double) suma/10;
		System.out.printf("La media es de: %.2f\n", media);
		
		for (int i=0 ; i<numeros.length; i++) {
			if (numeros[i]>media) {
				System.out.print(numeros[i]);
			}
		}

	teclado.close();}

}
