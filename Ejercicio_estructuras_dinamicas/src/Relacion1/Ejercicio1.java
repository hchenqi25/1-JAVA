package Relacion1;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {
        Stack<Integer>  pila = new Stack<Integer>();
        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Introduce un número: ");
                int num = teclado.nextInt();
                pila.push(num);
            }

            int total = pila.size();
            for (int i = 0; i < total; i++) {
                System.out.println("El contenido de la pila es: " + pila.pop());
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }

        teclado.close();
    }
}