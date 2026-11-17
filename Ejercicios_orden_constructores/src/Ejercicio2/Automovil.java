package Ejercicio2;

public class Automovil extends Motorizado{
	int cilindraje;
	int puertas;
	
	public Automovil() {
		cilindraje = 300;
		System.out.println("Constructor automovil ejecutandose");
	}
	
	public Automovil(int p) {
		puertas = p;
		System.out.println(puertas);
	}

}
