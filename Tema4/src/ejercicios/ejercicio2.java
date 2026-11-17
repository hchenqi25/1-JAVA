package ejercicios;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	float[]numero = new float [5];
	for (int i=0;i<numero.length;i++) {
	System.out.print("Introduce un numero" + (i+1) + ":");
	numero [i] = teclado.nextFloat();
	}
	System.out.print("Numeros en orden inverso:");
for (int i=numero.length-1;i>=0;i--) {
System.out.println(numero[i]);
	
}
teclado.close();	}

}
