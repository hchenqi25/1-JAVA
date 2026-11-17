package Encapsulacion;

public class Estudiantes {
	
	private String nombre;
	private int edad;
	private double calificacion;
	
	
	public void setNombre( String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int e) {
		if(e>=0) {
			edad = e;
		}else {
			System.out.println("No puede ser menor a cero");
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setCalificacion(double c) {
		if(c>0 && c <=10) {
			calificacion =c;
		}else {
			System.out.println("La nota no puede ser negativa");
		}
	}
	
	public double getCalificacion() {
		return calificacion;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre = >" + nombre);
		System.out.println("Edad => " + edad);
		System.out.println("Calificacion => " + calificacion);
	}

}
