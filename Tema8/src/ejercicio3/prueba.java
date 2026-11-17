package ejercicio3;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Coche c = new Coche();

        System.out.println("----------------COCHE----------------");
        System.out.println("Introduce la marca:");
        c.setMarca(teclado.nextLine());

        System.out.println("Introduce el modelo:");
        c.setModelo(teclado.nextLine());

        System.out.println("Introduce la cilindrada: ");
        c.setCilindrada(teclado.nextInt());

        System.out.println("Introduce la potencia: ");
        c.setPotencia(teclado.nextDouble());

        teclado.nextLine(); 
        
        System.out.println("Candtidad de ruedas: ");
        c.getcantidadeRuedas();

        c.caracteristicas();

        System.out.println("----------------MOTO-------------------- ");
        Moto m = new Moto();

        System.out.println("Dime la marca: ");
        m.setMarca(teclado.nextLine());

        System.out.println("Dime el modelo:");
        m.setModelo(teclado.nextLine());

        m.setCilindrada(c.getCilindrada());
        m.setPotencia(c.getPotencia());
        
        System.out.println("Cantidad de ruedas: ");
        m.getcantidadeRuedas();

        m.caracteristicas();
        
        System.out.println("----------------Sobrecoche-------------------- ");
        Vehiculo v1 = new Vehiculo();
        v1.Circular();        

        Vehiculo v2 = new Vehiculo();
        v2.Circular(120);     

        v1.caracteristicas();
        v2.caracteristicas();


      
        
        
        teclado.close();
    }
}