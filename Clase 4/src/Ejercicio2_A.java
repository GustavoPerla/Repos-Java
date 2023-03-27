import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Ejercicio2_A {

	public static void main(String[] args) throws IOException{
		int resultado;
		 if(args[1].charAt(0) == 's') {
			 resultado = suma(args[0]);
		 }else {
			 resultado = multiplicacion(args[0]);
		 }
		
		System.out.println("La operacion da: " + resultado);
	}
	
	private static int suma(String url) throws IOException {
		int suma=0;
		for(String num : Files.readAllLines(Paths.get(new File(url).getAbsolutePath()))) {
			suma+=Integer.parseInt(num);
		}
		return suma;
	}
	
	private static int multiplicacion(String url) throws IOException {
		int producto=1;

		
		for(String num : Files.readAllLines(Paths.get(new File(url).getAbsolutePath()))) {
			producto*=Integer.parseInt(num);
		}
		

		return producto;
	}
}