package antonio;
import java.util.Scanner;
public class ejermplo2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
System.out.print("Introduce la longitud del array: ");
int longitud = teclado.nextInt();
byte[] datos = new byte[longitud];
int contador = 0;

// Paso 2: Añadir números hasta que se escriba 0 o se llene el array
while (contador < longitud) {
    System.out.print("Introduce un número (0 para terminar): ");
    byte numero = teclado.nextByte();

    if (numero == 0) {
        break;
    }

    datos[contador] = numero;
    contador++;
}

// Paso 3: Mostrar los datos introducidos
System.out.println("Datos introducidos:");
for (int i = 0; i < contador; i++) {
    System.out.println("Posición " + i + ": " + datos[i]);
}

teclado.close();
}


}


