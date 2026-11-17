package Pilas;
import java.util.Stack;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crea un programa que pida al usuario 3 números reales y 3 cadenas de texto y lo guarde
		  en una pila. Después muestra el contenido en orden contrario.*/
		
		Stack<Object> pila = new Stack<>();
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0;i<3;i++) {
			System.out.println("Introduce un numero => ");
			int num = teclado.nextInt();
			pila.push(num);
		}
		
		for (int i=0;i<3;i++) {
			System.out.println("Introduce una palabra => ");
			String frase = teclado.next();
			pila.push(frase);
		}
		
		int total = pila.size();
		
		for(int i=0;i<total;i++) {
			System.out.println("El contenido de la pila es => " + pila.pop());
			
		}
		
	teclado.close();}

}
