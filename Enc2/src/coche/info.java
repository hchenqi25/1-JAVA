package coche;
import java.util.Scanner;
public class info {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Automovil a = new Automovil();
		
		System.out.println("Introduce la marca: ");
		a.setMarca(teclado.nextLine());
		
		a.getMarca();
		
		System.out.println("Introduce el modelo: ");
		a.setModelo(teclado.nextLine());
		a.getModelo();
		
		System.out.println("Introduce la velocidad: ");
		a.setVelocidad(teclado.nextInt());
		
		a.getVelocidad();
		
		System.out.println("Introduce la aceleracion: ");
		a.setAceleracion(teclado.nextInt());
		
		a.getVelocidad();
		
		System.out.println("Introduce el potencial de frenado: ");
		a.setFrenar(teclado.nextInt());
		
		a.getVelocidad();
		
		a.mostrarInfo();
		
		

	teclado.close();}

}
