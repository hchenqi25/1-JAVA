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
		if(nuevaEdad>=0) {
			edad = nuevaEdad;
		}else {
			throw new IllegalArgumentException("No puede ser inferior a 0");
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setCalificacion(double nuevaCalificacion) {
		if(nuevaCalificacion>=0 && nuevaCalificacion<=10) {
			calificacion = nuevaCalificacion;
		}else {
			throw new IllegalArgumentException("ERROR: ERES TAN PAQUETE COMO GONZALO");
		}
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void MostrarInfo() {
		System.out.println("Nombre del alumno =>" + getNombre());
		System.out.println("Edad =>" + getEdad());
		System.out.println("Calificacion =>" + getCalificacion());
	}

}
