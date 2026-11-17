package Funciones;

public class Persona {

    protected String nombre;
    
   public Persona(){
	   
   }



    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
    
    public void saludar(String mensaje) {
    	System.out.println(nombre + " " + "dice:" + mensaje);
    }
}

