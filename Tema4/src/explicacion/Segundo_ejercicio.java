package explicacion;
import java.util.Scanner;
public class Segundo_ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float []numero = new float[5];
	for (int i=0;i<5;i++) {
	System.out.print("Introduce un numero " + (i+1) + ":");
	 numero [i] = teclado.nextFloat();
	}
System.out.println("Numeros en orden inversos: ");
for (int i=4;i>0;i--) {
	System.out.println(numero[i]);
}
	teclado.close();}
}
