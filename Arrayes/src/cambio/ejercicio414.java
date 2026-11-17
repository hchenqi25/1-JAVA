package cambio;
import java.util.Scanner;
public class ejercicio414 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int contador =0;
		int []numeros = new int [5];
		numeros[0] =9;
		numeros[1] =7;
		numeros[2] =4;
		numeros[3] =2;
System.out.print("Posicion a borrar");
int posicion = teclado.nextInt();

for (int i=posicion;i<contador;i--) {
	numeros[i]= numeros[i+1];
	System.out.print("Dime el numero que quieres poner: ");
	numeros[i] = teclado.nextInt();
	System.out.print(numeros[i]);
teclado.close();}
	}

}
