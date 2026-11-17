package arrayse;
import java.util.Scanner;
public class ejercicio42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float[]numeros = new float[5];
		
		for (int i =0; i<numeros.length;i++) {
			System.out.print("Ingresa los numeros" + (i+1) + ":");
			numeros [i]= teclado.nextFloat();
		}
		
		for (int i=numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i]);
		}
teclado.close();
	}

}
