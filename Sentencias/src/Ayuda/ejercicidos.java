package Ayuda;
import java.util.Scanner;
public class ejercicidos {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Dame un numero: ");
	short num1 = sc.nextShort();
if (num1%2==0 || num1%5==0) {
	System.out.print("Dame otro numero: ");
	short num2 = sc.nextShort();
	short total =  (short) (num2-num1);
	System.out.print("El resultado es: " + total );
	}else {
		System.out.print("No es multiplo de dos o de cinco");
	}
sc.close();
	}

}
