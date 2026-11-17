package ejercicios;
import java.util.Scanner;
public class ejercico4 {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);

System.out.print("¿Cuántos números quieres introducir? ");
int longitud = teclado.nextInt();


float[] numeros = new float[longitud];


for (int i = 0; i < numeros.length; i++) {
    System.out.print("Introduce el número " + (i + 1) + ": ");
    numeros[i] = teclado.nextFloat();
}


float suma = 0;
for (int i = 0; i < numeros.length; i++) {
    suma += numeros[i];
}


float media = suma / numeros.length;
System.out.println("La media de los números introducidos es: " + media);

teclado.close();

}
	}


