package Ejerciciio3;

public class Rectangulo  extends Figura{
	double altura;
	double base;
	
	
	public Rectangulo( double a , double b) {
		altura = a;
		base =b;
	}
	
	public double Area(int factor) {
		return (base*altura)*factor ;
	}

}
