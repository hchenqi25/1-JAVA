package Encapsulacion;
import java.util.Scanner;
public class PruebaAutomovil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Automovil au = new Automovil();
		
		System.out.println("Introduce la marca del coche =>");
		au.setMarca(teclado.nextLine());
		System.out.println("Introduce el modelo del coche =>");
		au.setModelo(teclado.nextLine());
		
		System.out.println("Introduce la velocidad =>");
		au.setVelocidad(teclado.nextInt());
		
		System.out.println("Introduce la aceleracion =>");
		au.setVelocidad(teclado.nextInt());
		
		System.out.println("Introduce la frenada =>");
		au.setFreno(teclado.nextInt());
		
		System.out.println("-----DETALLES DEL COCHE-------------");
		au.MostrarInfo();
teclado.close();	}

}
