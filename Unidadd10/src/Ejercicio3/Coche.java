package Ejercicio3;

public class Coche implements ICualidades {
	
	@Override
	public void acelerar(int kmh) {
		System.out.println("Velocidad => " + " " + kmh + " m/s");
	}
	
	@Override
	public void frenar() {
		System.out.println("Disminuyendo velocidad ");
	}

}
