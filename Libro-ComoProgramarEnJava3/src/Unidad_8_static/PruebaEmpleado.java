package Unidad_8_static;

public class PruebaEmpleado {

	public static void main(String args[]) {
	
		System.out.println("Empleados antes de instanciar => " + Empleado.getCuenta());
		
		Empleado e1 = new Empleado("Esteban","Julian");
		Empleado e2 = new Empleado("Alejandra","Calleja");
		
		System.out.println("Empleados despues de instanciar => " + Empleado.getCuenta());
		System.err.println("Empleado => " + e1.getNombre() + " " + e1.getApellido() + " Cuenta => " + Empleado.getCuenta());
		System.err.println("Empleado => " + e2.getNombre() + " " + e2.getApellido() + " Cuenta=> " + Empleado.getCuenta());
	}	
}
