package Unidad_4_pag_85;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("Esteban Nerik", -50.0);
		Cuenta cuenta2 = new Cuenta("Martha Alejandra", 0.0);
		double deposito;
		
		System.out.println("Saldo de " + cuenta1.getNombre() + ": " + cuenta1.getSaldo());
		System.out.println("Saldo de " + cuenta2.getNombre() + ": " + cuenta2.getSaldo());
		
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿A que cuenta desea depositar?\n"
				+ "1)" + cuenta1.getNombre() + "\n"
				+ "2)" + cuenta2.getNombre());		
		int valor = teclado.nextInt();
				
			Scanner tecladoDeposito = new Scanner(System.in);

			if(valor == 1) 
			{			
				System.out.println("Eligio a Esteban, cuanto desea ingresar?");
				deposito = tecladoDeposito.nextDouble();
				cuenta1.depositar(deposito);
				System.out.println("Saldo de " + cuenta1.getNombre() + " ahora es : " + cuenta1.getSaldo());

			}
			else if (valor == 2)
			{
				System.out.println("Eligio a Alejandra, cuanto desea ingresar?");
				deposito = tecladoDeposito.nextDouble();
				cuenta2.depositar(deposito);		
				System.out.print("Saldo de " + cuenta2.getNombre() + " ahora es : " + cuenta2.getSaldo());
			
			}
			
			else System.out.print("ingrese un valor valido.");		
					
	}

}
