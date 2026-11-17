package Segregacion;

public class Pistola implements IArmasDeGuerra {
	@Override
	public void apuntar() {
		System.out.println("Apuntando con la pistola");
	}
	
	@Override 
	public void disparar() {
		System.out.println("Disparando con la pistola");
	}
	

}
