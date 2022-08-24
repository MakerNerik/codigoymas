package Unidad_7;

import java.util.ArrayList;

public class ColeccionArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("rojo");
		elementos.add(0, "amarillo");
				
		System.out.print("----Mostrar  contenido de lista con ciclo controlado por contador:");
		
		for(int contador=0; contador < elementos.size();contador++) 
		{
			System.out.print("\niprimer For: " + elementos.get(contador));
		}
		
		mostrar(elementos,"\n----Mostrar contenido de lista con instruccion for mejorada:");
		elementos.add("verde");
		elementos.add("amarillo");
		
		mostrar(elementos, "----lista con 2 nuevos elementos:");
		elementos.remove("amarillo");
		
		mostrar(elementos,"\n-Elimina primera instancia de amarillo:");
		elementos.remove(1);//elimina el elemento del subindice 1//se puede poner el elemento 0,1,2,3,4 ...
		
		mostrar(elementos,"\n----Elimina segundo elemento de la lista(verde):");
		System.out.println("----El color rojo " + (elementos.contains("rojo") ? "si " : "no ") + "esta en la lista");
		System.out.println("Tamaño: " + elementos.size());
		
	}
	
	public static void mostrar(ArrayList<String> elementoss, String encabezado) 
	{
		System.out.println(encabezado);
		
		for(String color : elementoss) 
		{
			System.out.println("Color con for mejorada: " + color);
		}
	}

}
