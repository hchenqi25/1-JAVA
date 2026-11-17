package Ejercicio4;

public class Animal {
    String nombre;
    String dieta;
    String sonido;

    public Animal() {
        System.out.println("El animal ha sido alimentado");
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDieta(String d) {
        dieta = d;
    }

    public String getDieta() {
        return dieta;
    }

    public void setSonido(String s) {
        sonido = s;
    }

    public String getSonido() {
        return sonido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dieta: " + dieta);
        System.out.println("Sonido: " + sonido);
        System.out.println("---------------------------");
    }

    public void alimentar() {
        System.out.println(nombre + " ha sido alimentado.");
    }
    public void emitirSonido() {
    	System.out.println("Sonido: " + sonido);
    	
    }
}