package arrays;
import java.util.Scanner;
public class Buscar {

	public static void main(String[] args) {
	int[]numeros = {10,20,30,40,50};
	Scanner teclado = new Scanner (System.in);
	
	System.out.print("Introduce el numero a buscar:");
	int buscado = teclado.nextInt();
	
	boolean encontrado = false;
	
	for (int i=0;i<numeros.length;i++) {
		if (numeros[i]==buscado) {
			System.out.print("El numero se encuentra en la posición:" + i);
			encontrado = true;
			break;
		}
	}
 if (!encontrado) {
	 System.out.print("Numero no encontrado");
 }
teclado.close();	}

}
