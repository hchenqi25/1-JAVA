package funciones;
public class Iniciales {
    public static void main(String[] args) {
        String nombreCompleto = "Antonio Barba";

      
        String primera = nombreCompleto.substring(0, 1);

       
        int espacio = nombreCompleto.indexOf(" ");
        String segunda = nombreCompleto.substring(espacio + 1, espacio + 2);


        String iniciales = primera + segunda;

        System.out.println(iniciales); 
    }
}