import java.util.List;

public class paraTestController 
{

	paraTestController()
	{
		consultarEmpleados2();
	}
	
	List<OtraClase> empleado;

	private OtraClaseService empl = new OtraClaseService();
	
	public void consultarEmpleados2() 
	{
		empleado = empl.consultaEmpleados(); 
	}
	
	public List<OtraClase> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<OtraClase> empleado) {
		this.empleado = empleado;
	}
	
	
	 
}
