package Funciones;

public class PersonaInglesa extends Persona{

	public PersonaInglesa() {
		nombre = "John";
	}
	
	
	public void TomarTe() {
		System.out.println("Estoy tomando té");
	}
	 
	public void saludar() {
	        System.out.println("Hi, I am " + getNombre());
	    }

}
