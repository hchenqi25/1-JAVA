package Pilas;
import java.util.Scanner; 
import java.util.Stack; //SE IMPORTA LA CLASE STACK
public class Ejemplo {

	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<>(); //INSTACIA DE LA PILA
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("Introduce un numero => ");
			int num = teclado.nextInt();
			pila.push(num);
		}
		
		int total = pila.size();
		
		for (int i =0; i<total ; i++) {
			System.out.println("El contenido de la piña es => " + pila.pop());
		}

	teclado.close();}

}
