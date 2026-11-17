package Ejercicio2;

public class Circulo extends Shape {
	private double radio;
	public Circulo(double r) {
		radio =r;
	}
	
	@Override
	public double area() {
		return Math.PI*radio*radio;
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*radio;
	}

}
