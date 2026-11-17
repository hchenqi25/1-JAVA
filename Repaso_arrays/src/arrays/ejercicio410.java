package arrays;
import java.util.Scanner;
public class ejercicio410 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	String[]nombres = new String[100];
	int contador=0;
	
	while (contador<nombres.length) {
		System.out.print("Introduce un nombre o un enter para finalizar");
		String nombre = teclado.nextLine();
	
	if (nombres.equals("")) {
		break;
	}
	nombres [contador] = nombre;
	contador++;
	
	}
	System.out.print("Nombres introducidos:");
	
	for (int i=0;i<contador;i++) {
		System.out.print(nombres[i]);
	}
	teclado.close();}

	}


