package arrays;
import java.util.Scanner;
public class ejercicio42 {

	public static void main(String[] args) {
	float[]numeros = new float[5];
		Scanner teclado = new Scanner (System.in);
 for (int i=0; i<numeros.length;i++) {
	 System.out.print("Ingresa un numero" + (i+1) + ":");
	 numeros[i] = teclado.nextFloat();
 }
 for (int i= numeros.length -1; i>=0 ; i--) {
	 System.out.print(numeros[i]);
 }
	teclado.close();}

}
