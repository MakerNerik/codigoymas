package Unidad_4;

public class Estudiante {

	private String nombre;
	private double calificacion;

	public Estudiante() {
	}

	// valida que el promedio sea consistente
	public Estudiante(String nombre, double promedio) {
		this.nombre = nombre;
		if (promedio > 0.0) {
			if (promedio <= 100) {
				this.calificacion = promedio;
			} else
				System.out.println("favor de colocar una calificacion valida para: " + getNombre());
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setCalificacion(double promedio) {
		if (promedio > 0.0)
			if (promedio <= 100.0)
				this.calificacion = promedio;
	}

	public double getCalificacion() {
		return this.calificacion;
	}

	public String getCalificacionEstudiante() {

		String calificacionEstudiante = "";
		if (calificacion >= 90.0)
			calificacionEstudiante = "A";
		else if (calificacion >= 80.0)
			calificacionEstudiante = "B";
		else if (calificacion >= 70.0)
			calificacionEstudiante = "C";
		else if (calificacion >= 60.0)
			calificacionEstudiante = "D";
		else
			calificacionEstudiante = "F";

		return calificacionEstudiante;
	}

}
