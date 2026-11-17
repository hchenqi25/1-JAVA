package Funciones;
import java.util.Scanner;
public class EjemploNombre {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner (System.in);

        Persona p = new Persona();  
        System.out.println("Vamos con la Persona");
      System.out.println("Introduce el nombre de la persona: ");
        p.setNombre(teclado.nextLine());
        p.getNombre();
        p.saludar();
        
        System.out.println("Vamos con la persona inglesa");
        PersonaInglesa e = new PersonaInglesa();
        System.out.println("Introduce el nombre del ingles: ");
        e.setNombre(teclado.nextLine());
        e.saludar();
        e.TomarTe();
       
  teclado.close();  }
}