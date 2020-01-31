package Boletin5;

import java.util.Scanner;


public class Ej_dosStars {
    public static Scanner sc;
//	private static String Texto;
    
	public static void main(String[]args) {
		
		sc= new Scanner(System.in);
	    String Nombre;
	    boolean texto=false;
		System.out.println("Ingrese Nombre ");
		Nombre=sc.next();
		while (!Nombre.equals("cynthia")){// mientras nombre sea distinto a Cynthia va a pedir ingrese nombre
			System.out.println("Ingrese Nombre ");
			Nombre=sc.next();
			texto=true;// cuando ingrese el nombre cynthia sera verdadero y sale del ciclo
			
		}
	
//	boolean result = Texto.startsWith("cy");
	
	System.out.println("El resultado es : "+texto);
	
}

}


