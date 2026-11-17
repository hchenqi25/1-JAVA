package ejercicios;
import java.util.Scanner;
public class ejercicio410_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
String[]nombres = new String[100];
int contador=0;
System.out.print("Escribe los nombres: ");

while (contador < 100) {
    System.out.print("Nombre #" + (contador + 1) + ": ");
    String nombre = teclado.nextLine();

    if (nombre.isEmpty()) {
        break;
    }

    nombres[contador] = nombre;
    contador++;
}

System.out.println("Nombres introducidos:");
for (int i = 0; i < contador; i++) {
    System.out.println((i + 1) + ". " + nombres[i]);
teclado.close();}



}
	}

