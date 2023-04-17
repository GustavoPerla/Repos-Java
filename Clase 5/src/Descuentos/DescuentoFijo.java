package Descuentos;

public class DescuentoFijo extends Descuentos {
	private float monto;

	public DescuentoFijo(float monto) {
		super();
		this.monto=monto;
	}
	@Override
	public float descuento(float base) {
		return monto;
	}
}
