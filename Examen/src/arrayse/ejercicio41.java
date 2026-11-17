package arrayse;
import java.util.Scanner;
public class ejercicio41 {

	public static void main(String[] args) {
		int suma =0;
		Scanner teclado  = new Scanner (System.in);
		int[]numeros = new int[4];
	for (int i=0;i< numeros.length;i++) {
		System.out.print("Ingresa un numemro" + (i+1) + ":");
		numeros[i] = teclado.nextInt();
		suma+= numeros[i];
	}
double media = (double) suma/4;

System.out.printf("La media es de: %.2f\n", media);
	teclado.close();}	

}
