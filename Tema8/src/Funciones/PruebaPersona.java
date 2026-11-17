package Funciones;

public class PruebaPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        PersonaInglesa p2 = new PersonaInglesa();
        PersonaInglesa p3 = new PersonaInglesa();
        PersonaItaliana p4 = new PersonaItaliana();

        p1.setNombre("Paco");
        p2.getNombre();
        p3.setNombre("Antonio");
        p4.setNombre("Julian");
        
      
        p1.saludar();
        p1.saludar("Encantado de conocerte");
        p2.saludar();
        p3.saludar();
        p4.saludar();

       
        p2.TomarTe();
    }
}