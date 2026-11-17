package Colegio;

public class Estudiante {

	private String nombre;
	private int edad;
	private double calificacion;

	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(int nuevaEdad) {
		if (edad >= 0) {
			edad = nuevaEdad;
		} else {
			throw new IllegalArgumentException("La edad no puede ser inferior a 0");
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setCalificacion(double nuevacalificacion) {
		if (nuevacalificacion >= 0 &&  nuevacalificacion<=10) {
			calificacion = nuevacalificacion;
		} else {
			throw new IllegalArgumentException("La calificacion debe de estar enttre 0 y 10");
		}
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void mostrarInfo() {
		System.out.println("---------------------DETALLES DEL ALUMNO------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Calificacion: " + calificacion);
	}

}
