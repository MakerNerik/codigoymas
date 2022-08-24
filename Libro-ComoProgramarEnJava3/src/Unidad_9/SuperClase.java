package Unidad_9;

public class SuperClase {
	/*
	 El objetivo de este ejercicio es ver si una sublase accede al metodo de la superclase una vez declarando el objeto en main (más que nada ver ese comportamiento)
	 hacer uso de @Override / y no hacer uso de @Override
	 hacer uso de @Override y colocar otros parametros en la subclase para ver en  main a que metodo realmente hace uso
	 */
	//Esta vez la superclase se llamara Empleado
	private String nombre;
	private int edad;
	private int sueldo;
	private int hora;

	//constructor
	public SuperClase(String nombre,int edad,int sueldo,int hora) {
		this.nombre=nombre;			
		if(edad<0) 
			System.out.println("debe ingresar una edad valida para " + getNombre());
		
		this.edad=edad;
		
		if(sueldo<0) 
		 System.out.println("debe ingresar un sueldo valido para " + getNombre());
		
		this.sueldo=sueldo;
		this.hora=hora;
	}
	
	//inicio de get y set 			nombre
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	//fin de get y set nombre
	
	//inicio get y set 				edad
	public int getEdad() {				
		return this.edad; 
	}
	
	public void setEdad(int edad) {
		if(edad<0) 
			System.out.println("debe ingresar una edad valida");
		
		this.edad=edad;
	}
	//din de get y set edad
	
	//inicio get y set 				sueldo
	public int getSueldo() {				
		return this.sueldo; 
	}
	
	public void setSueldo(int sueldo) {
		if(sueldo<0) 
			System.out.println("debe ingresar un sueldo valido");
		
		this.sueldo=sueldo;
	}
	//din de get y set sueldo
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	//@Override
	public String toStringg(String saludo) {
		return saludo + " SuperClase";
	}
	
	public int ingresos(){
		return getSueldo() * getHora();
	}
	
}

