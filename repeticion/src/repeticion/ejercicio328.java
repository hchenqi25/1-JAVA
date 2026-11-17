package repeticion;
import java.util.Scanner;
public class ejercicio328 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dame un numero: ");
	byte num = teclado.nextByte();
	System.out.println("Múltiplos de 7 entre 1 y " + num + ":");
    for (int i = 1; i <= num; i++) {
        if (i % 7 == 0) {
            System.out.print(i + " ");
        teclado.close();}
	}
	}
}
