package Ejemplo;

public class PruebaPuerta {
	public static void main(String[] args) {
		Puerta p = new Puerta();
		System.out.println("Valores iniciales...");
		p.mostrarEstado();
		System.out.println("Vamos a abrir...");
		p.abrir();
		p.setAncho(80);
		p.mostrarEstado();

		
		System.out.println("Ahora el portón...");
		Porton p2 = new Porton();
		p2.bloquear();
		p2.mostrarEstado();
	}
}

