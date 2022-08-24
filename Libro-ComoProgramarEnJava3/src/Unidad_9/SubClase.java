package Unidad_9;

//Esta vez la subclase se llamara Empleado_conserje
public class SubClase extends SuperClase {
	
	private int trabajitosExtras;
	private String apellido;
	
	public SubClase(String nombre,String apellido ,int edad, int sueldo,int trabajitosExtras,int hora) {
		super(nombre, edad, sueldo,hora);
		this.apellido=apellido;
		this.trabajitosExtras=trabajitosExtras;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTrabajitosExtras() {
		return trabajitosExtras;
	}

	public void setTrabajitosExtras(int trabajitosExtras) {
		this.trabajitosExtras = trabajitosExtras + getSueldo();
	}
	
	@Override 
	public String toStringg(String hola) {
		
		String cadena = hola + " Subclase";
		return cadena;
	}
	
	@Override
	public int ingresos(){
		//return getSueldo() * getHora() + getTrabajitosExtras();//funciona igual pero mucho codigo inecesario
		return getTrabajitosExtras() + super.ingresos();//funciona y es una manera elegante y más correcta de codigo
	}
}
