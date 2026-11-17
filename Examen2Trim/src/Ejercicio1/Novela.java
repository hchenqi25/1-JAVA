package Ejercicio1;

public class Novela extends Libro {
	private String genero;
	
	public void setGenero(String g) {
		genero = g;
	}
	public String getGenero() {
		return genero;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Genero=> " + getGenero());
	}
	

}
