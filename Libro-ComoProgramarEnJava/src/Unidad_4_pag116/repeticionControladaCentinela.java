package Unidad_4_pag116;

import java.util.Scanner;

public class repeticionControladaCentinela {

	public static void main(String[] args) {

		//repeticion controlada por centinela/bandera
		Scanner teclado = new Scanner(System.in);
		int contador=0;
		int total=0;
		
		System.out.println("Favor de introducir la calificación o colocar 0 para terminar y promediar");
		int calificacion = teclado.nextInt();
		
		while(calificacion!= 0) {
			
			total += calificacion;
			contador++;	
			System.out.println("Favor de introducir la calificación o colocar 0 para terminar y promediar");
			calificacion = teclado.nextInt();			
		}
		
		System.out.println("Total de calificaciones introducidas: " + contador);
		System.out.println("Suma de calificaciones: " + total);
		System.out.println("Promedio: " + total/contador);
		
	}
}

