
import Descuentos.Descuentos;

public class Carrito {
	private int maxCap=3;
	private ItemCarrito[] item;
	private int lugar;
	private int fecha;
	
	/*
	 * @param fecha
	 */
	
	public Carrito(int fecha) {
		super();
		this.fecha=fecha;
		this.item = new ItemCarrito[maxCap];
		this.lugar=0;
	}
	
	public int getFecha() {
		return this.fecha;
	}
	
	public float precio(Descuentos desc) {
		float base=0;
		
		for(int i=0;i<item.length;i++) {
			base= base+item[i].precio();
		}
		
		return base - desc.descuento(base);
	}
	
	public void agregarItem(ItemCarrito item) {
		if(this.lugar<maxCap) {
			this.item[lugar]=item;
			this.lugar++;
		}
	}
	@Override
	public String toString() {
		 System.out.println(String.valueOf(item[0].getCantidad()) +"\t\t"+ String.valueOf(item[0].getProducto().getPrecio())+"\t\t"+item[0].getProducto().getNombre());
		 System.out.println(String.valueOf(item[1].getCantidad()) +"\t\t"+ String.valueOf(item[1].getProducto().getPrecio())+"\t\t"+item[1].getProducto().getNombre());
		 System.out.println(String.valueOf(item[2].getCantidad()) +"\t\t"+ String.valueOf(item[2].getProducto().getPrecio())+"\t\t"+item[2].getProducto().getNombre());
		return " ";
	}

}
