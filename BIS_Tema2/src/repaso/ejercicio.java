package repaso;
import java.util.Scanner;
public class ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dime la distancia en metros: ");
		int metros = teclado.nextInt();
		double kilometros = (double) metros/1000;	
		System.out.print("La distancia en kilometros es:" + kilometros);
		teclado.close();}
}
