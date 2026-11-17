package Coche;
import java.util.Scanner;
public class ejecucion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		coche c = new coche();
		
		c.getMarca();
		c.getCilindrada();
		c.getCilindrada();
		c.getpotencia();
		c.caracteristicas();
		
		System.out.print("Dimme la marca que quieres: ");
		c.setmarca(teclado.nextLine());
		System.out.print("Dime el modelo que quieres: ");
		c.setmodelo(teclado.nextLine());
		

	teclado.close();}

}
