package Unidad_4;

public class PruebaEstudiante {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("Esteban", 983.0);
		Estudiante e2 = new Estudiante("Alejandra", 87.0);
		
		System.out.println("Actualmente los estudiantes tienes las siguientes calificaciones: "
		+ "\n" + e1.getNombre() + ": " + e1.getCalificacion()
		+ "\n" + e2.getNombre() + ": " + e2.getCalificacion());
		
		System.out.println();
		
		System.out.println("Las calificaciones en letra son: "
		+ "\n" + e1.getNombre() + ": " + e1.getCalificacionEstudiante()
		+ "\n" + e2.getNombre() + ": " + e2.getCalificacionEstudiante());
		
		
	}

}
