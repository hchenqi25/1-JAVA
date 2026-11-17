package Ejercicio3;

public class Prueba {

	public static void main(String[] args) {
		
		Guitarra g = new Guitarra();
		System.out.println("----------------GUITARRA------------------");
		
		System.out.println("El sondio de la guitarra es: " );
		g.tocar();
		
		
		System.out.println("---------------PIANO---------------");
		Piano p = new Piano();
		System.out.println("El sonido del piano es:");
		p.tocar();
		

	}

}
