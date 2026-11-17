package Ejercicicio3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Queue <Double> cola = new LinkedList();
		Scanner teclado = new Scanner (System.in);
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un numero " + i + "=>");
			cola.offer(teclado.nextDouble());
		}
		
		int tamaño = cola.size();
		
		for (int i=0; i<tamaño; i++) {
			System.out.println("La cola tiene los siguientes numeros: " + cola.poll());
		}
		
	teclado.close();}

}
