package ejemplos;
import java.util.Scanner;
public class ejemplo_buscar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int []numeros = {10,20,30,40,50};
		System.out.print("Introduce los numeros");
		int buscado = teclado.nextInt();
		boolean encontrado = false;
	for (int i =0;i<numeros.length;i++) {
		if (numeros[i]==buscado) {
		System.out.println("Numeros encontardos en la posición" + i);
	encontrado = true;
	break;
		}
	}
if (!encontrado) {
	System.out.println("No encontardo");
	
}
	teclado.close();}


}
