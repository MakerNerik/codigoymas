package Unidad_7;

public class PasoArreglo {

	public static void main(String[] args) 
	{

		int[]arreglo = {1,2,3,4,5};
		System.out.println("Los valores del arreglo original son:");	
		
		for(int numero : arreglo) 
		{
			System.out.print(numero + " ");			
		}
		
		System.out.println("\n\nLos valores del arreglo modificado son:");
		modificarArreglo(arreglo);		
		
		System.out.println("\n\n----------Efectos de pasar el valor de un elemento del arreglo----------");
		
		System.out.println("\n1.- Arreglo antes de modificar: arreglo[3]=" + arreglo[3]);			
		
		modificarElemento(arreglo[3]);	
		System.out.println("3.- Despues de modificar el elemnto del arreglo[3]=" + arreglo[3]);
	}

		public static void modificarArreglo(int[] arreglo2) 
		{
			//for(int numero : arreglo2)
			for(int contador=0; contador < arreglo2.length; contador++)
			{
			//	System.out.print(numero*2 + " ");
				arreglo2[contador] *= 2;
				System.out.print((arreglo2[contador]) + " ");
			}
		}
		
		public static void modificarElemento(int elemento) 
		{
			elemento *= 2;
			System.out.println("2.- Valor del elemento modificado=" + elemento);
		}
	
}
