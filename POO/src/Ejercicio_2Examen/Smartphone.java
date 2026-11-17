package Ejercicio_2Examen;

public class Smartphone extends Dispositivo {
	
	
	private String sistema;
	private int almacenamiento;
	
	
	public Smartphone(String marca, String modelo, double precio , String sistema, int almacenamiento) {
		super(marca, modelo, precio);
		this.almacenamiento=almacenamiento;
		this.sistema=sistema;
	}
	
	public void setSistema() {
		
	}
	
	public String getSistema() {
		return sistema;
	}
	
	public void setAlamcenamiento() {
		
	}
	
	public int getAlmacenamiento() {
		return almacenamiento;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Marca => " + getMarca());
		System.out.println("Modelo => " + getModelo() ) ;
		System.out.println("Precio => " + getPrecio());
		System.out.println("Sistema => " + getSistema( ));
		System.out.println("Almacenamiento => " + getAlmacenamiento());
		
	}
	
	
	
	

}
