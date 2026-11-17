package ejercicios;
import java.util.Scanner;
public class ejercicio411 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner (System.in);
		String [] palabras= new String [5];
		boolean encontrada = false;
		int contador =0;
		for (int i=0; i<palabras.length;i++) {
			System.out.println("Introduce una palabra: ");
			palabras[i]=sc.nextLine();
		}
		System.out.print("Introduce la palabra que quieres buscar");
		String buscar = sc.nextLine();
		
	for (int i= 0; i<palabras.length;i++) {
		if (palabras[i].equals(buscar)) {
			encontrada = true;
			contador++;
			
		}
	}
	System.out.println(encontrada);
	System.out.println("La palabra ha aparecido:" + contador);
sc.close();	}
	

}
