package Trabajador;

public class ArrayUnico {

	public static void main(String[] args) {
		Trabajador[]trabajo = new Trabajador[5];
		
		trabajo[0] = new Trabajador();
		trabajo[1] = new Programador();
		trabajo[2] = new IngenieroInformatico();
		trabajo[3] = new Ingeniero();
		trabajo[4] = new Analista();
		
		for (Trabajador t : trabajo) {
			t.saludar();
		}

	}

}
