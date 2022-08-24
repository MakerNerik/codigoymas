package Unidad1;

import java.util.Scanner;

public class SumaEnteros {

	public static void main(String[] args) {

		//Declarar variables
		int numero1;
		int numero2;
		int suma;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe el primer nùmero entero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Escribe el segundo nùmero entero: ");
		numero2 = entrada.nextInt();
				
		suma = numero1 + numero2;
		
		System.out.printf("El resultado de la suma es: %n%d",suma);
		
	}

}
