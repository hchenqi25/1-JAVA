package Encapsulacion;

public class Automovil {
private String marca;
private String modelo;
private int velocidad;


public void setMarca(String nuevaMarca) {
	marca = nuevaMarca;
}
public String getMarca() {
	return marca;
}
public void setModelo(String nuevoModelo) {
	modelo = nuevoModelo;
	
}
public String getModelo() {
	return modelo;
}
public void setVelocidad(int nuevaVelocidad) {
	if(nuevaVelocidad>0) {
		velocidad = nuevaVelocidad;
	}else {
		throw new IllegalArgumentException("La velocidad no puede ser negativa");
	}
}
public int getVelocidad() {
	return velocidad;
}

public void setAceleracion(int nuevaAceleracion) {
	velocidad += nuevaAceleracion;
	System.out.println();
}   
}
