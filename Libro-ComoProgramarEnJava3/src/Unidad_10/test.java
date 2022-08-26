package Unidad_10;

public class test {

	public static void main(String[] args) {
		
		PorPagar[] objetosPorPagar = new PorPagar[4];

		objetosPorPagar[0]= new Factura("01234","Asiento",2,375.00);
		objetosPorPagar[1]= new Factura("56789","Llanta",4,875.00);
		objetosPorPagar[2]= new EmpleadoAsalariado("Esteban","Julian","123456-ABCD",10000);
		objetosPorPagar[3]= new EmpleadoAsalariado("Alejandra","Calleja","987654-BGRE",90000);
		
		for(PorPagar porPagarActual : objetosPorPagar) 
		{
			//System.out.println(porPagarActual.toString() + "|pago vencido: " + porPagarActual.obtenerMontoPago());
			System.out.println(porPagarActual + "|pago vencido: " + porPagarActual.obtenerMontoPago());
		}
		
	}

}
