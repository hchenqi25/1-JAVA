package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Sonido[] animales = new Sonido[3];

        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Vaca();

        for (Sonido s : animales) {
            s.HacerSonido();
        }
    }
}