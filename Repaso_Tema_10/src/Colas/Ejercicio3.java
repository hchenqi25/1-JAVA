package Colas;
import java.util.Queue; // INSTANCIA DE LA COLA
import java.util.LinkedList; //INATNACIA DE LA LISTA 
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Queue <Integer >cola = new LinkedList<>();
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<5;i++) {
			System.out.println("Introduce un numero =>");
			double numero = teclado.nextDouble();
			cola.offer((int) numero); //AÑADE ELEMENTO A LA LISTA
		}
		int total = cola.size();
		for (int i =0; i<total; i++) {
			System.out.println("La posicion  " + i + " de la cola es =>" + cola.poll()); //DADO QUE ES LIFO SE UTILIZA POLL
		}
		
		

	teclado.close();}

}
