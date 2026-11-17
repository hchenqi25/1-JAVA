package TEMA2;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	System.out.print("Dame otra palabra : ");
	String palabra1 = sc.nextLine();
System.out.print("Dame otra palabra: ");
String palabra2 = sc.nextLine();  
System.out.print("Dame otra palabra: ");
String palbra3 = sc.nextLine();
System.out.print("Dame otra palabra: ");
String palabra4 = sc.nextLine();
System.out.print("Dame otra palabra");
String palabra5 = sc.nextLine();

String total = palabra1 + palabra2 + palbra3 + palabra4 + palabra5;
System.out.print("La frafrse formada es:" + total);
sc.close();
	}

}
