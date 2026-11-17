package Repaso;
import java.util.Scanner;
public class ejercicio50 {

	public static void main(String[] args) {
		double suma =0;
		Scanner teclado = new Scanner (System.in);
		double[]numeros = new double[10];
	for (int i=0;i<numeros.length;i++) {
		System.out.print("Ingresa los numeros" + (i+1) + ":"); 
		numeros[i]= teclado.nextDouble();
		suma+=numeros[i];
	}
	double media = suma/10;
	System.out.printf("La media de los numeros es de: %.2f\n", media);
		
	for (int i=0;i<numeros.length;i++) {
		if (numeros[i]>media) {
			System.out.println(numeros[i]);
		}
	}
	teclado.close();}
	}


