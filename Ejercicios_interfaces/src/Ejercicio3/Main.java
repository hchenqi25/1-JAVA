package Ejercicio3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Introduce la marca del coche =>");
    	String marca = teclado.nextLine();
    	System.out.println("Introduce el modelo del coche => ");
    	String modelo = teclado.nextLine();

        Vehiculos coche = new Coche(marca ,  modelo);
        
        System.out.println("Introduce la marca de la moto=>");
        String Mmarca = teclado.nextLine();
        System.out.println("Introduce el modelo de la moto =>");
        String Mmodelo = teclado.nextLine();
        
        Vehiculos moto = new Moto(Mmarca , Mmodelo);

        System.out.println("=== Simulación de conducción ===");
        System.out.println("------------------------COCHE--------------------------");

        coche.mostrarInfo();
        coche.acelerar();
        coche.acelerar();
        coche.frenar();

        System.out.println("-------------------------MOTO--------------------");

        moto.mostrarInfo();
        moto.acelerar();
        moto.frenar();
        moto.acelerar();
    teclado.close();}
}