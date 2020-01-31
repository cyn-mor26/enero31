package Boletin5;

import java.util.Arrays;

public class Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fd[]= {3,2,199,212,0};

System.out.println(Arrays.toString(fd));
int aux=0;
for (int i = 0; i < fd.length; i++) {
	for (int j = 0; j < fd.length-i-1; j++) {
		if (fd[j]>fd[j+1]) {
			aux=fd[j];
			fd[j]=fd[j+1];
			fd[j+1]=aux;
		}
	}
}
System.out.println(Arrays.toString(fd));
	}
	
	

}
