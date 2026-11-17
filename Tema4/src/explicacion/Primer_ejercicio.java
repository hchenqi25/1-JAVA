package explicacion;
import java.util.Scanner;

public class Primer_ejercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[4];
        int suma = 0;

       
        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numero[i] = teclado.nextInt();
            suma += numero[i];
        }

        System.out.println("Números ingresados:");
        for (int i = 0; i < 4; i++) {
            System.out.print(numero[i] + " ");
        }

      
        double media = (double) suma / 4;
        System.out.println("La media de los 4 números es: " + media);

        teclado.close();
    }
}
