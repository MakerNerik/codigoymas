package Unidad_9_pag406;

public class PruebaSistemaNomina {

	public static void main(String[] args) {
		
		EmpleadoAsalariado      empleadoAsalariado      = new EmpleadoAsalariado("Esteban","Julian","456465465A",10000);
		EmpleadoPorHoras        empleadoPorHoras        = new EmpleadoPorHoras("Nerik","Corona","456465465B",10000,41);
		EmpleadoPorComision     empleadoPorComision     = new EmpleadoPorComision("Marco","Julian","456465465C",400,1.0);
		EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Leydi","Julian","456465465D",400,1.0,10000);
		
		System.out.println("\nEmpleados procesados de por separado");
		
		System.out.println(empleadoAsalariado + " ----> " + empleadoAsalariado.ingresos());
		System.out.println(empleadoPorHoras + " ----> " + empleadoPorHoras.ingresos());
		System.out.println(empleadoPorComision + " ----> " + empleadoPorComision.ingresos());
		System.out.println(empleadoBaseMasComision + " ----> " + empleadoBaseMasComision.ingresos());
		
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		Empleado[] empleados = new Empleado[4];
		empleados[0]= empleadoAsalariado;
		empleados[1]= empleadoPorHoras;
		empleados[2]= empleadoPorComision;
		empleados[3]= empleadoBaseMasComision;
		
		System.out.println("\nEmpleados procesados de forma polimorfica");
		
		for(Empleado empleadoActual : empleados) 
		{
			System.out.println("==>"+empleadoActual);
			
			if(empleadoActual instanceof EmpleadoBaseMasComision)//determina si el empleado es un EmpleadoBaseMasComision  
			{
			//conversion descendente de la referencia de Empleado a una referencia de EmpleadoBaseMasComisionj
				EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
				//Empleado              empleado = (Empleado)                empleadoActual;
				empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
				System.out.println("El nuevo salario base con 10% de aumento es: " + empleado.getSalarioBase());
				System.out.println("ingresos: " + empleadoActual.ingresos());
			}
		}
		
		for(int i =0; i < empleados.length;i++) 
		{		  
		  System.err.println("El empleado " + i +"es un " + empleados[i].getClass().getName());
		}
	}

}
