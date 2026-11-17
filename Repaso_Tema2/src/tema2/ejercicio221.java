package tema2;
import java.util.Scanner;
public class ejercicio221 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	System.out.print("Dime el numero de dias: ");
	float dias = teclado.nextFloat();
float horas = dias * 24;
float minutos = horas*60;
float segundos = minutos*60;

System.out.println("Horas: " + horas);
System.out.println("Minutos: " + minutos);
System.out.println("Segundos: " + segundos);
teclado.close();
	}

}
