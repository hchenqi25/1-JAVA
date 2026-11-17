package Electronica;

public class Televisor  extends ProductoElectrico{

	protected int tamanoPantallaTelevisor;
	

	public Televisor() {
		
		nombreProductoElectrico = "Charles";
		precioProductoElectrico = 2500;
		tamanoPantallaTelevisor =27;
}
	
	public void mostrarInfo() {
		System.out.println("Nombre del producto: " + nombreProductoElectrico);
		System.out.println("Precion del producto: " + precioProductoElectrico);
		System.out.println("Tamaño de pantalla: " + tamanoPantallaTelevisor);
	}
}
