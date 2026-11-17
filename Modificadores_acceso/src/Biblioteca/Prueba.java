package Biblioteca;

public class Prueba {
    public static void main(String[] args) {

      
        Libro libro1 = new Libro();
        libro1.setTitulo("Don Quijote");
        libro1.setAutor("Cervantes");
        libro1.precio = 20;  

   
        LibroDigital libro2 = new LibroDigital();
        libro2.setTitulo("Java Avanzado");
        libro2.setAutor("Autor X");
        libro2.precio = 15;  
        libro2.setTamanoMB(5.2);

       
        Biblioteca b = new Biblioteca();

        
        b.agregarLibro(libro1);
        b.agregarLibro(libro2);

        
        System.out.println("--------- Información del Libro -----------");
        libro1.mostrarInfo();   // 

        System.out.println("------- Información del Libro Digital ------------");
        libro2.mostrarInformacionDigital();  

       
        System.out.println("---------Biblioteca-----------");
        b.mostrarCantidadLibros();
    }
}