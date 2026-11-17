package Ejercicio3;

public class DesarroladorBackend extends Desarrollador {
	String tema;
	
	public void setTema(String te) {
		tema = te;
	}
	
	public String getTema() {
		return tema;
	}
	
	public void mostrarInfo() {
		System.out.println("Fondo : " + tema);
	}

}
