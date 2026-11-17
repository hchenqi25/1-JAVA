package Ejercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Samrtphone m = new Samrtphone();
		System.out.println("-----------Smarthphone---------------");
		System.out.println("Marca: ");
		m.setMarca(teclado.nextLine());
		m.getmarca();
		System.out.println("Precio: ");
		m.setPrecio(teclado.nextDouble());
		m.getPrecio();
		System.out.print("Almacenamiento: ");
		m.setAlmacenamiento(teclado.nextInt());
		m.getAlmacenamiento();
		
		m.mostrarInfo();
		
		System.out.println("--------------Laptop--------------");
		Laptop l = new Laptop();
		
		System.out.println("Marca: ");
		l.setMarca(teclado.nextLine());
		l.getmarca();
		System.out.println("Precio: ");
		l.setPrecio(teclado.nextDouble());
		l.getPrecio();
		
		System.out.print("Ram: ");
		l.setRam(teclado.nextInt());
		l.getRam();
		l.mostrarInfo();

	}

}
