package Unidad_10;

public class Factura implements PorPagar
{

	private final String numeroPieza;
	private final String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	//CONSTRUCTOR
	public Factura(String numeroPieza,String descripcionPieza,int cantidad,double precioPorArticulo) 
	{
		if(cantidad < 0)
			System.out.println("La cantidad debe ser mayor a 0");
		
		if(precioPorArticulo < 0)
			System.out.println("El precio debe ser mayor a 0");
	
		this.numeroPieza=numeroPieza;
		this.descripcionPieza=descripcionPieza;
		this.cantidad=cantidad;
		this.precioPorArticulo=precioPorArticulo;		
	}
	
	public String getNumeroPieza() 
	{
		return this.numeroPieza;
	}
	
	public String getDescripcionPieza() 
	{
		return this.descripcionPieza;
	}

	public void setCantidad(int cantidad) 
	{
		if(cantidad < 0)
			System.out.println("La cantidad debe ser mayor a 0");
		
		this.cantidad = cantidad;
	}
	
	public int getCantidad() 
	{			
		return cantidad;
	}

	public double getPrecioPorArticulo() 
	{
		return precioPorArticulo;
	}

	public void setPrecioPorArticulo(double precioPorArticulo) 
	{
		if(precioPorArticulo < 0)
			System.out.println("El precio debe ser mayor a 0");
		
		this.precioPorArticulo = precioPorArticulo;
	}
	
	@Override
	public String toString() 
	{
		return String.format("|Factura |Número de pieza: " + getNumeroPieza() + "|descripción pieza: " + getDescripcionPieza() + "|cantidad: " + getCantidad() + "Precio por articulo:" + getPrecioPorArticulo());
	}

	@Override
	public double obtenerMontoPago() {		
		
		return getCantidad() * getPrecioPorArticulo();
	}

}
