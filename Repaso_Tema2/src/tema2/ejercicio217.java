package tema2;
import java.util.Scanner;
public class ejercicio217 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.print("Dame un letra: ");
	char primera = teclado.next().charAt(0);
	System.out.print("Dame otra letra: ");
	char segunda = teclado.next().charAt(0);
	System.out.print("Dame otra letra: ");
	char tercera = teclado.next().charAt(0);
	System.out.print("Dame otra letra: ");
	char cuarta= teclado.next().charAt(0);

	String total =" "  + primera + segunda + tercera + cuarta;
System.out.print(total);
	teclado.close();}

}
