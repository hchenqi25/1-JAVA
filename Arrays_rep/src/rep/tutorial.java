  package rep;
import java.util.Scanner;
public class tutorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float []numeros = new float[4];
		System.out.print("Introduce un numero:");
            numeros[0] = teclado.nextInt();
        System.out.print("Introduce un numero: ");
        numeros [1] = teclado.nextInt();
        System.out.print("Introduce un numero: ");
        numeros[2] = teclado.nextInt();
        System.out.print("Introduce otro numero: ");
        numeros[3] = teclado.nextInt();
        
       System.out.print("Los numeros introducidos son: ");
       System.out.println(numeros[0]);
       System.out.println(numeros[1]);
       System.out.println(numeros[2]);
       System.out.println(numeros[3]);
    
       float media = (numeros[0] + numeros[1] + numeros[2] + numeros[3] ) /4;
       
       System.out.println("La media de los numeros es de: " + media ) ;
       teclado.close();
	}

}
