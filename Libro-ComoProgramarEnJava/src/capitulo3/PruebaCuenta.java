package capitulo3;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
/*
		Cuenta cuenta1 = new Cuenta();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe el nombre de la cuenta: ");
		cuenta1.setNombre(entrada.nextLine());
		System.out.println("El nombre de la cuenta es: " + cuenta1.getNombre());
		*/
		Cuenta miCuenta = new Cuenta();
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("El nombre incial es:%s%n%n",miCuenta.getNombre());
		
		System.out.println("Introduzca el nombre:");
		miCuenta.setNombre(entrada.nextLine());
		
		System.out.printf("%nEl nombre en el objeto miCuenta es: %n%s",miCuenta.getNombre());
		
	}

}
