package Ejercicios;

public abstract class Material {
	protected String titulo;
	protected boolean prestado;

	public Material(String titulo) {
		this.titulo = titulo;
		this.prestado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return titulo + "," + prestado;
	}
}