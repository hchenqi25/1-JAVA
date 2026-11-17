package Ejercicio4;

public class AutobusElectrico extends Autobus {
	int bateria;
	
	public AutobusElectrico() {
		
	}
	
	public AutobusElectrico(int b) {
		bateria = b;
		
		System.out.println("Constructor bateria ejecutandose");
	}

}
