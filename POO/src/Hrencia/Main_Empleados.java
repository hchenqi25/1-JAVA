package Hrencia;

public class Main_Empleados {

	public static void main(String[] args) {
				
		Empleado e = new Empleado_Tiempo_Completo();
		e.calcularSalario();
		Empleado em = new Empleado_Medio_Tiempo();
		em.calcularSalario();


	}

}
