package arrays;
import java.util.Scanner;
public class ejercicio48 {

	public static void main(String[] args) {
		float suma =0;
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime la longitud del arrayse:");
	int longitud = teclado.nextInt();
	float[]numeros = new float[longitud];
	
	for (int i=0; i<numeros.length;i++) {
		System.out.print("Ingresa los numeros" + (i+1) + ":");
		numeros[i] = teclado.nextFloat();
		
		suma+= numeros[i];
	}
  double media = (double) suma/longitud;
  System.out.printf("La media es de: %.2f\n", media);
teclado.close();	}

}
