package Unidad_9_pag406;

public class EmpleadoPorComision extends Empleado{
	
	private double ventasBrutas;
	private double tarifaComision;

	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double ventasBrutas,double tarifaComision) {
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		
		if(tarifaComision< 0.0 || tarifaComision> 1.0)
			System.out.println("La tarifa de comision debe ser > 0.0 y < 1.0 ");
		
		if(ventasBrutas<0.0)
			System.out.println("Las ventas brutas deben ser >= 0.0");
		
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComision;
	}

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		if(ventasBrutas<0.0)
			System.out.println("Las ventas brutas deben ser >= 0.0");
		
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		if(tarifaComision<=0.0 || tarifaComision>=1.0)
			System.out.println("La tarifa de comision debe ser > 0.0 y < 1.0 ");
		
		this.tarifaComision = tarifaComision;
	}
	
	@Override
	public String toString() {
		return String.format("|Empleado por comision: " + super.toString() + "|ventas brutas: " + getVentasBrutas() + "|tarifa de comision: " + getTarifaComision());
	}

	@Override
	public double ingresos() {
		return getTarifaComision() * getVentasBrutas();
	}
	
	

}
