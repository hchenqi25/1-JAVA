package Ejercicio2;

public class Motorizado extends  vehiculo{
	String motor;
	
	public Motorizado() {
		motor = "Motorizado";
		System.out.println("Constructor motorizado ejecutandose");
	}
	
	public Motorizado(String m) {
		motor = m;
		
		System.out.println(motor);
	}

}
