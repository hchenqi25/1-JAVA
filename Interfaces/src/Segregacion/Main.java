package Segregacion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("----------------AVION--------------");
		IVehiculo a = new Avion();
		System.out.println("Introduce la aceleracion del avion =>");
		a.acelerar(teclado.nextInt());
		System.out.println("Frenando =>");
		a.frenar();
		System.out.println("Introduce el angulo del giro");
		a.girar(teclado.nextInt());

		IVehiculoVolador av = new Avion();
		av.despegar();
		av.aterrizar();
		
		System.out.println("------------TANQUE--------------");
		IVehiculo t = new Tanque();
		System.out.println("Introduce la aceleracion =>");
		t.acelerar(teclado.nextInt());
		t.frenar();
		System.out.println("Introduce el radio de giro =>");
		t.girar(teclado.nextInt());
		
		IArmasDeGuerra ia = new Tanque();
		ia.apuntar();
		ia.disparar();
		
		
	teclado.close();}

}
