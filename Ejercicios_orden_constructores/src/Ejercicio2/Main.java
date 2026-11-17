package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		 System.out.println("\nCreando un Vehiculo:");
	        vehiculo v = new vehiculo();

	        System.out.println("Creando un Motorizado:");
	        Motorizado m = new Motorizado();

	        System.out.println("Creando un Automovil:");
	        Automovil a = new Automovil();

	        System.out.println("Creando un Deportivo:");
	        Deportivo d = new Deportivo();
	        
	        System.out.println("Creando un Camion:");
	        Camion c = new Camion();
	        
	        System.out.println("Creando un Camion electrico:");
	        CamionElectrico ce = new CamionElectrico(null);
	    }
	


	}


