import java.util.ArrayList;
import java.io.*;

public class MainCarrera {

    static final double DISTANCIA_OBJETIVO = 500.0;

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Ferrari", "F40", 200));
        vehiculos.add(new Auto("Toyota", "Supra", 180));
        vehiculos.add(new Moto("Honda", "CBR", 160));
        vehiculos.add(new Moto("Yamaha", "R1", 170));

        System.out.println("=== COMIENZA LA CARRERA ===");
        System.out.println("Distancia objetivo: " + DISTANCIA_OBJETIVO + " km\n");

        Vehiculo ganador = null;
        int vuelta = 1;

        while (ganador == null) {
            System.out.println("-- Vuelta " + vuelta + " --");
            for (Vehiculo v : vehiculos) {
                v.avanzar();
                System.out.printf("%s (%s): %.2f km%n", v.getNombre(), v.getTipo(), v.getDistancia());
                if (v.getDistancia() >= DISTANCIA_OBJETIVO && ganador == null)
                    ganador = v;
            }
            vuelta++;
            System.out.println();
        }

        System.out.println("=== GANADOR: " + ganador.getNombre() + " ===");

        // Ordenar por distancia (burbuja)
        for (int i = 0; i < vehiculos.size() - 1; i++)
            for (int j = 0; j < vehiculos.size() - 1 - i; j++)
                if (vehiculos.get(j).getDistancia() < vehiculos.get(j + 1).getDistancia()) {
                    Vehiculo temp = vehiculos.get(j);
                    vehiculos.set(j, vehiculos.get(j + 1));
                    vehiculos.set(j + 1, temp);
                }

        System.out.println("\n=== RANKING FINAL ===");
        for (int i = 0; i < vehiculos.size(); i++)
            System.out.printf("%d. %s (%s) - %.2f km%n",
                (i + 1), vehiculos.get(i).getNombre(), vehiculos.get(i).getTipo(), vehiculos.get(i).getDistancia());

        guardarRanking(vehiculos);
    }

    static void guardarRanking(ArrayList<Vehiculo> vehiculos) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ranking.txt"));
            bw.write("=== RANKING FINAL ==="); bw.newLine();
            for (int i = 0; i < vehiculos.size(); i++) {
                bw.write((i + 1) + ". " + vehiculos.get(i).getNombre() +
                    " (" + vehiculos.get(i).getTipo() + ") - " +
                    String.format("%.2f", vehiculos.get(i).getDistancia()) + " km");
                bw.newLine();
            }
            bw.close();
            System.out.println("\nRanking guardado en ranking.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar ranking: " + e.getMessage());
        }
    }
}