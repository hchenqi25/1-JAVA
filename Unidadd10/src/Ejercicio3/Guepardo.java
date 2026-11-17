package Ejercicio3;

public class Guepardo implements ICualidades {
	@Override
	public void acelerar(int kmh) {
		System.out.println("Velocidad => " + " " + kmh + " m/s");
	}
	
	@Override
	public void frenar() {
		System.out.println("Disminuyendo velocidad Ambrosio ");
	}

}
