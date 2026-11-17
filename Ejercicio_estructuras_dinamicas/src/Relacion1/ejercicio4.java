package Relacion1;

import java.util.LinkedList;
import java.util.Queue;

public class ejercicio4 {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);
        cola.offer(5);

        int n = 2;

        moverPrimerosN(cola, n);

        System.out.println(cola);
    }

    public static void moverPrimerosN(Queue<Integer> cola, int n) {
        for (int i = 0; i < n; i++) {
            cola.offer(cola.poll());
        }
    }
}