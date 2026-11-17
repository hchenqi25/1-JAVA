package operaciones;
import java.util.Scanner;
public class Buscar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int[]numeros = new int [5];
	for (int i=0;i<numeros.length;i++) {
		System.out.print("Introdue los numeros" + (i+1) + ":");
		numeros[i] = teclado.nextInt();
	}
for (int i=0; i<numeros.length;i++) {
	System.out.print(numeros[i]);
}
System.out.println("Dime el numero que quieres buscar: ");
int buscado = teclado.nextInt();

boolean encontrado = false;
for (int i=0;i<numeros.length;i++) {
	if(numeros[i]==buscado) {
		System.out.println("Numero encontrado en la posicion " + i);
		encontrado = true;
		break;
		
	}
}
if (!encontrado) {
	System.out.print("Numero no encontrado");
}
teclado.close();	}

}
