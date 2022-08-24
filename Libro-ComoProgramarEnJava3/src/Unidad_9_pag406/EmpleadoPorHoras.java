package Unidad_9_pag406;

public class EmpleadoPorHoras extends Empleado{

	private double sueldo;
	private double horas;
	
	public EmpleadoPorHoras(String primerNombre,String apellidoPaterno,String numeroSeguroSocial,double sueldo,double horas) {
		super(primerNombre,apellidoPaterno,numeroSeguroSocial);
		
		if(sueldo<0) {
			System.out.println("El sueldo debe ser mayor a 0");
		}
		
		if(horas<0 || horas>168) {
			System.out.println("Las horas trabajadas deben ser mayor a 0 ó menor o igual a 168");
		}
		this.sueldo=sueldo;
		this.horas=horas;
		
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		if(sueldo<0) {
			System.out.println("El sueldo debe ser mayor a 0");
		}
		
		this.sueldo = sueldo;
	}

	public double getHoras() {		
		return this.horas;
	}

	public void setHoras(double horas) {		
		if(horas<0 || horas>168) {
			System.out.println("Las horas trabajadas deben ser mayor a 0 ó menor o igual a 168");
		}
		
		this.horas = horas;
	}

	@Override
	public String toString() {
		return String.format("|Empleado por horas: " + super.toString() + "|sueldo por hora: " +  getSueldo() + "|horas trabajadas: " + getHoras());
	}
	
	@Override
	public double ingresos() {
		if(getHoras()<=40)//no hay tiempo extra
			return getSueldo()*getHoras();
		else
			return 40 * getSueldo() + (getHoras()-40)*getSueldo()*1.5;
					
	}
	
	
	
}
