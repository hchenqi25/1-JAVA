package Pilas;
import java.util.Stack;
import java.util.Scanner;
public class Ejemplo {

	public static void main(String[] args) {
		Stack <Integer>pila = new Stack<>(); //SE INSTANCIA AL PILA
		Scanner teclado = new Scanner(System.in); 
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero =>");
			int numero = teclado.nextInt();
			pila.push(numero); //SE UTILIZA PARA INSERTAR UN ELEMENTO EL ULTIMO ES EL PRIMERO
		}
		int total =pila.size(); //SE UTILIZA PAAR DEVOLVER LOS ELEMENTOS DE LA PILA
		for (int i=0;i<total;i++) {
			System.out.println("El contenido de la pila es => " + pila.pop()); //SIRVE PARA MOSTRAR LOS ELEMENTOS DE LA PILA POR ORDEN INVERSO
		}

teclado.close();	}

}
