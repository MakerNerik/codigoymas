package Unidad1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SumaEnterosRepaso {

	public static void main(String[] args) {

		int int_numero1=0;
		int int_numero2=0;		
		int resultado=0;
		
		Scanner entrada_teclado = new Scanner(System.in);

		System.out.println("Escriba el 1° Número: ");
 		int_numero1 = entrada_teclado.nextInt();
		
		System.out.println("Escriba el 2° Número: ");
		int_numero2 = entrada_teclado.nextInt();
		
		resultado = int_numero1 + int_numero2;
		System.out.println("El resultado de la suma es: " + resultado);

// -------##########################-------##########################-------##########################-------##########################-------##########################
		
		int_numero1=0;		
		int_numero2=0;
	
		resultado=0;

		String string_numer1 = JOptionPane.showInputDialog(null, "Escriba el primer número");
		int_numero1 = Integer.parseInt(string_numer1);
		
		String string_numer2 = JOptionPane.showInputDialog(null, "Escriba el primer número");
		int_numero2 = Integer.parseInt(string_numer2);
		
		resultado=int_numero1 + int_numero2;
				
		JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
		
	}

}
