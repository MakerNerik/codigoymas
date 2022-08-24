package Unidad_7;

public class ForMejorada {

	public static void main(String[] args) {

		//int[]arreglo1 = new int[10];
		int[]arreglo2 = {10,12,3,4,5,6,7,8,9};
		int contador=0;
		int total=0;
		
		System.out.println("Indice\tValor");
		for(int numero : arreglo2) 
		{
			System.out.println(contador + "\t" + arreglo2[contador]);
			total+=numero;
			contador++;
		}
		System.out.println("El total de los números del arreglo es: " + total + " contador: " + contador);
		

	}

}
