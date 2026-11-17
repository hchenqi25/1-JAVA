package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        Coche coche = new Coche("Toyota", 4);
        Moto moto = new Moto("Honda");
        Bicicleta bici = new Bicicleta("Giant");

        System.out.println(coche.obtenerDescripcion());
        System.out.println(moto.obtenerDescripcion());
        System.out.println(bici.obtenerDescripcion());

        
        System.out.println(coche.obtenerDescripcion("Gasolina"));
    }
}
