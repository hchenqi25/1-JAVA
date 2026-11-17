package Ejercicio2;

public class Rectangulo extends Shape {
	private double ancho;
	private double altura;

	public Rectangulo(double a , double h) {
		ancho = a;
		altura =h;
	}
	
	@Override
	public double area() {
		return ancho*altura;
	}
	@Override
	public double perimetro() {
		return 2*(ancho+altura);
	}
}
