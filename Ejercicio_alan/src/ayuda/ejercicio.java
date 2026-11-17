package ayuda;
import java.util.Scanner;

public class ejercicio{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        short[] numeros = new short[5];  

        System.out.println("Introduce 5 números cortos:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextShort();  
        }

       
        System.out.println("Has introducido:");
        for (int num : numeros) {
            System.out.println(num);
   teclado.close();     }
    }
}


