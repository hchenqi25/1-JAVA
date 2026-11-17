package Ejerciciio3;

public class Cuadrado extends Figura {
	double lado;
	
	public Cuadrado(double l) {
		lado = l;
	}
	
	public double  Area(){
		return lado*lado;
	}

}
