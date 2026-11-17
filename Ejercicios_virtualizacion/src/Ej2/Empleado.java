package Ej2;

public class Empleado {
	String nombre;
	double salarioBase;
	int id;

	public Empleado(String n, double s, int i) {
		this.nombre =n;
		this.salarioBase =s;
		this.id =i;
	}
	
	public double  calcularSalario() {
		return salarioBase;
	}
	
	public void mostrarInfo() {
		System.out.println(nombre);
		System.out.println(salarioBase);
		System.out.println(id);
	}

}
