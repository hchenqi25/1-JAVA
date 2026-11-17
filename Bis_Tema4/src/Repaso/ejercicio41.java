package Repaso;
import java.util.Scanner;

public class ejercicio41 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime un número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        double media = (double) suma / 4;

        System.out.printf("La media aritmética es: %.2f\n", media);
        teclado.close();
    }
}