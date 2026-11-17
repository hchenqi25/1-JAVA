package Trabajador;

public class Super {

	public static void main(String[] args) {
		System.out.println("----------------Programador--------------");
		Analista a = new Analista();
		a.saludar();
		
		System.out.println("--------------Ingeneiro------------------");
		Ingeniero i = new Ingeniero();
		i.saludar();
		
		System.out.println("----------------Ingeniero Informatico-------------");
		IngenieroInformatico ing = new IngenieroInformatico();
		ing.saludar();

	}

}
