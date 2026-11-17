package ejercicio2;

public class Estudiante {

	private String nombre;
	private int edad;
	private double calificacion;

	public void Setnombre(String nuevoNombre) {
		nombre = nuevoNombre;

	}

	public String Getnombre() {
		return nombre;

	}

	public void Setedad(int nuevaEdad) {
		if (nuevaEdad >= 0) {
			edad = nuevaEdad;
		} else {
			throw new IllegalArgumentException("La edad no puede ser negativa");
		}

	}

	public int Getedad() {
		return edad;
	}

	public void Setcalificaion(double nuevaCalificacion) {
		if (nuevaCalificacion <= 10) {
			calificacion = nuevaCalificacion;
		} else {
			throw new IllegalArgumentException("La edad no puede ser negativa");
		}
	}

	public double Getcalificacion() {
		return calificacion;
	}

	public void mostarInfo() {
		System.out.println("El nombre del alumno es: " + nombre);
		System.out.println("La edad del alumno es: " + edad);
		System.out.println("La calificacion obtenida es: " + calificacion);
	}

}
