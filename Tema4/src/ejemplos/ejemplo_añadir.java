package ejemplos;
import java.util.Scanner;
public class ejemplo_añadir {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		int contador =0;
	Scanner teclado = new Scanner (System.in);
while (contador<numeros.length) {
	System.out.print("Introduce un numero (o-1 para terminar): ");
	int n = teclado.nextInt();
	
	if (n==-1) break;
numeros [contador] = n;
contador++;
}
System.out.println("Contenido del array: ");
for (int i=0;i<contador;i++) {
	System.out.print(numeros[i] + "");
teclado.close();}
	}

}
