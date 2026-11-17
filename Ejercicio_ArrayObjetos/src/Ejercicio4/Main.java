package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Animal[] zoo = new Animal[8];

        zoo[0] = new Felino();
        zoo[0].setNombre("Tigre");
        zoo[0].setDieta("Carnívoro");
        zoo[0].setSonido("Grrrr");

        zoo[1] = new Canino();
        zoo[1].setNombre("Lobo");
        zoo[1].setDieta("Carnívoro");
        zoo[1].setSonido("Auuuu");

        zoo[2] = new Loro();
        zoo[2].setNombre("Loro Pepe");
        zoo[2].setDieta("Semillas");
        zoo[2].setSonido("Hola!");

        zoo[3] = new Aguila();
        zoo[3].setNombre("Águila Real");
        zoo[3].setDieta("Carnívoro");
        zoo[3].setSonido("Kiiii");

        zoo[4] = new Mamifero();
        zoo[4].setNombre("Vaca");
        zoo[4].setDieta("Herbívoro");
        zoo[4].setSonido("Muuu");

        zoo[5] = new Ave();
        zoo[5].setNombre("Gorrión");
        zoo[5].setDieta("Insectos");
        zoo[5].setSonido("Pío");

        zoo[6] = new Felino();
        zoo[6].setNombre("León");
        zoo[6].setDieta("Carnívoro");
        zoo[6].setSonido("Rooooar");

        zoo[7] = new Loro();
        zoo[7].setNombre("Loro Azul");
        zoo[7].setDieta("Frutas");
        zoo[7].setSonido("Hola amigo!");

  
        System.out.println("--- INFORMACIÓN DE LOS ANIMALES ---");
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].mostrarInfo();
        }

       
        System.out.println("\n--- SONIDOS ---");
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].emitirSonido();;
        }

       
        System.out.println("\n--- ALIMENTANDO A TODOS ---");
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].alimentar();
        }

      
        int totalAnimales = 0;
        int totalMamiferos = 0;
        int totalAves = 0;
        int totalFelinos = 0;
        int totalCaninos = 0;
        int totalLoros = 0;
        int totalAguilas = 0;

        for (int i = 0; i < zoo.length; i++) {
            totalAnimales++;

            if (zoo[i] instanceof Mamifero) totalMamiferos++;
            if (zoo[i] instanceof Ave) totalAves++;
            if (zoo[i] instanceof Felino) totalFelinos++;
            if (zoo[i] instanceof Canino) totalCaninos++;
            if (zoo[i] instanceof Loro) totalLoros++;
            if (zoo[i] instanceof Aguila) totalAguilas++;
        }

        System.out.println("--- CONTADORES ---");
        System.out.println("Total animales: " + totalAnimales);
        System.out.println("Mamíferos: " + totalMamiferos);
        System.out.println("Aves: " + totalAves);
        System.out.println("Felinos: " + totalFelinos);
        System.out.println("Caninos: " + totalCaninos);
        System.out.println("Loros: " + totalLoros);
        System.out.println("Águilas: " + totalAguilas);
    }
}