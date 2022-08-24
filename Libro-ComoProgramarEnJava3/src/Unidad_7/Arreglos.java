package Unidad_7;

public class Arreglos 
{

	public static void main(String[] args) 
	{
		
	 	//Hay varias formas de declarar arreglos iniciandolos o no iniciados
			//no iniciado
			//int[]arreglo = new int[10];
		
			//iniciado
			int[]arreglo2 = {1,3,4,5,12,2,9};//Para este ejemplo vamos a ocupar el arreglo2		
			System.out.println("Indice\tValor\tGrafica");
			
			for(int contador=0; contador < arreglo2.length; contador++) 
			{
				System.out.print(contador + "\t" + arreglo2[contador] + "\t");
		
					for(int estrellas=0; estrellas < arreglo2[contador]; estrellas++) 
					{
						System.out.print("*");	
					}								
							System.out.println();
			}

    }
}	

