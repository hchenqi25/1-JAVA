package Encapsulacion;

public class Automovil {
	
	private String marca;
	private String modelo;
	private int velocidad;
	
	
	public void setMarca(String m) {
		marca =m;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String m) {
		modelo =m;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setVelocidad(int v) {
		if(v>=0) {
			velocidad = v;
		}else {
			System.out.println("No puede ser la velocidad negativa");
		}
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelerar(int incremento) {
		velocidad += incremento;
		
		System.out.println("Nueva velocidad " + velocidad);
		
	}
	
	public void frenar(int disminucion) {
		velocidad -= disminucion;
		
		System.out.println("Nueva velocidad tras la disminucion => " + velocidad);
	}
	
	public void mostrarInfo() {
		System.out.println(" Maca => " + marca);
		System.out.println("Modelo => " + modelo);
		System.out.println("Velocidad  => " + velocidad);
	}

}
