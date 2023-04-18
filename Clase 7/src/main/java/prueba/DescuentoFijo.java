package prueba;


public class DescuentoFijo extends Descuento{
	private double monto;

	public DescuentoFijo(double monto) {
		super();
		this.monto=monto;
	}

	@Override
	public double descuento(double base) {
		
		return monto;
	}
	
}
