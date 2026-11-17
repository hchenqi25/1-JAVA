package tema2;
import java.util.Scanner;
public class ejercicio213 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dime la distancia en metros: ");
	int metros = teclado.nextInt();
	double kilometros =(double) metros/1000;
System.out.print("La distancia en kilometros es: " + kilometros);

	teclado.close();}

}
