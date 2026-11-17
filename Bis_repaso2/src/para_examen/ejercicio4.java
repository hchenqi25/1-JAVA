package para_examen;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        System.out.print("Dime los metros: ");
		int metros = teclado.nextInt();
		int kilometros = metros/1000;
	System.out.print("Los kilometros son: " + kilometros);
	teclado.close();

	}

}
