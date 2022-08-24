package Unidad5_pag155;

public class Unidad5_pag175_break {

	public static void main(String[] args) {
					
		int cuenta;
		
		for(cuenta=1;cuenta<=10;cuenta++)
		{
			if(cuenta==5) 	
			{
				//break;//termina el ciclo si encutra 5.
				continue;// omite el resto del codigo en el ciclo si cuenta es 5.
			}		
			System.out.println("Cuenta: " + cuenta);					
			System.out.println("AAAA");
			System.out.println("BBBB");		
		}		
		
		System.out.println("Salio del ciclo en cuenta: " + cuenta);//SIGUIENTE INSTRUCCION DESPUES DEL BREAK.
	}

}
