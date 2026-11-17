package Hrencia;

public class Main_Dispositivos {

	public static void main(String[] args) {		
		Smarthpone s = new Smarthpone();
		s.setMarca("Iphone");
		
		s.setPrecio(1500);
		s.setAlmacenamiento(250);
		System.out.println("========================================================");
		s.mostrarInfo();
		
		System.out.println("========================LAPTOP=======================");
		
		Laptop l = new Laptop();
		l.setMarca("Lenovo");
		l.setPrecio(2500);
		l.setRamGB(16);
		l.mostrarInfo();
		

	}

}
