package Ejercicio5;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
        Cuenta_ahorro ahorro = new Cuenta_ahorro();
      System.out.println("-------------------Cuenta ahorro");

    System.out.println("Depositar: ");
    
        ahorro.depositar(teclado.nextDouble());
        
        System.out.println("Retiro: ");
        ahorro.retirar(teclado.nextDouble()); 
        System.out.println("Saldo: ");
        ahorro.mostrarSaldo();

        CuentaCorriente corriente = new CuentaCorriente();
        System.out.println("Depositar: ");
        
        corriente.depositar(teclado.nextDouble());
        
        System.out.println("Retiro: ");
        corriente.retirar(teclado.nextDouble()); 
        System.out.println("Saldo: ");
        corriente.mostrarSaldo();
   teclado.close(); }
}