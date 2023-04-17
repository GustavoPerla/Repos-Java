package Descuentos;

public class DescuentoPorcentaje extends Descuentos{
	private float porcentaje;

	public DescuentoPorcentaje(float porcentaje) {
		super();
		this.porcentaje=porcentaje;
	}
	@Override
	public float descuento(float base) {
		return base*porcentaje/100;
	}
	
}
