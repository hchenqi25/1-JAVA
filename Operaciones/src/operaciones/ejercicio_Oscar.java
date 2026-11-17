package operaciones;
import java.util.Scanner;
public class ejercicio_Oscar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
	String[][]nombres = new String[3][4];
	
	for (int i =0;i<nombres.length;i++) {
		for (int j =0;j<nombres[i].length;j++) {
			System.out.print("Dime los nombres" + (i+1) + (j+1) + ":");
			nombres[i][j] = teclado.nextLine();
		}
	}
	for (int i=0;i<nombres.length;i++) {
		for (int j=0 ;j< nombres[i].length;j++) {
			System.out.print(nombres[i][j] + " ");
		}
		System.out.println();
	}
		System.out.print("Dime el nombre a buscar: ");
		String palabra = teclado.nextLine();
			boolean encontrado = false;
			for ( int i =0; i<nombres.length;i++) {
				for (int j=0;j<nombres[i].length;j++) {
					if (nombres[i][j].equalsIgnoreCase(palabra)){
						System.out.print("Nombre encontrado en posicion:" + i +"*" + j);
						encontrado = true;
					}
				}
				
				}
			if (!encontrado) {
				System.out.println("No esta en el arryse");
				}
			teclado.close();} 
		}
		 	
		
	

	


