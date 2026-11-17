package Colas;
import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo {

	public static void main(String[] args) {
		Queue <Integer> cola = new LinkedList<>();
		cola.offer(3);
		cola.add(14);
		cola.offer(12);
		cola.add(7);
		cola.offer(10);
		
		int total = cola.size();
		
		for (int i =0; i<total;i++) {
			System.out.println("La posicion " + i + " de la cola => " + cola.poll());
		}


	}

}
