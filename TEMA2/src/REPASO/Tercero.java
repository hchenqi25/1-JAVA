package REPASO;
import java.util.Scanner;
public class Tercero {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dame la distancia en mteros: ");
	int metros = teclado.nextInt();
 double kilometros = (double) metros/1000;
 System.out.print("Los metros en kilometros son: " + kilometros);
 teclado.close();

	}

}
