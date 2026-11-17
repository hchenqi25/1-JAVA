package cambio;
import java.util.Scanner;
public class ejeercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int contador = 0;
		int[]numeros = new int[5];
for (int i=0; i<3;i++) {
	numeros[i] = teclado.nextInt();
}
System.out.print("Dime la posicion que quieras borrar: ");
int posicion = teclado.nextInt();
for (int i =posicion ; i<contador ; i++) {
	System.out.print("Muestra los valores del arryase: " + numeros[i]);
}

System.out.print("El numero ");


teclado.close();	
 }

}
