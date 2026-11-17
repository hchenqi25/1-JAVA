package curso;

public class Primera {

	public static void main(String[] args) {
		
		//Declaracion y creacion del arryse
	 int[]numeros = new int[3];
	 System.out.println(numeros);
	 
//	 Declaracion de arryse de nombres
	 String[]nombres = {"Brais" , "Moure" , "mouredev"};
	 System.out.println(nombres);
	 
	//Acceso a los datos del arryse
	 System.out.println(nombres[0]);
	 System.out.println(numeros[3]);
	
	
	
	 //Modificar el arryse
	 numeros[0] = 1;
	 numeros[1] = 10;
	 System.out.println(numeros[0]);
	 System.out.println(numeros[1]);
	//numero[3 = Error debido a que no hay huecos suficientes reservados
	 
	 System.out.println(numeros[1]);
	 nombres[2] ="hchenqi25@gmail.com";
	  
	
	}
}
