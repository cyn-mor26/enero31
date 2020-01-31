package Boletin5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//se pretende realizar un programa para gestionar la lista de participaciones 
		//competicion de salto de longitud. El numero de plazas disponibles es de 10
		//sus datos se iran introduciendo en el mismo orden que vayan inscribiendose los atletas.
		//disenar el programa que muestre las sigts op.
		// inscribir un participant
		//MOSTRAR LISTADO DE DATOS
		//MOSTRAR LISTADO POR MARCAS
		//FINALIZAR EL PROGRAMA
		 Scanner sc = new Scanner(System.in);
		 int op;
		 String participantes[][]=new String[10][4];	
		 final int TAM=10,D=0, M2000=1,M2001=2, M2002=3;
		 
		 int opc//final me deja las variales con un unico valor de entrada durante todo el codigo 
	    	System.out.println("**************************COMPETENCIA DE SALTO**********************");
			System.out.println("******op.1 : Ingresar nombre participante *******");
			System.out.println("******op.2 : Mostrar participantes *******");
			System.out.println("******op.3 : Listado de marcas *******");
			System.out.println("******op.4 : Finalizar programa *******");
			
	    	System.out.println("Ingrese Op" );
			op= sc.nextInt();
			switch (op) {
				case 0:
					System.out.println("Adios" );
					break;
				case 1:// nombre, mejor marca 2001,2002,2001;
					
					System.out.println("Case 1" );
					
					break;
				case 2:
					

					break;
				case 3:
					
					break;
				case 4:
					System.out.println("Case 4" );
					break;
				default:
			           System.out.println("Ingrese opcion correcta" );
			           break;	
			}
	    }while(op!=0);	
	}
}	
