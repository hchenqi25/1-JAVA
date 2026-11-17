package ejercicios_repaso;
import java.util.Scanner;

public class ejercicio522 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce varios números separados por espacios: ");
        String entrada = teclado.nextLine();

        String[] partes = entrada.split(" ");
        int suma = 0;
        int mayor = Integer.MIN_VALUE;

        for (String parte : partes) {
            int numero = Integer.parseInt(parte);
            suma += numero;
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Número mayor: " + mayor);

        teclado.close();
    }
}
 