package Unidad_9_pag406;

public abstract class Empleado {

	private final String primerNombre;
	private final String apellidoPaterno;
	private final String numeroSeguroSocial;

	public Empleado(String primerNombre,String apellidoPaterno,String numeroSeguroSocial) {		
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	
	//al ser variables de tipo final es incongruente tener metodos set.
	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	
	@Override
	public String toString() {
		return String.format("|Hereda de <Clase Empleado> " + "|Nombre: " + getPrimerNombre()+ "|Apellido: " + getApellidoPaterno() + " |Número de seguro social: " + getNumeroSeguroSocial());
	}
	
	// metodo abstracto sobrescrito por las subclases concretas
	public abstract double ingresos();
	
	
	
	
}
