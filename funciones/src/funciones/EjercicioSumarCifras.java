package funciones;


public class EjercicioSumarCifras {

    
    public static int sumarCifras(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;  
            numero /= 10;         
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero = 123;
        int resultado = sumarCifras(numero);
        System.out.println("La suma de las cifras de " + numero + " es: " + resultado);
    }
}