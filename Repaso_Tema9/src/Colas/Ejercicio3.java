package Colas;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Ejercicio3 {

	public static void main(String[] args) {
		/*Crea un programa que pida al usuario 5 números reales de doble precisión, los guarde
		  en una cola y luego los muestre en pantalla*/
		Queue <Double> cola = new LinkedList<>();
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce el numero de doble posicion =>");
			double num = teclado.nextDouble();
			
			cola.add(num);
		}
		int total = cola.size();
		
		for(int i=0;i<total;i++) {
			System.out.println("La posicion " + i + " de la cola es => " + cola.poll());
		}

	teclado.close();}

}
