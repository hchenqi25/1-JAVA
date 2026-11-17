package Encapsulacion;

public class Automovil {
	private String marca;
	private String modelo;
	private int velocidad;

	public void setMarca(String m) {
		marca = m;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String mo) {
		modelo = mo;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setVelocidad(int v) {
		if(v>0) {
			velocidad = v;
		}else {
			throw new IllegalArgumentException("La velocidad no puede ser negativa");
		}
	}
	
	public void setAceleracion(int a) {
		velocidad += a;
	}
	public void setFreno(int f) {
		if(velocidad -f>0 || f-velocidad>0) {
			velocidad -= f;
		}else {
			throw new IllegalArgumentException("No puede ser negativa");
		}
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	public void MostrarInfo() {
		System.out.println("Marca =>" + getMarca());
		System.out.println("Modelo => " + getModelo());
		System.out.println("Velocidad => " + getVelocidad());
	}

}
