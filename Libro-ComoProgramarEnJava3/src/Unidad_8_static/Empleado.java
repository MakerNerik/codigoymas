package Unidad_8_static;

public class Empleado {

	private static int cuenta=0;
	private String nombre;
	private String apellido;
	
	public Empleado(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		++cuenta;
		System.out.println("Constructor de objeto creado => " 
		+ getNombre() +" "+ getApellido() + " cuenta => " + getCuenta());	
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public static int getCuenta() {
		return cuenta;
	}
	
}
