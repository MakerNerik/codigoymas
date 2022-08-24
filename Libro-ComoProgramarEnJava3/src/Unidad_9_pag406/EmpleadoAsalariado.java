package Unidad_9_pag406;

public class EmpleadoAsalariado extends Empleado {

	private double salarioSemanal;
	
	public EmpleadoAsalariado(String primerNombre,String apellidoPaterno,String numeroSeguroSocial, double salarioSemanal) {
		super(primerNombre,apellidoPaterno,numeroSeguroSocial);
		
		if(salarioSemanal<0) {
			System.out.println("El salario debe ser mayor a 0");
		}		
		this.salarioSemanal=salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if(salarioSemanal<0) {
			System.out.println("El salario debe ser mayor a 0");
		}		
		this.salarioSemanal=salarioSemanal;
	}

	@Override
	public String toString() {
		return String.format("|Empleado asalariado: " + super.toString() + " |salario semanal: " + getSalarioSemanal());
	}
	
	@Override
	public double ingresos() {	
		return getSalarioSemanal();
	}

}
