import java.util.ArrayList;
import java.util.List;

//supongamos que esta clase opera junto con la base de datos
public class OtraClaseService //se comunica Empleado con la BD
{ 
	public List<OtraClase> consultaEmpleados()
	{
		List<OtraClase> empleados = new ArrayList<OtraClase>();
		
		OtraClase empleadoMicrosft = new OtraClase();
		OtraClase empleadoApple = new OtraClase();
		OtraClase empleadoIBM = new OtraClase();
		
		empleadoMicrosft .setNombre("Esteban Nerik");
		empleadoMicrosft .setApellidoM("Julian");
		empleadoMicrosft .setApellidoP("Corona");
		empleadoMicrosft .setEstado("Activo");
		
		empleadoApple .setNombre("Esteban Nerik");
		empleadoApple .setApellidoM("Julian");
		empleadoApple .setApellidoP("Corona");
		empleadoApple .setEstado("Activo");
		
		empleadoIBM .setNombre("Esteban Nerik");
		empleadoIBM .setApellidoM("Julian");
		empleadoIBM .setApellidoP("Corona");
		empleadoIBM .setEstado("Activo");
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosft);
		
		return empleados;
	}

}
