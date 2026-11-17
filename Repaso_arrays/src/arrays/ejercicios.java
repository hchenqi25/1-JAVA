package arrays;
import java.util.Scanner;
public class ejercicios {

	public static void main(String[] args) {
		int suma=0;
		Scanner teclado = new Scanner (System.in);
		int[]numeros = new int [4];
	for (int i=0;i<numeros.length;i++) {
		System.out.print("Ingresa un numero" + (i+1) + ":");
		numeros[i] = teclado.nextInt();
		suma+= numeros[i];
	}
	double  media = (double) suma/4;
	
	System.out.printf("La media es: %.2f\n", media);


  
teclado.close();	}

}
