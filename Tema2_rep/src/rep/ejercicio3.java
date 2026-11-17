package rep;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
System.out.print("Dime la distancia en metros: ");
 int metros = teclado.nextInt();
 
 double kilometro = (double )metros/1000;
 
 System.out.print("Los kilometros son: " + kilometro);
 teclado.close();
	}

}
