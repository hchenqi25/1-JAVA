package Ejercicio2;

public class Gerente  extends Empleado{
	float bono;
	
	public Gerente( String n, float s , float b) {
		nombre = n;
		salario = s;
		bono = b;
	}
	
	public float Salario() {
		return salario + bono;
	}

}
