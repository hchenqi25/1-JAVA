package rep;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuál será la longitud del array? ");
        int num = teclado.nextInt();

        float[] longitud = new float[num];

       
        for (int i = 0; i < longitud.length; i++) {
            System.out.print("Introduce un número " + (i + 1) + ": ");
            longitud[i] = teclado.nextFloat();
        }

    
        float suma = 0;
        for (int i = 0; i < longitud.length; i++) {
            suma += longitud[i];
        }

        
        float media = suma / longitud.length;
        System.out.println("La media es: " + media);

        teclado.close();
    }
}
