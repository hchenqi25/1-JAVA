package Ejercicio2;

public class Deportivo extends Automovil {
	String deportivo;
	String caracteristicas;
	
	public Deportivo() {
		deportivo = "Deportivo";
		System.out.println("Constructor deportivo ejecutandose");
	}
	
	public Deportivo(String c) {
		caracteristicas = c;
		
		System.out.println(caracteristicas);
	}

}
