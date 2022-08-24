package Unidad_7;

import java.security.SecureRandom;

public class TirarDado {

	public static void main(String[] args) {
	
		SecureRandom numAleatorios = new SecureRandom(); 
		int[] Arreglofrecuencia = new int[7];//arreglo de contadores de frecuencia
				
		//tirar el dado 6,000,000 veces; usa el valor del dado como indice de frecuencia
		for(int tiro=1; tiro <= 6000; tiro++) 
		{		
			++Arreglofrecuencia[1 + numAleatorios.nextInt(6)];
		}
		System.out.println("Cara\tFrecuencia");
		
		for(int cara=1; cara< Arreglofrecuencia.length;cara++) 
		{				
			System.out.println(cara + "\t" + Arreglofrecuencia[cara]);
		}
		
	}
}
