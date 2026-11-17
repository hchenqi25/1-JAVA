package Persona;

public class Persona {

	private String nombre;

	public Persona() {
		nombre = "Paco";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	public void saludar() {
		System.out.println("Hola, soy:" + nombre);
	}

}
