package Trabajador;

public class PruebaDeTrabajadores {

    public static void main(String[] args) {

        System.out.println("-------------------PROGRAMADOR-----------------");
        Programador[] p = new Programador[3];
        for (int i = 0; i < 3; i++) {
            p[i] = new Programador();
        }

        System.out.println("----------------------ANALISTA---------------------------");
        Analista[] a = new Analista[3];
        for (int i = 0; i < 3; i++) {
            a[i] = new Analista();
        }

        System.out.println("-------------------------INGENIERO---------------------------");
        Ingeniero[] in = new Ingeniero[3];
        for (int i = 0; i < 3; i++) {
            in[i] = new Ingeniero();
        }

        System.out.println("----------------------INGENIERO INFORMATICO--------------------------");
        IngenieroInformatico[] ing = new IngenieroInformatico[3];
        for (int i = 0; i < 3; i++) {
            ing[i] = new IngenieroInformatico();
        }

        System.out.println("-------------------------LISTA DE TRABAJADORES-------------------");

        Trabajador[] lista = new Trabajador[5];
        lista[0] = new Trabajador();
        lista[1] = new Programador();
        lista[2] = new Analista();
        lista[3] = new Ingeniero();
        lista[4] = new IngenieroInformatico();

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Posición " + i + ": " + lista[i]);
        }
    }
}