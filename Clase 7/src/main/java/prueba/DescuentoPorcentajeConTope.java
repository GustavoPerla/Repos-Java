package prueba;

public class DescuentoPorcentajeConTope extends Descuento{
	
	private double porcentaje;
	private double tope;
	
	public DescuentoPorcentajeConTope(double porcentaje,double tope) {
		super();
		this.porcentaje=porcentaje;
		this.tope=tope;
	}
	@Override
	public double descuento(double base) {
		double res=base*porcentaje/100;
		return res<tope? res:tope;
	}
	
}
