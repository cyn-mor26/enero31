package Boletin5;

import java.util.Scanner;

public class Ej_uno {
    private static Scanner sc;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
	
		System.out.println("Ingresa tu nombre :");
		
		String nombre= sc.nextLine();
		int cantidad= nombre.length();
		
		
		System.out.println("Tu nombre tiene : "+cantidad+"caracteres");
	}

}
