package Unidad_9_pag406;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{

	private double salarioBase;
	
	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double ventasBrutas, double tarifaComision,double salarioBase) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
	
		if(salarioBase<0.0)
			System.out.println("El salario base debe ser >= 0.0");
		
		this.salarioBase=salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if(salarioBase<0.0)
			System.out.println("El salario base debe ser >= 0.0");
		
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return String.format("|Salario base mas comision: "  + super.toString() + "|salario base: " + getSalarioBase());
	}

	@Override
	public double ingresos() {
		return getSalarioBase() + super.ingresos();
	}
	
	
}
