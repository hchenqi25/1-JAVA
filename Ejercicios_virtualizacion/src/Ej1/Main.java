package Ej1;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Cohe("Toyota", "Corolla", 5);
        vehiculos[1] = new Moto("Honda", "CBR", 600);
        vehiculos[2] = new Cohe(); 
        vehiculos[3] = new Moto();  

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}