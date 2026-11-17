package rep;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		byte[]meses = new byte[12];
		meses[0] = teclado.nextByte();
		meses[1] = teclado.nextByte();
		meses[2] = teclado.nextByte();
		meses[3] = teclado.nextByte();
		meses[4] = teclado.nextByte();
		meses[5] = teclado.nextByte();
		meses[6] = teclado.nextByte();
		meses[7] = teclado.nextByte();
		meses[8] = teclado.nextByte();
		meses[9] = teclado.nextByte();
		meses[10] = teclado.nextByte();
		meses[11] = teclado.nextByte();
	System.out.print("Los numeros introducidos son: ");
	System.out.print(meses[0]);
	System.out.print(meses[1]);
	System.out.print(meses[2]);
	System.out.print(meses[3]);
	System.out.print(meses[4]);
	System.out.print(meses[5]);
	System.out.print(meses[6]);
	System.out.print(meses[7]);
	System.out.print(meses[8]);
	System.out.print(meses[9]);
	System.out.print(meses[10]);
	System.out.print(meses[11]);
teclado.close();
	}

}
