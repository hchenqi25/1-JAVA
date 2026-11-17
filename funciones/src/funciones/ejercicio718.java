package funciones;
import java.util.Scanner;

public class ejercicio718 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        int exp = teclado.nextInt();

        System.out.println(base + " elevado a " + exp + " es: " + potencia(base, exp));
    teclado.close();}

    public static long potencia(int base, int exp) {
       
        if (exp == 0) {
            return 1;
        }
      
        return base * potencia(base, exp - 1);
    }
}