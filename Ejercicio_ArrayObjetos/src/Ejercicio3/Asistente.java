package Ejercicio3;

public class Asistente  extends Empleado{
	String oficio;
	
	
	public void setOficio(String o) {
		oficio = o;
	}
	
	public String getOficio() {
		return oficio;
	}
	
	public void mostrarInfo() {
		System.out.println("Oficio: " + oficio);
	}
	
	

}
