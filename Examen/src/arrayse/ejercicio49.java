package arrayse;
import java.util.Scanner;
public class ejercicio49 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	double[]numeros = new double[10];
	int suma =0;
	
	for (int i=0; i<numeros.length;i++) {
		System.out.print("Intrdouce un numero" + (i+1) + ":");
		numeros[i] = teclado.nextDouble();
		suma+= numeros[i];
	}
	double media = suma/10;
	
	for (int i =0; i<numeros.length;i++) {
		if (numeros[i]>media) {
			System.out.print(media);
			System.out.println("Los bumeros mayores a la media son" + numeros[i]);
		}
	}
teclado.close();
	}

}
