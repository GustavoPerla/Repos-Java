package prueba;
public class ItemCarrito {
	private int cantidad;
	private Producto producto;
	
	public ItemCarrito(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}


	public Producto getProducto() {
		return producto;
	}


	public int precio() {
		return cantidad*producto.getPrecio();
	}
	
}
