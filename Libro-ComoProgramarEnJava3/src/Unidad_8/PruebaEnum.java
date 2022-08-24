package Unidad_8;

import java.util.EnumSet;

public class PruebaEnum {

	public static void main(String[] args) {
System.out.println("Todos los libros");
		
		for(Libro libro : Libro.values()) {
			System.out.println(libro+"*****" + libro.getTitulo() + "*****" + libro.getAnioCopyRight());
		}
		
		//mostrar ahora un rango de constantes.
		System.out.println("\nMostrar ahora un rango de constantes.");
		for(Libro libro : EnumSet.range(Libro.JHTP, Libro.CPPHTP)) {
			System.out.println(libro + "*****" + libro.getTitulo() + "*****" + libro.getAnioCopyRight() );
		}
		
	}

}
