package repeticion;
import java.util.Scanner;
public class ejercicio329 {

	public static void main(String[] args) {
		
Scanner teclado = new Scanner (System.in);
System.out.print("Introduce el primer número: ");
int num1 = teclado.nextInt();

System.out.print("Introduce el segundo número: ");
int num2 = teclado.nextInt();

int mcm = Math.max(num1, num2); 

while (true) {
    if (mcm % num1 == 0 && mcm % num2 == 0) {
        System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + mcm);
        break;   }
    mcm++;
}
teclado.close();	}

}
