package ModificadorAcceso_Tienda;

public class ProductoElectronico extends Producto {
	private String marca;
	
	public void setMarca(String m) {
		marca = m;
	}
	public String getMarca() {
		return marca;
	}
	
	public void mostrarInfoElectronico() {
		System.out.println("Marca => " + marca);
		System.out.println("Codigo => " + getCodigo());
	}

}
