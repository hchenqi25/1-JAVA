package Ejercicio3;

public class DesarrolladorFronted extends Desarrollador {
 String rama;
 
 public void setRama(String r) {
	 rama = r;
 }
 
 public String getRama() {
	 return rama;
 }
 
 public void mostrarInfo() {
	 System.out.println("Rama: " + rama);
 }
	
}
