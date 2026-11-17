package Estudiante;

public class Estudiante {

	private String nombre;
	private int edad;
	private double calificacion;
	
	
	
	public void setNombre(String alumno) {
		nombre = alumno;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int años) {
		if (años>=0) {
			edad=años;
		}else {
			throw new IllegalArgumentException("La edad no puede ser meor a 0");
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setCalificacion(double nota) {
		if (nota>=0 && nota<=10) {
			calificacion=nota;
		}else {
			throw new IllegalArgumentException("La nota debe de estar entre 0 y 10");
		}
	}
	
	public double getCalificacion() {
		return calificacion;
	}
	
	public void mostrarInfo() {
		System.out.println("------------------------Estudiante-----------------------------");
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad del es: " + edad);
		System.out.println("La calificacion es: " + calificacion);
	}
}
