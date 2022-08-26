package Unidad_10;

public class EmpleadoAsalariado extends Empleado{
	
	private double salarioSemanal;

	//CONSTRUCTOR
	public EmpleadoAsalariado(String primerNombre, String apellido, String numeroSeguroSocial,double salarioSemanal) 
	{
		super(primerNombre, apellido, numeroSeguroSocial);	
		if(salarioSemanal<0)
			System.out.println("El salario semanal debe de ser mayor a 0");
		
		this.salarioSemanal=salarioSemanal;	
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if(salarioSemanal<0)
			System.out.println("El salario semanal debe de ser mayor a 0");
		
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double obtenerMontoPago() {		
		return getSalarioSemanal();
	}
	
	@Override
	public String toString() 
	{
		return String.format("|Empleado asalariado |" + super.toString() + "|salario semanal: " + getSalarioSemanal());
	}
}
