package Ejercicio_2Examen;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Dispositivo> listaDispositivos;

    public Inventario() {
        this.listaDispositivos = new ArrayList<>();
    }

    
    public void añadirDispositivo(Dispositivo dispositivo) {
        listaDispositivos.add(dispositivo);
        System.out.println("Dispositivo añadido correctamente.");
    }

    
    public void mostrarTodos() {
        if (listaDispositivos.isEmpty()) {
            System.out.println("No hay dispositivos en el inventario.");
            
            
        }

        System.out.println("========== INVENTARIO ==========");
        for (Dispositivo d : listaDispositivos) {
            d.mostrarInfo();
            System.out.println("--------------------------------");
        }
    }
}