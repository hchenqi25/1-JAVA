package TEMA2;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	System.out.print("Dime un numero: ");
	int num = sc.nextInt();
	byte num1= (byte) num;
short num2 = (short) num1;
System.out.print("El numero en byte es " + num1);
System.out.print("El numero en short es" + num2);
sc.close();
	}

}
