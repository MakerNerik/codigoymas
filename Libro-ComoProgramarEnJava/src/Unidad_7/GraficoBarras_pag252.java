package Unidad_7;

public class GraficoBarras_pag252 {

	public static void main(String[] args) {

		int[]arreglo = {0,0,0,0,0,0,1,2,4,2,1};//11
		
		System.out.println("Distribución de calificaciones:");
		
		//para cada elemento del arreglo, imprime una barra del grafico
		for(int contador=0;contador < arreglo.length;contador++)
		{
			if(contador==10)
				System.out.print(100 + " ");
			else 
				System.out.print(contador * 10 + "-" + (9 + (contador * 10))  + " ");
			
			for(int estrellas=0; estrellas< arreglo[contador];estrellas++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}

}
