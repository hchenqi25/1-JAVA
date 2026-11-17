package Hrencia;

public class Smarthpone extends Dispositivo {
    private int almacenamiento;
    
    public void setAlmacenamiento(int a) {
        almacenamiento = a;
    }
    
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    
    public void mostrarInfo() {
    	System.out.println("Marca => " + getMarca());
		System.out.println("Precio => " + getPrecio());
		System.out.println("Almacenamiento => " + almacenamiento);
	}

}