package Relacion2;
import java.util.HashMap;
import java.util.Map;

public class ejercicio2 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

       
        map.put("ES", "España");
        map.put("FR", "Francia");
        map.put("IT", "Italia");

        try {
          
            String clave = "FR";

            if (map.containsKey(clave)) {
                map.remove(clave);
                System.out.println("Elemento con clave '" + clave + "' eliminado.");
            } else {
                System.out.println("La clave '" + clave + "' no existe en el mapa.");
            }

            System.out.println("Mapa resultante: " + map);
            System.out.println("Tamaño del mapa: " + map.size());

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al manipular el mapa: " + e.getMessage());
        }
    }
}