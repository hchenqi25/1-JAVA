package Ejercicio3;

public class Empleado {
	
	String nombre;
	int identificacion;
	
	public void setNombre( String n) {
		nombre = n;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setIdentificacion(int i) {
		identificacion = i;
	}
	
	public int getIdnetificacion() {
		return identificacion;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Idnetificacion: " + identificacion);
	}

}
