package HrenciaBiblioteca;

public class LibroDigital extends Libro{
	private double tamano;
	
	public void setTAno(double t) {
		tamano = t;
	}
	public double getTamano() {
		return tamano;
	}
	
	public void mostrarInfonDi() {
		mostrarInfo();
		System.out.println("Tamaño =>" + tamano + " MB");
	}

}
