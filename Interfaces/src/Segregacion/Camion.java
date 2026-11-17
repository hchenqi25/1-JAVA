package Segregacion;

public class Camion  implements IVehiculo{
	@Override
	public void acelerar(int kmh) {
		System.out.println("Estamos acelerando " + kmh + "km/h");
	}
	
	@Override
	public void frenar() {
		System.out.println("Estamos frenando");
	}
	
	@Override
	
	public void girar(int angulo) {
		System.out.println("Estamos girando " + angulo + " grados");
	}
	

}
