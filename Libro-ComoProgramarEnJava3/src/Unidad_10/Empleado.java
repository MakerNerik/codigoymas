package Unidad_10;


//LA CLASE LA DECLARO COMO ABSTRACT YA QUE NO IMPLEMENTE TODOS LOS METODOS DE LA INTERFAZ(EN ESTE CASO SOLO ES UN METODO) DE LO CONTRARIO PODRIA QUEDAR COMO UNA CLASE CONCRETA
public abstract class Empleado implements PorPagar
{

	private final String primerNombre;
	private final String apellido;
	private final String numeroSeguroSocial;
	
	
	//CONSTRUCTOR
	public Empleado(String primerNombre,String apellido,String numeroSeguroSocial) 
	{
		this.primerNombre=primerNombre;
		this.apellido=apellido;
		this.numeroSeguroSocial=numeroSeguroSocial;
	}
	
	public String getPrimerNombre() 
	{
		return primerNombre;
	}
	
	public String getApellido() 
	{
		return apellido;
	}
	
	public String getNumeroSeguroSocial() 
	{
		return numeroSeguroSocial;
	}
	
	@Override
	public String toString() 
	{
		return String.format("|Empleado |Numero de seguro social: " + getNumeroSeguroSocial() + "|Primer nombre: " + getPrimerNombre() + "|Apellido: " + getApellido() + "|Número seguro social: " + getNumeroSeguroSocial());
	}
}
