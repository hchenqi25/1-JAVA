package Segregacion;

public class Avion implements IVehiculoVolador  {
	@Override 
	public void acelerar(int kmh) {
		System.out.println("Esarmos acelerando " + kmh + "km/h");
		
	}
	
	@Override
	public void frenar() {
		System.out.println("Estamos frenando");
	}
	
	@Override
	public void girar(int angulo) {
		System.out.println("Esramos girando" + angulo + " grados");
	}
	
	@Override
	public void despegar() {
		System.out.println("Estamos despegando");
	}
	
	@Override
	public void aterrizar() {
		System.out.println("Estamos aterrizando");
	}

}
