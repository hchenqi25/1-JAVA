package Peliculas;

public class Biblioteca {

    private Pelicula[] biblioteca;  
    private int contador;
    private int capacidad;

    public Biblioteca(int capacidad) {
        this.capacidad = capacidad;
        biblioteca = new Pelicula[capacidad];    
        contador = 0;
    }

    public void agregarPelicula(Pelicula p) {
        if (contador < capacidad) {
            biblioteca[contador] = p;
            contador++;
        } else {
            System.out.println("La biblioteca está llena");
        }
    }

    public void mostrarPeliculas() {
        for (int i = 0; i < contador; i++) {
            biblioteca[i].mostrarInformacion();
        }
    }
}