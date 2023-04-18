package prueba;



public class DescuentoPorcentaje extends Descuento {
	private double porcentaje;

	public DescuentoPorcentaje(double porcentaje) {
		super();
		this.porcentaje=porcentaje;
	}
	@Override
	public double descuento(double base) {
		return base*porcentaje/100;
	}
}
