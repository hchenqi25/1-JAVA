package arrays;

import java.util.Scanner;

public class ejercicio41 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];
        int suma = 0;

        System.out.println("Dime 4 números:");

        
        for (int i = 0; i < 4; i++) {
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }
        double media = (double) suma / numeros.length;

      
        System.out.println("El promedio de los números es: " + media);

        teclado.close();
    }
}
