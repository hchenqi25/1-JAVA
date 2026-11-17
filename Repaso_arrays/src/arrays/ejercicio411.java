package arrays;
import java.util.Scanner ;
public class ejercicio411 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[]nombres= {"sol","luna","estrella","nube","sol"};
		
		System.out.print("Introduce el nombre que quieres bsucar:");
		String buscado = teclado.nextLine();
		
		int contador=0;
		for (int i=0;i<nombres.length;i++) {
			if (nombres[i].equalsIgnoreCase(buscado)) {
				contador++;
			}
		}
 if (contador>0) {
	 System.out.print("La palabra está en el array y aparece" + contador + "veces");
 }else {
	 System.out.print("zenutrio");
 }
	teclado.close();}

}
