package Encapsulacion;
import java.util.Scanner;
public class Main_Automovil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Automovil a = new Automovil();
		
		System.out.println("Introduce la marca del automovil");
		a.setMarca(teclado.nextLine());
		a.getMarca();
		
		System.out.println("Introduce el modelo => ");
		a.setModelo(teclado.nextLine());
		a.getMarca();
		System.out.println("Intrdouce la velocidad => ");
		a.setVelocidad(teclado.nextInt());
		a.getVelocidad();
		
		
		System.out.println("Ingrese la aceleracion => ");
		a.acelerar(teclado.nextInt());
		a.getVelocidad();
		
		System.out.println("Ingrese la disminucion de la velcoidad del coche => ");
		a.frenar(teclado.nextInt());
		a.getVelocidad();
		
		
		System.out.println("=======================INFORMACION DEL PRODUCTO================================");
		a.mostrarInfo();
		
	teclado.close();}

}
