package Ejercicio1;

public class LibroTecnico extends Libro {
	
	private String area;
	
	public void setArea(String ar) {
		area = ar;
	}
	public String getArea() {
		return area;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Area => " + getArea());
	}

}
