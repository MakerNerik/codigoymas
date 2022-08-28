package Unidad_11;

import java.util.Scanner;

public class UsoExceptons_ejemplo1 {

	public static int division_cociente(int numerador, int denominador) 
	{
		return numerador/denominador;
	}
	
	public static void main(String args[]) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Esribe el númerador para la división");
		int numerador = teclado.nextInt();
		
		System.out.println("Escribe el denominador para la devision");
		int denominador = teclado.nextInt();
				
		System.out.println("El resultado de la división es: " + division_cociente(numerador,denominador));
	}
	
}
