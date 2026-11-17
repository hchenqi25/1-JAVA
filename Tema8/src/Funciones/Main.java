package Funciones;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[3];

        personas[0] = new Persona();
        personas[1] = new PersonaInglesa();
        personas[2] = new PersonaItaliana();

        for (Persona p : personas) {
            p.saludar();  
        }
    }
}
