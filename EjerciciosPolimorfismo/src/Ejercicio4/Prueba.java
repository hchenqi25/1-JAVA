package Ejercicio4;

public class Prueba {
    public static void main(String[] args) {

      
        Guitarra g = new Guitarra("Clásica");
        Piano p = new Piano();
        Bateria b = new Bateria();


        System.out.println(g.Sonido("x"));
        System.out.println(p.Sonido("x"));
        System.out.println(b.Sonido("x"));


       
    }
}