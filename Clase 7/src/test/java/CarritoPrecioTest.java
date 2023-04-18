import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import prueba.Carrito;
import prueba.Descuento;
import prueba.DescuentoFijo;
import prueba.DescuentoPorcentaje;
import prueba.DescuentoPorcentajeConTope;
import prueba.ItemCarrito;
import prueba.Producto;

public class CarritoPrecioTest {
	private Carrito compra=new Carrito(20231022);
	private ItemCarrito item;
	@BeforeEach
	public void setup() {
		int cantidad[] = new int[]{4,5,6};
		int precio[] = new int[] {50,30,25};
		String nombre[]=new String[] {"Picadillo", "zapallo", "carne"};
		
		
		for(int i=0;i<3;i++) {
			item=new ItemCarrito(cantidad[i],new Producto(nombre[i],precio[i]));
			compra.agregarItem(item);
		}	
	}
	
	@DisplayName("Precio descuento fijo 100")
	@Test
	public void test1() {
		double esperado= 400;
		Descuento df=new DescuentoFijo(100);
		Assertions.assertEquals(esperado,compra.precio(df));
	}
	
	@DisplayName("Precio descuento porcentaje 30%")
	@Test
	public void test2() {
		double esperado= 500-(500*0.3);
		Descuento dp=new DescuentoPorcentaje(30);
		Assertions.assertEquals(esperado,compra.precio(dp));
	}
	
	@DisplayName("Precio descuento porcentaje con tope 40% 160")
	@Test
	public void test3() {
		double esperado= 500-160;

		Descuento dpt=new DescuentoPorcentajeConTope(40,160);
		Assertions.assertEquals(esperado,compra.precio(dpt));
	}
	
	
}
