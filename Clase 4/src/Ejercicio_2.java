import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Ejercicio_2 {

	public static void main(String[] args) throws IOException {
		int suma=0;
		
		for(String num : Files.readAllLines(Paths.get(new File(args[0]).getAbsolutePath()))) {
			suma+=Integer.parseInt(num);
		}
		System.out.println("La suma de los numeros es: " + suma);
	}
}
