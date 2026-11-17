package Pilas;
import java.util.Scanner;
import java.util.Stack;
public class Ejercicio1 {

	public static void main(String[] args) {
		Stack<Object> pila  = new Stack<>();
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i =0; i<3; i++) {
			System.out.println("Introduce un numero =>");
			int numero = teclado.nextInt();
			pila.push(numero);
		}
		
		for (int i=0; i<3;i++) {
			System.out.println("Introduce una palabra => ");
			String palabra = teclado.next();
			pila.push(palabra);
		}
		
		int total = pila.size();
		for (int i =0; i<total; i++) {
			System.out.println("El contenido de la pila en orden inverso es => " + pila.pop());
		}
		
		

	teclado.close();}

}
