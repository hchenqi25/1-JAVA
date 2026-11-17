package rep;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[]numeros = new int[4]; //Declaro un array de 4 posiciones
		
	for(int i=0; i<numeros.length;i++) { //Pedimos al usuario que reyene el arr
		System.out.println("Introduce un numero " + (i+1) + ":");
		numeros[i] = teclado.nextInt();
		}
	for (int i=0 ; i<numeros.length;i++) {
		System.out.print(numeros[i]); //Muestro los datos del arryse
	}
	teclado.close();

	}

}
