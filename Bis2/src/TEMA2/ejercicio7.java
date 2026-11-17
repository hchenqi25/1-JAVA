package TEMA2;
import java.util.Scanner;
public class ejercicio7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
System.out.print("Dame un carcter: "); 
String palabra1 = sc.nextLine();
System.out.print("Dame un caracter: ");
String palabra2 = sc.nextLine();
System.out.print("Dame un caracter: ");
String palabra3 = sc.nextLine();
System.out.print("Dame otra palabra:");
String palabra4 = sc.nextLine();
System.out.print("Dame otra palabras: ");
String palabra5 = sc.nextLine();

String total = palabra1 + palabra2 + palabra3 + palabra4 + palabra5;
System.out.print("La palabra completa es" + total);
sc.close();
	}

}
