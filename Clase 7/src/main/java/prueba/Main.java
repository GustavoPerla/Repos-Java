package prueba;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class Main {

	public static void main(String[] args) throws IOException{
		String productos = new File("src\\main\\resources\\items.txt").getAbsolutePath();
		
		Carrito compra1 = new Carrito(20230515);
		
		System.out.println("Cantidad\tPrecio Uni\tProducto");
		
		for(String linea : Files.readAllLines(Paths.get(productos))) {
			String [] valores = linea.split(",");
			String cantidad = valores[0];
			String nombre = valores[1];
			String precioU = valores[2];
			//System.out.println(cantidad+"\t\t"+precioU+"\t\t"+nombre);
			ItemCarrito item = new ItemCarrito(Integer.parseInt(cantidad),new Producto(nombre,Integer.parseInt(precioU)));
			
			compra1.agregarItem(item);
		}
		
		System.out.println(compra1.toString());
		if (args.length != 0) {

			switch (args[0]) {
			
			case "DF": // Descuento Fijo
				Descuento df =  new DescuentoFijo(Double.parseDouble(args[1]));
				System.out.println(compra1.precio(df));
				break;

			case "DP": // Descuento Porcentaje
				Descuento dp = new DescuentoPorcentaje(Double.parseDouble(args[1]));
				System.out.println(compra1.precio(dp));
				break;
			case "DPT":
				Descuento dpt = new DescuentoPorcentajeConTope(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
				System.out.println(compra1.precio(dpt));
			}
		} else {
			Descuento descuento = new DescuentoFijo(0); // Creo un descuento 0
			System.out.println(compra1.precio(descuento));
		}

	}

}
