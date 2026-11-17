package Ejercicio3;

public class Gerente extends Empleado {
	String puesto;
	
	public void setPuesto(String p) {
		puesto = p;
	}
	public String getPuesto() {
		return puesto;
	}
	
	public void mostrarInfo() {
		System.out.println("Puesto: " + puesto);
	}

}
