package Segregacion;

public class Tanque  implements IVehiculo, IArmasDeGuerra {
	@Override
	public void apuntar() {
		System.out.println("Apuntando con el tanque");
	}
	
	@Override
	public void disparar() {
		System.out.println("Disparando con el tanque ");
	}
	
	@Override
	public void acelerar(int kmh) {
		System.out.println("Estamos acelerando " + kmh + "km/h");
	}
	
	@Override
	public void frenar() {
		System.out.println("Estamos frenando ");
	}
	
	@Override
	public void girar(int angulo) {
		System.out.println("Estamos girando " + angulo + "grados");
	}

}
 