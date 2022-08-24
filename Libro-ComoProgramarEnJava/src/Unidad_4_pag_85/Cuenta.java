package Unidad_4_pag_85;

public class Cuenta {

		private double saldo;
		private String nombre;
		
		public Cuenta() {}
		
		public Cuenta(String nombre, double saldo) {//constructor
			
			this.nombre=nombre;
			if (saldo > 0.0) 
				this.saldo=saldo;					
		}
		
		public void depositar(double deposito) {//metodo depositar
			
			if(deposito>0.0)
			  saldo += deposito;
		}
		
		//metoos geters and seters
		public double getSaldo() {
			return saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		

	


}
