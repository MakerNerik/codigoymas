package Unidad_9;

public class test {

	public static void main(String args[]) {
	
		SuperClase sup = new SuperClase("Esteban",30,50000,8);
		SubClase sub = new SubClase("Alejandra","Carrillo",28,30000,5,8);
		
		/*
		 Es preferible colocar las anotaciones @Override ya que de esa manera el IDE ayuda a que coincida la firma del método tal cual como se encuentra en la superclase.
		  - Al evitar colocar la anotación @Override y sobrecargar el metodo de la subclase así como hacer la llamada desde el cliente con los mismos parametros de la superclase 
		    va a llamar al metodo de la superclase y no de la subclase
		 */
		System.out.println(sup.toStringg("saludo 1"));
		System.out.println(sub.toStringg("saludo 2"));
		
		sup.setSueldo(50000);
		sub.setSueldo(10000);
		
		System.out.println("Sueldo del trabajador " + sup.getNombre() + " es: " + sup.getSueldo() + " ingreso total: " + sup.ingresos());
		System.out.println("Sueldo del trabajador " + sub.getNombre() + " es: " + sub.getSueldo() + " ingreso total: " + sub.ingresos());
		
		
		
	}
}
