package ejercicios_repaso;
import java.util.Scanner;

public class ejercicio5113 {

    public static void main(String[] args) {
    	
   
 Scanner teclado = new Scanner(System.in);

  // Pedir una frase al usuario
 System.out.print("Introduce una frase: ");
   String frase = teclado.nextLine();

 // Eliminar todos los espacios usando replaceAll()
  String fraseSinEspacios = frase.replaceAll(" ", "");

 // Usar StringBuilder para trabajar con la nueva frase
    	        StringBuilder resultado = new StringBuilder(fraseSinEspacios);

 // Mostrar la frase sin espacios
  System.out.println("Frase sin espacios: " + resultado.toString());
  teclado.close();
    	    }
    	}
    
