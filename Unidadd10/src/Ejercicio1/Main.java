package Ejercicio1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Introduce las dimensiones de la cocina =>");
    	
        habitaciones c = new Cocina(teclado.nextDouble(),teclado.nextDouble(),teclado.nextDouble());
        c.calcular();
        c.mostrar();
        
        System.out.println("Introduce las dimensiones de la cocina =>");
        habitaciones d = new Dormitorio(teclado.nextDouble(),teclado.nextDouble(),teclado.nextDouble());
        d.calcular();
        d.mostrar();
        
        System.out.print("Introduce las dimensiones del aseo =>");
        
        habitaciones a = new Aseo(teclado.nextDouble(),teclado.nextDouble(),teclado.nextDouble());
        a.calcular();
        a.mostrar();
   teclado.close(); }
}