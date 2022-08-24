package Unidad_4_pag116;

import java.util.Scanner;

public class PromedioClase {

	public static void main(String[] args) {

		int total=0;
	    int contador=1;
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    //repeticion controlada por contador.
	    while(contador <= 10) {	    	
	    System.out.println("Escribe la calificaciones del estudiante N° " + contador);
	    total+= teclado.nextInt();
	    contador+=1;
	    }	    
	    
	    System.out.println("La suma de las calificaciones es: " + total);
	    System.out.println("El contador llego al número: " + (contador-1));
	    System.out.println("El promedio de las calificaciones es: " + total/(contador-1));
					

	}

}
