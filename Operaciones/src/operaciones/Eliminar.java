package operaciones;
import java.util.Scanner;
public class Eliminar {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int []numeros = new int [5];
for (int i =0; i<numeros.length;i++) {
	System.out.println("Introduce un numero:" + (i+1) + ":");
	numeros[i] = teclado.nextInt();
}
for (int i=0; i<numeros.length;i++) {
	System.out.println(numeros[i]);
}
System.out.print("Introduce el numero  a eliminar: ");
int eliminar = teclado.nextInt();

int nuevoTam = numeros.length;
boolean encontrado = false;

for (int i=0;i<nuevoTam;i++) {
	if (numeros[i]==eliminar) {
		//Movemos a la izquierda el contenido del arryse 
		for (int j=i;j<nuevoTam-1;j++) {
			numeros[j]= numeros[j+1];
		}
		nuevoTam--;
		encontrado = true;
		break;
	}
}
if (encontrado) {
	System.out.println("Array despues de eliminar: ");
	for (int i=0; i<nuevoTam;i++) {
		System.out.print(numeros[i]);
	}
} else {
	System.out.println("Numero no encontrado");
}
teclado.close();	}

}
