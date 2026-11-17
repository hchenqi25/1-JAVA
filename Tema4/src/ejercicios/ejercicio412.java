package ejercicios;
import java.util.Scanner;
public class ejercicio412 {

	public static void main(String[] args) {
		int[] numeros = new int [6];
	int  contador = 0;
	boolean numero = false;	
	Scanner sc = new Scanner (System.in);
	
	while (contador<numeros.length) {
		System.out.println("Introduce el numero que quieres buscar (0 para finalizar): ");
		int n = sc.nextInt();
		if (n==0) break;
		numeros [contador] = n;
		contador++;
	 numero = true;
		System.out.print("El numero esta " );
	System.out.print("El numero no esta");
	}
	System.out.print(numero);
System.out.println("El numero aparece: " + contador);
	sc.close();}

}
