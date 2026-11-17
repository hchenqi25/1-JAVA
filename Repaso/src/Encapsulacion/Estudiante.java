package Encapsulacion;

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
		if (nuevaEdad >= 0) {
			
			edad = nuevaEdad;
		} else {
			throw new IllegalArgumentException("La edad no puede ser inferior a 0 ");
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setCalificacion(double nuevaCalificacion) {
		if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
			
			calificacion = nuevaCalificacion;
		} else {
			throw new IllegalArgumentException("La calificacion es invalidad");
		}
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void MostrarInfo() {
		System.out.println("------------DETALLES DEL ALUMNO------------");
		System.out.println("Nombre del alumno => " + nombre);
		System.out.println("Edad del alumno =>" + edad);
		System.out.println("Calificacion del alumnos =>" + calificacion);
	}


}
